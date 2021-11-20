import request from '@/utils/request'


//获取涨停数据
export function getData(chosenDate) {
  return request({
    url: '/ztb/data/getData',
    method: 'post',
    data: chosenDate,
  })
}

//获取涨跌家数
export function getLDNum(param) {
  return request({
    url: '/ztb/data/getLDNum',
    method: 'post',
    data: param,
  })
}


// export const insertWareHouse = (filter) => {
//   let prefix = adminUrlPrefix
//   return axios.request({
//     url: `${prefix}/wareHouse/insertWareHouse`,
//     method: 'post',
//     data: filter
//   })
// }




export function getInfo(token) {
  return request({
    url: '/vue-element-admin/user/info',
    method: 'get',
    params: { token }

  })
}

export function logout() {
  return request({
    url: '/vue-element-admin/user/logout',
    method: 'post'
  })
}
