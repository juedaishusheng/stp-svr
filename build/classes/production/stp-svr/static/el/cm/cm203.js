/*
 * EL UI - 1.0.0
 * http://www.elitesland.com/
 *
 * Copyright 2016 Elitesland.com
 */

define(function (require) {

  var _tmpls = {};

  //公司ID
  var ouId = void(0);

  //公司查询 初始页面数据查询 带分页
  var listView_reqProxy = {
    url: 'api/cm_fac/cm203/listView',
    argsBuilder: argsList,
    callback: renderTable,
    sortSelector: '.cm203 .stp-table-ouName',
    pagingSelector: '.cm203 .stp-cm203-ou',
    trigger: '.cm203 .search-ou-btn',  //检索按钮绑定
    immediately: true
  };

  //公司查询  子页面数据查询 带分页
  var dblView_reqProxy = {
    url: 'api/cm_fac/cm203/dblView',
    argsBuilder: argsDbl,
    callback: renderDblView,
    sortSelector: '.cm203 .stp-table-ouProName',
    pagingSelector: '.cm203 .stp-cm203-pro',
    trigger: '.cm203 .search-btn',
    immediately: true
  };

  //请求参数列表 不带参
  function argsList () {
    return {};
  }

  //请求参数列表
  function argsDbl () {
    return {ouId:ouId};
  }

  //渲染listView模板
  function renderTable (resultsData) {
    $('.cm203 .listView').html(_tmpls['listView'](resultsData));
    return gotoClick();
  }

  //渲染dblView模板
  function renderDblView (resultsData) {
    $('.cm203 .dblView').html(_tmpls['dblView'](resultsData));
    return backTableList();
  }

  //显示、隐藏页面
  function view(viewId) {
    optClass(viewId);

    if(viewId === 'listView'){
      EL.paging(listView_reqProxy);
      loadSelectData();
    }
    else if(viewId === 'dblView'){
      EL.paging(dblView_reqProxy);
      loadSelectData().then(function () {
        EL.dtp('.cm203 .el-dtp');
        return btnFrameList();
      });
    }
  }

  //显示、隐藏不同模块view
  function optClass(viewId) {
    $('.cm203> .view').addClass('hide');
    $('.cm203> .'+viewId).removeClass('hide');
  }

  //公司查询初始化页面 select数据
  function loadSelectData() {
    return $.when(
      EL.get('api/cm_fac/cm203/quantityLevel'),
      EL.get('api/cm_fac/cm203/printLevel'),
      EL.get('api/cm_fac/cm203/bindLevel')
    ).then(function (quantityLevel,printLevel,bindLevel) {
      EL.log(quantityLevel,printLevel,bindLevel);
      $('.cm203 .quantityLevel').append(_tmpls['quantityLevel'](quantityLevel[0]));
      $('.cm203 .printLevel').append(_tmpls['printLevel'](printLevel[0]));
      $('.cm203 .bindLevel').append(_tmpls['bindLevel'](bindLevel[0]));

    });
  }

  //加载公司查询-产能数据，印刷订单，工艺价格的数据
  function loadDblData(){
    return $.when(
      EL.get('api/mock/cm204capacity'),
      EL.get('api/mock/cm204print'),
      EL.get('api/mock/cm204price')
    ).then(function (capacityData,printData,priceData) {
      EL.log(capacityData,printData,priceData);
      $('.capacity_data').html(_tmpls['capacity_table'](capacityData[0]));
      $('.print_data').html(_tmpls['print_table'](printData[0]));
      $('.price_data').html(_tmpls['price_table'](priceData[0]));
    });
  }

  //双击事件跳转 子页面
  function gotoClick() {

    $('.cm203 >.view>.panel> .tablelist > .table > tbody > tr').on("dblclick",function(){
      ouId=$(this).attr("data-view-value");
      view($(this).data('viewId'));
    });

  }

  //返回公司查询按钮事件
  function backTableList(){
    $('.cm203 .panel-heading > .btn').on('click', function () {
      view('listView');
    });
  }

  //按钮组 弹窗事件
  function btnFrameList() {
    $('.cm203 .btn').on('click', function () {
      var viewid=$(this).data('viewId');
      if(viewid==='proQueryBtn'){
        EL.msg('产能信息','green');
      }
    });
  }

  //初始化
  function init() {
    $('.cm203 .hbs').each(function () {
      var $hbs = $(this), viewId = $hbs.data('viewId');
      _tmpls[viewId] = Handlebars.compile($hbs.html());
    });

    view('listView');
  }
  return init;

});

