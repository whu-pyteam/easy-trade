import request from "@/utils/request"
import da from 'element-ui/src/locale/lang/da'

export function getAuctionList(data) {
  return request({
    url: '/auction',
    method: 'post',
    data: {
      aad202: data.aad202,
      aad209: data.aad209,
      pageNum: data.pageNum,
      pageSize: data.pageSize
    }
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
