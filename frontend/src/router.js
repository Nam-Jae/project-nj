
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import CallCallManager from "./components/listers/CallCallCards"
import CallCallDetail from "./components/listers/CallCallDetail"

import DispatchDispatchManager from "./components/listers/DispatchDispatchCards"
import DispatchDispatchDetail from "./components/listers/DispatchDispatchDetail"



export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/calls/calls',
                name: 'CallCallManager',
                component: CallCallManager
            },
            {
                path: '/calls/calls/:id',
                name: 'CallCallDetail',
                component: CallCallDetail
            },

            {
                path: '/dispatches/dispatches',
                name: 'DispatchDispatchManager',
                component: DispatchDispatchManager
            },
            {
                path: '/dispatches/dispatches/:id',
                name: 'DispatchDispatchDetail',
                component: DispatchDispatchDetail
            },




    ]
})
