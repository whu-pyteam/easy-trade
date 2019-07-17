import request from '@/utils/request'

export function getLogList(data) {
  return request({
    url: '/log',
    method: 'post',
    data
  })
}

export function getLogDetail(id) {
  return request({
    url: '/log/' + id,
    method: 'get'
  })
}
