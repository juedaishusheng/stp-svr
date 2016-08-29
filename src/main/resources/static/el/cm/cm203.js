/*
 * EL UI - 1.0.0
 * http://www.elitesland.com/
 *
 * Copyright 2016 Elitesland.com
 */
define(function (require) {

  var _tmpls203 = {};
  var _ouId = void(0);
  var _monthStatus = void(0);
  var _dateFrom = void(0);
  var _dateTo = void(0);
  var _manuStatus = void(0);
  /*-------------------+
   | 分页、查询函数条件 |
   +===================*/
  //公司查询主页面分页查询函数条件
  var listView_reqProxy = {
    url: 'api/cm_fac/cm203/listView',
    argsBuilder: argsMaster,
    callback: renderMaster,
    selector: '.cm203 .table-master',
    pagingSelector: '.cm203 .paging-master',
    trigger: '.cm203 .cm203-search-ou',
    immediately: true
  };

  //请求参数列表-公司查询主页面
  function argsMaster() {
    var ouName = $('.cm203 .listView .ouName').val(); //公司名称
    var qualifyLevel = $('.cm203 .listView .quantityLevel :selected').val(); //质量等级
    var printDiffLevel = $('.cm203 .listView .printLevel :selected').val(); //印刷难度等级
    var bindDiffLevel = $('.cm203 .listView .bindDiffLevel :selected').val(); //装订难度等

    var condition = {
      ouName: ouName,
      qualifyLevel: qualifyLevel,
      printDiffLevel: printDiffLevel,
      bindDiffLevel: bindDiffLevel
    };
    return condition;
  }

  //回调渲染主数据分页页面-公司查询主页面
  function renderMaster(data) {
    $('.cm203 .listView  .master-data').html(_tmpls203['listView'](data));
  }

  //公司查询子页面 产能数据 分页查询函数条件
  var dblView_proData_reqProxy = {
    url: 'api/cm_fac/cm203/dblViewProData',
    argsBuilder: dblView_proData_argsMaster,
    callback: dblView_proData_renderMaster,
    selector: '.cm203 .table-dblView-capacity',
    pagingSelector: '.cm203 .paging-dblView-capacity',
    trigger: '.cm203 .cm203-search-capacity',
    immediately: true
  };

  //请求参数列表-公司查询子页面 产能数据
  function dblView_proData_argsMaster() {
    var dateFrom = $('.cm203 .cm203-capacity-date-from').val();
    var dateTo = $('.cm203 .cm203-capacity-date-to').val();
    if(_monthStatus === 1){
      dateFrom = _dateFrom;
      dateTo = _dateTo;
    }
    var condition = {
      ouId: _ouId,
      dateFrom:dateFrom,
      dateTo:dateTo
    };
    return condition;
  }

  //回调渲染主数据分页页面-公司查询子页面 产能数据
  function dblView_proData_renderMaster(data) {
    $('.cm203 .dblView .cm203_capacity').html(_tmpls203['capacityView'](data));
    //_monthStatus = 0;
  }

  //公司查询子页面 印刷订单 分页查询函数条件
  var dblView_printData_reqProxy = {
    url: 'api/cm_fac/cm203/dblViewPrintData',
    argsBuilder: dblView_printData_argsMaster,
    callback: dblView_printData_renderMaster,
    selector: '.cm203 .table-dblView-print',
    pagingSelector: '.cm203 .paging-dblView-print',
    trigger: '.cm203 .cm203-search-print',
    immediately: true
  };

  //请求参数列表-公司查询子页面 印刷订单
  function dblView_printData_argsMaster() {
    var dateFrom = $('.cm203 .cm203-print-date-from').val();
    var dateTo = $('.cm203 .cm203-print-date-to').val();
    if(_monthStatus === 1){
      dateFrom = _dateFrom;
      dateTo = _dateTo;
    }
    var condition = {
      ouId: _ouId,
      dateFrom:dateFrom,
      dateTo:dateTo,
      manuStatus:_manuStatus
    };
    return condition;
  }

  //回调渲染主数据分页页面-公司查询子页面 印刷订单
  function dblView_printData_renderMaster(data) {
    $('.cm203 .dblView .cm203_print').html(_tmpls203['printView'](data));
    //_monthStatus = 0;
  }

  /*-------------------+
   |  页面渲染视图管理  |
   +===================*/
  function view(viewId) {
    EL.view('cm203',viewId);
    //主页面
    if (viewId === 'listView') {
      loadSelectData();
      EL.table(listView_reqProxy);
      goToDetail();
      return false;
    }
    //子页面
    if (viewId === 'dblView') {
      loadDetailSelectData();
      EL.dtp('.cm203 .dblView .el-dtp');
      monthClick();
      goToPrintDetail();
      return goBack();
    }
    //子页面中的印刷订单的子页面
    if (viewId === 'dblView-print-detail') {
      //loadSoProdDetail();
      return goDetailBack();
    }
  }

  /*-------------------+
   | 页面Button事件管理 |
   +===================*/
  //返回公司查询按钮事件
  function goBack() {
    $('.cm203 .dblView .el-back').on('click', function () {
      EL.view('cm203','listView');
    });
  }

  //返回子页面按钮事件
  function goDetailBack() {
    $('.cm203 .dblView-print-detail .closeBtn').on('click', function () {
      EL.view('cm203','dblView');
    });
  }

  /*-------------------+
   | 详细的业务处理请求 |
   +===================*/
  //公司查询初始化页面 select数据
  function loadSelectData() {
    $.when(
      EL.get('api/ui/udc/QUALITY_LEVEL'),//生产质量等级
      EL.get('api/ui/udc/PRINT_DIFF_LEVEL'),//印刷难度等级
      EL.get('api/ui/udc/BIND_DIFF_LEVEL')//装订等级
    ).then(function (quantityLevel, printLevel, bindDiffLevel) {
      EL.log(quantityLevel, printLevel, bindDiffLevel);
      $('.cm203 .listView .quantityLevel').append(_tmpls203['quantityLevel'](quantityLevel[0]));
      $('.cm203 .listView .printLevel').append(_tmpls203['printLevel'](printLevel[0]));
      $('.cm203 .listView .bindDiffLevel').append(_tmpls203['bindDiffLevel'](bindDiffLevel[0]));
    });
  }

  //公司查询子页面 印刷订单select数据
  function loadDetailSelectData() {
    $.when(
      EL.get('api/ui/udc/PRODCUT_STATUS')//生产状态
    ).then(function (productStatus) {
      var data = new Array();
     if(productStatus){
        productStatus.forEach(function(obj,i){
          if(obj.key!=='04'){
            data[i] = obj;
          }
        })
      }
      $('.cm203 .dblView .status').html(_tmpls203['status'](data));
      //TODO 这是不好的处理方式，暂时这样处理 。稍后修改
      while ($('.cm203 .status-select').select().val() !== 'undefined'){
        statusSelectClick();
        return ;
      }
    });
  }
  //加载印刷订单详情页 工序类型select数据
  function loadSoProdDetail() {
    return EL.get('api/cm_ou/cm004/capaType')
      .then(function (capaTypes) {
        $('.cm203 .dblView-print-detail .capaType').html(_tmpls203['capaType'](capaTypes));
      });
  }

  //双击加载子页面table数据
  function loadDblTableData(data) {
      $('.cm203-detail-label').html(_tmpls203['detailData'](data)); //基本数据 label数据
      $('.cm203_process_capacity').html(_tmpls203['processCapacityView'](data.factStdcapaDomains)); //工序产能table数据
      $('.cm203_route').html(_tmpls203['priceView'](data.proPriceDataDomains)); //工序价格数据
  }

  //双击加载印刷订单详情页面table数据
  function loadPrintDetailTableData(data) {
    $('.cm203-soNo').html(_tmpls203['soNo'](data));
    $('.cm203_printOrder_1').html(_tmpls203['printOrder_1'](data.schedulingInfo));
    $('.cm203_printOrder_2').html(_tmpls203['printOrder_2'](data.prodDetails));
    $('.cm203_printOrder_3').html(_tmpls203['printOrder_3'](data.prodReportInfo));
    $('.cm203_printOrder_4').html(_tmpls203['printOrder_4'](data.completionInfo));
    $('.cm203_printOrder_5').html(_tmpls203['printOrder_5'](data.prodRecords));
  }


  //公司查询主页面Table数据点击跳转到子页面事件处理
  function goToDetail() {
    $('.cm203 .listView .master-data').on('click', 'a', function () {
      _ouId = $(this).data('args');
      view('dblView');
      return detaiData();
    });
  }

  //公司查询子页面，数据请求处理
  function detaiData() {
    //基本数据，工序产能，工序价格 数据
    EL.get('api/cm_fac/cm203/detailTables', {ouId: _ouId}).then(loadDblTableData);
    //产能数据
    EL.table(dblView_proData_reqProxy );
    //印刷订单
    EL.table(dblView_printData_reqProxy);
  }

  //跳转到印刷订单详情页
  function goToPrintDetail() {
    $('.cm203 .dblView .cm203_print').on('click', 'a', function () {
      var args = $(this).data('args');
      if(args !== null){
        var soManuId = args.split(',')[0]; //T_SO_MANU ID号
        var manuDistId = args.split(',')[1]; //手工分单工厂ID
        var soNo = args.split(',')[2]; //订单编号
      }
      view('dblView-print-detail');
      return EL.get('api/cm_fac/cm203/prinDetailView', {soManuId: soManuId,manuDistId: manuDistId,soNo: soNo}).then(loadPrintDetailTableData);
    });
  }

  //产能数据，印刷订单 一个月，三个月按钮事件
  function monthClick() {
    $('.cm203  .dblView .btn').on('click',function () {
      var btnId = $(this).data('viewId');
      if(typeof(btnId) !== "undefined"  && btnId !== null){
        _monthStatus = 1;
        var tab = btnId.split(',')[0];
        var month = btnId.split(',')[1];

        if(month === 'oneMonth'){
          _dateFrom = moment().add(-1, 'month').format('YYYY-MM-DD');
          _dateTo = moment().format('YYYY-MM-DD');
        } else if(month === 'threeMonth'){
          _dateFrom = moment().add(-3, 'month').format('YYYY-MM-DD');
          _dateTo = moment().format('YYYY-MM-DD');
        }

        if(tab === 'capa'){
          //产能数据 请求
          EL.table(dblView_proData_reqProxy);
        } else if(tab === 'print'){
          //印刷订单请求
          EL.table(dblView_printData_reqProxy);
        }
        _monthStatus = 0;
      }
    })
  }

  //印刷订单，生产状态select修改 触发事件
  function statusSelectClick() {
    $('.cm203  .status-select').change(function () {
      _manuStatus = $(this).select().val();
      //印刷订单请求
      EL.table(dblView_printData_reqProxy);
    })
  }

  //初始化 编译所有模板
  function init() {
    $('.cm203 .hbs').each(function () {
      var $hbs = $(this), viewId = $hbs.data('viewId');
      _tmpls203[viewId] = Handlebars.compile($hbs.html());
    });
    view('listView');
  }
  return init;
});
