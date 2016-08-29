define(function (require) {

  function renderTable (results) {
    var tablesTmpl = Handlebars.compile($('#sm004_table').html());
    $('.sm004_data').html(tablesTmpl(results));
    $('.dateFrom').datepicker({
      todayHighlight: true,
      autoclose: true
    });
    $('.dateTo').datepicker({
      todayHighlight: true,
      autoclose: true
    });
    }

    var _reqProxy = {
      url: 'api/sm/sm004/listView',
      argsBuilder: argsBuilder,
      callback: renderTable,
      sortSelector: '.sm004 .panel .stp-table-sm004',
      pagingSelector: '.sm004 .panel .stp-paging-sm004',
      trigger: '.sm004 .search-btn',
      immediately: true
    };
    function argsBuilder () {
      var condition = {
        soNo: $('#soNo').val(),
        custName: $('#custName').val(),
        prodName: $('#prodName').val(),
        dateFrom: $('#dateFrom').val(),
        dateTo: $('#dateTo').val()
    };
    return condition;
    }
    function init () {
      EL.paging(_reqProxy);
      EL.dtp('.sm004 .el-dtp');
      }
      return init;
    });
