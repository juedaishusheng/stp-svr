/*
 * EL UI - 1.0.0
 * http://www.elitesland.com/
 *
 * Copyright 2016 Elitesland.com
 */
define(function (require) {
  //新增行
  function insertRow(){
    var tr = '<tr class="edit">'+
                    '<td><input type="checkbox" name="checkItem">'+
                      '<input type="hidden" class="edit id" name="id" value="{{id}}"/>'+
                      '<input type="hidden" class="edit delinoteProdId" value="{{delinoteProdId}}"/>'+
                    '</td>'+
                    '<td class="t10 edit ">'+
                      '<span data-prop="transCompanyAddrno">'+
                        '<div class="el-hbs-supp-desc" data-supp-addrno="{{transCompanyAddrno}}"></div>'+
                       '</span>'+
                      '<div class="el-hbs-supp-select edit el-center transCompanyAddrno" data-supp-addrno="{{transCompanyAddrno}}" data-select-name="transCompanyAddrno"></div>'+
                    '</td>'+
                    '<td class="t6 edit "><!--<input type="text" value="{{cargoNo}}">-->'+
                      '<span data-prop="cargoNo">{{cargoNo}}</span>'+
                      '<input type="text" class="input-sm form-control edit el-center cargoNo" value="{{cargoNo}}"/>'+
                    '</td>'+
                    '<td class="t6 edit "><!--<input type="text" value="{{cargoPic}}">-->'+
                      '<span data-prop="cargoPic">{{cargoPic}}</span>'+
                      '<input type="text" class="input-sm form-control edit cargoPic" value="{{cargoPic}}"/>'+
                    '</td>'+
                    '<td class="t6 edit "><!--<input type="text" value="{{cargoPerson}}">-->'+
                      '<span data-prop="cargoPerson">{{cargoPerson}}</span>'+
                      '<input type="text" class="input-sm form-control edit cargoPerson" value="{{cargoPerson}}"/>'+
                    '</td>'+
                    '<td class="t4 el-right edit "><!--<input type="text" value="{{fee1}}">-->'+
                      '<span data-prop="fee1">{{fee1}}</span>'+
                      '<input type="text" class="input-sm form-control edit el-right fee1" value="{{fee1}}"/>'+
                    '</td>'+
                    '<td class="t4 el-right edit "><!--<input type="text" value="{{fee2}}">-->'+
                      '<span data-prop="fee2">{{fee2}}</span>'+
                      '<input type="text" class="input-sm form-control edit el-right fee2" value="{{fee2}}"/>'+
                    '</td>'+
                    '<td class="t4 el-right edit "><!--<input type="text" value="{{deliQty}}">-->'+
                      '<span data-prop="deliQty">{{deliQty}}</span>'+
                      '<input type="text" class="input-sm form-control edit el-right deliQty" value="{{deliQty}}"/>'+
                    '</td>'+
                    '<td class="t4 el-right edit "><!--<input type="text" value="{{giftQty}}">-->'+
                      '<span data-prop="giftQty">{{giftQty}}</span>'+
                      '<input type="text" class="input-sm form-control edit el-right giftQty" value="{{giftQty}}"/>'+
                    '</td>'+
                    '<td class="t6 el-center edit "><!--<input type="text" value="{{deliDate}}" class="el-dtp">-->'+
                      '<span data-prop="deliDate">{{deliDate}}</span>'+
                      '<input type="text" name="deliDate" class="input-sm form-control edit el-dtp deliDate"  value="{{deliDate}}"/>'+
                    '</td>'+
                    '<td class="t4 el-center">'+
                      '<button type="button" class="btn btn-info btn-xs ops editing">新增</button>'+
                    '</td>'+
                  '</tr>';
     ;
     var delinoteProdId = $("input[name='delinoteProdId']:checked").val();
     $('.sm002_data2').append(Handlebars.compile(tr)({'delinoteProdId':delinoteProdId}))
      .find('.ops').off('click').on('click', function() {
           var $el = $(this);
           $el.hasClass('editing') ? saveRow($el) : editRow($el);
       });
     generateSuppSelect('sm002');
     EL.dtp('.sm002 .el-dtp');
  }

  // 进入编辑模式
    function editRow($el) {
      var $tr = $el.closest('tr');
      $tr.addClass('edit');
      generateSuppSelect('sm002');
      $el.html('保存').addClass('editing');
    }
    // 更新完成后的处理
      function rowSaved($tr, $el, data) {
        var dataView = {
            id:data.id,
            delinoteProdId:data.delinoteProdId,
            transCompanyAddrno:data.transCompanyAddrno,
            cargoNo:data.cargoNo,
            cargoPic:data.cargoPic,
            cargoPerson:data.cargoPerson,
            fee1:data.fee1,
            fee2:data.fee2,
            deliQty:data.deliQty,
            giftQty:data.giftQty,
            deliDate:data.deliDateYmd
        };
        $tr.find('span').each(function() {
          var $span = $(this), propName = $span.data('prop');
          if(propName!='transCompanyAddrno'){
             $span.text(dataView[propName]);
          }else{
              var suppDesc = '<div class="el-hbs-supp-desc" data-supp-addrno="'+dataView[propName]+'"></div>';
             $span.html(suppDesc);
          }
        });
        $tr.find('.id').val(data.id);
        $tr.find('.delinoteProdId').val(data.delinoteProdId);
        $tr.removeClass('edit');
        generateSuppDesc('sm002');
        $el.html('修改').removeClass('editing')
        if($el.hasClass('inserting')){
          $el.removeClass('inserting').addClass('ops');
        }

      }
    // 保存修改并退出编辑模式
    function saveRow($el) {
      var $tr = $el.closest('tr');
      var msgs = [], args = rowInput($tr, msgs);
      msgs.length ? EL.msg(msgs) : EL.post('api/sm/sm002/deliUpdate', args)
          .then(function(data) {
                rowSaved($tr, $el, data);
           });
    }
    // 数据收集及校验
      function rowInput($tr, msgs) {
        var data = {};
        $tr.find('.error').removeClass('error');
        data.id = $tr.find('.id').val();
        data.delinoteProdId = $tr.find('.delinoteProdId').val();
        data.transCompanyAddrno = $tr.find('select[name="transCompanyAddrno"]').val();
        data.cargoNo = $tr.find('.cargoNo').val();
        data.cargoPic = $tr.find('.cargoPic').val();
        data.cargoPerson = $tr.find('.cargoPerson').val();
        data.fee1 = _inputNum($tr.find('.fee1'), msgs, '过路过桥费');
        data.fee2 = _inputNum($tr.find('.fee2'), msgs, '物流费用');
        data.deliQty = _inputNum($tr.find('.deliQty'), msgs, '发货数量');
        data.giftQty = _inputNum($tr.find('.giftQty'), msgs, '赠送数量');
        data.deliDate = $tr.find('.deliDate').val();
        return data;
      }
      function _inputNum($el, msgs, label, data) {
          var input = $el.val();
          if(input!=''){
              if (!/^\d+(\.\d+)?$/.test(input)) {
                $el.addClass('error');
                msgs.push(label + ': 无效数字');
              }
          }
          return input;
        }
   /*
     展示物流信息
   */
  function showLogistics(delinoteProdId){
     var _tmpl = Handlebars.compile($('#sm002_table2').html());
          EL.get('api/sm/sm002/showDeli','delinoteProdId='+delinoteProdId)
            .then(function (json) {
              $('.sm002_data2').html(_tmpl(json))
               .find('.ops').off('click').on('click', function() {
                    var $el = $(this);
                    $el.hasClass('editing') ? saveRow($el) : editRow($el);
                });
              generateSuppDesc('sm002');
              EL.dtp('.sm002 .el-dtp');
            });
            $('#sm002-2-removeBtn').off('click').on('click', function() {
                 var checkList = $("input[name='checkItem']:checked");
                    if(checkList.length<=0){
                     EL.msg('至少选择一行做删除操作!');
                     return false;
                 }else{
                    EL.ask('您确认要删除吗？').then(function () {
                        var ids = "";
                        for (var i = 0; i < checkList.length; i++) {
                           $tr = $(checkList[i]).parents('tr');
                           ids += $tr.find('input[name="id"]').val()+',';
                        }
                         EL.post('api/sm/sm002/deliDelete', "ids="+ids)
                             .then(function(data) {
                                  for (var i = 0; i < checkList.length; i++) {
                                    $(checkList[i]).parents('tr').remove();
                                  }
                                   // EL.msg("删除成功");
                              });
                    })
                 }
             });
             $('#sm002-2-insertBtn').off('click').on('click', function() {
                  insertRow();
              });

  }
    var _pageReqProxy = {
      url: 'api/sm/sm002/page/list',
      argsBuilder: pageArgsBuilder,
      callback: renderTable,
      selector: '.sm002 .panel .sm002-listView-table',
      pagingSelector: '.sm002 .panel .stp-paging-sm002',
      trigger: '.sm002 .sm002-listView-searchBtn',
      immediately: true
    };
    function renderTable (results) {
        var tablesTmpl = Handlebars.compile($('#sm002_table1').html());
        $('.sm002_data1').html(tablesTmpl(results));
        generateElUdcDesc('sm002');
        generateElUdcSelect('sm002');
         $('#sm002-1-saveBtn').off('click').on('click', function() {
               var checkList = $("input[name='delinoteProdId']")
               var updateInfo = [],flag=1;
               for (var i = 0; i < checkList.length; i++) {
                  $tr = $(checkList[i]).parents('tr');
                  $tr.find('.error').removeClass('error');
                  var idVal = $(checkList[i]).val();
                  $select = $tr.find('select[name="lineStatus"]');
                  var seltValue = $select.val();
                  if(!!seltValue && seltValue!="null"){
                    updateInfo.push({'id':idVal,'lineStatus':seltValue});
                  }else{
                    $select.addClass('error');
                    flag+=1;
                  }
               }
               if(flag==1){//JSON.stringify()
                     EL.post('api/sm/sm002/saveStatus', "param="+JSON.stringify(updateInfo))
                         .then(function(data) {
                                if(data>0){
                                    EL.msg("保存成功");
                                }else{
                                    EL.msg("保存失败");
                                }
                          });
               }else{
                    EL.msg('状态不能设置为全部','red');
               }
          });
        $("input[name='delinoteProdId']").off('click').on('click', function() {
            var delinoteProdId = $("input[name='delinoteProdId']:checked").val();
            showLogistics(delinoteProdId);
        });
        $("input[name=delinoteProdId]:eq(0)").attr("checked",'checked').click();
       }
    function pageArgsBuilder () {
          var soNo=$("#sm002-soNo").val();
           var custName=$("#sm002-custName").val();
           var prodName=$("#sm002-prodName").val();
           var demandDeliDateFrom=$("#sm002-demandDeliDateFrom").val();
           var demandDeliDateTo=$("#sm002-demandDeliDateTo").val();
           var lineStatus="";
          $(".sm002 input[name='lineStatus']:checked").each(function(){
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
      EL.table(_pageReqProxy);
      EL.dtp('.sm002 .el-dtp');
     }
     return init;
});
