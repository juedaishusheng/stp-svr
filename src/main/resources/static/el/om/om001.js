/*
 * EL UI - 1.0.0
 * http://www.elitesland.com/
 *
 * Copyright 2016 Elitesland.com
 */
define(function (require) {
  var _tmpls = {};
  function view(viewId) {
    EL.view('om001',viewId);//页面切换
    EL.dtp('.om001  .' + viewId + ' .el-dtp');//日期控件
    if (viewId === 'listView') {
        EL.table(new _req('listView', argsListview, renderListView));
        return listenClick();
    }else if (viewId === 'printView') {
      loadDblData();
      backTableList();
    }else if (viewId === 'transView') {
      EL.table(new _req('transView', argsListview, renderTransView));
      return listenClick2();
    }
  }
  /*
   * 请求数据
   * @param moduleId 模块名称 listView/printView/transView
   */
  function _req(moduleId, argsBuilder, callback) {
    this.url = 'api/om/om001/listView';
    this.argsBuilder = argsBuilder;
    this.callback = callback;
    this.selector = '.om001 .om001-table-' + moduleId;
    this.trigger = '.om001 .om001-' + moduleId + '-search';
    this.pagingSelector = '.om001 .om001-paging-' + moduleId;
    this.immediately = true
  }
  //渲染模板
  function renderListView(resultsData) {
    $('.om001 .panel .om001_listView').html(_tmpls['listView'](resultsData));
    $(".om001 input[name='om001_table1']:eq(0)").attr("checked", 'checked');
  }
  //渲染库存查询模板
  function renderTransView(resultsData) {
    $('.om001 .panel .om001_transView').html(_tmpls['transView'](resultsData));
  }

  //请求参数
  function argsListview() {
    var soName=$('.om001 .panel .navbar-form .soName').val();
    var custName =$('.om001 .panel .navbar-form .custName').val();
    var prodName = $('.om001 .panel .navbar-form .prodName').val();
    var om001DateFrom = $('.om001 .panel .navbar-form .om001DateFrom').val();
    var om001DateTo = $('.om001 .panel .navbar-form .om001DateTo').val();
    var condition = {
        'so.soName':soName,
        'cust.custName':custName,
        'prod.prodName':prodName,
        om001DateFrom:om001DateFrom,
        om001DateTo:om001DateTo
    };
    return condition;
  }
  function loadDblData() {
    var checkRadio = $(".om001 input[name='om001_table1']:checked");
    var conditon = {
      'so.soNo': checkRadio.data('soNo')
    };
    var detail_tmpl = Handlebars.compile($('.om001-headView').html());
    EL.get("api/om/om001/headView", conditon).then(function (json) {
      $('.om001 .om001-headInfo').html(detail_tmpl(json));
    });
    }

  function backTableList() {
    $('.om001 >.printView .navbarbtn>.form-group> .btn').on('click', function () {
      var dataviewvalue = $(this).attr('data-view-value');
      if (dataviewvalue === 'listView') {
        view(dataviewvalue);
      } else if (dataviewvalue === 'payDetail') {
        payDetail();
        var dlg = $('.el-msg');
        dlg.find('.modal-content').css("width","900px")
        dlg.find('.modal-title').text('价格明细');
        dlg.find('.modal-body').html($('#payDetail').html());
        dlg.find('.modal-footer .ok').text('确认');
        dlg.find('.modal-footer .cancel').text('取消');
        dlg.modal();
      }
    });
  }

  function payDetail() {
    return $.when(
      EL.get('api/mock/om001_paperCost'),//纸张费用
      EL.get('api/mock/om001_accessCost'),//辅料费用
      EL.get('api/mock/om001_printCost'),//印刷费用
      EL.get('api/mock/om001_dealCost'),//表面处理费用
      EL.get('api/mock/om001_bindCost'),//装订费用
      EL.get('api/mock/om001_handCost'),//手工费用
      EL.get('api/mock/om001_printlnCost'),//印前费用
      EL.get('api/mock/om001_packCost'),//包装费用
      EL.get('api/mock/om001_transCost')//物流费用
    ).then(function (paperCostData, accessCostData, printCostData, dealCostData, bindCostData, handCostData, printlnCostData, packCostData, transCostData) {

      $('.paperCost').html(_tmpls['paperCost'](paperCostData[0]));
      $('.accessCost').html(_tmpls['accessCost'](accessCostData[0]));
      $('.printCost').html(_tmpls['printCost'](printCostData[0]));
      $('.dealCost').html(_tmpls['dealCost'](dealCostData[0]));
      $('.bindCost').html(_tmpls['bindCost'](bindCostData[0]));
      $('.handCost').html(_tmpls['handCost'](handCostData[0]));
      $('.printlnCost').html(_tmpls['printlnCost'](printlnCostData[0]));
      $('.packCost').html(_tmpls['packCost'](packCostData[0]));
      $('.transCost').html(_tmpls['transCost'](transCostData[0]));
    });
  }

  function paperconfData() {
    var _tmpl = Handlebars.compile($('.om001_paperConfData').html());
    EL.get('api/mock/om001_paperConf')
      .then(function (json) {
        $('.om001_paperConf').html(_tmpl(json));
      });
  }

  function listenClick() {
    $('.om001 > .listView  .navbarbtn > .form-group> .btn').on('click', function () {
      var dataviewvalue = $(this).attr('data-view-value');
      if (dataviewvalue == 'transView') {
        view(dataviewvalue);
      }else if(dataviewvalue=='printView'){
        view(dataviewvalue);
      }else if(dataviewvalue == 'gypsView'){
        $('.om001> .view').addClass('el-hide');
        $('#om001-gypsView-div').removeClass('el-hide');
          return listenClick3();
      }else {
        stockData();
        var dlg = $('.el-msg');
        dlg.find('.modal-content').css("width","900px");
        dlg.find('.modal-title').text('库存查询');
        dlg.find('.modal-body').html($('#stockNum').html());
        dlg.find('.modal-footer .ok').text('确认');
        dlg.find('.modal-footer .cancel').text('取消');
        dlg.modal();
      }
    $('.om001 .search-toggle-btn').on('click', function () {
      $(this).find('i').toggleClass("fa-plus");
      $(this).find('i').toggleClass("fa-minus");
      $('.om001 .search-toggle-content').toggle();
    });
  });
  }

  function stockData() {
    return $.when(
      EL.get('api/mock/om001_productNum'),
      EL.get('api/mock/om001_stockNum')
    ).then(function (productData, stockData) {
      $('.om001_productNum').html(_tmpls['productNum'](productData[0]));
      $('.om001_stockNum').html(_tmpls['stockNum'](stockData[0]));
    });
  }

  function listenClick2() {
    $('.om001 .panel-heading > .btn').on('click', function () {
      view('listView');
    });
    $('.om001 .navbarbtn > .form-group> .btn').on('click', function () {
      var dataviewvalue = $(this).attr('data-view-value');
      if(dataviewvalue =='saveBtn'){
        EL.msg('保存成功!');
      }else if(dataviewvalue == 'removeBtn'){
        var checkList = $("input[name='checkItem']:checked");
        if(checkList.length<=0){
          EL.msg('至少选择一行!');
          return false;
        }else{
          var ids = "";
          for (var i = 0; i < checkList.length; i++) {
            $(checkList[i]).parents('tr').remove();
          }
        }
      }
    });
  }
   function listenClick3() {
     //返回
     $('#om001-2-btn-back').off('click').on('click', function() {
       $('#om001-gypsView-div').addClass('el-hide');
       $('.om001>.listView').removeClass('el-hide');

     });
     //保存
     $('#om001-2-btn-save').off('click').on('click', function() {
       EL.msg('保存成功！');
     });
     //评审完成
     $('#om001-2-btn-finish').off('click').on('click', function() {
       $('#om001-gypsView-div').addClass('el-hide');
       $('.om001>.listView').removeClass('el-hide');
     });
     $('#om001-2-btn-fade1-select').on('click',function(){
//                  selectPaper();
       var dlg = $('#om001-2-btn-fade1-select-modal');
       dlg.find('.modal-content').css("width","1200px").css("left","-300px");
       dlg.find('.modal-body').html($('#om001-2-fade1-select-tmpl').html());
     });
     $('.om001-2-prod-tmpl .look').on('click',function(){
       //var $click = $(e.target);
       var dlg = $('#om001-2-btn-prod-look-modal');
       dlg.find('.modal-content').css("width","1200px").css("left","-300px");
       dlg.find('.modal-body').html($('#om001-2-prod-look-tmpl').html());
     });


   }

  function init() {
    $('.om001> .hbs').each(function () {
      var $hbs = $(this), viewId = $hbs.data('viewId');
      _tmpls[viewId] = Handlebars.compile($hbs.html());
    });

    view('listView');
  }

  return init;
});
