<template>
  <div class="app-container">
    <el-card style="width: 1000px">
      <el-form label-position="left">
        <el-form-item label="员工名称">
          <el-input
            v-model="aaf202"
            :disabled="true">
          </el-input>
        </el-form-item>
        <el-form-item label="员工状态">
          <el-switch
            active-text="启用"
            inactive-text="禁用"
            v-model="aaf207">
          </el-switch>
        </el-form-item>
        <el-form-item label="员工角色">
          <el-transfer
            v-model="selectRoles"
            :data="roles"
            :titles="['待选角色', '已选角色']"></el-transfer>
        </el-form-item>
        <el-form-item>
          <el-button type="primary" @click="onSubmit">保存</el-button>
          <el-button>取消</el-button>
        </el-form-item>
      </el-form>
    </el-card>

  </div>
</template>

<script>
  import {getRoleList, getSingleStaff, getStaffRoles, updateStaff} from "@/api/staff"

  export default {
    name: 'staff-update',
    data() {
      return {
        aaf201: null,
        aaf202: '',
        aaf207: false,
        roles: [],
        selectRoles: []
      }
    },
    created() {
      this.fetchRoles()
      this.fetchStaffByAaf202(this.$route.params.username)

    },
    methods: {
      onSubmit() {
        let params = {
          aaf201: this.aaf201,
          aaf601List: this.selectRoles,
          aaf207: this.aaf207 ? 1 : 0
        }
        updateStaff(params).then(() => {
          this.$message.success("操作成功!")

          window.setTimeout(this.goback, 2000)
        })
      },
      fetchStaffByAaf202(username) {
        getSingleStaff(username).then(res => {
          if (res.data) {
            this.aaf201 = res.data.aaf201
            this.aaf202 = res.data.aaf202
            this.aaf207 = res.data.aaf207 === 1
          } else {
            this.$message.error("找不到数据!")
            window.setTimeout(this.goback, 2000)
          }
          getStaffRoles(this.aaf201).then(res => {
            console.log(res.data)
            this.selectRoles = res.data.map(function (ele) {
              return ele.aaf601
            })
            console.log("seleceted: " + this.selectRoles)
          })
        })

      },
      fetchRoles() {
        getRoleList().then(res => {
          this.roles = res.data.map(function (ele) {
            return {
              key: ele.aaf601,
              label: ele.aaf602,
              disabled: ele.aaf603 === 0
            }
          })
        })
      },
      goback() {
        this.$router.go(-1)
      }
    }
  }
</script>

<style rel="stylesheet/scss" lang="scss" scoped>

</style>
