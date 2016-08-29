/*
 * EL UI - 1.0.0
 * http://www.elitesland.com/
 *
 * Copyright 2016 Elitesland.com
 */

define(function (require) {

  var _tmpls = {};

 //加载页面数据
  function load(viewId) {
    return EL.get('api/cm_fac/cm205/'+viewId)
      .then(function (data) {
        return $('.cm205>  .' + viewId).html(_tmpls[viewId](data));
      });
  }

  //视图函数
    function view(viewId) {
      load(viewId).then(function ($view) {
        $('.cm205> .view').addClass('hide');
        $view.removeClass('hide');
        if (viewId === 'listView') {
          loadSelectData().then(function () {
            return listenClick();//监听页面点击事件
          });
        }else if(viewId === 'dblView'){//
          backTableList();
          loadDblData();
          btnFrameList();
          loadSelectData().then(function () {
            productDetailPanelBtn();
            EL.dtp('.cm205 .el-dtp'); //日期
          });
        }
      });
    }

    //加载公司查询-产能数据，印刷订单，工艺价格的数据
      function loadDblData(){
        return $.when(
          EL.get('api/mock/cm206produceData'),
          EL.get('api/mock/cm206productDetail'),
          EL.get('api/mock/cm206productDetailPanel')
        ).then(function (produceData,productData,productDetailPanel) {

          EL.log(produceData,productData,productDetailPanel);
          $('.produceData_data').html(_tmpls['produceData_table'](produceData[0]));
          $('.productDetail_data').html(_tmpls['productDetail_table'](productData[0]));
          $('.productDetailPanel_data').html(_tmpls['productDetailPanel_table'](productDetailPanel[0]));
        });
      }

    //select数据
      function loadSelectData() {
        return $.when(
          //订单查询  装订方式select
          EL.get('api/mock/cm205_bindType'),
          //订单查询-产能数据 工序类型select数据
          EL.get('api/mock/cm004_routeType')
        ).then(function (bindType,routeType) {
          EL.log(bindType,routeType);
          $('.bindType').append(_tmpls['bindType'](bindType[0]));
          $('.processType').append(_tmpls['processType'](routeType[0]));
        });
      }

      //返回公司查询
        function backTableList(){
          $('.cm205 .panel-heading .returnOrder').on('click', function () {
            view('listView');
          });
        }

        //点击产品明细，显示产能需求事件
          function productDetailPanelBtn(){
            $('.cm205 .productBtn > .table > tbody > tr').on('dblclick', function () {
              $('.cm205 .productNeedBtn').removeClass('hide');
            });
          }

        //按钮组事件
          function btnFrameList() {
            $('.cm205 .btn').on('click', function () {
              var viewid=$(this).data('viewId');
              if(viewid==='orderReceiveBtn'){
                EL.msg('接单','green');
              }
              else if(viewid==='orderRefuseBtn'){
                EL.msg('拒绝接单','green');
              }
              else if(viewid==='detailRefuseBtn'){
                EL.msg('接单','green');
              }
              else if(viewid==='detailReceiveBtn'){
                EL.msg('拒绝接单','green');
              }
              else if(viewid==='detailQueryBtn'){
                EL.msg('产品信息','green');
              }
              else if(viewid==='proQueryBtn'){
                EL.msg('产能信息','green');
              }
            });
          }

    //监听事件
      function listenClick() {

        //每行数据绑定双击事件
        $('.cm205 >.view>.panel> .panel-body > .tablelist > .table > tbody > tr').on("dblclick",function(){
          var objValue=$(this).attr("data-view-value");
          EL.log($(this).data('viewId'));
          view($(this).data('viewId'));
        });


        //点击订单接单 拒绝事件   cm205 view panel panel-body navbarbtn
        $('.cm205 >.view>.panel> .panel-body > .navbarbtn > .form-group > .btn').on("click",function(){
          var viewid=$(this).data('viewId');
          if(viewid==='orderReceiveBtn'){
            $('.modal-title').text("接单成功");
            $('.el-msg >.modal-dialog> .modal-content> .modal-footer >.ok').text("确定"); //modal ok
            $('.el-msg >.modal-dialog> .modal-content> .modal-footer >.cancel').hide(); //modal cancel
            $('.el-msg').modal('show');
          }else if(viewid==='orderRefuseBtn'){
            var dlg = $('.el-msg');
            dlg.find('.modal-title').text('请填写拒绝原因');
            var msgContext = "<textarea rows='3' style='width:100%'></textarea>";
            dlg.find('.modal-body').empty().append(msgContext);
            dlg.modal();
          }
        });

      }

//初始化函数
  function init() {
    $('.cm205> .hbs').each(function () {
      var $hbs = $(this), viewId = $hbs.data('viewId');
      _tmpls[viewId] = Handlebars.compile($hbs.html());
    });

    view('listView');
  }
  return init;

});
