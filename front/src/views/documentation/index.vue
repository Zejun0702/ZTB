<template>
  <el-container>
    <div class="block">
      <span class="demonstration">查询时间</span>
      <el-date-picker v-model="requestParameter.chosenDate" format='yyyy-MM-dd' value-format='yyyy-MM-dd' type="date" placeholder="选择日期"></el-date-picker>
    </div>

    <el-row>
      <el-table :data="tableData" height="1000" style="width: 100%">
        <el-table-column type="index" label="序号"></el-table-column>
        <el-table-column prop="stockcode" label="股票代码"></el-table-column>
        <el-table-column prop="stockname" label="股票名称"></el-table-column>
        <el-table-column prop="firstLimitUp" label="首次涨停时间"></el-table-column>
        <el-table-column prop="lastLimitUp" label="最后涨停时间"></el-table-column>
        <el-table-column prop="changePercent" label="涨跌幅"></el-table-column>
        <el-table-column prop="plateName" label="所属板块"></el-table-column>
        <el-table-column prop="stockReason" label="涨停原因" width="200px"></el-table-column>
      </el-table>
    </el-row>
    <el-row>
      <el-button primary @click="query">查询</el-button>
    </el-row>
  </el-container>

</template>

<script>
// import DropdownMenu from '@/components/Share/DropdownMenu'

import { getData } from '@/api/data-api'

export default {
  name: 'Documentation',
  // components: { DropdownMenu },
  data() {
    return {
      tableData: [],
      requestParameter: {
        chosenDate: '',
        other: 'other'
      }
    }
  },
  methods: {
    query() {
      getData(this.requestParameter).then(res => {
        console.log(this.requestParameter)
        this.tableData = res.jinrizhangtingList
        //
        //   this.$message.success('获取信息成功')
        // }
      })
    }
  }

}
</script>

<style lang="scss" scoped>
.documentation-container {
  margin: 50px;
  display: flex;
  flex-wrap: wrap;
  justify-content: flex-start;

  .document-btn {
    flex-shrink: 0;
    display: block;
    cursor: pointer;
    background: black;
    color: white;
    height: 60px;
    padding: 0 16px;
    margin: 16px;
    line-height: 60px;
    font-size: 20px;
    text-align: center;
  }
}
</style>
