/*
 * EL UI - 1.0.0
 * http://www.elitesland.com/
 *
 * Copyright 2016 Elitesland.com
 */

define(function (require) {

  /*function init() {
   EL.dtp('.om005 .el-dtp');
   // EL.paging(_reqProxy);
   var _tmpl = Handlebars.compile($('#om005-listViewTpl').html());
   EL.get('api/om/om005/listView')
   .then(function (json) {
   $('#om005-listViewData').html(_tmpl(json));

   });
   $('#search_btn').on('click', function () {
   var args = {
   soNo: $('#soNo').val(),
   custName: $('#custName').val(),
   prodName: $('#prodName').val(),
   dateFrom: $('#dateFrom').val(),
   dateTo: $('#dateTo').val()
   };
   var tablesTmpl = Handlebars.compile($('#om005-listViewTpl').html());
   EL.get('api/om/om005/listView', args).then(function (json) {
   $('#om005-listViewData').html(tablesTmpl(json));

   });
   });
   }
   return init;

   });*/

  var _reqProxy = {
    url: 'api/om/om005/listView',
    argsBuilder: argsBuilder,
    callback: renderTable,
    sortSelector: '.om005 .om005-listView-table',
    pagingSelector: '.om005 .om005-listView-paging',
    trigger: '.om005 .search-btn',
    immediately: true
  };

  function argsBuilder() {
    var condition = {
      soNo: $('#soNo').val(),
      custName: $('#custName').val(),
      prodName: $('#prodName').val(),
      dateFrom: $('#dateFrom').val(),
      dateTo: $('#dateTo').val()
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

