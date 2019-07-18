import request from '@/utils/request'

export function getProductList(data) {
  return request({
    url: '/product',
    method: 'get',
    params: data
  })
}

export function getProductDetail(id) {
  return request({
    url: '/product/' + id,
    method: 'get'
  })
}

export function updateProduct(aac101, aac104) {
  return request({
    url: '/product/' + aac101,
    method: 'put',
    data: {
      id: aac101,
      status: aac104
    }
  })
}
