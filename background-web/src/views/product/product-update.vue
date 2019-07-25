<template>
  <div class="app-container">
    <el-card style="width: 1400px">
      <el-form label-position="top">
        <el-form-item label="商品名称:" style="width: 500px;">
          <el-card
            shadow="never"
          >
            {{data.aac102}}
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
        <el-form-item label="商品详情:" style="width: 1000px;">
          <el-card
            rows="4"
            type="textarea"
            shadow="never"
          >
            {{data.aac103}}
          </el-card>
        </el-form-item>
        <el-form-item label="上传日期:" style="width: 500px;">
          <el-card
            prefix-icon="el-icon-date"
            :disabled="true"
            shadow="never"
          >
            {{data.aac107.replace('T', ' ').replace('.000+0000', '')}}
          </el-card>
        </el-form-item>
        <el-form-item label="审核结果:">
          <el-card
            prefix-icon="el-icon-date"
            :disabled="true"
            style="width: 250px;"
            shadow="never"
          >
            <el-switch
              active-text="审核通过"
              inactive-text="审核不通过"
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
  import {getProductDetail, updateProduct} from "@/api/product";

  export default {
    name: 'product-update',
    data() {
      return {
        aac101: this.$route.params.id,
        data: {
          aac102: '',
          aac103: '',
          aac104: '',
          aac106: '',
          aac107: ''
        },

        isCheck: false,
        srcs: [
          'data:image/png;base64,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'
        ]
      }
    },
    created() {
      this.fetchProductDetail()
    },
    methods: {
      fetchProductDetail() {
        getProductDetail(this.aac101).then(res => {
          console.log(res.data)
          if (res.data) {
            this.data.aac102 = res.data.aac102
            this.data.aac103 = res.data.aac103
            this.data.aac104 = res.data.aac104
            this.data.aac107 = res.data.aac107
            this.data.aac106 = res.data.aac106
            this.isCheck = res.data.aac104==='1'
            this.srcs = [this.data.aac106]
          } else {
            this.$message.error("找不到数据!")
            window.setTimeout(this.cancelUpdate, 1200)
          }
        }).catch(err => {
          this.$message.error("找不到数据!")
          window.setTimeout(this.cancelUpdate, 1200)
        })
      },
      onSubmit() {
        updateProduct(this.aac101, this.isCheck?'1':'2').then(res => {
          this.$message.info(res.data)
          window.setTimeout(this.cancelUpdate, 1200)
        }).catch(err => console.log(err))
      },
      cancelUpdate() {
        this.$router.go(-1)
      }
    }
  }
</script>

<style rel="stylesheet/scss" lang="scss" scoped>

</style>
