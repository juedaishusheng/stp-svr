/*
 * EL UI - 1.0.0
 * http://www.elitesland.com/
 *
 * Copyright 2016 Elitesland.com
 */
define(function (require) {
  var _tmpls = {};

  function load(viewId) {
    return EL.get('api/fm/fm001/' + viewId)
      .then(function (data) {
        return $('.fm001>  .' + viewId).html(_tmpls[viewId](data));
      });
  }

  function view(viewId) {
    load(viewId).then(function ($view) {
      $('.fm001> .view').addClass('hide');
      $view.removeClass('hide');
      if (viewId === 'listView') {
        asyncLoad().then(function () {//渲染页面异步加载数据（先将页面加载完，再监听）
          EL.dtp('.fm001 .el-dtp');
          return listenClick();//监听页面点击事件
        });
      } else if (viewId === 'editView') {
        backTableList();
      } else if (viewId === 'dblView') {
        backTableList();
      }
    });
  }

  function backTableList() {
    $('.fm001 .panel-heading > .btn').on('click', function () {
      view('listView');
    });
  }

  function asyncLoad() {
    return $.when(
      EL.get('api/mock/fm001_orderStatus')
    ).then(function (orderStatus) {
      EL.log(orderStatus);
      $('.fm001 .orderStatus').append(_tmpls['orderStatus'](orderStatus));

    });
  }


  function listenClick() {
    $('.fm001 .navbarbtn > .form-group> .btn').on('click', function () {
      view($(this).data('viewId'));
    });

  }

  function init() {
    $('.fm001> .hbs').each(function () {
      var $hbs = $(this), viewId = $hbs.data('viewId');
      _tmpls[viewId] = Handlebars.compile($hbs.html());
    });

    view('listView');
  }

  return init;
});

