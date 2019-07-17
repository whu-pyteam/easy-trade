<template>
  <div class="app-container" style="text-align: center; justify-content: center;">

    <el-card class="page-card" shadow="hover">
      <el-form :inline="true" :model="condition" class="demo-form-inline">
        <el-form-item label="操作人名称">
          <el-input v-model="condition.aaf202" clearable></el-input>
        </el-form-item>
        <el-form-item label="开始时间">
          <el-date-picker
            v-model="condition.dateBegin"
            type="datetime"
            placeholder="选择日期时间">
          </el-date-picker>
        </el-form-item>
        <el-form-item label="结束时间">
          <el-date-picker
            v-model="condition.dateEnd"
            type="datetime"
            placeholder="选择日期时间">
          </el-date-picker>
        </el-form-item>
        <el-form-item>
          <el-button type="primary" @click="onSubmit">查询</el-button>
        </el-form-item>
      </el-form>
    </el-card>

    <el-card class="page-card" shadow="hover">

      <el-table
        align="center"
        :data="tableData"
        style="width: 100%">
        <el-table-column
          label="序号"
          width="150">
          <template slot-scope="scope">
            {{scope.$index}}
          </template>
        </el-table-column>
        <el-table-column
          prop="aaf202"
          label="操作员名称"
          width="300">
        </el-table-column>
        <el-table-column
          label="上传时间"
          width="400">
          <template slot-scope="scope">
            {{scope.row.aaf303}}
          </template>
        </el-table-column>
        <el-table-column label="操作">
          <template slot-scope="scope">
            <el-button
              icon="el-icon-edit-outline"
              @click="handleDetail(scope.$index, scope.row)">查看
            </el-button>
          </template>
        </el-table-column>
      </el-table>
    </el-card>

    <el-card class="page-card" shadow="hover">
      <el-pagination
        @current-change="handleCurrentChange"
        background
        layout="total, prev, pager, next"
        :page-size="pageInfo.pageSize"
        :total="pageInfo.total"
        :current-page="pageInfo.pageNum">
      </el-pagination>
    </el-card>


    <el-dialog
      title="提示"
      :visible.sync="dialogVisible"
      width="30%">

      <el-form :model="condition">
        <el-form-item label="操作人名称" label-width="120px">
          <el-input v-model="rowData.aaf202" disabled=""></el-input>
        </el-form-item>
        <el-form-item label="操作日期" label-width="120px">
          <span>{{formatDate(rowData.aaf303)}}</span>
          {{rowData.aaf303}}
        </el-form-item>
        <el-form-item label="操作详情" label-width="120px">
          <sapn v-for="item in logDetail" :key="item">{{item}}</sapn>
        </el-form-item>
      </el-form>
    </el-dialog>

  </div>
</template>

<script>
  import {getLogDetail, getLogList} from "@/api/log";

  export default {
    name: 'feedback-list',
    data() {
      return {
        condition: {
          aaf202: null,
          dateBegin: null,
          dateEnd: null
        },
        tableData: [],
        pageInfo: {
          total: 0,
          pageNum: 1,
          pageSize: 10
        },
        dialogVisible: false,
        logDetail: {},
        rowData: {}
      }
    },
    created() {
      this.fetchLogList()
    },
    methods: {
      fetchLogList() {
        let params = {
          ...this.condition,
          pageNum: this.pageInfo.pageNum,
          pageSize: this.pageInfo.pageSize
        }
        console.log(params)
        getLogList(params).then(res => {
          console.log(res)
          this.pageInfo.total = res.data.total
          this.tableData = res.data.list
        })
      },
      onSubmit() {
        this.fetchLogList()
      },
      handleDetail(index, rowData) {
        getLogDetail(rowData.aaf201).then(res => {
          console.log(JSON.parse(res.data.aaf302))
          this.logDetail = JSON.parse(res.data.aaf302)
          console.log(this.logDetail)
          this.rowData = rowData
        })
        this.dialogVisible = true
      },
      handleCurrentChange(val) {
        this.pageInfo.pageNum = val
        this.fetchLogList()
      }
    }
  }
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
  .page-card {
    margin-bottom: 50px;
    width: 1200px;
  }
</style>
