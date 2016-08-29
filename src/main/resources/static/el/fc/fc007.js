/*
 * EL UI - 1.0.0
 * http://www.elitesland.com/
 *
 * Copyright 2016 Elitesland.com
 */

define(function (require) {
  var _tmpls = {};
  var _reqProxy = {
    url: 'api/fc/fc007/listView',
    argsBuilder: argsBuilder,
    callback: renderTable,
    selector: '.fc007  .table-fc007-1',
    pagingSelector: '.fc007  .stp-paging-fc007-1',
    trigger: '.fc007 .search-btn',
    immediately: true
  };
  var _reqProxy2 = {
    url: 'api/fc/fc007/editView',
    argsBuilder: argsBuilder2,
    callback: renderTable2,
    selector: '.fc007 .table-fc007-2',
    pagingSelector: '.fc007 .stp-paging-fc007-2'
  }


  function renderTable(data) {
    $('.fc007 .page-container .tab-content .summary_data').html( _tmpls['summary_table'](data));
    $(".fc007 .summary_data input[name='summaryRadio']:eq(0)").attr("checked", 'checked');
    $('.fc007 .panel-body').removeClass('hide');
    return bindSummaryTableClick();
  }
  function renderTable2(data) {
    $('.fc007 .panel-body').addClass('hide');
    $('.fc007 .page-container .tab-content .detail_data').html( _tmpls['detail_table'](data));
  }
  function argsBuilder() {
    var formObj = $('.fc007 .search-toggle-content');
    var condition = {
      soNo: formObj.find('.soNo').val(),
      prodName: formObj.find('.prodName').val(),
      docDateFrom: formObj.find('.docDateFrom').val(),
      docDateTo: formObj.find('.docDateTo').val()
    };
    return condition;
  }
  function argsBuilder2() {
    var checkRadio = $(".fc007 .summary_data input[name='summaryRadio']:checked");
    var conditon = {
      prodCode: checkRadio.data('prodCode'),
      addrName: checkRadio.data('addrName')
    };
    return conditon;
  }

  function bindSummaryTableClick() {
       $('#fc007-detail-tab').off('click').on('click', function () {
             EL.table(_reqProxy2);
          });
      $("#fc007-summary-tab").on('click', function() {
            $('.fc007 .panel-body').removeClass('hide');

      });
  }

  //视图管理
  function view() {
    EL.dtp('.fc007 .el-dtp');
    //初始化加载表格数据
    EL.table(_reqProxy);
//    EL.table(_reqProxy2);
  }

  function init() {
    //编译所有模板
    $('.fc007> .hbs').each(function () {
      var $hbs = $(this), viewId = $hbs.data('viewId');
      _tmpls[viewId] = Handlebars.compile($hbs.html());
    });
    view();
  }
  return init;
});
