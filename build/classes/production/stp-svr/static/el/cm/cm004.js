/*
 * EL UI - 1.0.0
 * http://www.elitesland.com/
 *
 * Copyright 2016 Elitesland.com
 */

define(function (require) {

  var _tmpls = {};

  var factId = void(0);


  var listView_reqProxy = {
    url: 'api/cm_ou/cm004/listView',
    argsBuilder: argsBuilder,
    callback: renderTable,
    sortSelector: '.cm004 .stp-table-name',
    pagingSelector: '.cm004 .stp-cm004-factory',
    trigger: '.cm004 .search-btn',
    immediately: true
  };

  //请求参数列表
  function argsBuilder () {
    return {};
  }

  //渲染模板
  function renderTable (resultsData) {
    $('.cm004  .listView').html(_tmpls['listView'](resultsData));
    return bindClick();
  }

  var dblView_reqProxy = {
    url: 'api/cm_ou/cm004/dblView',
    argsBuilder: argsBuilder,
    callback: renderDblView,
    sortSelector: '.cm004 .stp-table-name',
    pagingSelector: '.cm004 .stp-cm004-factory',
    trigger: '.cm004 .search-btn',
    immediately: true
  };

  //请求参数列表
  function argsBuilder () {
    return {factId:factId};
  }

  //渲染模板
  function renderDblView (resultsData) {
    EL.log('====================',resultsData)
    $('.cm004  .dblView').html(_tmpls['dblView'](resultsData[0]));
    return loadDblData();
  }


  function view(viewId) {
    if(viewId === 'listView'){
      optClass(viewId);
      EL.paging(listView_reqProxy);
      loadSelectData();
      //listenClick()
    }

    //双击进入的页面
    if(viewId === 'dblView'){
      optClass(viewId);
      EL.paging(dblView_reqProxy);
      loadDblData().then(function () {
        EL.dtp('.cm004 .el-dtp');
        return clickOrderDetail();
      });
      // listenClick()
    }

    if(viewId === 'printOrderView'){//spring
      loadSelectData();
      loadPrintOrderData();
      btnFrameList();
    }
    // load(viewId).then(function ($view) {
    //   $('.cm004> .view').addClass('hide');
    //   $view.removeClass('hide');
    //   if (viewId === 'listView') {
    //     loadSelectData();
    //     return listenClick(); //监听页面点击事件
    //   } else if(viewId === 'dblView'){//
    //     backTableList();
    //     loadDblData();
    //    // loadSelectData();
    //     loadSelectData().then(function () {
    //       EL.dtp('.cm004 .el-dtp');
    //     });
    //   }
    // });
  }

  //双击印刷订单弹出订单生产明细  //spring
  function clickOrderDetail() {
    $('.cm004 .dblView .cm004_print tr').on("dblclick",function(){
      view('printOrderView');
    });
  }

  //按钮组事件
  function btnFrameList() {//spring
    $('.cm004 .closeBtn').on('click', function () {
      view('dblView');
    });

    $('.cm004 .printBtn').on('click', function () {
      EL.msg('打印成功','green');
    });
  }

  //显示、隐藏不同模块view
  function optClass(viewId) {
    $('.cm004> .view').addClass('hide');
    $('.cm004> .'+viewId).removeClass('hide');
  }

  function backTableList(){
    $('.cm004 .panel-heading > .btn').on('click', function () {
      view('listView');
    });
  }

  function loadDblData(){
    return $.when(
      EL.get('api/cm_ou/cm004/processCapacity'),//工序产能
      EL.get('api/cm_ou/cm004/capacityData')//产能数据
      // EL.get('api/cm/cm005_capacity'),
      // EL.get('api/cm/cm005print'),
      // EL.get('api/cm/cm005route')
    ).then(function (processCapacity,capacityData) {
EL.log('2111111111111111',processCapacity,capacityData);
      $('.cm004_process_capacity').html(_tmpls['processCapacityView'](processCapacity[0]));
      $('.cm004_capacity').html(_tmpls['capacityView'](capacityData[0]));
      // $('.cm004_print').html(_tmpls['printView'](printData[0]));
      // $('.cm004_route').html(_tmpls['routeView'](routeData[0]));
    });
  }

  //加载工厂查询 印刷订单 订单生产明细数据
  function loadPrintOrderData(){//spring
    return $.when(
      EL.get('api/mock/cm210_2'),
      EL.get('api/mock/cm210'),
      EL.get('api/mock/cm210_3'),
      EL.get('api/mock/cm210_4'),
      EL.get('api/mock/cm210_5')
    ).then(function (cm210_2,cm210,cm210_3,cm210_4,cm210_5) {

      EL.log(cm210_2,cm210,cm210_3,cm210_4,cm210_5);
      $('.cm210_data_2').html(_tmpls['cm210_table_2'](cm210_2[0]));
      $('.cm210_data').html(_tmpls['cm210_table'](cm210[0]));
      $('.cm210_data_3').html(_tmpls['cm210_table_3'](cm210_3[0]));
      $('.cm210_data_4').html(_tmpls['cm210_table_4'](cm210_4[0]));
      $('.cm210_data_5').html(_tmpls['cm210_table_5'](cm210_5[0]));
    });
  }

  //select 数据
  function loadSelectData() {
    return $.when(
      EL.get('api/ui/udc/QUALITY_LEVEL'),//生产质量等级
    EL.get('api/ui/udc/PRINT_DIFF_LEVEL'),//印刷难度等级
    EL.get('api/ui/udc/BIND_DIFF_LEVEL')//装订等级
    ).then(function (qualifyLevel,printDiffLevel,bindDiffLevel) {
      EL.log('1111111111111',qualifyLevel,_tmpls['qualifyLevel'](qualifyLevel[0]));
      $('.qualifyLevel').append(_tmpls['qualifyLevel'](qualifyLevel[0]));
      $('.printDiffLevel').append(_tmpls['printDiffLevel'](printDiffLevel[0]));
      $('.bindDiffLevel').append(_tmpls['bindDiffLevel'](bindDiffLevel[0]));
    });
  }

  function bindClick() {
    $('.cm004 .listView .navbarbtn > .form-group> .btn').on('click', function () {
      EL.log('22222222222222222');
      view($(this).data('viewId'));
    });

    //每行数据绑定双击事件
    $('.cm004 .listView>.panel> .tablelist > .table > tbody > tr').on("dblclick",function(){
      EL.log('333333333333333333333333');
      factId=$(this).attr("data-view-value");
      view($(this).data('viewId'));
    });
  }

  //返回
  function backTableList(){
    $('.cm004 .panel-heading > .btn').on('click', function () {
      view('listView');
    });
  }

  //初始化
  function init() {
    $('.cm004> .hbs').each(function () {
      var $hbs = $(this), viewId = $hbs.data('viewId');
      _tmpls[viewId] = Handlebars.compile($hbs.html());
    });

    view('listView');
  }
  return init;

});
