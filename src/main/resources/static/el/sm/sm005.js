/*
 * EL UI - 1.0.0
 * http://www.elitesland.com/
 *
 * Copyright 2016 Elitesland.com
 */

define(function (require) {
  function renderTable (results) {
    var tablesTmpl = Handlebars.compile($('#sm005_table').html());
      $('.sm005 .sm005_data').html(tablesTmpl(results));
    }

    var _reqProxy = {
      url: 'api/sm/sm005/page/list',
      argsBuilder: argsBuilder,
      callback: renderTable,
      selector: '.sm005 .panel .stp-table-sm005',
      pagingSelector: '.sm005 .panel .stp-paging-sm005',
      trigger: '.sm005 .search-btn',
      immediately: true
    };
    function argsBuilder () {
      var soNo=$("#sm005-soNo").val();
      var custName=$("#sm005-custName").val();
      var outWhName=$("#sm005-outWhName").val();
      var inWhName=$("#sm005-inWhName").val();
      var docDateFrom=$("#sm005-docDateFrom").val();
      var docDateTo=$("#sm005-docDateTo").val();
      var condition = {
       'so.soNo':soNo,
      'cust.custName':custName,
      'outWh.whName':outWhName,
      'inWh.whName':inWhName,
      'docDateFrom':docDateFrom,
      'docDateTo':docDateTo
      };
      //EL.msg(condition);
      return condition;
    }

    function init () {
      EL.dtp('.sm005 .el-dtp');
      EL.suggestion({
          url: 'api/common/dropdown/cust',//参数直接后缀到url上 api/common/dropdown/cust?ouId=1
          selector: '.sm005 input.custName'
        });
       EL.suggestion({
            url: 'api/common/dropdown/metas/SO',
            selector: '.sm005 input.soNo'
          });
      EL.table(_reqProxy);
    }
    return init;
  });
