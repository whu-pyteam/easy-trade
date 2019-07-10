import request from '@/utils/request'

export function queryStaffList(params) {
  return request({
    url: '/staff',
    method: 'get',
    params: params
  })
}

export function addStaff(data) {
  return request({
    url: '/admin/staff',
    method: 'POST',
    data
  })
}
