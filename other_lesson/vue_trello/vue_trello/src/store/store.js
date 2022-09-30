import Vuex from "vuex"
export default new Vuex.Store({
    state(){
        return {
            workObj:{"sample":"a"},
            accomObj:{"sample":"b"},
            roomObj:{"sample":"c"},
            activityObj:{"sample":"d"}
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
        }

    },
    getters:{
        getWorkObj: state => state.workObj,
        getAccomObj: state => state.accomObj,
        getRoomObj: state => state.roomObj,
        getActivityObj: state => state.activityObj
    }


})