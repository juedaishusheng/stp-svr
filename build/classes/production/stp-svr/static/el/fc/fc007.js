/*
 * EL UI - 1.0.0
 * http://www.elitesland.com/
 *
 * Copyright 2016 Elitesland.com
 */

define(function (require) {

  function renderTable(results) {
    var tablesTmpl = Handlebars.compile($('#summary_table').html());
    $('.summary_data').html(tablesTmpl(results));
    $("input[name=fc007_table1]:eq(0)").attr("checked", 'checked');
    $('.dateFrom').datepicker({
      todayHighlight: true,
      autoclose: true
    });
    $('.dateTo').datepicker({
      todayHighlight: true,
      autoclose: true
    });
    $('#listEditDiv').removeClass('hide');
    return listenClick();
  }

  function listenClick() {

    $('#detail_btn').on('click', function () {
      var checkList =$("input[type='radio']:checked");
      var tr =$(checkList[0].parentNode.parentNode);
      window.args2 = {
        prodCode: $("input[type='radio']:checked").val(),
        addrName: tr.find("input[name='addrName']").val()
      }
      if (args.prodCode === args2.prodCode) {

        var _tmpl = Handlebars.compile($('#detail_table').html());
        EL.get('api/fc/fc007/editView', args2)
          .then(function (json) {
            $('.detail_data').html(_tmpl(json));
          });
        $('#listEditDiv').addClass('hide');
      } else {
        var _tmpl = Handlebars.compile($('#detail_table').html());
        EL.get('api/fc/fc007/editView', args)
          .then(function (json) {
            $('.detail_data').html(_tmpl(json));
          });
        $('#listEditDiv').addClass('hide');
      }
    });

    $('#summary_btn').on('click', function () {
      init();
    });
    $('.summary_data > tr').on('dblclick', function () {
      window.args = {
        prodCode: $('.summary_data > tr').attr("data-view-id"),
        addrName: $('.summary_data > tr').attr("data-view-value")
      }

      $('#detail_btn').click();

    });
  }

  var _reqProxy = {
    url: 'api/fc/fc007/listView',
    argsBuilder: argsBuilder,
    callback: renderTable,
    sortSelector: '.fc007 .panel .stp-table-fc007_2',
    pagingSelector: '.fc007 .panel .stp-paging-fc007_2',
    trigger: '.fc007 .search-btn',
    immediately: true
  };

  function argsBuilder() {
    var condition = {
      soNo: $('#soNo').val(),
      prodName: $('#prodName').val(),
      dateFrom: $('#dateFrom').val(),
      dateTo: $('#dateTo').val()
    };
    return condition;
  }

  function init() {
    EL.paging(_reqProxy);
    EL.dtp('.fc007 .el-dtp');
  }

  return init;

});
