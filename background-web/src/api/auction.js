import request from "@/utils/request"

export function getAuctionList(data) {
  return request({
    url: '/auction',
    method: 'post',
    data
  })

}

export function getAuctionDetail(id) {
  return request({
    url: '/auction/' +id,
    method: 'get'
  })
}

export function updateAuction(aad201, aad209) {

  return request({
    url: '/auction/' + aad201,
    method: 'put',
    params: {
      aad209
    }
  })
}
