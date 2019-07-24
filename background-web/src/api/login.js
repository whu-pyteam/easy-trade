import request from '@/utils/request'

export function login(username, password) {
  return request({
    url: '/admin/login',
    method: 'post',
    data: {
      username,
      password
    }
  })
}

export function registerStaff(data) {
  return request({
    url: '/admin/register',
    method: 'post',
    data
  })
}

export function getInfo() {
  return request({
    url: '/admin/info',
    method: 'get',
  })
}

export function logout() {
  return request({
    url: '/admin/logout',
    method: 'post'
  })
}

export function uploadImg(file) {
  return request({
    url: '/admin/uploadImg',
    method: 'post',
    headers: { "Content-Type": "multipart/form-data" },
    data: file
  })
}

export function updateInfo(data) {
  return request({
    url: '/admin/info',
    method: 'put',
    data: {
      username: data.username,
      nickname: data.nickname,
      avatarUrl: data.avatarUrl
    }

  })
}
