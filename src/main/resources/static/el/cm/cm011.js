/*
 * EL UI - 1.0.0
 * http://www.elitesland.com/
 *
 * Copyright 2016 Elitesland.com
 */

define(function (require) {

  var _tmpls = {};

  var listView_reqProxy = {
    url: 'api/cm_ou/cm011/listView',
    argsBuilder: argsBuilder,
    callback: renderTable,   //回调
    selector: '.cm011 .table-listView',
    pagingSelector: '.cm011 .paging-listView',
    //sortSelector: '.cm011 .stp-cm011-table',
    trigger: '.cm011 .search-btn',
    immediately: true
  };

  //请求参数列表
  function argsBuilder () {
    return {};
  }

  //渲染模板
  function renderTable (resultsData) {
    $('.cm011 .listView-data').html(_tmpls['listView'](resultsData));
    return buttonClick();
  }

  //视图
  function view(viewId) {

    if (viewId === 'listView') {
      $('.cm011 .el-msg-tip').addClass('el-hide');
      EL.table(listView_reqProxy);
    }
  }

  //按钮点击事件
  function buttonClick(){
    $('.cm011  .navbarbtn > .form-group> .btn').on('click', function () {
      var viewId = $(this).data('viewId');
      //退回按钮事件
      if(viewId==='cm011-returnBtn'){
        var orderId = $('.cm011 .listView-data input[name="cm011_table"]:checked').val();
        if(typeof(orderId) === "undefined"){
          EL.msg('请先选择','green');
        }else{
          $(".cm011 .el-msg-returnBtn").modal();
        }
      }
      //同意按钮事件
      if(viewId==='cm011-agreeBtn'){
        var orderId = $('.cm011 .listView-data input[name="cm011_table"]:checked').val();
        if(typeof(orderId) === "undefined"){
          EL.msg('请先选择','green');
        }
        else {
          EL.get('api/cm_ou/cm011/updateListView', {orderId: orderId}).then(function (data) {
              view('listView');
          });
        }
      }
    });

    //退回页面-确认按钮事件
    $(".cm011 .modal-footer .ok").click(function () {
      var textareaContent=$(".cm011 .modal-body .orderPriceBackTextarea").val();
      var orderId = $('.cm011 .listView-data input[name="cm011_table"]:checked').val();
      if(!textareaContent){
        //EL.view('el-msg-tip');
        $('.cm011 .el-msg-tip').addClass('el-hide');
        $('.cm011 .el-msg-tip').removeClass('el-hide');
        $(".cm011 .modal-body").append($(".cm011 .el-msg-tip"));
        return false;
        //EL.msg('请填写退回原因','green');
      }
      else {
        EL.get('api/cm_ou/cm011/orderPriceBackView',{orderId: orderId,textareaContent: textareaContent}).then(function (data) {
          view('listView');
        });
      }
    });

//  退回页面-取消按钮事件
    $(".cm011 .modal-footer .cancel").click(function () {
      $('.cm011 .el-msg-tip').toggleClass('el-hide');
    });
  }


  //初始化
  function init() {
    $('.cm011> .hbs').each(function () {
      var $hbs = $(this), viewId = $hbs.data('viewId');
      _tmpls[viewId] = Handlebars.compile($hbs.html());
    });
    view('listView');
  }
  return init;

});
