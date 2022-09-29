import Vuex from "vuex"
export default new Vuex.Store({
    state(){
        return {
            obj:0
        }
    },
    mutations: {
        setObj(state, data){
            state.obj = data;
            console.log('mu:');
            console.log(data);
        }
    },
    getters:{
        myobj: function (state) {
            return state.obj;
        }
    }


})