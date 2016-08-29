/*
 * EL UI - 1.0.0
 * http://www.elitesland.com/
 *
 * Copyright 2016 Elitesland.com
 */

/*------------------+
|   STP UI COMMON   |
+==================*/

// 各种缺省配置选项
EL.opts = {
  // @see https://bootstrap-datepicker.readthedocs.io/en/latest/options.html
  dtp: {
    language: EL.ctxt.lang,
    format: 'yyyy-mm-dd',
    // clearBtn: true,
    // todayBtn: true,
    todayHighlight: true,
    autoclose: true
  }
};

// 时间选择控件初始化
EL.dtp = function (selector, opts) {
  $(selector).datepicker(opts || EL.opts.dtp);
};

// 报红信息显示
EL.red = function (msg) {
  $('.el-warn').text(msg).removeClass('el-hide');
};

// 出一个对话框(Promise-Style)
EL.dlg = function (btns, txts, color) {
  var msgs = typeof txts === 'string' ? [txts] : txts,
    $msgs = $('<ul/>').addClass(color || '');
  for (var i = 0, n = msgs.length; i < n; i++) {
    $('<li>' + msgs[i] + '</li>').appendTo($msgs);
  }

  var $dlg = $('.el-msg');
  $dlg.find('.modal-title').text('盛通印刷云平台');
  $dlg.find('.modal-body').empty().append($msgs);

  var dfd = $.Deferred();
  $dlg.find('.ok').text(btns.ok || 'OK').on('click', function () {
    dfd.resolve();
  });
  btns.cancel ?
    $dlg.find('.cancel').removeClass('hide')
    .text(btns.cancel || 'Cancel').on('click', function () {
      dfd.reject();
    }) :
    $dlg.find('.cancel').addClass('hide');

  $dlg.modal();

  return dfd.promise();
};

// 出一个消息框
EL.msg = function (txts, color) {
  return EL.dlg({
    ok: '确定'
  }, txts, color);
};

// 出一个错误框
EL.err = function (txts) {
  return EL.msg(txts, 'red');
};

// 出一个确认框
EL.ask = function (txts) {
  return EL.dlg({
    ok: '确定',
    cancel: '取消'
  }, txts);
};

/*-------------------+
|   TABLE & PAGING   |
+===================*/

