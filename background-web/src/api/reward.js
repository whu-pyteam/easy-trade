import request from '@/utils/request'

export function getRewardList(data) {
  return request({
    url: '/reward',
    method: 'get',
    params: data
  })
}

export function getRewardDetail(id) {
  return request({
    url: '/reward/' + id,
    method: 'get'
  })
}

export function updateReward(id, status) {
  return request({
    url: '/reward/' + id,
    method: 'put',
    data: {
      status
    }
  })
}
