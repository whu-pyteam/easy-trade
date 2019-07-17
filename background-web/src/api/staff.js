import request from '@/utils/request'

export function queryStaffList(data) {
  return request({
    url: '/staff',
    method: 'post',
    data
  })
}

export function addStaff(data) {
  return request({
    url: '/admin/staff',
    method: 'POST',
    data
  })
}

export function getRoleList() {
  return request({
    url: '/admin/role',
    method: 'get'
  })
}

export function getSingleStaff(username) {
  return request({
    url: '/staff/' + username,
    method: 'get'
  })
}

export function updateStaff(data) {
  return request({
    url: '/staff/role',
    method: 'post',
    data: data
  })
}

export function getStaffRoles(id) {
  return request({
    url: '/staff/role/' + id,
    method: 'get'
  })
}
