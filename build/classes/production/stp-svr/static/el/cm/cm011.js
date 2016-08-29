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
    sortSelector: '.cm011 .stp-cm011-table',
    pagingSelector: '.cm011 .stp-cm011-orderPrice',
    //trigger: '.cm011 .search-btn',
    immediately: true
  };

  //请求参数列表
  function argsBuilder () {
    return {};
  }

  //渲染模板
  function renderTable (resultsData) {
    $('.cm011 .listView').html(_tmpls['listView'](resultsData));
    return buttonClick();
  }

  //视图
  function view(viewId) {
    if (viewId === 'listView') {
      $('.cm011 .listView').removeClass('hide');
      EL.paging(listView_reqProxy);
    }
  }

  //按钮点击事件
  function buttonClick(){
    $('.cm011  .navbarbtn > .form-group> .btn').on('click', function () {
      var viewId = $(this).data('viewId');
      if(viewId==='cm011-returnBtn'){
        var dlg = $('.el-msg');
        dlg.find('.modal-title').text('请填写退回原因');
        var msgContext = "<textarea rows='3' id='returnmsg' style='width:100%'></textarea>";
        dlg.find('.modal-body').empty().append(msgContext);
        dlg.modal();
        $('.el-msg >.modal-dialog> .modal-content> .modal-footer >.ok').text("提交"); //modal ok
        $('.el-msg >.modal-dialog> .modal-content> .modal-footer >.cancel').text("取消"); //modal cancel
        // var rmsg = $("#returnmsg").val();
        // console.log(rmsg);
      }
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

  // function init() {
  //   var _tmpl = Handlebars.compile($('.cm011_order_table').html());
  //   EL.get('api/cm_ou/cm011/listView').then(function (json) {
  //       $('.cm011_order_data').html(_tmpl(json));
  //   });
  //    EL.paging(listView_reqProxy);
  // }
  // return init;

});
