/**
************************************
************************************
*********@TODO 未经验证，谨慎使用
************************************
************************************
**/

/**
    构建udc select 控件(divToken:页面标识符，增加jquery查询精度和速度，如<div class="sm003">页面使用，传值sm003)
    用法： <div class="el-hbs-udc-select" data-udc-name="DEMO"  data-udc-code="xxx" data-select-name="xxx" data-select-class="xxx"></div>
        必须参数：class="el-hbs-udc-select"
                  data-udc-name="DEMO"(DEMO是java枚举类UdcMetas中的一个枚举)
        可选参数：data-udc-code="xxx"(默认选中值)
                  data-select-name="xxx"（生成select控件的name属性，不需要name属性时不用携带data-select-name）
                  data-select-class="xxx"(生成select控件的class属性，不需要class属性时不用携带data-select-class）

     调用：generateElUdcSelect('sm002');
**/
function generateElUdcSelect(divToken){
      if('string' === $.type(divToken)){
            var _tmpls = {};
//            var queryData = {};
            $('.el-hbs-udc-select').each(function (i) {
                var $hbs = $(this), udcName = $hbs.data('udcName'),udcCode=$hbs.data('udcCode'),selectName=$hbs.data('selectName'),selectClass=$hbs.data('selectClass');
                if(udcCode==undefined){udcCode=''};
                 var selectTemp;
                 if(!!selectName){
                      if(!!selectClass){
                          selectTemp =  '<select class=\"'+selectClass+'\" name=\"'+selectName+'\">{{opt udcNames udcCode}}</select>';
                      }else{
                          selectTemp =  '<select  name=\"'+selectName+'\">{{opt udcNames udcCode}}</select>';
                      }
                 }else{
                      if(!!selectClass){
                          selectTemp =  '<select class=\"'+selectClass+'\" >{{opt udcNames udcCode}}</select>';
                      }else{
                          selectTemp =  '<select >{{opt udcNames udcCode}}</select>';
                      }
                 }
                //if(_tmpls[i] == undefined){
                    _tmpls[i] = Handlebars.compile(selectTemp);
                    if(!!udcName){
                        EL.get('api/ui/udc/'+udcName)
                            .then(function (data) {
      //                          console.log(data);
      //                          queryData[udcName] = data;
                                return $hbs.html(_tmpls[i]({
      //                            udcNames:queryData[udcName],
                                  udcNames:data,
                                  udcCode:udcCode
                                }));
                            });
                    }else{
                          return $hbs.html(_tmpls[i]({
          //                            udcNames:queryData[udcName],
                                      udcNames:null,
                                      udcCode:''
                                    }));
                    }

               /* }else{
                     return $hbs.html(_tmpls[i]({
                        udcNames:queryData[udcName],
                        udcCode:udcCode
                      }));
                }*/
            });
       }
}
/**
  构建udc desc 控件，根据udcCode显示name
  (divToken:页面标识符，增加jquery查询精度和速度，如<div class="sm003">页面使用，传值sm003)
  用法：<div class="el-hbs-udc-desc" data-udc-name="DEMO"  data-udc-code="03" ></div>
  必须参数：class="el-hbs-udc-desc"
            data-udc-name="DEMO"(DEMO是java枚举类UdcMetas中的一个枚举)
            data-udc-code="xxx"(实际code值)
   调用：generateElUdcDesc('sm002');
**/
function generateElUdcDesc(divToken){
      if('string' === $.type(divToken)){
          var _tmpls = {};
          $('.el-hbs-udc-desc').each(function (i) {
                var $hbs = $(this), udcName = $hbs.data('udcName'),udcCode=$hbs.data('udcCode');
                var selectTemp =  '{{udcName}}';
                _tmpls[i] = Handlebars.compile(selectTemp);
                if(!!udcName && (!!udcCode ||udcCode==0)){
                    EL.get('api/ui/udc/'+udcName+'/'+udcCode)
                      .then(function (data) {
                          return $hbs.html(_tmpls[i]({
                            udcName:data.name
                          }));
                      });
                }else{
                      return $hbs.html(_tmpls[i]({
                        udcName:''
                      }));
                }
          });
      }
 }
