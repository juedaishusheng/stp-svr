/*
 * EL UI - 1.0.0
 * http://www.elitesland.com/
 *
 * Copyright 2016 Elitesland.com
 */
define(function (require) {
  var _tmpls = {};
  var ouId = void(0);

  var listView_reqProxy = {
    url: 'api/fm/fm002/listView',
    argsBuilder: argsList,
    callback: renderTable,
    sortSelector: '.fm002 .stp-table-accountName',
    pagingSelector: '.fm002 .stp-fm002-account',
    trigger: '.fm002 .search-btn',  //检索按钮绑定
    immediately: true
  };

  var ticketView_reqProxy = {
    url: 'api/fm/fm002/ticketView',
    argsBuilder: argsTicket,
    callback: renderTicketlView,
    sortSelector: '.fm002 .stp-table-ticketName',
    pagingSelector: '.fm002 .stp-fm002-ticket',
    trigger: '.fm002 .search-btn',
    immediately: true
  };

  var payView_reqProxy = {
    url: 'api/fm/fm002/payView',
    argsBuilder: argsPay,
    callback: renderPayView,
    sortSelector: '.fm002 .stp-table-payName',
    pagingSelector: '.fm002 .stp-fm002-pay',
    trigger: '.fm002 .search-btn',
    immediately: true
  };

  var statementView_reqProxy = {
    url: 'api/fm/fm002/statementView',
    argsBuilder: argsStatement,
    callback: renderStatementView,
    sortSelector: '.fm002 .stp-table-statementName',
    pagingSelector: '.fm002 .stp-fm002-statement',
    trigger: '.fm002 .search-btn',
    immediately: true
  };

  //请求参数列表 不带参
  function argsList () {
    return {};
  }

  //请求参数列表
  function argsTicket () {
    return {ouId:ouId};
  }

  function argsPay () {
    return {ouId:ouId};
  }

  function argsStatement () {
    return {ouId:ouId};
  }

  //渲染listView模板
  function renderTable (resultsData) {
    $('.fm002 .listView').html(_tmpls['listView'](resultsData));
    EL.log('=============123',resultsData);
    return listenClick();
  }

  //渲染ticketView模板
  function renderTicketlView (resultsData) {
    $('.fm002 .ticketView').html(_tmpls['ticketView'](resultsData));
    EL.log('=============456',resultsData);
    return backTableList();
  }

  //渲染payView模板
  function renderPayView (resultsData) {
    $('.fm002 .payView').html(_tmpls['payView'](resultsData));
    EL.log('=============789',resultsData);
    return backTableList();
  }

  //渲染statementView模板
  function renderStatementView (resultsData) {
    $('.fm002 .statementView').html(_tmpls['statementView'](resultsData));
    EL.log('=============statement',resultsData);
    return backTableList();
  }

  function view(viewId) {

      if (viewId === 'listView') {
        optClass(viewId);
        EL.paging(listView_reqProxy);
        EL.dtp('.fm002>.listView .el-dtp');
      } else if (viewId === 'payView') {
        optClass(viewId);
        EL.paging(payView_reqProxy);
        EL.dtp('.fm002>.payView .el-dtp');
      } else if (viewId === 'ticketView') {
        optClass(viewId);
        EL.paging(ticketView_reqProxy);
        EL.dtp('.fm002>.ticketView .el-dtp');
      }else if (viewId === 'statementView'){
        optClass(viewId);
        EL.paging(statementView_reqProxy);
        EL.dtp('.fm002>.statementView .el-dtp');
      }

  }

  function backTableList() {
    $('.fm002 .panel-heading > .btn').on('click', function () {
      view('listView');
    });
  }


  //显示、隐藏不同模块view
  function optClass(viewId) {
    $('.fm002> .view').addClass('hide');
    $('.fm002> .'+viewId).removeClass('hide');
  }

  function listenClick() {
    $('.fm002 .navbarbtn > .form-group> .btn').on('click', function () {
      var dataviewvalue=$(this).attr('data-view-value');
      ouId = $('.fm002 .stp-table-accountName  input[name="fm002_table"]:checked').val();
      EL.log("~~~~~~~~~!!!!!"+ouId);
      view(dataviewvalue);
    });

  }

  function init() {
    $('.fm002> .hbs').each(function () {
      var $hbs = $(this), viewId = $hbs.data('viewId');
      _tmpls[viewId] = Handlebars.compile($hbs.html());
    });

    view('listView');
  }

  return init;
});