EL.paging = (function() {

  var MAX_PAGE_COUNT = 10;

  Handlebars.registerHelper('paging', function (pageIndex, pageCount) {
    var pn = pageCount > MAX_PAGE_COUNT ? MAX_PAGE_COUNT : pageCount
      , items = [];
    for (var pi = 1; pi <= pn; pi++) {
      pi === pageIndex
        ? items.push('<li class="item idx active"><span data-pi="' + pi + '">' + pi + '</span></li>')
        : items.push('<li class="item idx"><span data-pi="' + pi + '">' + pi + '</span></li>');
    }
    return new Handlebars.SafeString(items.join(''));
  });

  function _onSort(req) {
    var selector = req.sortSelector;
    $(selector + ' .sorting').on('click', function () {
      var $el = $(this);
      $el.toggleClass(function () {
        var order;
        if ($el.is('.asc')) {
          $el.removeClass('asc');
          order = 'desc';
        }
        else {
          $el.removeClass('desc');
          order = 'asc';
        }
        $el.siblings().removeClass('asc').removeClass('desc');
        req.args.order = order;
        req.args.pi = 1;
        req.args.field = $el.data('field');
        _paging(req);
        _resetPaging(req);
        return order;
      });
    });
  };

  function _onPaging(req) {
    var selector = req.pagingSelector;
    $(selector + ' .pagination .item').on('click', function () {
      var pi, $el = $(this),
        $span = $el.find('span');
      if ($el.is('.disabled') || $el.is('.active')) return;
      if ($el.hasClass('previous')) {
        pi = parseInt($el.data('pi'), 10);
        pi -= 1;
        if (pi < 1) pi = 1;
      }
      else if ($el.hasClass('next')) {
        var pc = parseInt($el.data('pc'), 10);
        pi = parseInt($el.data('pi'), 10);
        pi += 1;
        if (pi > pc) pi = pc;
      }
      else {
        pi = parseInt($span.data('pi'), 10);
        $el.siblings().removeClass('active');
        $el.addClass('active');
      }
      req.args.pi = pi;
      _paging(req);
      _animatePaging($el, req);
    });
  };

  function _paging(req) {
    var args = $.extend({}, req.argsBuilder(), req.args);
    // log(1, args);
    EL.get(req.url, args)
      .then(function (data) {
        req.callback(data.results);
        _renderPaging(data.paging, req);
      });
  };

  function _trigger(req) {
    $(req.trigger).on('click', function () {
      req.args = {
        pi: 1
      };
      _paging(req);
      _resetPaging(req);
    });
  };

  function _renderPaging(paging, req) {
    var selector = req.pagingSelector;
    if ($(selector).is('.el-hide')) {
      req.args = {};
      $(selector).html(_pagingTmpl(paging));
      $(selector).toggleClass('el-hide');
      _onSort(req);
      _onPaging(req);
    }
    else {
      _selector(req).$opt.data('pi', paging.pageIndex).data('pc', paging.pageCount);
    }
  };

  function _selector(req) {
    return {
      $item: $(req.pagingSelector + ' .pagination .item.idx'),
      $prev: $(req.pagingSelector + ' .pagination .item.previous'),
      $next: $(req.pagingSelector + ' .pagination .item.next'),
      $opt: $(req.pagingSelector + ' .pagination .item.previous,' +
        req.pagingSelector + ' .pagination .item.next')
    };
  };

  function _resetPaging(req) {
    var selector = _selector(req),
      $prev = selector.$prev;
    $prev.siblings().removeClass('active').removeClass('disabled');
    $prev.addClass('disabled');
    !$prev.next().is('.next') && $prev.next().addClass('active');
    $(req.sortSelector + ' .sorting').siblings().removeClass('asc').removeClass('desc');
    _changePaging(req);
  };

  function _animatePaging($el, req) {
    var selector = _selector(req),
      $prev = selector.$prev,
      $next = selector.$next,
      $item = selector.$item,
      pi = req.args.pi,
      pc = parseInt($next.data('pc'), 10);
    pi === 1 ? $prev.addClass('disabled') : $prev.removeClass('disabled');
    pi === pc ? $next.addClass('disabled') : $next.removeClass('disabled');
    pc > 10 && _changePaging(req);
    //上一页、下一页切换页码时样式
    if ($el.is('.active')) return;
    $.each($item, function (idx, val) {
      var pageIndex = $(val).is('.active') ? $(val).find('span').data('pi') : pi;
      if (pi !== pageIndex) {
        $el.siblings().removeClass('active');
        if ($el.is('.previous')) $(val).prev().addClass('active');
        else if ($el.is('.next')) $(val).next().addClass('active');
      }
    });
  };

  function _changePaging(req) {
    var selector = _selector(req),
      pages = [],
      $prev = selector.$prev,
      $next = selector.$next,
      $item = selector.$item,
      pi = req.args.pi,
      pc = parseInt($next.data('pc'), 10),
      cnt = pi > 6 ? pi + 4 : 10,
      cnt = cnt > pc ? pc : cnt;
    for (var limit = cnt - 9; limit <= cnt; limit++) pages.push(limit);
    $item.siblings().removeClass('active');
    $.each($item, function (idx, val) {
      $(val).find('span').data('pi', pages[idx]).text(pages[idx]);
      pi === pages[idx] && $(val).addClass('active');
    });
  };

  function _pagingTmpl(data) {
    var html =
      '<ul class="pagination"><li class="item previous disabled" data-pi="{{pageIndex}}"><span>上一页</span></li>' +
      '{{paging pageIndex pageCount}}' +
      '<li class="item next" data-pi="{{pageIndex}}" data-pc="{{pageCount}}"><span>下一页</span></li></ul>',
      tmpl = Handlebars.compile(html);
    return tmpl(data);
  };

  return function (req) {
    _trigger(req);
    if (req.immediately) {
      _paging(req);
    }
    else {
      req.immediately = true;
    }
  };

})();

