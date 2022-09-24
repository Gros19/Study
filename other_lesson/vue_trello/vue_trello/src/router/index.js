import {createRouter, createWebHistory} from "vue-router";

import NotFound from "@/components/NotFound";
import BoardComponent from "@/components/Board";
import DataBind from "@/components/DataBind";
import ClassBind from "@/components/ClassBind";
import ListCom from "@/components/ListCom";
import ComputedCom from "@/components/ComputedCom";
import WatchCom from "@/components/WatchCom";
import DisplayCom from "@/components/DisplayCom";
import SearchCom from "@/components/SearchCom";
const RenderCom = () => import(/*" webpackChunkName: "lazyrender" */"@/components/RenderCom")
const HelloWorld = () => import(/* webpackChunkName: "hello" */"@/components/HelloWorld") ;
const ByeWorld = () => import(/* webpackChunkName: "bye" */"@/components/ByeWorld");
const DataBindingHtml = () => import(/* webpackChunkName: "datahtml" */ "@/components/DataBindingHtml");
const routes = [
    {
        path: "/html",
        component: DataBindingHtml
    },
    {
        path: "/search",
        component: SearchCom
    },
    {
        path: "/display",
        component: DisplayCom
    },
    {
        path: "/watch",
        component: WatchCom
    },
    {
        path: "/computed",
        component : ComputedCom
    },
    {
        path:'/event',
        component: () => import('../components/EventCom')
    },
    {
        path:'/render',
        component: RenderCom
        // component: () => import(/* webpackChunkName: "about" */ '../components/RenderCom')
    },
    {
        path: '/list',
        component: ListCom
    },
    {path:'/class',
    component: ClassBind
    },
    {
        path: '/data',
        component: DataBind
    },
    {
        path: '/',
        component: HelloWorld
    },
    {
        path: '/bye',
        component: ByeWorld
    },
    {
        path: '/b/:bid',
        component: BoardComponent
    },
    {
        path: "/:catchAll(.*)",
        component: NotFound
    }];
const router = createRouter(
    {
        history: createWebHistory(),
        routes
    }
);

export  default router