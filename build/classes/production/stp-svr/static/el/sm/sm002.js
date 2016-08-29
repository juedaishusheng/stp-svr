/*
 * EL UI - 1.0.0
 * http://www.elitesland.com/
 *
 * Copyright 2016 Elitesland.com
 */
define(function (require) {


   /*
     展示物流信息
   */
  function showLogistics(delinoteProdId){
     var _tmpl = Handlebars.compile($('#sm002_table2').html());
          EL.get('api/sm/sm002/showDeli','delinoteProdId='+delinoteProdId)
            .then(function (json) {
              $('.sm002_data2').html(_tmpl(json));
              EL.dtp('.sm002 .el-dtp');
            });
            $('#sm002-2-removeBtn').on('click', function() {
                 var checkList = $("input[name='checkItem']:checked");
                    if(checkList.length<=0){
                     EL.msg('至少选择一行!');
                     return false;
                 }else{
                    var ids = "";
                    for (var i = 0; i < checkList.length; i++) {
                      $(checkList[i]).parents('tr').remove();
                    }
                 }
             });
  }
    var _pageReqProxy = {
      url: 'api/sm/sm002/page/list',
      argsBuilder: pageArgsBuilder,
      callback: renderTable,
      sortSelector: '.sm002 .panel .sm002-listView-table',
      pagingSelector: '.sm002 .panel .stp-paging-sm002',
      trigger: '.sm002 .sm002-listView-searchBtn',
      immediately: true
    };
    function renderTable (results) {
        var tablesTmpl = Handlebars.compile($('#sm002_table1').html());
        $('.sm002_data1').html(tablesTmpl(results));
        $("input[name='delinoteProdId']").on('click', function() {
            var delinoteProdId = $("input[name='delinoteProdId']:checked").val();
            showLogistics(delinoteProdId);
        });
        $("input[name=delinoteProdId]:eq(0)").attr("checked",'checked').click();
       }
    function pageArgsBuilder () {
          var soNo=$("#soNo").val();
           var custName=$("#custName").val();
           var prodName=$("#prodName").val();
           var demandDeliDateFrom=$("#demandDeliDateFrom").val();
           var demandDeliDateTo=$("#demandDeliDateTo").val();
           var checkList = $("input[name='lineStatus']:checked");
           var lineStatus="";
          $("input[name='lineStatus']:checked").each(function(){
            lineStatus+=$(this).val()+",";
           })

           var condition = {
            'so.soNo':soNo,
           'cust.custName':custName,
           'prod.prodName':prodName,
           'demandDeliDateFrom':demandDeliDateFrom,
           'demandDeliDateTo':demandDeliDateTo,
           'lineStatus':lineStatus
           };
        return condition;
    }
    function init () {
      EL.paging(_pageReqProxy);
      EL.dtp('.sm002 .el-dtp');
     }
     return init;
});