/** 以下是分页之前的代码 备份使用 **/
/*
define(function (require) {

  var _tmpls = {};

  //公司ID
  var ouId = void(0);

  function load(viewId) {
    if(viewId === 'dblView'){
      return EL.get('api/cm_fac/cm203/'+viewId,{ouId:ouId})
        .then(function (data) {
          EL.log("-----",data);
          return $('.cm203>  .' + viewId).html(_tmpls[viewId](data));
        });
    }
    return EL.get('api/cm_fac/cm203/'+viewId)
      .then(function (data) {
      EL.log("-----",data);
        return $('.cm203>  .' + viewId).html(_tmpls[viewId](data));
      });
  }

//视图函数
  function view(viewId) {
    load(viewId).then(function ($view) {
      $('.cm203> .view').addClass('hide');
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
          EL.dtp('.cm203 .el-dtp'); //日期
        });
      }
    });
  }

//返回公司查询
  function backTableList(){
    $('.cm203 .panel-heading > .btn').on('click', function () {
      view('listView');
    });
  }

//加载公司查询-产能数据，印刷订单，工艺价格的数据
  function loadDblData(){
    return $.when(
      EL.get('api/mock/cm204capacity'),
      EL.get('api/mock/cm204print'),
      EL.get('api/mock/cm204price')
    ).then(function (capacityData,printData,priceData) {

      EL.log(capacityData,printData,priceData);
      $('.capacity_data').html(_tmpls['capacity_table'](capacityData[0]));
      $('.print_data').html(_tmpls['print_table'](printData[0]));
      $('.price_data').html(_tmpls['price_table'](priceData[0]));
    });
  }

//select数据
  function loadSelectData() {
    return $.when(
      //公司查询的select数据
      EL.get('api/cm_fac/cm203/quantityLevel'),
      EL.get('api/cm_fac/cm203/printLevel'),
      EL.get('api/cm_fac/cm203/bindLevel')
      //公司查询-产能数据 工序类型select数据
      //EL.get('api/mock/cm203routeType'),
      //公司查询-印刷订单 生产状态select数据
      //EL.get('api/mock/cm203status')
    ).then(function (quantityLevel,printLevel,bindLevel) {
      EL.log(quantityLevel,printLevel,bindLevel);
      $('.quantityLevel').append(_tmpls['quantityLevel'](quantityLevel[0]));
      $('.printLevel').append(_tmpls['printLevel'](printLevel[0]));
      $('.bindLevel').append(_tmpls['bindLevel'](bindLevel[0]));
      //$('.routeType').append(_tmpls['routeType'](routeType[0]));
      //$('.status').append(_tmpls['status'](status[0]));
    });
  }

//按钮组事件
  function btnFrameList() {
    $('.cm203 .btn').on('click', function () {
      var viewid=$(this).data('viewId');
      if(viewid==='proQueryBtn'){
        EL.msg('产能信息','green');
      }
    });
  }

//监听事件
  function listenClick() {
    //每行数据绑定双击事件
    $('.cm203 >.view>.panel> .tablelist > .table > tbody > tr').on("dblclick",function(){
      ouId=$(this).attr("data-view-value");
      view($(this).data('viewId'));
    });
  }


  //初始化
  function init() {
    $('.cm203> .hbs').each(function () {
      var $hbs = $(this), viewId = $hbs.data('viewId');
      _tmpls[viewId] = Handlebars.compile($hbs.html());
    });

    view('listView');
  }
  return init;

});
*/
