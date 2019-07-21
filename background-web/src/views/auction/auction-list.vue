<template>
  <div class="app-container" style="text-align: center; justify-content: center;">

    <el-card class="page-card" shadow="hover">
      <el-form :inline="true" :model="condition" class="demo-form-inline">
        <el-form-item label="拍卖名称">
          <el-input v-model="condition.aad202" clearable></el-input>
        </el-form-item>
        <el-form-item label="拍卖审核状态" prop="aad209">
          <el-card shadow="never" body-style="padding: 0 10px">
            <el-radio-group v-model="condition.aad209">
              <el-radio label="">所有</el-radio>
              <el-radio label="0">未审核</el-radio>
              <el-radio label="1">已审核</el-radio>
            </el-radio-group>
          </el-card>
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
          prop="aad202"
          label="拍卖名称"
          width="250">
        </el-table-column>
        <el-table-column
          label="上传时间"
          width="250">
          <template slot-scope="scope">
            {{scope.row.aad212}}
          </template>
        </el-table-column>
        <el-table-column
          label="审核状态"
          width="250">
          <template slot-scope="scope">
            <el-switch
              v-model="scope.row.aad209 === '0'"
              active-text="待审核"
              inactive-text="已审核"
              disabled>
            </el-switch>
          </template>
        </el-table-column>
        <el-table-column label="操作">
          <template slot-scope="scope">
            <el-button
              icon="el-icon-edit-outline"
              @click="handleEdit(scope.$index, scope.row)">审核
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

  </div>
</template>

<script>
  import {getAuctionList} from "@/api/auction";

  export default {
    name: 'auction-list',
    data() {
      return {
        condition: {
          aad202: '',
          aad209: ''
        },
        tableData: [],
        pageInfo: {
          total: 0,
          pageNum: 1,
          pageSize: 10
        }
      }
    },
    created() {
      this.fetchAuctionList()
    },
    methods: {
      fetchAuctionList() {
        let params = {
          ...this.condition,
          pageNum: this.pageInfo.pageNum,
          pageSize: this.pageInfo.pageSize
        }
        getAuctionList(params).then(res => {
          this.pageInfo.total = res.data.total
          this.tableData = res.data.list
        })
      },
      onSubmit() {
        this.fetchAuctionList()
      },
      handleEdit(index, rowData) {
        this.$router.push(`/auction/${rowData.aad201}`)
      },
      handleCurrentChange(val) {
        this.pageInfo.pageNum = val
        this.fetchAuctionList()
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
