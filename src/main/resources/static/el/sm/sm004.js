define(function (require) {

  function renderTable (results) {
    var tablesTmpl = Handlebars.compile($('.hbs-tables').html());
    $('.sm004 .table-sm004 .sm004_data').html(tablesTmpl(results));
    }

    var _reqProxy = {
      url: 'api/sm/sm004/listView',
      argsBuilder: argsBuilder,
      callback: renderTable,
      selector: '.sm004 .panel .table-sm004',
      pagingSelector: '.sm004 .panel .stp-paging-sm004',
      trigger: '.sm004 .search-btn',
      immediately: true
    };
    function argsBuilder () {
      var condition = {
        soNo: $('#sm004-soNo').val(),
        custName: $('#sm004-custName').val(),
        prodName: $('#sm004-prodName').val(),
        demandDeliDateFrom: $('#sm004-demandDeliDateFrom').val(),
        demandDeliDateTo: $('#sm004-demandDeliDateTo').val()
    };
    return condition;
    }
    function init () {
      EL.paging(_reqProxy);
      EL.dtp('.sm004 .el-dtp');
      }
      return init;
    });