$(function () {

  function initTabBar() {

    /*----------------+
    |   MENU & PAGE   |
    +================*/

    var MENU_HOME = 'home';
    var RE_MENUID = /^([a-z]{2})\d{3}$/;

    var _tabNavTmpl = Handlebars.compile(
      '<li class={{menuId}}><a href="#{{menuId}}" data-toggle="tab"><i class="fa fa-{{menuIco}}"></i>' +
      '{{#if menuLbl}} {{menuLbl}}&nbsp;&nbsp;<i class="fa fa-close" data-menu-id="{{menuId}}"></i>{{/if}}</a></li>'
    );
    var _tabContentTmpl = Handlebars.compile('<div id="{{menuId}}" class="tab-pane"></div>');
    var _pageTmpl = Handlebars.compile(
      '<link rel="stylesheet" href="{{{pageUri}}}.css">{{{pageUI}}}');

    function _loadModule($menu) {
      var menu = {
        menuId: $menu.data('menuId'),
        menuIco: $menu.data('menuIco'),
        menuLbl: $menu.data('menuLbl'),
        menuFix: $menu.data('menuFix')
      };
      _activateTab(menu.menuId) || _createTab(menu);
    }

    function _createTab(menu) {
      var matched = menu.menuId.match(RE_MENUID),
        pageMod = matched ? (matched[1] + '/' + matched[0]) : menu.menuId,
        pageUri = 'static/el/' + pageMod;
      return EL.get(pageUri + '.html').then(function (pageUI) {
        var pageHtml = _pageTmpl({
          pageUri: EL.url(pageUri),
          pageUI: pageUI
        });

        var $tabNav = $(_tabNavTmpl(menu)).appendTo('.content>ul.nav'),
          $tabPane = $(_tabContentTmpl(menu)).html(pageHtml).appendTo('.content>.tab-content')

        var $tabClose = $tabNav.find('.fa-close');
        menu.menuFix ? $tabClose.remove() : $tabClose.on('click', _destroyTab);

        _activateTab(menu.menuId);

        SystemJS.import(pageUri).then(_fnCaller);
      });
    }

    function _fnCaller(fn) {
      fn();
    }

    function _destroyTab() {
      var menuId = $(this).data('menuId'),
        $tabNav = $('.content>ul.nav>li.' + menuId),
        isActive = $tabNav.hasClass('active');
      $tabNav.remove();
      $('.content>.tab-content>#' + menuId).remove();
      isActive && _activateTab(MENU_HOME);
    }

    function _activateTab(menuId) {
      var $tabContent = $('.content>.tab-content');
      var $tabPane = $tabContent.find('#' + menuId);
      if (!$tabPane.length) return false;
      if ($tabPane.hasClass('active')) return true;

      $tabContent.children().removeClass('active');
      $tabPane.addClass('active');
      $('.content>ul.nav>li.' + menuId).tab('show');
      return true;
    }

    var $menus = $('ul.sidebar-menu li.menu-item')
      .on('click', function () {
        var $menu = $(this);
        $menu.hasClass(MENU_HOME) ? EL.go() : _loadModule($menu);
      });
    _loadModule($($menus[0]));

  }

  EL.get('api/ui/menus').then(function(menus) {
    var tmpl = Handlebars.compile($('#el_menu').html());
    $('.sidebar-menu').html(tmpl({menus: menus, debug: true}));
    initTabBar();
  });

});
