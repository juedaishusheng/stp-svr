define(function (require) {

  function renderTable (results) {
    var tablesTmpl = Handlebars.compile($('#sm001_table').html());
    $('.sm001_data').html(tablesTmpl(results));
  }

  var _reqProxy = {
    url: 'api/sm/sm001/listView',
    argsBuilder: argsBuilder,
    callback: renderTable,
    sortSelector: '.sm001 .panel .stp-table-sm001',
    pagingSelector: '.sm001 .panel .stp-paging-sm001',
    trigger: '.sm001 .search-btn',
    immediately: true
  };
  function argsBuilder () {
    if(null==$('#dateTo').val()||""==$('#dateTo').val()){
      var dd = new Date();
      dd.setDate(dd.getDate()+2);//获取2天后的日期
      var y = dd.getFullYear();
      var m = dd.getMonth()+1;//获取当前月份的日期
      var d = dd.getDate();
      var date = y+"-"+m+"-"+d;
      var condition = {
          dateTo: date
      };
    }else {
      var condition = {
          dateTo: $('#dateTo').val()
      };
    }

    return condition;
  }
  function init () {
    EL.paging(_reqProxy);
    EL.dtp('.sm001 .el-dtp');
  }
    return init;
});
