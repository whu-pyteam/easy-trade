import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router)

/* Layout */
import Layout from '../views/layout/Layout'

/**
 * hidden: true                   if `hidden:true` will not show in the sidebar(default is false)
 * alwaysShow: true               if set true, will always show the root menu, whatever its child routes length
 *                                if not set alwaysShow, only more than one route under the children
 *                                it will becomes nested mode, otherwise not show the root menu
 * redirect: noredirect           if `redirect:noredirect` will no redirct in the breadcrumb
 * name:'router-name'             the name is used by <keep-alive> (must set!!!)
 * meta : {
    title: 'title'               the name show in submenu and breadcrumb (recommend set)
    icon: 'svg-name'             the icon show in the sidebar,
  }
 **/
export const constantRouterMap = [
  {path: '/login', component: () => import('@/views/login/index'), hidden: true},
  {path: '/404', component: () => import('@/views/404'), hidden: true},
  {
    path: '',
    component: Layout,
    redirect: '/info',
    children: [{
      path: 'home',
      name: 'home',
      component: () => import('@/views/home/index'),
      meta: {title: '首页', icon: 'home'}
    }]
  },
  {
    path: '/info',
    component: Layout,
    redirect: '/info/detail',
    children: [{
      path: 'detail',
      name: 'info',
      component: () => import('@/views/info/Info'),
      meta: { title: "个人中心", icon: 'user'}
    }]
  },
  {
    path: '/staff',
    component: Layout,
    redirect: "/staff/list",
    meta: { title: "员工管理", icon: 'staff-manager'},
    children: [{
      path: 'list',
      name: 'staff-manager',
      component: () => import('@/views/staff/staff-list'),
      meta: { title: "员工列表", icon: 'd'},
    },
    {
      path: 'add',
      name: 'staff-add',
      component: () => import('@/views/staff/staff-update'),
      meta: { title: "员工修改", icon: 'd'},
    }
    ]
  },
  {path: '*', redirect: '/404', hidden: true}
]

export default new Router({
  // mode: 'history', //后端支持可开
  scrollBehavior: () => ({y: 0}),
  routes: constantRouterMap
})

