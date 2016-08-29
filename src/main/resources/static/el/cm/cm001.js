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
    return EL.get('api/cm_ou/cm001/orderCompletionChar?processType=A').then(function (data) {
      var config = _config(data)
      var _canvasCtx = $('.cm001  .myChart')[0].getContext('2d');
      var _lineChart = new Chart(_canvasCtx, config);
    });
  }

  //加载下拉选择项
  var processTypeSelect = Handlebars.compile($('#cm001processTypeSelect').html());
  function init() {
    return $.when(
      EL.get('api/common/select/processTypeOuItems?ouid=1'),
      EL.get('api/cm_ou/cm001/orderStatus?processType=A')
    ).then(function (processTypeItemsData, orderStatusData) {
      EL.log('--->',processTypeItemsData);
      $('.cm001 .processType').append(processTypeSelect(processTypeItemsData[0]));
      $(".cm001 .processTypeSelect").change(function () {
        var seleText = $(".cm001 .processTypeSelect").find("option:selected").text();
        title = seleText + " 产能利用率";
        loadOrderCapactityChar();
      });
      var orderStatusObj=orderStatusData[0];
      $('.cm001 .panel .panel-body .form-group .num1').html(orderStatusObj.num1?orderStatusObj.num1:0);
      $('.cm001 .panel .panel-body .form-group .num2').html(orderStatusObj.num2?orderStatusObj.num2:0);
      $('.cm001 .panel .panel-body .form-group .num3').html(orderStatusObj.num3?orderStatusObj.num3:0);
      $('.cm001 .panel .panel-body .form-group .num4').html(orderStatusObj.num4?orderStatusObj.num4:0);
      loadOrderCapactityChar();
    });
  }

  return init;
});
