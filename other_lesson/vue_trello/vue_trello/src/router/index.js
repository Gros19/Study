import {createRouter, createWebHistory} from "vue-router";
import HelloWorld from "@/components/HelloWorld";
import ByeWorld from "@/components/ByeWorld";
import NotFound from "@/components/NotFound";
import BoardComponent from "@/components/Board";

const routes = [

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