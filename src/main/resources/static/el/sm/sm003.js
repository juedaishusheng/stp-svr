define(function (require) {

  function renderTable(results) {
    var tablesTmpl = Handlebars.compile($('.sm003_table').html());
    $('.sm003 .table-sm003 .sm003_data').html(tablesTmpl(results));
  }

  var _reqProxy = {
    url: 'api/sm/sm003/listView',
    argsBuilder: argsBuilder,
    callback: renderTable,
    selector: '.sm003 .panel .table-sm003',
    pagingSelector: '.sm003 .panel .stp-paging-sm003',
    trigger: '.sm003 .search-btn',
    immediately: true
  };

  function argsBuilder() {
    var condition = {
      'transCompanyAddrno':$('#sm003-transSelect option:selected').val(),
      'cargoPic': $('#sm003-cargoPic').val(),
      'cargoNo': $('#sm003-cargoNo').val(),
      'demandDeliDateFrom': $('#sm003-demandDeliDateFrom').val(),
      'demandDeliDateTo': $('#sm003-demandDeliDateTo').val()
    };
    return condition;
  }
   function collapse(){
    //收缩按钮
       $('#sm003-collapse-btn').on('click', function () {
         $(this).find('i').toggleClass("fa-plus");
         $(this).find('i').toggleClass("fa-minus");
         $(this).parent().find('.search-toggle-content').toggle();
       });
   }
  function init() {
    EL.paging(_reqProxy);
    EL.dtp('.sm003 .el-dtp');
    generateSuppSelect('sm003');
    collapse();
  }

  return init;
});
