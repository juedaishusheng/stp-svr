/*
 * EL UI - 1.0.0
 * http://www.elitesland.com/
 *
 * Copyright 2016 Elitesland.com
 */

define(function (require) {

  var _tmpls = {};

//-----------------------主页面数据查询---------------------------------
  var listViewProxy = {
    url: 'api/cm_fac/cm209/listView',
    argsBuilder: argsMaster,
    callback: renderMaster,
    selector: '.cm209 .table-master',
    pagingSelector: '.cm209 .paging-master',
    trigger: '.cm209 .search-master-btn',  //检索按钮绑定
    immediately: false
  };

  //----------------主页面请求参数列表------------------------------------------
  function argsMaster() {
    var prodName = $('#prodName').val(); //产品名称
    var soNo = $("#soNo").val();//订单编号
    var ouName = $("#customName").val();//公司名称
    var manuStatus = $(".cm209 .master .manuStatus :selected").val();

    var manuDueDateStart = $(".cm209 .master .manuDueDateStart").val();

    var manuDueDateEnd = $(".cm209 .master .manuDueDateEnd").val();

    var condition = {
      prodName: prodName,
      soNo: soNo,
      ouName: ouName,
      manuStatus: manuStatus,
      manuDueDateStart: manuDueDateStart,
      manuDueDateEnd: manuDueDateEnd
    };
    return condition;
  }

  //-------------------渲染主页面Master模板-------------------------------
  function renderMaster(data) {

    var tmpl = _tmpls['listView'];
    $('.cm209 .master-data').html(tmpl(data));
  }

  function togglePages() {
    $(".cm209 .view.master").toggleClass('el-hide');
    $(".cm209 .view.dblView").toggleClass('el-hide');

  }

//--------------------视图函数------------------------------------------
  function view(viewId) {
    if (viewId === 'listView') {
      EL.table(listViewProxy);
    }
  }

  //按钮组事件
  function btnFrameList() {
    $('.cm209 .btn').on('click', function () {
      var viewid = $(this).data('viewId');
      if (viewid === 'queryProBtn') {
        EL.msg('产品信息', 'green');
      }
    });
  }

  //-------------------------加载页面上的UDC数据，select数据-------------
  function loadSelectData() {

    return $.when(
      //公司查询的select数据
      EL.get('api/ui/udc/PRODCUT_STATUS')
    ).then(function (manuStatus) {
      EL.log(manuStatus);
      $('.manuStatus').append(_tmpls['manuStatus'](manuStatus));
    });
  }


//--------------------子页面数据渲染，渲染Prod Detail模板----------------
  function renderProdDetail(data) {
    //var tmpl = Handlebars.compile($('.cm209 .hbs-prod-dtl').html());
    var tmpl = _tmpls["dblView"];
    //子页面的head数据
    $('.cm209 .dblView').html(tmpl(data.cmOrderQryHeadDomain));

    //子页面的产品明细数据
    $('.cm209-prod-dtl').html(_tmpls['cm209-prod-dtl'](data.cmOrderQryDtlDomains));

    //子页面的订单排场
    $('.cm209_data_occupy').html(_tmpls['cm209_data_occupy'](data.cmOrderQryOccupyDomains));

    //子页面的生产报工
    $('.cm209-sorpt').html(_tmpls['cm209-sorpt'](data.cmOrderQrySorptDomains));

    //子页面的完工入库
    $('.cm209_data_prodin').html(_tmpls['cm209_data_prodin'](data.cmOrderQryProdInDomains));

    //子页面的生产记录
    $('.cm209-snote-item').html(_tmpls['cm209-snote-item'](data.cmOrderQrySnoteItemDomains));

    //绑定子页面的事件
    eventBindForDtl();
  }

//----------------------------绑定子页面的事件，例如：返回列表按钮事件、产品明细表数据的行单击事件---------------
  function eventBindForDtl() {
    //子页面的产品明细行单击事件，单击之后加载对应产品的产能需求
    $(".cm209 .cm209-prod-dtl >tr").on("click", function () {
      var prodId = $(this).data('args');
      if (prodId != undefined && prodId != null) {
        EL.get('api/cm_fac/cm209/dblProdProcess', {prodId: prodId}).then(renderProdProcess);
      }

    });

    //绑定返回列表按钮的单击事件
    $(".cm209 .returnList").on("click", function () {
      togglePages();
    });
  }

  //---------------渲染产能需求，渲染Prod Process模板 产能需求------------
  function renderProdProcess(data) {
    var tmpl = _tmpls["cm209-prod-process"];
    $('.cm209 .view .cm209-prod-process').html(tmpl(data));
  }

  //------------------绑定主页面数据的单击事件，单击后打开子页面------------
  function bindClick() {
    $('.cm209 .master-data').on('click', 'a', function () {
      togglePages();
      var soId = $(this).data('args');
      if (soId != null && soId != undefined && soId != "") {
        EL.get('api/cm_fac/cm209/dblDtlData', {soId: soId}).then(renderProdDetail);
      }
      return false;
    });

    $(".cm209 .search-toggle-btn").on('click', function () {
      $(this).parent().find(".search-toggle-content").toggle();
    });
  }
//------------------------页面初始化函数-------------------------
  function init() {
    EL.dtp('.cm209 .el-dtp'); //日期
    $('.cm209> .hbs').each(function () {
      var $hbs = $(this), viewId = $hbs.data('viewId');
      _tmpls[viewId] = Handlebars.compile($hbs.html());
    });

    view('listView');

    loadSelectData();
    bindClick();


  }

  return init;

});