/**
  构建udc desc 控件，用于显示udcName.
  js脚本使用
**/
function getElUdcDesc(udcName, udcCode){
      EL.get('api/ui/udc/'+udcName+'/'+udcCode)
        .then(function (data) {
            return data.name;
        });
 }
(function() {
    Handlebars.registerHelper('suppOpt', function (supp, addrNo) {
     return new Handlebars.SafeString(_suppOpts(supp, addrNo));
   });
   // 生成 <option /> 元素
   function _suppOpt(supp, addrNo) {
     return '<option value="' + supp.addrNo +
       (supp.addrNo === addrNo ? '" selected>' : '">') +
       supp.suppName + "</option>"
   }
   // 生成多个 <option /> 元素
   function _suppOpts(supp, addrNo) {
     if (!supp || !supp.length) return '';
     if (supp.length === 1) return _suppOpt(supp[0], addrNo);
     var h = '';
     for (var i = 0, n = supp.length; i < n; i++) {
       h += _suppOpt(supp[i], addrNo);
     }
     return h;
   }
})();
 /**
    构建供应商的Select控件(divToken:页面标识符，增加jquery查询精度和速度，如<div class="sm003">页面使用，传值sm003)
    用法： <div class="el-hbs-supp-select" data-supp-addrno="xxx" data-select-name="xxx" data-select-class="xxx"></div>
    必须参数：class="el-hbs-supp-select"
    可选参数：data-supp-addrno="xxx"（默认选中）
              data-select-name="xxx"（生成select控件的name属性，不需要name属性时不用携带data-select-name）
              data-select-class="xxx"（生成select控件的class属性，不需要class属性时不用携带data-select-class）

     调用：generateSuppSelect('sm003');
 **/
 function generateSuppSelect(divToken){
        if('string' === $.type(divToken)){
              var _tmpls = {};
              $('.'+divToken+' .el-hbs-supp-select').each(function (i) {
                  var $hbs = $(this), suppAddrno=$hbs.data('suppAddrno'),selectName=$hbs.data('selectName'),selectClass=$hbs.data('selectClass');
                  if(suppAddrno==undefined){suppAddrno=''};
                  var selectTemp;
                  if(!!selectName){
                      if(!!selectClass){
                          selectTemp =  '<select class=\"'+selectClass+'\" name=\"'+selectName+'\">{{suppOpt supp addrNo}}</select>';
                      }else{
                          selectTemp =  '<select name=\"'+selectName+'\">{{suppOpt supp addrNo}}</select>';
                      }
                  }else{
                      if(!!selectClass){
                           selectTemp =  '<select class=\"'+selectClass+'\">{{suppOpt supp addrNo}}</select>';
                      }else{
                           selectTemp =  '<select>{{suppOpt supp addrNo}}</select>';
                      }
                  }
                    _tmpls[i] = Handlebars.compile(selectTemp);
                     EL.get('api/common/supp/list')
                         .then(function (data) {
                           return $hbs.html(_tmpls[i]({
                             supp:data,
                             addrNo:suppAddrno
                           }));
                      });
               });
         }
 }
 /**
   构建供应商的desc 控件，用于根据addrNo显示suppName
   (divToken:页面标识符，增加jquery查询精度和速度，如<div class="sm003">页面使用，传值sm003)
   用法：<div class="el-hbs-supp-desc" data-supp-addrno="xxx"></div>
   必须参数：class="el-hbs-supp-desc"
             data-supp-addrno="xxx"(实际addrNo值)

    调用：generateSuppDesc('sm002');
 **/
 function generateSuppDesc(divToken){
      if('string' === $.type(divToken)){
           var _tmpls = {};
           $('.el-hbs-supp-desc').each(function (i) {
                 var $hbs = $(this), suppAddrno=$hbs.data('suppAddrno');
                 var selectTemp =  '{{suppName}}';
                 _tmpls[i] = Handlebars.compile(selectTemp);
                  if(!!suppAddrno || suppAddrno== 0){
                       EL.get('api/common/supp/one/'+suppAddrno)
                           .then(function (data) {
                               return $hbs.html(_tmpls[i]({
                                 suppName:data.suppName
                               }));
                           });
                  }else{
                         return $hbs.html(_tmpls[i]({
                             suppName:''
                           }));
                  }

           });
       }
  }



