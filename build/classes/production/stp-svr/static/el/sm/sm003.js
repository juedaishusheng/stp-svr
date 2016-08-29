define(function (require) {

  function renderTable (results) {
    var tablesTmpl = Handlebars.compile($('#sm003_table').html());
    $('.sm003_data').html(tablesTmpl(results));
    }

    var _reqProxy = {
      url: 'api/sm/sm004/transView',
      argsBuilder: argsBuilder,
      callback: renderTable,
      sortSelector: '.sm003 .panel .stp-table-sm003',
      pagingSelector: '.sm003 .panel .stp-paging-sm003',
      trigger: '.sm003 .search-btn',
      immediately: true
    };
    function argsBuilder () {
      var condition = {
        cargoPic: $('#cargoPic').val(),
        cargoNo: $('#cargoNo').val(),
        dateTo: $('#dateTo').val(),
        dateFrom:$('#dateFrom').val()
    };
    return condition;
    }
    function init () {
      EL.paging(_reqProxy);
      EL.dtp('.sm003 .el-dtp');
      }
      return init;
    });
