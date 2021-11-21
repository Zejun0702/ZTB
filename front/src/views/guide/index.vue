<template>
<el-container>
  <el-header>
    <el-form inline>
      <el-form-item label="查询天数" style="margin-top:20px">
        <el-select v-model="options.value" placeholder="请选择">
          <el-option v-for="item in options" :key="item.value" :label="item.label" :value="item.value">
          </el-option>
        </el-select>
        <el-switch
          v-model="value"
          active-text="叠加上证指数"
          inactive-text="关闭上证指数">
        </el-switch>
      </el-form-item>

    </el-form>
  </el-header>
  <el-main>
    <el-button type="primary" @click="getmain">查询</el-button>
    <div id="main" style="width:1800px;height:800px;"></div>
  </el-main>
</el-container>
</template>

<script>
import { getLDNum } from '@/api/data-api'
import * as echarts from 'echarts';
require('echarts/theme/shine');//引入主题
export default {
  name: 'Guide',
  // components:
  data() {
    return {
      xArray:[],
      y1Array:[],
      y2Array:[],
      y3Array:[],
      y4Array:[],
      y5Array:[],
      UDnumRes:'',
      chartLine: null,
      options: [{
        value: 5,
        label: '近五天'
      }, {
        value: 10,
        label: '近十天'
      }, {
        value: 20,
        label: '近二十天'
      },
        {
          value: 30,
          label: '近三十天'
        },
        {
          value: 50,
          label: '近五十天'
        },
        {
          value: 60,
          label: '近六十天'
        },
        {
          value: 120,
          label: '近一百二十天'
        },
        {
          value: 250,
          label: '近二百五十天'
        },


        ],
      searchDays: 5
    }
  },
  mounted() {
  },
  methods: {

    //初始化数据
    getData(){
      let param = {
        searchOption:this.options.value
      }

      getLDNum(param).then(res=>{
        this.UDnumRes = res.zhangdiejiashuList;
        this.xArray = [];
        this.y1Array = [];
        this.y2Array = [];
        this.y3Array = [];
        this.y4Array = [];
        this.y5Array = [];
        for(let i = 0; i　< this.UDnumRes.length-1; i++) {
          this.xArray.push(this.UDnumRes[i].rpTime)
          this.y1Array.push(this.UDnumRes[i].riseCount)
          this.y2Array.push(this.UDnumRes[i].fallCount)
          this.y3Array.push(this.UDnumRes[i].limitUpCount)
          this.y4Array.push(this.UDnumRes[i].limitDownCount)
          this.y5Array.push(this.UDnumRes[i].limitUpBrokenCount)
        }

      })



    },

    getmain() {
      //获取echarts对象
      this.getData()
      let myChart = echarts.init(document.getElementById("main"));
      // 指定图表的配置项和数据
      let option = {

        color: [
          // '#004DA1',
          // '#009EA7',
          '#FF0033',
          '#99CC33',
          '#FFCCCC',
          '#009966',
          '#A40081',
          '#0068B6',
          '#00A73B',
          '#FFD800',
          '#F29600',
          '#541B85'
        ],

        //表头
        title: {
          text: "涨跌家数"
        },
        tooltip: {}, //提示
        legend: {
          //图例
          data: ["上涨家数","下跌家数","涨停数","跌停数","涨停破板数"] //对应series每一项中的name
        },
        xAxis: {
          //x轴显示内容
          data: this.xArray
        },
        yAxis: {}, //y轴默认
        series: [
          //数据1  柱形
          {
            name: "上涨家数",
            type: "line", //类型  柱形
            data:  this.y1Array
          },
          //数据2  折线
          {
            name: "下跌家数",
            type: "line", //类型 折线
            smooth: true, //是否是弯曲的折现  弯弯曲曲
            // itemStyle: {
            //   //折线样式
            //   /*设置折线颜色*/
            //   normal: {
            //     color: "#c4cddc"
            //   }
            // },
            data:  this.y2Array //折线的点
          },
          {
            name: "涨停数",
            type: "line", //类型  柱形
            data:  this.y3Array //柱形的点
          },
          {
            name: "跌停数",
            type: "line", //类型  柱形
            data:  this.y4Array //柱形的点
          },
          {
            name: "涨停破板数",
            type: "line", //类型  柱形
            data: this.y5Array
          },
        ]
      }
      myChart.setOption(option);
    },
  }
}
</script>
