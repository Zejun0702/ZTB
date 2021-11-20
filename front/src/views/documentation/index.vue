<template>
  <el-container>
    <el-header>
        <el-form inline>
          <el-form-item label="选择查询日期" style="margin-top:20px" label-width="100px">
            <el-date-picker :picker-options="pickerOptions" v-model="requestParameter.chosenDate" format="yyyy-MM-dd"
                            value-format="yyyy-MM-dd" type="date" placeholder="选择日期" @change="query"></el-date-picker>
          </el-form-item>
          <el-form-item>
            <el-input placeholder="输入搜索内容,支持按代码和板块搜索" @input="query"  clearable style="margin-top:20px"></el-input>
          </el-form-item>
          <el-form-item>
          <el-switch
            v-model="value"
            active-text="显示ST"
            inactive-text="关闭ST">
          </el-switch>
          </el-form-item>
        </el-form>
    </el-header>
    <el-main>
      <el-row>
        <el-table :data="tableData" height="1000" style="width: 100%" v-loading="loading">
          <el-table-column type="index" label="序号"></el-table-column>
          <el-table-column prop="stockcode" label="股票代码"></el-table-column>
          <el-table-column prop="stockname" label="股票名称"></el-table-column>
          <el-table-column prop="price" label="当前价格"></el-table-column>
          <el-table-column prop="firstLimitUp" label="首次涨停时间"></el-table-column>
          <el-table-column prop="lastLimitUp" label="最后涨停时间"></el-table-column>
          <el-table-column prop="changePercent" label="涨跌幅"></el-table-column>
          <el-table-column prop="turnoverRatio" label="换手率"></el-table-column>
          <el-table-column prop="buyLockVolumeRatio" label="封单比"></el-table-column>
          <el-table-column prop="limitUpDays" label="连板天数"></el-table-column>
          <el-table-column prop="mdaysNBoardsDays" label="n天"></el-table-column>
          <el-table-column prop="mdaysNBoardsBoards" label="n板"></el-table-column>
          <el-table-column prop="plateName" label="所属板块1"></el-table-column>
          <el-table-column prop="plateName2" label="所属板块2"></el-table-column>
          <el-table-column prop="stockReason" label="涨停原因" width="200px"></el-table-column>
          <el-table-column prop="totalCapital" label="总市值" width="200px"></el-table-column>
          <el-table-column prop="nonRestrictedCapital" label="流通市值" width="200px"></el-table-column>
        </el-table>
      </el-row>
    </el-main>
  </el-container>
</template>

<script>
// import DropdownMenu from '@/components/Share/DropdownMenu'

import { getData } from '@/api/data-api'
import moment from 'moment'

export default {
  name: 'Documentation',
  data() {
    return {
      value: true,
      loading: true,
      pickerOptions: {
        disabledDate(time) {
          return time.getTime() > Date.now()
        }
      },
      tableData: [],
      requestParameter: {
        chosenDate: moment().format('YYYY-MM-DD'),
        other: 'other'
      }
    }
  },

  mounted() {
    this.query()
  },

  methods: {
    query() {
      console.log(this.requestParameter)
      getData(this.requestParameter).then(res => {
        // console.log(this.requestParameter)
        this.tableData = res.jinrizhangtingList
        this.loading=false
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
