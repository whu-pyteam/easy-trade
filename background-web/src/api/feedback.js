import request from "@/utils/request"

export function getFeedbackList(data) {
  return request({
    url: '/feedback',
    method: 'post',
    data
  })

}

export function getFeedbackDetail(id) {
  return request({
    url: '/feedback/' +id,
    method: 'get'
  })
}

export function updateFeedback(aab501, aab504, aab506) {

  return request({
    url: '/feedback/' + aab501,
    method: 'put',
    params: {
      reply: aab506,
      status: aab504
    }
  })
}
