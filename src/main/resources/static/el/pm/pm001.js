/*
 * EL UI - 1.0.0
 * http://www.elitesland.com/
 *
 * Copyright 2016 Elitesland.com
 */
/*define(function (require) {
 var _tmpls = {};

 function load(viewId) {
 return EL.get('api/mock/pm001_' + viewId)
 .then(function (data) {
 return $('.pm001>  .' + viewId).html(_tmpls[viewId](data));
 });
 }

 function view(viewId) {
 load(viewId).then(function ($view) {
 $('.pm001> .view').addClass('hide');
 $view.removeClass('hide');
 if (viewId === 'listView') {
 EL.dtp('.pm001>.listView .el-dtp');
 return listenClick();//监听页面点击事件

 }else if(viewId === 'editView') {
 backTableList();
 asyncLoad_editPage().then(function () {
 return editListenClick();
 });
 }else if(viewId === 'dblView'){
 backTableList();
 asyncLoad_dbViewLoadTab2().then(function (){
 return dblListenClick();
 });
 }
 });
 }

 function backTableList(){
 $('.pm001 .panel-heading > .btn').on('click', function () {
 view('listView');
 });
 }


 //加载产品信息数据 Tab2页面


 function listenClick() {
 $('.pm001 .navbarbtn > .form-group> .btn').on('click', function () {
 var viewid=$(this).data('viewId');
 if(viewid==='pm001saveBtn'){
 EL.msg('提交成功','green');
 }else if(viewid==='pm001sureFileBtn'){
 EL.ask('文件是否确认？');
 }else{
 view(viewid);
 }
 });

 $('.pm001 >.view>.panel> .tablelist > .table > tbody > tr').on("dblclick",function(){
 var objValue=$(this).attr("data-view-value");
 view($(this).data('viewId'));
 });

 //隐藏、显示
 $('.pm001 .search-toggle-btn').on('click', function () {
 $(this).find('i').toggleClass("fa-plus");
 $(this).find('i').toggleClass("fa-minus");
 $('.pm001 .search-toggle-content').toggle();
 });
 }
 function editListenClick() {
 $('.pm001>.editView  .navbarbtn > .form-group> .btn').on('click', function () {
 var viewid=$(this).data('viewId');
 if(viewid==='pm001_edit_printBtn'){
 EL.msg('打印成功','green');
 }else if(viewid==='pm001_edit_saveBtn'){
 EL.msg('保存成功','green');
 }else if(viewid==='pm001_edit_submitBtn'){
 EL.msg('提交成功','green');
 }
 })
 }
 function dblListenClick() {
 $('.pm001>.dblView  .navbarbtn > .form-group> .btn').on('click', function () {
 var viewid=$(this).data('viewId');
 if(viewid==='pm001_dblView_printBtn'){
 EL.msg('打印成功','green');
 }else if(viewid==='pm001_dblView_submitBtn'){
 EL.msg('文件提交成功','green');
 }else if(viewid==='pm001_dblView_affirmBtn'){
 EL.msg('确认成功','green');
 }
 })
 }

 function init() {
 $('.pm001> .hbs').each(function () {
 var $hbs = $(this), viewId = $hbs.data('viewId');
 _tmpls[viewId] = Handlebars.compile($hbs.html());
 });

 view('listView');
 }



 return init;*/
