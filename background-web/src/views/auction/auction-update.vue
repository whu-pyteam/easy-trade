<template>
  <div class="app-container">
    <el-card style="width: 1400px">
      <el-form label-position="top">
        <el-form-item label="拍卖名称:" style="width: 500px;">
          <el-card
            :body-style="{ padding: '0px' }"
            shadow="never"
          >
            {{data.aad202}}
          </el-card>
        </el-form-item>
        <el-form-item label="图片展示:">
          <el-card v-for="(src, index) in  srcs"
                   :key="index"
                   :body-style="{ padding: '0px' }"
                   style="width: 400px;"
                   shadow="never">
            <img :src="src" alt="">
          </el-card>
        </el-form-item>
        <el-form-item label="拍卖详情:" style="width: 1000px;">
          <el-card
            :body-style="{ padding: '0px' }"
            rows="4"
            type="textarea"
            shadow="never"
          >
            {{data.aad204}}
          </el-card>
        </el-form-item>
        <el-form-item label="上传日期:" style="width: 500px;">
          <el-card
            :body-style="{ padding: '0px' }"
            prefix-icon="el-icon-date"
            :disabled="true"
            shadow="never"
          >
            {{data.aad212.replace('T', ' ').replace('.000+0000', '')}}
          </el-card>
        </el-form-item>
        <el-form-item label="审核状态:">
          <el-card
            :body-style="{ padding: '0px' }"
            prefix-icon="el-icon-date"
            :disabled="true"
            style="width: 250px;"
            shadow="never"
          >
            <el-switch
              active-text="拍卖通过"
              inactive-text="拍卖不通过"
              v-model="isCheck">
            </el-switch>
          </el-card>

        </el-form-item>
        <el-form-item>
          <el-button type="primary" @click="onSubmit">保存</el-button>
          <el-button @click="cancelUpdate">取消</el-button>
        </el-form-item>
      </el-form>
    </el-card>

  </div>
</template>

<script>
  import {getAuctionDetail, updateAuction} from "@/api/auction";

  export default {
    name: 'auction-update',
    data() {
      return {
        aad201: this.$route.params.id,
        data: {
          aad202: '',
          aad204: '',
          aad212: '',
          aad203: '',
          aac107: ''
        },
        isCheck: false,
        srcs: []
      }
    },
    created() {
      this.fetchAuctionDetail()
    },
    methods: {
      fetchAuctionDetail() {
        getAuctionDetail(this.aad201).then(res => {
          console.log(res.data)
          this.data.aad202 = res.data.aad202
          this.data.aad204 = res.data.aad204
          this.data.aad212 = res.data.aad212
          this.data.aad203 = res.data.aad203
          this.isCheck = res.data.aad209 === '1'
          this.srcs = [res.data.aad203]
        })
      },
      onSubmit() {
        let params = {
          id: this.aad201,
          status: this.isCheck ? '1' : '2'
        }
        console.log(params)
        updateAuction(this.aad201, this.isCheck ? '1' : '2').then(() => {
          this.$message.success("操作成功")
          this.cancelUpdate()
        })
      },
      cancelUpdate() {
        this.$router.go(-1)
      }
    }
  }
</script>

<style rel="stylesheet/scss" lang="scss" scoped>

</style>
