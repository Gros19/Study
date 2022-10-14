import Vuex from "vuex"
import axios from "axios";

export default new Vuex.Store({
    state() {
        return {
            timePlace: {
                startDt: "",
                endDt: "",
                wrkplaceRegion: ""
            },
            workObj: {
                "wrkplaceId": 0,
                "wrkplaceNm": "1",
                "wrkplaceDesc": "1",
                "wrkplaceMoney": "1",
                "wrkplaceMaxCnt": "1",
                "wrkplacePath": "1"
            },
            accomObj: {
                "accomId": 0,
                "accomNm": "2",
                "accomDesc": "2",
                "profilePath": "2"
            },
            roomObj: {
                "accomInfoId": 0,
                "fkAccomId": 3,
                "roomType": "3",
                "roomMoney": 3,
                "roomDesc": "3",
                "roomPath": "3",
                "roomMaxCnt": 3
            },
            activityObj: {
                "activityId": 0,
                "activityNm": "4",
                "activityDesc": "4",
                "activityMoney": 4,
                "activityType": "4",
                "activityPath": "4"
            },
            workList:[

            ],
            accomList:[

            ],
            roomList:[

            ],
            activityList:[

            ],
            paymentList:[

            ]
        }
    },
    mutations: {
        setWorkObj: (state, payload) => {
            state.workObj = payload
        },
        setAccomObj: (state, payload) => {
            state.accomObj = payload
        },
        setRoomObj: (state, payload) => {
            state.roomObj = payload
        },
        setActivityObj: (state, payload) => {
            state.activityObj = payload
        },
        setTP: (state, payload) => {
            state.timePlace = payload
        },
        setWorkList:(state, payload) => state.workList = payload,
        setAccomList:(state, payload) => state.accomList = payload,
        setRoomList:(state, payload) => state.roomList = payload,
        setActivityList:(state, payload) => state.activityList = payload


    },
    getters: {

        getWorkList: state => state.workList,
        getAccomList: state => state.accomList,
        getRoomList: state => state.roomList,
        getActivityList: state => state.activityList,

        getWorkObj: state => state.workObj,
        getAccomObj: state => state.accomObj,
        getRoomObj: state => state.roomObj,
        getActivityObj: state => state.activityObj,

        /*총 금액에 각 항목의 금액들을 더함
        * 단 기본값은 제외( 기본값은 각 Id에 음수가 입력 돼 있음*/
        getTotPrice: state =>
            parseInt(state.roomObj.accomInfoId > 0 ?
                state.roomObj.roomMoney
                : 0) +
            parseInt(state.workObj.wrkplaceId > 0 ?
                state.workObj.wrkplaceMoney
                : 0) +
            parseInt(state.activityObj.activityId > 0 ?
                state.activityObj.activityMoney
                : 0)

    },
    actions:{
        workReq: (context, payload) => {
            axios.post("http://localhost:9000/task/v1/workation/getWorkPlaceList",{"wrkplaceRegion":payload})
                .then(function (response) {
                    let d = response.data["resultData"];
                    console.log('actions_workReq:: ', d);
                    if(d.length > 0)
                        context.commit("setWorkList", d);

                })
                .catch(function (error) {
                    console.log(error);
                });
        },
        // accomReq

        accomReq: (context, payload) => {
            axios.post("http://localhost:9000/task/v1/workation/getAccomList",{"accomRegion":payload})
                .then(function (response) {
                let d = response.data["resultData"];
                console.log('action_accomReq:: ',d);
                if(d.length > 0)
                    context.commit("setAccomList", d)
            })
                .catch(function (error) {
                    console.log(error);
                });
        },
        // roomReq
        roomReq: (context, payload) => {
            axios.post("http://localhost:9000/task/v1/workation/getRoomList",{"fkAccomId":payload})
                .then(function (response) {
                let d = response.data["resultData"];
                console.log("action_roomReq:: ",d);
                if(d.length > 0){
                    context.commit("setRoomList", d)
                }

            })
                .catch(function (error) {
                    console.log(error);
                });
        },
        // activityReq
        activityReq: (context, payload) => {
            axios.post("http://localhost:9000/task/v1/workation/getActivityList",{"activityRegion":payload})
                .then(function (response) {
                    let d = response.data["resultData"];
                    console.log("action_activityReq::", d);
                    if(d.length > 0)
                        context.commit("setActivityList", d)
                })
                .catch(function (error) {
                    console.log(error);
                });
        },
        // payReq
        payReq: (context, payloadObj) => {
            axios.post("http://localhost:9000/task/v1/workation/payment", payloadObj)
                .then(function (response) {
                    let d = response.data["resultData"];
                    console.log("action_payReq:: ",d)
                })
                .catch(function (error) {
                    console.log(error);
                });
        }
    }


})