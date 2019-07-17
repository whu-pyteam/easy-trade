<template>
  <div class="app-container" style="text-align: center; justify-content: center;">

    <el-card class="page-card" shadow="hover">
      <el-form :inline="true" :model="condition" class="demo-form-inline">
        <el-form-item label="员工名称">
          <el-input v-model="condition.aaf202" clearable></el-input>
        </el-form-item>
        <el-form-item label="员工昵称">
          <el-input v-model="condition.aaf204" clearable></el-input>
        </el-form-item>
        <el-form-item label="员工状态">
          <el-radio-group v-model="condition.aaf207">
            <el-radio label=null>所有</el-radio>
            <el-radio label="0">禁用</el-radio>
            <el-radio label="1">启用</el-radio>
          </el-radio-group>
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
          width="100">
          <template slot-scope="scope">
            {{scope.$index}}
          </template>
        </el-table-column>
        <el-table-column
          prop="aaf202"
          label="员工名称"
          width="200">
        </el-table-column>
        <el-table-column
          prop="aaf204"
          label="员工昵称"
          width="200">
        </el-table-column>
        <el-table-column
          label="员工状态"
          width="250">
          <template slot-scope="scope">
            <el-switch
              v-model="scope.row.aaf207 === 1? true : false"
              active-text="启用"
              inactive-text="禁用"
              disabled>
            </el-switch>
          </template>
        </el-table-column>

        <el-table-column
          prop="aaf205"
          label="员工创建时间"
          width="200">
        </el-table-column>

        <el-table-column label="操作">
          <template slot-scope="scope">
            <el-button
              icon="el-icon-edit-outline"
              @click="handleEdit(scope.$index, scope.row)">编辑
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
  import {queryStaffList} from "@/api/staff";
  import {formatDate} from "@/utils/date";

  export default {
    name: 'staff-list',
    data() {
      return {
        condition: {
          aaf202: '',
          aaf204: '',
          aaf207: '',
          dateBegin: null,
          dateEnd: null
        },
        tableData: [],
        pageInfo: {
          total: 100,
          pageNum: 1,
          pageSize: 10
        }
      }
    },
    created() {
      this.fetchStaffList()
    },
    methods: {
      fetchStaffList() {
        let params = {
          aaf202: this.condition.aaf202,
          aaf204: this.condition.aaf204,
          aaf207: this.condition.aaf207,
          dateBegin: this.condition.dateBegin === null ? null : formatDate(this.condition.dateBegin, "yyyy-MM-dd HH:mm:ss"),
          dateEnd: this.condition.dateEnd === null ? null : formatDate(this.condition.dateEnd, "yyyy-MM-dd HH:mm:ss"),
          pageNum: this.pageInfo.pageNum,
          pageSize: this.pageInfo.pageSize
        }
        console.log(params)
        queryStaffList(params).then(res => {
          if (res.data.list.length === 0) {
            this.$message.warning("没有满足条件的数据!")
          }
          this.pageInfo.total = res.data.total
          this.tableData = res.data.list
        })
      },
      onSubmit() {
        this.fetchStaffList()
      },
      handleCurrentChange(val) {
        this.pageInfo.pageNum = val
        this.fetchStaffList()
      },
      handleEdit(index, rowData) {
        this.$router.push("/staff/" + rowData.aaf201)
      }
    }
  }
</script>

<style lang="scss" scoped>
  .page-card {
    margin-bottom: 50px;;
    width: 1200px;
  }
</style>
