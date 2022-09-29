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
const RenderCom = () => import(/* webpackChunkName: "lazyrender" */"@/components/RenderCom");
const ChoiceTPCOM = () => import(/* webpackChunkName: "hello" */"@/components/ChoiceTPCom") ;
const ByeWorld = () => import(/* webpackChunkName: "bye" */"@/components/ByeWorld");
const DataBindingHtml = () => import(/* webpackChunkName: "databind" */ "@/components/DataBindingHtml");
const MainCom = () => import(/* webpackChunkName: "main" */"@/components/MainCom");
const WorkPlaceCom = () => import(/* webpackChunkName: "workplace" */"@/components/WorkPlaceCom");
const AccomCom = () => import(/* webpackChunkName: "accom" */"@/components/AccomCom");
const RoomCom = () => import(/* webpackChunkName: "accom" */"@/components/RoomCom");
const ActivityCom = () => import(/* webpackChunkName: "accom" */"@/components/ActivityCom");
const routes = [

    {
        path: "/activity",
        component: ActivityCom
    },
    {
        path: "/room",
        component: RoomCom
    },
    {
        path: "/accom",
        component: AccomCom
    },
    {
        path: "/workplace",
        component: WorkPlaceCom
    },
    {
        path: "/main",
        component: MainCom
    },
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
        component: ChoiceTPCOM
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