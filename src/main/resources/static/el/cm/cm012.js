/*
 * EL UI - 1.0.0
 * http://www.elitesland.com/
 *
 * Copyright 2016 Elitesland.com
 */

define(function (require) {
  var _tmpls = {};
  var soId = 0, somanuId = 0, manudistId = 0, soprodId = 0,acptMethod=0;

  /*-------------------+
   | 分页、查询函数条件 |
   +===================*/
  var listView_reqProxy = {
    url: 'api/mock/cm012/listView',
    argsBuilder: argsBuilderListView,
    callback: renderTableListView,
    selector: '.cm012 .listView .table-order-search',
    pagingSelector: '.cm012 .listView .paging-order-search',
    trigger: '.cm012 .listView .search-ou-btn',
    immediately: true
  };
  //请求参数列表
  function argsBuilderListView() {
    var formObj = $('.cm012 .listView .search-toggle-content');
    var condition = {
      orderStatus: formObj.find('.orderStatus_select').val(),
      productStatus: formObj.find('.productStatus_select').val(),
      paperReadyStatus: formObj.find('.paperReadyStatus_select').val(),
      acptStatus: formObj.find('.seperateStatus_select').val(),
      acptMethod: formObj.find('.acptMethod_select').val(),
      factoryAddr: formObj.find('.factoryAddr').val(),
      endDuedate: formObj.find('.endDuedate').val(),
      startDuedate: formObj.find('.startDuedate').val(),
      orderNo: formObj.find('.orderNo').val(),
      productName: formObj.find('.productName').val()
    }
    return condition;
  }
  //回调渲染分页页面
  function renderTableListView(data) {
    $('.cm012 .listView .el-tbody').html( _tmpls['listView'](data));
    return bindRadioClick();
  }

  /*-------------------+
   |  页面渲染视图管理  |
   +===================*/
  function view(viewId) {
    EL.view('cm012',viewId);//页面切换
    EL.dtp('.cm012  .' + viewId + ' .el-dtp');//日期控件
    //初始化页面
    if (viewId === 'listView') {
      loadSelectData().then(function () {
        EL.table(listView_reqProxy);
      });
      return bindListViewBtn();
    }
    //订单详情（table超链接）
    if (viewId === 'orderDetail') {
      return orderDetail();
    }
    //自动分单
    if (viewId === 'spiltOrder') {
      return spiltOrder();
    }

    //订单生产明细
    if (viewId === 'printOrderView') {//spring
      loadSoProdDetail().then(function () {
        renderPrintOrderTable();
      });
      // EL.table(printOrderView_reqProxy);
      return false;
    }
  }

  /*-------------------+
   | 页面Button事件管理 |
   +===================*/
  function bindListViewBtn() {
    //收缩按钮
    $('.cm012 .listView .search-toggle-btn').on('click', function () {
      $(this).find('i').toggleClass("fa-plus");
      $(this).find('i').toggleClass("fa-minus");
      $(this).parent().find('.search-toggle-content').toggle();
    });
    //table超链接事件
    $('.cm012 .listView .panel .box-wrap .el-tbody').on('click', 'a', function () {
      soId = $(this).data('soId');
      somanuId = $(this).data('somanuId');
      manudistId = $(this).data('manudistId');
      soprodId = $(this).data('soprodId');
      acptMethod = $(this).data('acptMethod');
      var orderViewId = $(this).data('viewId');
      if (manudistId && somanuId && (soId || soprodId)) {
        view(orderViewId);
      } else {
        EL.msg('页面参数错误!');
      }
    });
    //功能按钮
    $('.cm012 .listView .navbarbtn .btn').on('click', function () {
      if ($(this).is('.disabled')) {
        return false;
      }
      var viewId = $(this).data('viewId');
      var orderId = $('.cm012 .listView .table .el-tbody input[name="orderSearch"]:checked').data('orderId');
      if (!orderId) {
        EL.msg('无法操作，未选择订单产品信息！');
        return false;
      }
      switch (viewId) {
        case "updatePrice"://修改价格
          updatePrice(orderId);
          break;
        case "reassign"://重新分配
          reassign(orderId);
          break;
        case "manualSinglePoints"://手工分单
          manualSinglePoints(orderId);
          break;
        case "automaticSingle"://自动分单
          automaticSingle(orderId);
          break;
        case "pauseSinglePoints"://暂停分单
          pauseSinglePoints(orderId);
          break;
        default:
          return viewId;
      }
    });
  }

  //暂停分单
  function pauseSinglePoints(orderid) {
    EL.get('api/mock/cm012/pauseSeperate', {orderid: orderid}).then(function (data) {
      data > 0 ? EL.msg('恭喜，暂停成功') : EL.msg('抱歉，暂停失败');
    });
  }
  //修改价格按钮事件
  function updatePrice(orderId) {
    EL.get('api/mock/cm012/updatePrice', {
      orderid: '1',
    }).then(function (data) {
      $('.cm012 .listView .el-msg-updatePrice .modal-body').html(data);
      $('.cm012 .listView .el-msg-updatePrice').modal();
    });
  }
  //重新分配按钮事件
  function reassign(orderId) {
    alert('正在开发重新分配');
  }
  //手工分单按钮事件
  function manualSinglePoints(orderId) {
    alert('正在开发手工分单');

  }
  //自动分单
  function automaticSingle(orderId) {
    view('spiltOrder');
  }


  /*-------------------+
   | 详细的业务处理请求 |
   +===================*/
  //自动分单业务-数据请求
  function spiltOrder() {
    $('.cm012 .spiltOrder .navbarbtn .back-btn').on('click', function () {//返回功能按钮监听
      EL.view('cm012','listView');//直接页面切换
    });
    // return $.when(
    //   EL.get('api/mock/cm012/orderSearchByID',{orderid:1})
    //
    // ).then(function (orderData) {
    //   $('.cm012 .spiltOrder .orderDetailInfo').html(_tmpls['orderDetailInfo'](orderData[0]));
    // });
  }

  //table超链接请求(订单详情-数据请求)
  function orderDetail() {
    $('.cm012 .orderDetail .navbarbtn .back-btn').on('click', function () {//返回功能按钮监听
      var viewId = $(this).data('viewId');
      EL.view('cm012', viewId);
    });
    //客户信息、订单信息
    EL.get('api/mock/cm012/orderDetailSearch', {
      soId: soId,
      somanuId: somanuId,
      manudistId: manudistId
      }).then(function (data) {
        $('.cm012 .orderDetail .panel-body').html(_tmpls['prodDetailFieldset'](data));
      });
    //产品信息
    EL.get('api/mock/cm012/productSearchByOrder', {
        somanuId: somanuId,
        manudistId: manudistId,
      soprodId: soprodId
      }).then(function (data) {
        $('#cm012product .table .product-detail').html(_tmpls['prodDetailTable'](data));
      }).then(function () {
        bindProductDBClick();//绑定请求产能工序请求
      });
    //分单对象
    EL.get('api/mock/cm012/productSeperateObject', {
      soId: soId
    }).then(function (data) {
      $('#cm012product .table .spilt-orderDetail').html(_tmpls['spiltOrderDetail'](data));
    });
    //进度跟踪
    EL.get('api/mock/cm012/trackingProgressSearch', {
      somanuId: somanuId,
      manudistId: manudistId,
      acptMethod: acptMethod
    }).then(function (data) {
      $('#cm012product .table .finished-list').html(_tmpls['progressTracking'](data));
    }).then(function () {
      bindTrackingProgressDBClick();//绑定进度跟踪的完工列表
    });
  }

  //绑定产品信息tr双击事件（产能工序）
  function bindProductDBClick() {
    $('#cm012MyTabContent .product-detail').on('dblclick', 'tr', function () {
      var somanuId = $(this).data('somanuId');
      var manudistprodId = $(this).data('manudistprodId');
      var soprodId = $(this).data('soprodId');
      if (!somanuId && !manudistprodId && !soprodId) {
        return EL.msg('当前状态产品无工序类型！');
      }
      EL.get('api/mock/cm012/processType', {//查询工序类型
        somanuId: somanuId,
        manudistprodId: manudistprodId,
        soprodId: soprodId
      }).then(function (data) {
        $('#cm012product .capacity-detail').html(_tmpls['capacityDetail'](data));
      });
    });
  }
  //绑定进度跟踪（完工列表）双击事件
  function bindTrackingProgressDBClick() {
    $('#cm012MyTabContent .product-detail').on('dblclick', 'tr', function () {
      var somanuId_ProgressId = $(this).data('somanuId');
      if (!somanuId_ProgressId) {
        return EL.msg('无工厂生产信息！');
      }
      EL.get('api/mock/cm012/trackingProgressCompletionSearch', {//查询完工列表
        somanuId: somanuId_ProgressId
      }).then(function (data) {
        $('#cm012product .finished-list').html(_tmpls['finishedList'](data));
      });
    });
  }

  //根据订单状态控制按钮是否禁用
  function bindRadioClick() {
    $('.cm012 .listView .table .el-tbody').on('click','tr', function () {
      $(this).find('input[type="radio"]').prop('checked', true);
      radioSwitchStatus($(this).find('input[type="radio"]'));
    });
    $('.cm012 .listView .table .el-tbody input[type="radio"]').on('click', function () {
      radioSwitchStatus(this);
    });
    return true;
  }

  //按钮权限效果控制
  function radioSwitchStatus(obj) {
    var spodSostatue = $(obj).data('spodSostatue');//订单状态
    var btn01 = false, btn02 = false, btn03 = false, btn04 = false, btn05 = false;
    switch (spodSostatue) {
      case "01"://已下发1
        btn01 = true, btn02 = false, btn03 = true, btn04 = false, btn05 = false;
        break;
      case "02"://已暂停2
        btn01 = false, btn02 = false, btn03 = true, btn04 = true, btn05 = false;
        break;
      case "03"://无工厂3
        btn01 = true, btn02 = false, btn03 = true, btn04 = false, btn05 = false;
        break;
      case "04"://待接单4
        btn01 = true, btn02 = false, btn03 = true, btn04 = false, btn05 = false;
        break;
      case "05"://已失败5
        btn01 = true, btn02 = false, btn03 = true, btn04 = false, btn05 = false;
        break;
      case "06"://已接单6
        btn01 = false, btn02 = true, btn03 = false, btn04 = false, btn05 = false;
        break;
      case "07"://待核价7
        btn01 = false, btn02 = false, btn03 = false, btn04 = false, btn05 = false;
        break;
      case "08"://待确认8
        btn01 = false, btn02 = false, btn03 = false, btn04 = false, btn05 = false;
        break;
      case "09"://未通过核价9
        btn01 = false, btn02 = false, btn03 = false, btn04 = false, btn05 = true;
        break;
      case "10"://已确认10
        btn01 = false, btn02 = true, btn03 = false, btn04 = false, btn05 = false;
        break;
      case "11"://已拒绝11
        btn01 = false, btn02 = false, btn03 = true, btn04 = false, btn05 = false;
        break;
      case "12"://已退单12
        btn01 = false, btn02 = false, btn03 = true, btn04 = false, btn05 = false;
        break;
    }
    //按钮管理
    var navbarbtnGroup = $('.cm012 .listView .panel .navbarbtn .btn ');
    if (!navbarbtnGroup || navbarbtnGroup.length != 5) {
      return EL.msg('出错，检查按钮是否完整！');
    }
    btn01 ? navbarbtnGroup.eq(1).removeClass('disabled') : navbarbtnGroup.eq(1).addClass('disabled');
    btn02 ? navbarbtnGroup.eq(2).removeClass('disabled') : navbarbtnGroup.eq(2).addClass('disabled');
    btn03 ? navbarbtnGroup.eq(3).removeClass('disabled') : navbarbtnGroup.eq(3).addClass('disabled');
    btn04 ? navbarbtnGroup.eq(4).removeClass('disabled') : navbarbtnGroup.eq(4).addClass('disabled');
    btn05 ? navbarbtnGroup.eq(5).removeClass('disabled') : navbarbtnGroup.eq(5).addClass('disabled');
  }


  //================================ ↓ 老方法，待整合↓ =========================================//


  //点击分单按钮加载选择工厂数据
  function loadFactoryData() {
    return $.when(
      EL.get('api/mock/cm010_detail'),//产品明细数据
      EL.get('api/mock/cm010_capacity'),//产能数据
      EL.get('api/mock/cm010_info'),//工厂数据
      EL.get('api/mock/cm007_progress'),//进度跟踪
      EL.get('api/mock/cm010_capacity')//完成列表
    ).then(function (prodDetails, capacityData, factoryList, progressTracking, finishedList) {
      $('.factory-prod-detail').html(_tmpls['factoryProdDetail'](prodDetails[0]));
      $('.factory-capacity').html(_tmpls['factoryCapacity'](capacityData[0]));
      $('.factory-list').html(_tmpls['factoryList'](factoryList[0]));
      $('.progress-data').html(_tmpls['progressTracking'](progressTracking[0]));
      $('.finished-list').html(_tmpls['finishedList'](finishedList[0]))
    });
  }

  //点击分派订单按钮加载分派订单模块数据
  function loadSpiltOrderData() {
    return $.when(
      EL.get('api/mock/cm010_detail'),//产品明细数据
      EL.get('api/mock/cm010_capacity'),//产能数据
      EL.get('api/mock/cm010_info'),//工厂数据
      EL.get('api/mock/cm007_progress'),//进度跟踪
      EL.get('api/mock/cm010_capacity'),//完成列表
      EL.get('api/mock/cm010_info')//未分配完订单
    ).then(function (prodDetails, capacityData, factoryList, progressTracking, finishedList,unallocatedOrders) {

      EL.log(capacityData);
      $('.spilorder-prod-detail').html(_tmpls['factoryProdDetail'](prodDetails[0]));
      $('.spilorder-capacity').html(_tmpls['factoryCapacity'](capacityData[0]));
      $('.factory-list').html(_tmpls['factoryList'](factoryList[0]));
      $('.progress-data').html(_tmpls['progressTracking'](progressTracking[0]));
      $('.finished-list').html(_tmpls['finishedList'](finishedList[0]));
      $('.spiltorder-unallocated-order').html(_tmpls['unallocatedOrder'](unallocatedOrders[0]))
    });
  }

  //加载订单查询select数据
  function loadSelectData() {
    return $.when(
      EL.get('api/ui/udc/PRODUCT_CONFIRMATION_STATUS'),//产品信息确认
      EL.get('api/ui/udc/SEPERATE_STATUS'),//分单状态
      EL.get('api/ui/udc/SEPERATE_METHOD'),//分单方式
      EL.get('api/ui/udc/PAPER_STATUS'),//纸张确认（纸张完备状态）
      EL.get('api/ui/udc/QUALITY_LEVEL')//订单状态
    ).then(function (data1,data2,data3,data4,data5) {
      $('.cm012 .listView .productConfirmationStatus').append(_tmpls['productConfirmationStatus'](data1[0]));
      $('.cm012 .listView .seperateStatus').append(_tmpls['seperateStatus'](data2[0]));
      $('.cm012 .listView .seperateMethod').append(_tmpls['seperateMethod'](data3[0]));
      $('.cm012 .listView .paperStatus').append(_tmpls['paperStatus'](data4[0]));
      $('.cm012 .listView .orderStatus').append(_tmpls['orderStatus'](data5[0]));
    });
  }

  //单击工厂加载产能信息
  function factoryClick() {
    $('.cm012-factory-table-001 >tbody >tr').on("click", function () {
      var objValue = $(this).attr("data-view-value");
      $('.cm012 .' + $(this).data('viewId')).removeClass('hide');
      load($(this).data('viewId'));
    });
  }


  function init() {
    //编译所有模板
    $('.cm012> .hbs').each(function () {
      var $hbs = $(this), viewId = $hbs.data('viewId');
      _tmpls[viewId] = Handlebars.compile($hbs.html());
    });
    //初始化
    view('listView');
  }
  return init;
});