define(function (require) {
    var _tmpls = {};

    var listView_reqProxy_quote = {
        url: 'api/pm/pm001/listView',
        argsBuilder: argsBuilder,
        callback: renderTable,   //回调
        sortSelector: '.pm001>.listView .table-master',
        pagingSelector: '.pm001>.listView .stp-pm001-list',
        trigger: '.pm001>.listView .search-btn',
        immediately: true
    };

    //请求参数列表
    function argsBuilder() {
        var checkboxObj = $('.pm001 .listView .prodTypeCheckbox input[name="pm001-checkbox"]:checked');
        var check_array =new Array();
        checkboxObj.each(function () {
            check_array.push($(this).val());
        });

        var custName = $('.pm001 .listView .custName').val();
        var prodName = $('.pm001 .listView .prodName').val();
        var quoteNo = $('.pm001 .listView .quoteNo').val();
        var createDate = $('.pm001 .listView .createDate').val();
        var endDate = $('.pm001 .listView .endDate').val();
        var condition = {
            custName: custName,
            prodName: prodName,
            quoteNo: quoteNo,
            createDate: createDate,
            endDate: endDate,
            quoteStatus: check_array.join(',')
        }
        return condition;
    }

    //渲染模板
    function renderTable(resultsData) {
        //EL.log("--------pm001", resultsData);
        $('.pm001 .listView  .listView-data').html(_tmpls['listView'](resultsData));
        EL.dtp('.pm001>.listView .el-dtp');
        return listenListClick();
    }

    /*var partMsg_reqProxy = {
     url: 'api/mock/pm001_partMsg',
     argsBuilder: argsBuilder,
     callback: renderPartMsg,   //回调
     sortSelector: '.pm001 .addProView .table-master',
     /!*pagingSelector: '.pm001>.listView .stp-fm001-list',*!/
     trigger: '.pm001>.addProView  .addBtn',
     immediately: true
     };*/

    //渲染模板
    /*function renderPartMsg(partMsgData) {
     EL.log("--------PartMsg", partMsgData);
     /!* var tmpl = Handlebars.compile($('.pm001 .hbs-listView').html());
     $('.pm001 .listView-data').html(tmpl(resultsData));*!/
     /!*loadTotalData();*!/
     $('.addProView  .partMsg').html(_tmpls['partMsg'](partMsgData));

     }*/


    function loadPartMsgDate() {
        return $.when(
            EL.get('api/mock/pm001_partMsg')
        ).then(function (partMsgData) {
            EL.log("!!!!!!!!!!!!!!!!", partMsgData);
            $('.partMsg').html(_tmpls['partMsg'](partMsgData));
        });
    }


    function listenListClick() {
        $('.pm001 .search-toggle-btn').on('click', function () {
            $(this).find('i').toggleClass("fa-plus");
            $(this).find('i').toggleClass("fa-minus");
            $('.pm001 .search-toggle-content').toggle();
        });

        $('.pm001 .navbarbtn > .form-group> .btn').on('click', function () {
            var viewId = $(this).attr('data-view-id');
            view(viewId);
        });


        $('.pm001 .listView  .quoteTable').on('click', function () {
            /*var objValue=$(this).parent().parent().attr("data-view-value");*/
            view("createPriceBtn");
        });


        //退回页面-确认按钮事件
        $(".pm001 .el-msg-returnBtn .modal-footer .return").click(function () {
            var textareaContent = $(".pm001 .modal-body .orderPriceBackTextarea").val();
            if (!textareaContent) {
                //EL.view('el-msg-tip');
                $('.pm001 .msg-tip').addClass('el-hide');
                $('.pm001 .msg-tip').removeClass('el-hide');
                return false;
                //EL.msg('请填写退回原因','green');
            }
            else {
                view('listView');
            }
        });


        $('.pm001>.addProView .panel-heading .btn').on('click', function () {
            view('createPriceBtn');
        });

        $(".pm001 .el-msg-addProdsBtn .modal-footer .btn").click(function () {
            view('createPriceBtn');
        });


        $('.pm001>.editView  .addFieldset  .btn').on('click', function () {
            var viewId = $(this).data('viewId');
            view(viewId);
        });

        $('.pm001>.editView .panel-heading > .btn').on('click', function () {
            //view('listView');
            optClass('listView');
        });

        $('.pm001>.printView .panel-heading > .btn').on('click', function () {
            //view('listView');
            optClass('editView');
        });

    }

    /*function listenEditClick() {

     }*/


    function enterPay() {
        $.when(
            EL.get('api/mock/pm001_enterPay')
        ).then(function (enterPayData) {
            EL.log("!!!!!!!!!!!!!!!!", enterPayData);
            $('.enterPay').html(_tmpls['enterPay'](enterPayData));
        }).then(function () {
                var $data_tbl = $(".el-msg-enterPayBtn .table");
                EL.log("enterPay---------->", $data_tbl);
                $.each($data_tbl.find("tr"), function () {
                    var $this = $(this);

                    var inputNum = $this.find("td:eq(2)").text();

                    if (inputNum === "0") {
                        console.log(" -- ", inputNum);
                        $this.find("input").attr('readOnly', true);
                    }
                })
            }
        )
    }


    function addProds() {
        return $.when(
            EL.get('api/mock/pm001_addProds')
        ).then(function (addProdsData) {
            EL.log("!!!!!!!!!!!!!!!!", addProdsData);
            $('.addProds').html(_tmpls['addProds'](addProdsData));
        });
    }


    function loadDblData() {
        return $.when(
            EL.get('api/mock/pm001_proDemd'),
            EL.get('api/mock/pm001_packDemd'),
            EL.get('api/mock/pm001_transDemd'),
            EL.get('api/mock/pm001_printView'),
            EL.get('api/mock/pm001_print2View')
        ).then(function (proDemdData, packDemdData, transDemdData, printData, print2Data) {
            $('.pm001_proDemd').html(_tmpls['proDemdView'](proDemdData[0]));
            $('.pm001_packDemd').html(_tmpls['packDemdView'](packDemdData[0]));
            $('.pm001_transDemd').html(_tmpls['transDemdView'](transDemdData[0]));
            $('.pm001_product').html(_tmpls['printView'](printData[0]));
            $('.pm001_products').html(_tmpls['print2View'](print2Data[0]));
        });
    }


    function payDetail() {
        return $.when(
            EL.get('api/mock/pm001_paperCost'),//纸张费用
            EL.get('api/mock/pm001_accessCost'),//辅料费用
            EL.get('api/mock/pm001_printCost'),//印刷费用
            EL.get('api/mock/pm001_dealCost'),//表面处理费用
            EL.get('api/mock/pm001_bindCost'),//装订费用
            EL.get('api/mock/pm001_handCost'),//手工费用
            EL.get('api/mock/pm001_printlnCost'),//印前费用
            EL.get('api/mock/pm001_packCost'),//包装费用
            EL.get('api/mock/pm001_transCost'),//物流费用
            EL.get('api/mock/pm001_change')//变更
        ).then(function (paperCostData, accessCostData, printCostData, dealCostData, bindCostData, handCostData, printlnCostData, packCostData, transCostData, changeData) {
            $('.paperCost').html(_tmpls['paperCost'](paperCostData[0]));
            $('.accessCost').html(_tmpls['accessCost'](accessCostData[0]));
            $('.printCost').html(_tmpls['printCost'](printCostData[0]));
            $('.dealCost').html(_tmpls['dealCost'](dealCostData[0]));
            $('.bindCost').html(_tmpls['bindCost'](bindCostData[0]));
            $('.handCost').html(_tmpls['handCost'](handCostData[0]));
            $('.printlnCost').html(_tmpls['printlnCost'](printlnCostData[0]));
            $('.packCost').html(_tmpls['packCost'](packCostData[0]));
            $('.transCost').html(_tmpls['transCost'](transCostData[0]));
            $('.change').html(_tmpls['change'](changeData[0]));
        });
    }

    function optClass(viewId) {
        $('.pm001> .view').addClass('el-hide');
        $('.pm001> .' + viewId).removeClass('el-hide');
    }

//视图
    function view(viewId) {
        if (viewId === 'listView') {
            optClass(viewId);
            EL.table(listView_reqProxy_quote);
        } else if (viewId === 'createPriceBtn') {
            optClass('editView');
            loadDblData();
            /*listenEditClick();*/
            EL.dtp('.pm001>.editView .el-dtp');
        } else if (viewId === 'saveBtn') {
            optClass('listView');
        } else if (viewId === 'passBtn') {
            optClass('listView');
        } else if (viewId === 'enterPayBtn') {
            $(".pm001 .el-msg-enterPayBtn").modal();
            enterPay();
            /*if(){
             }*/
        } else if (viewId === 'payDetailBtn') {
            payDetail();
            var dlg = $('.el-msg');
            dlg.find('.modal-content').css("width", "900px");
            dlg.find('.modal-title').text('价格明细');
            dlg.find('.modal-body').html($('.pm001 .payDetail').html());
            dlg.find('.modal-footer .ok').text('确认');
            dlg.find('.modal-footer .cancel').text('取消');
            dlg.modal();
        } else if (viewId === 'returnBtn') {
            $(".pm001 .modal-body .orderPriceBackTextarea").val("");
            $('.pm001 .msg-tip').addClass('el-hide');
            $(".pm001 .el-msg-returnBtn").modal();
        } else if (viewId === 'addPro') {
            optClass('addProView');
            EL.log("进来addpro了");
            loadPartMsgDate();
            /*EL.table(partMsg_reqProxy);*/
        } else if (viewId === 'addProds') {
            $(".pm001 .el-msg-addProdsBtn").modal();
            addProds();
        } else if (viewId === 'jumpOrder') {
            optClass('printView');
            loadDblData();
        }
    }

    function init() {
        $('.pm001> .hbs').each(function () {
            var $hbs = $(this), viewId = $hbs.data('viewId');
            _tmpls[viewId] = Handlebars.compile($hbs.html());
        });
        view('listView');
    }

    return init;
});
