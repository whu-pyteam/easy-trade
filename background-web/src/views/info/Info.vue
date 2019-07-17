<template>
  <div class="app-container">
    <el-form ref="form" :model="form" label-width="80px" style="width: 500px;">
      <el-form-item label="我的名称">
        <el-input v-model="form.username" disabled></el-input>
      </el-form-item>
      <el-form-item label="我的昵称">
        <el-input v-model="form.nickname"></el-input>
      </el-form-item>
      <el-form-item label="我的头像" style="vertical-align: center;">
        <el-avatar :size="50" src="#">
          <img :src="form.avatarUrl" alt="图像读取失败"/>
        </el-avatar>
        <el-button type="text" @click="dialogVisible = true">点击更换头像</el-button>
        <el-dialog
          :visible.sync="dialogVisible"
          title="选择头像"
          width="30%"
          align="center"
          center>
          <el-upload
            action="#"
            :limit ="1"
            ref="upload"
            :show-file-list="true"
            :before-upload="beforeUpload"
            :on-success="handleUploadSuccess"
            :on-error="handleUploadErr"
            drag>
            <i class="el-icon-upload"></i>
            <div class="el-upload__text">将图片拖到此处，或<em>点击上传</em></div>
            <div class="el-upload__tip" slot="tip">只能上传jpg/png文件，且不超过2Mb</div>
          </el-upload>
          <span slot="footer" class="dialog-footer">
            <el-button @click="dialogVisible = false">取 消</el-button>
            <el-button type="primary" @click="submitUpload">保 存</el-button>
          </span>
        </el-dialog>
      </el-form-item>
      <el-form-item>
        <el-button type="primary" @click="onSubmit">保 存</el-button>
        <el-button @click="fetchInfo">重 置</el-button>
      </el-form-item>
    </el-form>
  </div>
</template>

<script>
  import {getInfo, updateInfo, uploadImg} from "@/api/login"
  export default {
    name: 'Info',
    data() {
      return {
        form: {
          aaf201: '',
          username: '',
          nickname: '',
          avatarUrl: '#',
          role: '',
          status: true
        },
        dialogVisible: false,
        img: new FormData()
      }
    },
    created() {
      this.fetchInfo()
    },
    methods: {
      fetchInfo() {
        getInfo().then(res => {
          // console.log(res.data)
          this.form.username = res.data.username
          this.form.nickname = res.data.nickname
          this.form.avatarUrl = res.data.avatarUrl
        })
      },
      onSubmit() {
        updateInfo(this.form).then((res) =>
        {
          this.$message.success(res.message)
          this.fetchInfo()
          this.$store.dispatch('GetInfo').then()
        }).catch(() => this.$message.error('修改失败!'))

      },
      submitUpload() {
        uploadImg(this.img).then(response => {
          this.form.avatarUrl = response.data.avatarUrl
          this.$message.success("头像上传成功!")
          this.dialogVisible = false
        }).catch(() => this.$message.error('头像图片上传失败'))
      },
      beforeUpload(file) {
        const isLt2M = file.size / 1024 / 1024 < 2;
        if (!isLt2M) {
          this.$message.error('上传头像图片大小不能超过 2MB!');

        } else {
          this.img.append('fileName', file.name)
          this.img.append('file', file)
          console.log(file)
          console.log(this.img)
        }
        return false;
      }
    }
  }
</script>

<style lang="scss" scoped>
  .app-container {
    margin-top: 40px;
    margin-left: 120px;
    margin-right: 120px;
  }

  .el-upload {
    border: 1px dashed #d9d9d9;
    border-radius: 6px;
    cursor: pointer;
    position: relative;
    overflow: hidden;
  }

  .el-upload:hover {
    border-color: #409EFF;
  }

  .avatar-uploader-icon {
    font-size: 28px;
    color: #8c939d;
    width: 178px;
    height: 178px;
    line-height: 178px;
    text-align: center;
  }

  .avatar {
    width: 178px;
    height: 178px;
    display: block;
  }
</style>
