define(function (require) {

  function renderTable(results) {
    var tablesTmpl = Handlebars.compile($('.sm001_table').html());
    $('.sm001 .table-sm001 .sm001_data').html(tablesTmpl(results));
  }

  var _reqProxy = {
    url: 'api/sm/sm001/listView',
    argsBuilder: argsBuilder,
    callback: renderTable,
    selector: '.sm001 .panel .table-sm001',
    pagingSelector: '.sm001 .panel .stp-paging-sm001',
    trigger: '.sm001 .search-btn',
    immediately: true
  };

  function argsBuilder() {
      var condition = {
        demandDeliDate: $('#sm001-dateTo').val()
      };
    return condition;
  }

  function init() {
    var dd = new Date();
    dd.setDate(dd.getDate() + 2);//获取2天后的日期
    var y = dd.getFullYear();
    var m = dd.getMonth() + 1;//获取当前月份的日期
    var d = dd.getDate();
    var date = y + "-" + m + "-" + d;
    $('#sm001-dateTo').val(date);
    EL.table(_reqProxy);
    EL.dtp('.sm001 .el-dtp');
  }

  return init;
});
