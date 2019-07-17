
<template>
  <div>
    <el-card class="login-form-layout">
      <el-form autoComplete="on"
               :model="loginForm"
               ref="loginForm"
               label-position="left">
        <h2 class="login-title">后台管理登录</h2>
        <el-form-item prop="username">
          <el-input name="username"
                    type="text"
                    v-model="loginForm.username"
                    autoComplete="on"
                    placeholder="请输入用户名">
          <span slot="prefix">
            <svg-icon icon-class="user"></svg-icon>
          </span>
          </el-input>
        </el-form-item>
        <el-form-item prop="password">
          <el-input name="password"
                    :type="pwdType"
                    @keyup.enter.native="handleLogin"
                    v-model="loginForm.password"
                    autoComplete="on"
                    placeholder="请输入密码">
          <span slot="prefix">
            <svg-icon icon-class="password"></svg-icon>
          </span>
            <span slot="suffix" @click="showPwd">
            <svg-icon :icon-class="pwdIcon"></svg-icon>
          </span>
          </el-input>
        </el-form-item>
        <el-form-item style="margin-bottom: 20px">
          <el-button style="width: 100%" type="primary" :loading="loginLoading" @click.native.prevent="handleLogin">
            登录
          </el-button>
        </el-form-item>
        <el-form-item>
          <el-button style="width: 100%" type="primary" :loading="registLoading" @click.native.prevent="handleRegister">
            注册
          </el-button>
        </el-form-item>
      </el-form>
    </el-card>
    wxg 商品审核员
    wxg2 悬赏审核员
    wxg3 拍卖审核员
  </div>
</template>

<script>
  import {isvalidUsername} from '@/utils/validate'
  import {regsiterStaff} from "@/api/login"

  export default {
    name: 'login',
    data() {
      const validateUsername = (rule, value, callback) => {
        if (!isvalidUsername(value)) {
          callback(new Error('请输入正确的用户名'))
        } else {
          callback()
        }
      };
      const validatePass = (rule, value, callback) => {
        if (value.length < 3) {
          callback(new Error('密码不能小于3位'))
        } else {
          callback()
        }
      };
      return {
        loginForm: {
          username: 'admin',
          password: '123456',
        },
        loginRules: {
          username: [{required: true, trigger: 'blur', validator: validateUsername}],
          password: [{required: true, trigger: 'blur', validator: validatePass}]
        },
        loginLoading: false,
        registLoading: false,
        pwdType: 'password',
        pwdIcon: 'eye'
      }
    },
    methods: {
      showPwd() {
        if (this.pwdType === 'password') {
          this.pwdType = ''
          this.pwdIcon = 'eye-open'
        } else {
          this.pwdType = 'password'
          this.pwdIcon = "eye"
        }
      },
      handleLogin() {
        this.$refs.loginForm.validate(valid => {
          if (valid) {
            this.loginLoading = true;
            this.$store.dispatch('Login', this.loginForm).then(() => {
              this.loading = false;
              this.$router.push({path: '/'})
            }).catch(() => {
              this.loginLoading = false
            })
          } else {
            console.log('参数验证不合法！');
            return false
          }
        })
      },
      handleRegister() {
        this.registLoading = true
        regsiterStaff(this.loginForm.username, this.loginForm.password).then(() => {
          this.$message.success("注册成功")
          this.registLoading = false
        })
      }
    }
  }
</script>

<style scoped>
  .login-form-layout {
    position: absolute;
    left: 0;
    right: 0;
    width: 360px;
    margin: 140px auto;
  }

  .login-title {
    text-align: center;
    padding: 10px;
  }

</style>
