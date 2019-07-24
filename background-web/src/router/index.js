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
 * redirect: noredirect           if `redirect:noredirect` will no redirect in the breadcrumb
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
    redirect: '/home',
    children: [{
      path: 'home',
      name: 'home',
      component: () => import('@/views/info/info'),
      meta: {title: '首页', icon: 'home'}
    }]
  },

  {
    path: '/staff',
    component: Layout,
    redirect: "/staff/list",
    meta: {title: "员工管理", icon: 'staff-manager'},
    children: [
      {
        path: 'list',
        name: 'staff-manager',
        component: () => import('@/views/staff/staff-list'),
        meta: {title: "员工列表", icon: 'product-list'},
      },
      {
        path: ':id',
        name: 'staff-add',
        component: () => import('@/views/staff/staff-update'),
        meta: {title: "员工修改", icon: 'audit'},
      }
    ]
  },
  {
    path: '/product',
    component: Layout,
    redirect: '/product/list',
    meta: {title: '商品管理', icon: 'product'},
    children: [
      {
        path: 'list',
        name: 'product-list',
        component: () => import('@/views/product/product-list'),
        meta: {title: '商品列表', icon: 'product-list'}
      },
      {
        path: ':id',
        name: 'product-edit',
        component: () => import('@/views/product/product-update'),
        meta: {title: "商品审核", icon: 'audit'},
      }]
  },
  {
    path: '/reward',
    component: Layout,
    redirect: '/reward/list',
    meta: {title: '悬赏管理', icon: 'reward'},
    children: [
      {
        path: 'list',
        name: 'reward-list',
        component: () => import('@/views/reward/reward-list'),
        meta: {title: '悬赏管理', icon: 'product-list'}
      },
      {
        path: ':id',
        name: 'reward-update',
        component: () => import('@/views/reward/reward-update'),
        meta: {title: '悬赏审核', icon: 'audit'}
      }]
  },
  {
    path: '/auction',
    component: Layout,
    redirect: '/auction/list',
    meta: {title: '拍卖管理', icon: 'auction'},
    children: [
      {
        path: 'list',
        name: 'auction-list',
        component: () => import('@/views/auction/auction-list'),
        meta: {title: '拍卖管理', icon: 'product-list'}
      },
      {
        path: ':id',
        name: 'auction-update',
        component: () => import('@/views/auction/auction-update'),
        meta: {title: '拍卖审核', icon: 'audit'}
      }]
  },
  {
    path: '/feedback',
    component: Layout,
    redirect: '/feedback/list',
    meta: {title: '反馈管理', icon: 'feedback'},
    children: [
      {
        path: 'list',
        name: 'feedback-list',
        component: () => import('@/views/feedback/feedback-list'),
        meta: {title: '反馈管理', icon: 'product-list'}
      },
      {
        path: ':id',
        name: 'feedback-update',
        component: () => import('@/views/feedback/feedback-update'),
        meta: {title: '反馈批阅', icon: 'audit'}
      }]
  },
  {
    path: '/log',
    component: Layout,
    redirect: '/log/list',
    meta: {title: '日志管理', icon: 'log'},
    children: [
      {
        path: 'list',
        name: 'log-list',
        component: () => import('@/views/log/log-manager'),
        meta: {title: '日志管理', icon: 'log'}
      }]
  },
  {path: '*', redirect: '/404', hidden: true}
]

export default new Router({
  // mode: 'history', //后端支持可开
  scrollBehavior: () => ({y: 0}),
  routes: constantRouterMap
})

