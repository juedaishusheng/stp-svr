/*
 * EL UI - 1.0.0
 * http://www.elitesland.com/
 *
 * Copyright 2016 Elitesland.com
 */

define(function (require) {

  var _tmpls = {};
  var _id = void(0);

  /*-------------------+
   | 分页、查询函数条件 |
   +===================*/
  // 订单接单主页面分页查询函数条件
  var listView_reqProxy = {
    url: 'api/cm_fac/cm205/listView',
    argsBuilder: argsBuilder,
    callback: renderTable,
    selector: '.cm205 .table-listView',
    pagingSelector: '.cm205 .paging-listView',
    trigger: '.cm205 .cm205-search-btn',
    immediately: true
  };

  //请求参数列表
  function argsBuilder() {
    return {};
  }

  //渲染模板
  function renderTable(resultsData) {
    $('.cm205 .listView-data').html(_tmpls['listView'](resultsData));
    return buttonClick();
  }

  //订单接单子页面 产能数据 分页查询函数条件
  var dblView_proData_reqProxy = {
    url: 'api/cm_fac/cm205/productData',
    callback: dblView_proData_renderMaster,
    selector: '.cm205 .table-dblView-capacity',
    pagingSelector: '.cm205 .paging-dblView-capacity',
    trigger: '.cm205 .cm205-search-capacity',
    immediately: true
  };

  //回调渲染主数据分页页面-订单接单子页面 产能数据
  function dblView_proData_renderMaster(data) {
    $('.cm205 .dblView .produceData_data').html(_tmpls['produceData_table'](data));
    bindBtnClick();
  }

  /*-------------------+
   |  页面渲染视图管理  |
   +===================*/
  function view(viewId) {
    EL.view('cm205',viewId);//页面切换
    if (viewId === 'listView') {
      EL.table(listView_reqProxy);
      bindClick();
      buttonClick();
    }
    if (viewId === 'dblView') {
      EL.dtp('.cm205 .dblView .el-dtp');
      doubleClick();
      goBack();
    }
  }

  /*-------------------+
   | 页面Button事件管理 |
   +===================*/
  //返回主页按钮
  function goBack() {
    $('.cm205 .dblView .returnOrder').on('click', function () {
      EL.view('cm205','listView');
    });
  }

  //订单接单主页按钮点击事件
  function buttonClick(){
    $('.cm205  .navbarbtn > .form-group> .btn').on('click', function () {
      var viewId = $(this).data('viewId');
      //退回按钮事件
      if(viewId==='orderRefuseBtn'){
        var id = $('.cm205 .listView-data input[name="cm205_table"]:checked').val();
        if(!id){
          EL.msg('请先选择','green');
        }else{
          $(".cm205 .el-msg-returnBtn").modal();
        }
      }
    });
    //拒绝页面-确认按钮事件
    $(".cm205 .modal-footer .ok").click(function () {
      var textareaContent=$(".cm205 .modal-body .orderPriceBackTextarea").val();
      var id = $('.cm205 .listView-data input[name="cm205_table"]:checked').val();
      if(!textareaContent){
        //EL.view('el-msg-tip');
        $('.cm205 .el-msg-tip').addClass('el-hide');
        $('.cm205 .el-msg-tip').removeClass('el-hide');
        $(".cm205 .modal-body").append($(".cm205 .el-msg-tip"));
        return false;
      }else {
        EL.get('api/cm_ou/cm205/orderPriceBackView',{id: id,textareaContent: textareaContent}).then(function (data) {
          view('listView');
        });
      }
    });
    //拒绝页面-取消按钮事件
    $(".cm205 .modal-footer .cancel").click(function () {
      $('.cm205 .el-msg-tip').toggleClass('el-hide');
    });
  }

  //订单接单-详细页-产能数据按钮事件绑定
  function bindBtnClick() {
    $('.cm205 .cm205-capacity-btn').on('click', 'button', function () {
      var viewId = $(this).data('viewId');
      switch (viewId) {
        //查询产能
        case 'capacityQuery':
          var dateFrom = $('.cm205-date-from').val();
          var dateTo = $('.cm205-date-to').val();
          if (!dateFrom || !dateTo) {
            EL.msg('请先选择日期', 'green');
          } else {
            EL.get('api/cm_fac/cm205/capacityData', {dateFrom: dateFrom, dateTo: dateTo}).then(function (productData) {
              $('.produceData_data').html(_tmpls['produceData_table'](productData));
            });
          }
          break;
        //一个月
        case 'oneMonth':
          EL.get('api/cm_fac/cm205/capacityData', {
            dateFrom: moment().add(-1, 'month').format('YYYY-MM-DD'),
            dateTo: moment().format('YYYY-MM-DD')
          }).then(function (productData) {
            $('.produceData_data').html(_tmpls['produceData_table'](productData));
          });
          break;
        //三个月
        case 'threeMonth':
          EL.get('api/cm_fac/cm205/capacityData', {
            dateFrom: moment().add(-3, 'month').format('YYYY-MM-DD'),
            dateTo: moment().format('YYYY-MM-DD')
          }).then(function (productData) {
            $('.produceData_data').html(_tmpls['produceData_table'](productData));
          });
          break;
        // default:

      }

    });
  }
  /*-------------------+
   | 详细的业务处理请求 |
   +===================*/

  //跳转订单详情-产品明细产能需求
  function doubleClick() {
    $('.cm205 .dblView .productDetail_data').on('dblclick','tr',function () {
      var prodId=$(this).data('args');
      EL.get('api/cm_fac/cm205/productDetailDemand',{prodId:prodId}).then(
        function (data) {
          $('.cm205 .dblView .productDetailPanel_data').html(_tmpls['productDetailPanel_table'](data));
        })
    })
  }

  //订单接单主页面Table数据点击跳转到子页面事件处理
  function bindClick() {
    $('.cm205 .listView .listView-data').on('click', 'a', function () {
      _id = $(this).data('args');
      view('dblView');
      return detailData();
    });
  }
  //订单接单子页面，数据请求处理
  function detailData() {
    return $.when(
      EL.get('api/cm_fac/cm205/dblView', {id: _id}),
      EL.get('api/cm_fac/cm205/productDetail')
  ).then(function (data,productDetail) {
      var headData = new Array();
      headData = data[0];
      $('.dblView-detail-label').html(_tmpls['dblView-detail-data'](headData[0]));
      $('.productDetail_data').html(_tmpls['productDetail_table'](productDetail));
    });
  }

  //加载数据
  function loadDblData() {
    //产品明细
      EL.get('api/cm_fac/cm205/productDetail').then(function (productDetail) {
      $('.productDetail_data').html(_tmpls['productDetail_table'](productDetail));
    });
    //产能数据
    EL.table(dblView_proData_reqProxy );
  }

  //初始化 编译所有模板
  function init() {
    $('.cm205> .hbs').each(function () {
      var $hbs = $(this), viewId = $hbs.data('viewId');
      _tmpls[viewId] = Handlebars.compile($hbs.html());
    });
    view('listView');
  }
  return init;
});
