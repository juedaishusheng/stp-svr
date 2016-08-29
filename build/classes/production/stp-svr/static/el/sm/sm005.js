/*
 * EL UI - 1.0.0
 * http://www.elitesland.com/
 *
 * Copyright 2016 Elitesland.com
 */

define(function (require) {
  function renderTable (results) {
    var tablesTmpl = Handlebars.compile($('#sm005_table').html());
      $('.sm005_data').html(tablesTmpl(results));
    }

    var _reqProxy = {
      url: 'api/sm/sm005/page/list',
      argsBuilder: argsBuilder,
      callback: renderTable,
      sortSelector: '.sm005 .panel .stp-table-sm005',
      pagingSelector: '.sm005 .panel .stp-paging-sm005',
      trigger: '.sm005 .search-btn',
      immediately: true
    };
    function argsBuilder () {
      var soNo=$("#soNo").val();
      var custName=$("#custName").val();
      var outWhName=$("#outWhName").val();
      var inWhName=$("#inWhName").val();
      var docDateFrom=$("#docDateFrom").val();
      var docDateTo=$("#docDateTo").val();
      //EL.msg(custName);
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
    function generateElUdcSelect(){
            var _tmpls = {};
//            var queryData = {};
            $('.el-hbs-udc-select').each(function () {
                var $hbs = $(this), udcName = $hbs.data('udcName'),udcCode=$hbs.data('udcCode'),selectName=$hbs.data('selectName');
                var selectTemp =  '<select name=\"'+selectName+'\">{{opt udcNames udcCode}}</select>';
                //if(_tmpls[udcName] == undefined){
                    _tmpls[udcName] = Handlebars.compile(selectTemp);
                    EL.get('api/ui/udc/'+udcName)
                      .then(function (data) {
//                          console.log(data);
//                          queryData[udcName] = data;
                          return $hbs.html(_tmpls[udcName]({
//                            udcNames:queryData[udcName],
                            udcNames:data,
                            udcCode:udcCode
                          }));
                      });
               /* }else{
                     return $hbs.html(_tmpls[udcName]({
                        udcNames:queryData[udcName],
                        udcCode:udcCode
                      }));
                }*/
            });
        }
    function init () {
      EL.dtp('.sm005 .el-dtp');
      EL.paging(_reqProxy);
      generateElUdcSelect();
    }
    return init;
  });
