
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import ReservationReservationManager from "./components/listers/ReservationReservationCards"
import ReservationReservationDetail from "./components/listers/ReservationReservationDetail"

import ParkingParkingManager from "./components/listers/ParkingParkingCards"
import ParkingParkingDetail from "./components/listers/ParkingParkingDetail"

import CouponCouponManager from "./components/listers/CouponCouponCards"
import CouponCouponDetail from "./components/listers/CouponCouponDetail"



export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/reservations/reservations',
                name: 'ReservationReservationManager',
                component: ReservationReservationManager
            },
            {
                path: '/reservations/reservations/:id',
                name: 'ReservationReservationDetail',
                component: ReservationReservationDetail
            },

            {
                path: '/parkings/parkings',
                name: 'ParkingParkingManager',
                component: ParkingParkingManager
            },
            {
                path: '/parkings/parkings/:id',
                name: 'ParkingParkingDetail',
                component: ParkingParkingDetail
            },

            {
                path: '/coupons/coupons',
                name: 'CouponCouponManager',
                component: CouponCouponManager
            },
            {
                path: '/coupons/coupons/:id',
                name: 'CouponCouponDetail',
                component: CouponCouponDetail
            },




    ]
})
