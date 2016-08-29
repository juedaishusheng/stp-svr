/*
 * EL UI - 1.0.0
 * http://www.elitesland.com/
 *
 * Copyright 2016 Elitesland.com
 */

define(function (require) {

  var _randomColorFactor = function () {
    return Math.round(Math.random() * 255);
  };
  var randomColor = function (opacity) {
    return 'rgba(' + _randomColorFactor() + ',' + _randomColorFactor() + ',' +
      _randomColorFactor() +
      ',' + (opacity || '.3') + ')';
  };
  var dataList = new Array();
  var title = "";

  //异步加载页面数据
  function asyncLoad() {
    return $.when(
      EL.get('api/mock/ui006_designStatus'),
      EL.get('api/mock/ui006_productStatus')
    ).then(function (designStatusData,productStatusData) {
      EL.log(designStatusData,productStatusData);
      $('.designStatus').append(_tmpls['designStatus'](designStatusData[0]));
      $('.productStatus').append(_tmpls['productStatus'](productStatusData[0]));
    });
  }


  function _config(dataList){
    var config = {
      type: 'line',
      data: {
        labels: getXline(),
        datasets: [{
          label: title==''?'产能利用率':title,
          data: dataList,
          fill: false
        }]
      },
      options: {
        responsive: true,
        title: {
          display: true,
          text: '盛通驾驶舱产能利用率统计2'
        },
        // tooltips: {
        //   mode: 'label',
        //   callbacks: {}
        // },
        hover: {
          mode: 'dataset'
        },
        scales: {
          xAxes: [{
            display: true,
            scaleLabel: {
              show: true,
              labelString: '月'
            }
          }],
          yAxes: [{
            display: true,
            scaleLabel: {
              show: true,
              labelString: '%'
              //beginAtZero:true
            }
          }]
        }
      }
    };

    //渲染颜色
    $.each(config.data.datasets, function (i, dataset) {
      dataset.borderColor = randomColor(0.4);
      dataset.backgroundColor = randomColor(0.5);
      dataset.pointBorderColor = randomColor(0.7);
      dataset.pointBackgroundColor = randomColor(0.5);
      dataset.pointBorderWidth =3;
    });
    return config;
  }

 //动态获取当月天数
  var xLine=new Array()
  function getXline(){
    var currdate = new Date();
    var curMonthDays = new Date(currdate.getFullYear(), (currdate.getMonth()+1), 0).getDate();
    for (var i =1; i <=curMonthDays; i++) {
      xLine[i-1]=(i);
    }
    return xLine;
  }


  function loadOrderCapactityChar() {
    return EL.get('api/cm_fac/cm201/orderCompletionChar?processType=A').then(function (data) {
      var config = _config(data)
      var _canvasCtx = $('.cm201  .myChart')[0].getContext('2d');
      var _lineChart = new Chart(_canvasCtx, config);
    });
  }

  //加载下拉选择项
  var processTypeSelect = Handlebars.compile($('#cm201processTypeSelect').html());
  function init() {
    return $.when(
      EL.get('api/common/select/processTypeFacItems?facid=1'),
      EL.get('api/cm_fac/cm201/orderStatus?processType=A')
    ).then(function (processTypeItemsData, orderStatusData) {
      EL.log('--->', processTypeItemsData, orderStatusData);
      $('.cm201 .processType').append(processTypeSelect(processTypeItemsData[0]));
      $(".cm201 .processTypeSelect").change(function () {
        var seleText = $(".cm201 .processTypeSelect").find("option:selected").text();
        title = seleText + " 产能利用率";
        loadOrderCapactityChar();
      });
      var orderStatusObj=orderStatusData[0];
      var num1 =Number(orderStatusObj.num3 ? orderStatusObj.num3 : 0) + Number(orderStatusObj.num4 ? orderStatusObj.num4 : 0)
          + Number(orderStatusObj.num5 ? orderStatusObj.num5 : 0);
      EL.log('88------->', num1);
      $('.cm201 .panel .panel-body .form-group .num1').html(num1);
      $('.cm201 .panel .panel-body .form-group .num2').html(orderStatusObj.num3 ? orderStatusObj.num3 : 0);
      $('.cm201 .panel .panel-body .form-group .num3').html(orderStatusObj.num4 ? orderStatusObj.num4 : 0);
      $('.cm201 .panel .panel-body .form-group .num4').html(orderStatusObj.num5 ? orderStatusObj.num5 : 0);
      loadOrderCapactityChar();
    });
  }

  return init;
});
