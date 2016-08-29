/*
 * EL UI - 1.0.0
 * http://www.elitesland.com/
 *
 * Copyright 2016 Elitesland.com
 */

define(function (require) {
  var _tmpls = {};
  var soId = void(0);
  var soNo=void(0);
  var addrNo = void(0);
  var factId = void(0);

  //页面试图切换
  function view(viewId) {
    EL.view('cm004',viewId);//页面切换
    EL.dtp('.cm004  .' + viewId + ' .el-dtp');//日期控件

    if (viewId === 'listView') {
      return loadSelectData().then(function (data) {
        EL.table(new _req('listView', argsListview, renderListView));
        return bindTrClick(viewId);
      })
    }

    if (viewId === 'infoDetail') {
      //默认选中产能数据tab
      $('.cm004-tab li:first').addClass('active').nextAll().removeClass('active');
      $('.cm004-capacity-btn').addClass('active in').siblings().removeClass('active in');

      loadInfoDetailData();
      bindTrClick(viewId);
      backBtn('listView','infoDetail');
    }

    //订单生产明细
    if (viewId === 'soDetail') {//spring
      loadPrintOrderData();
      loadCapaType();
      backBtn('infoDetail','soDetail');
    }
  }

  //返回按钮
  function backBtn(viewId,view) {
    $('.cm004 .'+view+' button.el-back').unbind('click').click(function(){
      return EL.view('cm004',viewId)
    });
  }

  //加载二级页面数据
  function loadInfoDetailData() {
    EL.get('api/cm_ou/cm004/headInfo', {factId: factId}).then(function (data) {
      $('.cm004  .cm004-headInfo').html(_tmpls['headInfo'](data[0]));
    }).then(function (data) {
      EL.table(new _req('capacity', reqParams('capacity'), renderCap));
      EL.table(new _req('printSo', reqParams('printSo'), renderPrintSo));
      loadProcCapa();
      loadProcPrice();
      loadProdStatus();
    }).then(function () {
      bindBtnClick('capacity');
      bindBtnClick('printSo');
    });
  }

  //工序产能tab数据
  function loadProcCapa() {
    EL.get('api/cm_ou/cm004/processCapacity').then(function (data) {
      $('.cm004_process_capacity').html(_tmpls['processCapacityView'](data));
    })
  }

  //工艺价格
  function loadProcPrice() {
    EL.get('api/cm_ou/cm004/processPrice',{addrNo: addrNo}).then(function (data) {
      $('.cm004_route').html(_tmpls['priceView'](data));
    })
  }

  /**
   * 绑定tr跳转事件
   * @param moduleId listView/infoDetail
     */
  function bindTrClick(moduleId) {
     $('.cm004 .'+moduleId+' .table .tbody-data').unbind('click').on('click', 'a', function () {
       if(moduleId==='listView'){
         factId = $(this).data('args');
         addrNo = $(this).data('addrNo');
       }
       if(moduleId==='infoDetail'){
         soId = $(this).data('args1');
         soNo = $(this).data('args');
       }
       return view($(this).data('viewId'));
    });
  }
  //========================请求参数 页面渲染 start===================================

  //渲染产能数据模板
  function renderCap(resultsData) {
    return $('#myTabContent').find('.cm004-capacity-btn .capacity-data').html(_tmpls['capacityView'](resultsData));
  }

  //渲染印刷订单模板
  function renderPrintSo(resultsData) {
    $('.cm004 .infoDetail .tbody-data').html(_tmpls['printSoView'](resultsData));
  }

  function reqParams(moduleId) {
    var dateFrom = $('.cm004-' + moduleId + '-date-from').val();
    var dateTo = $('.cm004-' + moduleId + '-date-to').val();
    return {
      dateFrom: dateFrom,
      dateTo:dateTo,
      factId:factId
    }
  }

  //========================请求参数 页面渲染 end  ===================================


  /*
   * 请求数据
   * @param moduleId 模块名称 capacity/printSo/listView
   * @param argsBuilder 请求参数
   * @param callback 回掉渲染页面
   */
  function _req(moduleId, argsBuilder, callback) {
    this.url = 'api/cm_ou/cm004/' + moduleId;
    this.argsBuilder = argsBuilder;
    this.callback = callback;
    this.selector = '.cm004 .cm004-table-' + moduleId;
    this.trigger = '.cm004 .cm004-' + moduleId + '-search';
    this.pagingSelector = '.cm004 .cm004-paging-' + moduleId;
    this.immediately = true
  }

  //请求参数列表
  function argsListview() {
    var ouName = $('.cm004 .listView .ouName').val(); //公司名称
    var qualifyLevel = $('.cm004 .listView .qualifyLevel :selected').val(); //质量等级
    var printDiffLevel = $('.cm004 .listView .printDiffLevel :selected').val(); //印刷难度等级
    var bindDiffLevel = $('.cm004 .listView .bindDiffLevel :selected').val(); //装订难度等
    return {
      ouName: ouName,
      qualifyLevel: qualifyLevel,
      printDiffLevel: printDiffLevel,
      bindDiffLevel: bindDiffLevel
    };
  }

  //渲染listView模板
  function renderListView(resultsData) {
    $('.cm004 .listView .tbody-data').html(_tmpls['listView'](resultsData));
  }

  //三级子页面 订单生产明细页数据
  function loadPrintOrderData() {
    return EL.get('api/cm_ou/cm004/soProdDetail',{factId:factId,soId:soId})
      .then(function (resultData) {
        EL.log('++++++++++++++',resultData);
        EL.log('-----------------',soId,'+++++++++++',soNo);
        $(".cm004 .cm004-so-no").html('<label class="control-label">订单编号：</label>' +
          '<label class="control-label">' + soNo + '</label>');
        $('.cm004 .soDetail .printOrder_data_1').html(_tmpls['schedulingView'](resultData.schedulingInfo));
        $('.cm004 .soDetail .printOrder_data_2').html(_tmpls['productionDetailView'](resultData.prodDetails));
        $('.cm004 .soDetail .printOrder_data_3').html(_tmpls['productionReportView'](resultData.prodReportInfo));
        $('.cm004 .soDetail .printOrder_data_4').html(_tmpls['completionView'](resultData.completionInfo));
        $('.cm004 .soDetail .printOrder_data_5').html(_tmpls['productionRecordView'](resultData.prodRecords));
      })
  }
  //三级子页面 订单生产明细页-工序类型
  function loadCapaType() {
    EL.get('api/cm_ou/cm004/capaType').then(function (data) {
      $('.rptType').html(_tmpls['procType'](data));
    })
  }

  //印刷订单tab-生产状态
  function loadProdStatus() {
    EL.get('api/ui/udc/PRODCUT_STATUS').then(function (data) {
      $('.cm004-prod-status').html(_tmpls['prodStatus'](data));
    })
  }

  //listView select 数据
  function loadSelectData() {
    return $.when(
      EL.get('api/ui/udc/QUALITY_LEVEL'),//生产质量等级
      EL.get('api/ui/udc/PRINT_DIFF_LEVEL'),//印刷难度等级
      EL.get('api/ui/udc/BIND_DIFF_LEVEL')//装订等级
    ).then(function (qualifyLevel, printDiffLevel, bindDiffLevel) {
      $('.qualifyLevel').append(_tmpls['qualifyLevel'](qualifyLevel[0]));
      $('.printDiffLevel').append(_tmpls['printDiffLevel'](printDiffLevel[0]));
      $('.bindDiffLevel').append(_tmpls['bindDiffLevel'](bindDiffLevel[0]));
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


  //========================所有按钮事件  start ===================================

  /**
   * 明细页按钮事件绑定--产能数据/印刷订单检索
   * @param moduleId capacity/printSo
     */
  function bindBtnClick(moduleId) {

    $('.cm004 .cm004-' + moduleId + '-btn').unbind().on('click', 'button', function () {
      var url = 'api/cm_ou/cm004/' + moduleId;
      var btnId = $(this).data('btnId');
      var reqArgs = {};//请求参数
      var btnType = moduleId + 'Query';
      switch (btnId) {

        //查询产能
        case moduleId + 'Query':
          var dateFrom = $('.cm004-' + moduleId + '-date-from').val();
          var dateTo = $('.cm004-' + moduleId + '-date-to').val();
          if (!dateFrom || !dateTo) {
            return EL.msg('请先选择日期', 'green');
          }
          reqArgs = {dateFrom: dateFrom, dateTo: dateTo,factId:factId};
          break;

        //一个月
        case 'oneMonth':
          reqArgs = dateArgs(-1);
          break;

        //三个月
        case 'threeMonth':
          reqArgs = dateArgs(-3);
          break;
        // default:
      }
      loadModuleData(moduleId,reqArgs);
    });
  }

  function loadModuleData(moduleId,reqArgs) {
    if(moduleId==='capacity'){
      return EL.table(new _req('capacity', reqArgs, renderCap));
    }
    if (moduleId==='printSo'){
      return EL.table(new _req('printSo',reqArgs, renderPrintSo));
    }
  }


  function dateArgs(month) {
    return {
      factId:factId,
      dateFrom: moment().add(month, 'month').format('YYYY-MM-DD'),
      dateTo: moment().format('YYYY-MM-DD')
    }
  }

  //按钮组事件
  // function btnFrameList() {//spring
  //   // $('.cm004 .closeBtn').on('click', toggleClass1);
  //   //返回印刷订单
  //   $('.cm004 .closeBtn').on('click', function () {
  //     toggleClass1();
  //     // view('dblView');
  //   });

  //   $('.cm004 .printBtn').on('click', function () {
  //     EL.msg('打印成功', 'green');
  //   });
  // }

  //========================所有按钮事件   end  ===================================

});
