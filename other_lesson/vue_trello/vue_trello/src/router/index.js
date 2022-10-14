import {createRouter, createWebHistory} from "vue-router";

import TrelloBoard from "@/components/TrelloBoard";
import TrelloHome from "@/components/TrelloHome";
import TrelloLogin from "@/components/TrelloLogin";
import TrelloNotFound from "@/components/TrelloNotFound";
import TrelloCard from "@/components/TrelloCard";



const routes = [
    {
        path: "/trello",
        component: TrelloHome
    },
    {
        path: "/trello/b/:bid",
        component: TrelloBoard,
        children: [{path: "c/:cid", component: TrelloCard}]
    },
    {
        path: "/trello/Login",
        component: TrelloLogin
    },
    {
        path: "/trello/:catchAll(.*)",
        component: TrelloNotFound
    }];
const router = createRouter(
    {
        history: createWebHistory(),
        routes
    }
);

export default router