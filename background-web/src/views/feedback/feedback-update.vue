<template>
  <div class="app-container">
    <el-card style="width: 1400px">
      <el-form label-position="top">
        <el-form-item
          label="反馈标题:"
          style="width: 500px;"
        >
          <el-card shadow="never">
            {{data.aab503}}
          </el-card>
        </el-form-item>
        <el-form-item
          label="反馈详情:"
          style="width: 800px;"
        >
          <el-card
            rows="4"
            type="textarea"
            shadow="never"
          >
            {{data.aab502}}
          </el-card>
        </el-form-item>
        <el-form-item
          label="上传日期:"
          style="width: 500px;"
        >
          <el-card
            prefix-icon="el-icon-date"
            :disabled="true"
            shadow="never"
          >
            {{data.aab505.replace('T', ' ').replace('.000+0000', '')}}
          </el-card>
        </el-form-item>
<!--        <el-form-item label="查看状态:">-->
<!--          <el-card-->
<!--            prefix-icon="el-icon-date"-->
<!--            :disabled="true"-->
<!--            style="width: 250px;"-->
<!--            shadow="never"-->
<!--          >-->
<!--            <el-switch-->
<!--              active-text="反馈已阅"-->
<!--              inactive-text="反馈未阅"-->
<!--              v-model="isCheck"-->
<!--            >-->
<!--            </el-switch>-->
<!--          </el-card>-->

<!--        </el-form-item>-->
        <el-form-item label="反馈回复:">
            <el-input
              style="width: 800px;"
              type="textarea"
              autosize
              placeholder="请输入内容"
              v-model="data.aab506">
            </el-input>
        </el-form-item>
        <el-form-item>
          <el-button
            type="primary"
            @click="onSubmit"
          >保存</el-button>
          <el-button @click="cancelUpdate">取消</el-button>
        </el-form-item>
      </el-form>
    </el-card>

  </div>
</template>

<script>

  import {getFeedbackDetail, updateFeedback} from "@/api/feedback";

export default {
  name: 'feedback-update',
  data() {
    return {
      aad201: this.$route.params.id,
      data: {
        aab503: '',
        aab502: '',
        aab505: '',
        aab504: '',
        aab506: ''
      },
      isCheck: false,
      srcs: []
    }
  },
  created() {
    this.fetchFeedbackDetail()
  },
  methods: {
    fetchFeedbackDetail() {
      getFeedbackDetail( this.aad201 ).then( res => {
        console.log( res.data )
        // this.data.aad202 = res.data.aad202
        // this.data.aad204 = res.data.aad204
        // this.data.aad212 = res.data.aad212
        // this.data.aad203 = res.data.aad203
        this.data = res.data
        this.isCheck = res.data.aad504 === '1'
        this.srcs = [res.data.aad203]
      })
    },
    onSubmit() {
      updateFeedback( this.aad201, this.data.aab502 ===''? '0' : '1', this.data.aab506).then( () => {
        this.$message.success( "操作成功")
        this.cancelUpdate()
      })
    },
    cancelUpdate() {
      this.$router.go( -1 )
    }
  }
}
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
</style>
