/*  * EL UI - 1.0.0 
 * http://www.elitesland.com/ 
 * Copyright 2016 Elitesland.com 
 * */
define(function (require) {
  var _tmpls = {};
  var manuId = void(0);
  var soProdId=void(0);
// ================================生产管理 start seven ================================    
  var listView_reqProxy = {
    url: 'api/cm_fac/cm207/listView',
    argsBuilder: argsBuilder,
    callback: renderTable,
    selector: '.cm207 .table-listView',
    pagingSelector: '.cm207 .paging-listView',
    trigger: '.cm207 .cm207-search-btn',
    immediately: true
  };

//请求参数列表 
  function argsBuilder() {
    var prodName = $('.cm207 .listView .prodName').val(); //公司名称
    var soNo = $('.cm207 .listView .soNo').val(); //订单编号
    var prodAppr = $('.cm207 .listView .prodAppr :selected').val(); //产品信息确认
    var paperAppr = $('.cm207 .listView .paperAppr :selected').val(); //纸张确认
    var condition = {
      prodName: prodName,
      soNo: soNo,
      prodAppr: prodAppr,
      paperAppr: paperAppr
    };
    return condition;
  }

// 渲染模板 
  function renderTable(resultsData) {
    $('.cm207 .listView .produce_data').html(_tmpls['listView'](resultsData));
    hideAndShowClick();
  }
// ================================start end ================================    


  /*-------------------+
   |  页面渲染视图管理  |
   +===================*/
  function view(viewId) {
    EL.view('cm207', viewId);//页面切换 
    if (viewId === 'listView') {
      loadSelectData().then(function (data) {
        EL.table(listView_reqProxy);
        return bindClick();
      });
    }
    if (viewId === 'dblView') {
      loadDblData();//数据加载
      btnFrameList(); // 按钮组
      btnList();//切换按钮事件
      doubleClick();//绑定-文件检查双击事件
      return goBack();
    }
  }

  /*-------------------+
   | 页面Button事件管理 |
   +===================*/
  //隐藏、显示
  function hideAndShowClick() {
      $('.cm207 .search-toggle-btn').on('click', function () {
      $(this).find('i').toggleClass("fa-plus");
      $(this).find('i').toggleClass("fa-minus");
      $('.cm207 .search-toggle-content').toggle();
    });
  }
  //返回主页按钮
  function goBack() {
    $('.cm207 .dblView .returnClick').on('click', function () {
      EL.view('cm207','listView');
    });
  }

  //文件检查绑定tr双击事件
  function doubleClick() {
    $('.cm207 .dblView .fileCheck_data').on('dblclick','tr',function () {
      soProdId=$(this).data('args2');
      EL.get('api/cm_fac/cm207/fileCheckDoubleClick',{soProdId:soProdId}).then(
        function (data) {
          $('.cm207 .dblView .fileProductRequire_data').html(_tmpls['productRequire_table'](data));
        })
    })
  }
  //弹框按钮事件
  function btnFrameList() {
    $('.cm207 .btn').on('click', function () {
      var viewid = $(this).data('viewId');
      if (viewid === 'finish-cancelBtn') {//完工入库-取消按钮
        $(".cm207 .el-msg-finishCancelBtn").modal();
      }
      if (viewid === 'recordReport-cancelBtn') {//记录上报-取消按钮
        $(".cm207 .el-msg-finishCancelBtn").modal();
      }
    });

    //完工入库-取消按钮页面-确认按钮事件
    $(".cm207 .el-msg-finishCancelBtn .modal-footer .ok").click(function () {
      var finishBtnValue = $('.cm207 .finish-putBtn').text();
      if(finishBtnValue === '入库'){
        return true;
      } else {
        $('.cm207 .ducSave').removeClass('el-hide');
        $('.cm207 .ducSave').addClass('el-hide');
        $('.cm207 .finish-putBtn').text('入库');
      }
    });
    //记录上报-取消按钮页面-确认按钮事件
    $(".cm207 .el-msg-finishCancelBtn .modal-footer .ok").click(function () {
      var recBtnValue = $('.cm207 .recBtn').text();
      if(recBtnValue === '新增'){
        return true;
      }else {
        $('.cm207 .recSave').removeClass('el-hide');
        $('.cm207 .recSave').addClass('el-hide');
        $('.cm207 .recBtn').text('新增');
      }
    });

  }
  //切换按钮 事件
  function btnList(){
    $('.cm207 .btn').on('click', function () {
      var viewid=$(this).data('viewId');
      var btn_txt=$(this).text();
      if(viewid==='proBtn'){
        if(btn_txt === '报工'){
          $(this).text('保存');
          $('.cm207> .view .proSave').removeClass('hide');
        }else{
          $(this).text('报工');
          $('.cm207> .view .proSave').addClass('hide');
        } //end else
      }// end if
      else if(viewid==='recBtn'){//记录上报-新增按钮
        if(btn_txt === '新增'){
          $(this).text('保存');
          $('.cm207> .view .recSave').removeClass('el-hide');
          EL.get('api/cm_fac/cm207/recordReport',{soId:soId}).then(function (recordReportData) {
            $('.cm207 .recordSave_data').html(_tmpls['recordSave_table'](recordReportData));
          });
        }else{
          $(this).text('新增');
          $('.cm207> .view .recSave').addClass('el-hide');
          var recordReportArray = [];
          var itemDt=void(0);
          var itemDesc=void(0);
          var itemImpact=void(0);
          var itemSolution=void(0);
          $('.cm207 .dblView .recordSave_data tr').each(function () {
            itemDt=new Date().toLocaleDateString();
            itemDesc=$(this).find('.itemDesc').val();
            itemImpact=$(this).find('.itemImpact').val();
            itemSolution=$(this).find(' .itemSolution').val();
            recordReportArray.push({itemDt:itemDt,itemDesc:itemDesc,itemImpact:itemImpact,itemSolution:itemSolution});
            if(!!itemDesc && !!itemImpact && !!itemSolution){
              EL.get('api/cm_fac/cm207/recordReportSave',{itemDt:itemDt,itemDesc:itemDesc,itemImpact:itemImpact,itemSolution:itemSolution}).then(function (data) {
                if(data){
                  EL.log(data);
                  EL.msg('保存成功!');
                }else{
                  EL.msg('保存失败!');
                }
              });
            }else{
              if(!itemDesc){
                $('.cm207 .recBtn').text('保存');
                $('.cm207> .view .recSave').removeClass('el-hide');
                EL.msg("描述未输入！");
              }
              else if(!itemImpact){
                $('.cm207 .recBtn').text('保存');
                $('.cm207> .view .recSave').removeClass('el-hide');
                EL.msg("造成的影响未输入！");
              }
              else {
                $('.cm207 .recBtn').text('保存');
                $('.cm207> .view .recSave').removeClass('el-hide');
                EL.msg('解决方案未输入')
              }
            }
          });
          EL.log('recordReportArray',recordReportArray);
        } //end else
      }// end else if
      else if(viewid==='finish-putBtn'){//完工入库-入库按钮
        if(btn_txt === '入库'){
          $(this).text('保存');
          $('.cm207 .view .ducSave').removeClass('el-hide');
          EL.get('api/cm_fac/cm207/finishPut',{soId:soId}).then(function (finishPut) {
            $('.cm207 .finishSave_data').html(_tmpls['finishSave_table'](finishPut));
          });
        }else{
          $(this).text('入库');
          $('.cm207> .view .ducSave').addClass('el-hide');
          var whinQty=$('.cm207 .thisQty').val();
          if(whinQty){
            var AsFinished={};
            var prodCode=void(0);
            var prodName=void(0);
            var remark=void(0);
            var docDate=void(0);
            $('.cm207 .dblView .finishSave_data').each(function (i) {
               prodCode = $('.cm207 .dblView .finishSave_data .prodCode').text();
               prodName = $('.cm207 .dblView .finishSave_data .prodName').text();
               remark = $('.cm207 .dblView .finishSave_data .remark').text();
               docDate = new Date().toLocaleDateString();
               var whinQty=$('.cm207 .dblView .finishSave_data .thisQty').val();
               AsFinished[i]={whinQty:whinQty,prodCode:prodCode,prodName:prodName,remark:remark,docDate:docDate}
               EL.log(AsFinished[i]);
            });
            if(!!manuId){
              EL.get('api/cm_fac/cm207/finishPutSave',{whinQty:whinQty,docDate:docDate,somanuId:manuId,soId:soId}).then(function (data) {
                if(data){
                  EL.log(data);
                  EL.msg('保存成功!');
                }else{
                  EL.msg('保存失败!');
                }
              });
            }else{
              EL.msg('生产工厂ID参数错误！');
            }
          }else{
            $(this).text('保存');
            $('.cm207> .view .ducSave').removeClass('el-hide');
            EL.msg('本次入库数量为0或空的,不保存');
          }
        } //end else
      }// end else
    })
  }

  /*-------------------+
   | 详细的业务处理请求 |
   +===================*/
  //select数据
  function loadSelectData() {
    return $.when(
      //生产管理的select数据 (两个)
      EL.get('api/ui/udc/PRODUCT_CONFIRMATION_STATUS'),//产品信息确认
      EL.get('api/ui/udc/PAPER_STATUS')//纸张确认
    ).then(function (prodAppr,paperAppr) {
      $('.prodAppr').append(_tmpls['prodAppr'](prodAppr[0]));
      $('.paperAppr').append(_tmpls['paperAppr'](paperAppr[0]));
    });
  }
  var soId;
  //生产管理主页面Table数据点击跳转到子页面事件处理
  function bindClick() {
    $('.cm207 .listView .produce_data').on('click', 'a', function () {
      manuId = $(this).data('args');
      soId = $(this).data('soid');
      view('dblView');
      return detailData();
    });
  }
  //生产管理子页面，数据请求处理
  function detailData() {
    $.when(
      EL.get('api/cm_fac/cm207/dblView', {sid: manuId}),
      EL.get('api/cm_fac/cm207/productDetail',{sid: manuId}),//产品明细
      EL.get('api/cm_fac/cm207/productRequire')//产能需求
    ).then(function (data,productDetail,productRequire) {
      var headData = new Array();
      headData = data[0];
      $('.cm207  .dblView .dblView-detail-label').html(_tmpls['dblView-detail-data'](headData[0]));
      $('.cm207  .dblView .productDetail_data').html(_tmpls['productDetail_table'](productDetail[0]));
      $('.cm207  .dblView .productRequire_data').html(_tmpls['productRequire_table'](productRequire[0]));
    });
  }

  //加载数据
  function loadDblData() {
    $.when(
      EL.get('api/cm_fac/cm207/fileCheck'),//文件检查
      EL.get('api/cm_fac/cm207/pageCheck',{soId: soId}),//纸张检查
      EL.get('api/cm_fac/cm207/productReport'),//生产报工
      EL.get('api/cm_fac/cm207/recordReport',{soId: soId}),//记录上报
      EL.get('api/cm_fac/cm207/finishPut',{soId:soId})//完工入库
    ).then(function (fileCheck,pageCheck,productReport,recordReport,finishPut) {
      $('.cm207 .fileCheck_data').html(_tmpls['fileCheck_table'](fileCheck[0]));
      $('.cm207 .pageCheck_data').html(_tmpls['pageCheck_table'](pageCheck[0]));
      $('.cm207 .product_data').html(_tmpls['product_table'](productReport[0]));
      $('.cm207 .record_data').html(_tmpls['record_table'](recordReport[0]));
      $('.cm207 .finish_data').html(_tmpls['finish_table'](finishPut[0]));
    });

    // //订单排产
    // EL.get('api/cm_fac/cm207/orderProduction').then(function (orderProduction) {
    //   $('.product_data').html(_tmpls['productDetail_table'](orderProduction));
    // });
    // //
    // EL.table(dblView_productReport_reqProxy );
  }

//初始化 
  function init() {
    $('.cm207> .hbs').each(function () {
      var $hbs = $(this), viewId = $hbs.data('viewId');
      _tmpls[viewId] = Handlebars.compile($hbs.html());
    });
    view('listView');
  }

  return init;
});
