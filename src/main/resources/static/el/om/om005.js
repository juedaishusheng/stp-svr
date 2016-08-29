/*
 * EL UI - 1.0.0
 * http://www.elitesland.com/
 *
 * Copyright 2016 Elitesland.com
 */

define(function (require) {

  var _reqProxy = {
    url: 'api/om/om005/listView',
    argsBuilder: argsBuilder,
    callback: renderTable,
    selector: '.om005 .table-om005',
    pagingSelector: '.om005 .om005-listView-paging',
    trigger: '.om005 .search-btn',
    immediately: true
  };

  function argsBuilder() {
    var condition = {
      soNo: $('#om005-soNo').val(),
      custName: $('#om005-custName').val(),
      prodName: $('#om005-prodName').val(),
      demandDeliDateFrom: $('#om005-demandDeliDateFrom').val(),
      demandDeliDateTo: $('#om005-demandDeliDateTo').val()
    };
    return condition;
  }

  function renderTable(results) {
    var tablesTmpl = Handlebars.compile($('#om005-listViewTpl').html());
    $('#om005-listViewData').html(tablesTmpl(results));
  }

  function init() {
    EL.dtp('.om005 .el-dtp');
    EL.paging(_reqProxy);
  }

  return init;

});

