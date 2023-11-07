
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import OrderOrderManager from "./components/listers/OrderOrderCards"
import OrderOrderDetail from "./components/listers/OrderOrderDetail"

import DeliveryDeliveryMgmtManager from "./components/listers/DeliveryDeliveryMgmtCards"
import DeliveryDeliveryMgmtDetail from "./components/listers/DeliveryDeliveryMgmtDetail"

import StockInventoryManager from "./components/listers/StockInventoryCards"
import StockInventoryDetail from "./components/listers/StockInventoryDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/orders/orders',
                name: 'OrderOrderManager',
                component: OrderOrderManager
            },
            {
                path: '/orders/orders/:id',
                name: 'OrderOrderDetail',
                component: OrderOrderDetail
            },

            {
                path: '/deliveries/deliveryMgmts',
                name: 'DeliveryDeliveryMgmtManager',
                component: DeliveryDeliveryMgmtManager
            },
            {
                path: '/deliveries/deliveryMgmts/:id',
                name: 'DeliveryDeliveryMgmtDetail',
                component: DeliveryDeliveryMgmtDetail
            },

            {
                path: '/stocks/inventories',
                name: 'StockInventoryManager',
                component: StockInventoryManager
            },
            {
                path: '/stocks/inventories/:id',
                name: 'StockInventoryDetail',
                component: StockInventoryDetail
            },



    ]
})
