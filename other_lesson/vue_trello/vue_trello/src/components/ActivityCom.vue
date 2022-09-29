<template>
  <div class="hello" v-on:click="roomPushData(this.responseData)" >
    여기를 누르면
    <div class="card" v-for="(obj, index) in responseData" :key="index">
      
      <div class="img_case_v">

        <img class="img_v" v-bind:src="obj['activityPath']">

      </div>
      <div class="card_info_v" v-on:click="log(obj['activityNm'])">
        여기를 누르면 로그
        <div>
          <div>{{obj["activityId"]}}</div>
          <div>{{obj["activityMoney"]}}</div>
          <div>{{obj["activityType"]}}</div>
          <div class="activityNm_v">{{obj["activityNm"]}}</div>
          <div class="description_v">{{obj["activityDesc"]}}</div>
          <button>숙소 선택하기</button>
        </div>

      </div>

    </div>

  </div>
</template>

<script>

import axios from "axios";

export default {
  name: 'HelloWorld',
  setup(){
    return{
    };
  },
  data() {
    return {
      responseData:[],
      activityRegion: ""
    };
  },
  props: {
    msg: String
  },methods:{
    why(){
      this.c = this.$store.state.obj
      console.log(this.c)
    },
    log(pram){
      console.log(pram);
    },roomPushData(obj) {
      //임시로 강원도를 넣어줌
      this.activityRegion = "강원도";
      axios.post("http://localhost:8083/task/v1/workcation/getActivityList",{"activityRegion":this.activityRegion}).then(function (response) {
        let d = response.data["resultData"];
        console.log('response,', response);
        console.log(d);

        if(obj.length === 0  || d.length !== obj.length){
          obj.splice(0,obj.length);
          for(var a=0; a < d.length; a++){
            console.log("if:: ", d[a]);
            obj.push(d[a]);
          }
        }


      })
          .catch(function (error) {
            console.log(error);
          });
      console.log("rep:: ",this.responseData);
      console.log("obj:: ",obj);
    }
  }


}
</script>
import store from "@/store/store";
<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
.activityNm_v {
  background: rgba(45, 166, 51, 0.53);
}

.description_v {
  background: rgba(166, 77, 45, 0.53);
}

.asset_v {
  background: rgba(86, 211, 224, 0.53);
}

.card_info_v {
  display: inline-block;
  width: 500px;
  height: 300px;
  background: rgba(45, 156, 166, 0.53);
}

.img_case_v {
  display: inline-block;
  width: 300px;
  height: 200px;
  background: rgba(127, 255, 0, 0.44);
}

.img_v {
  width: 300px;
  margin-top: 7%;
}

.card {
  margin-left: 27.5%;
  margin-bottom: 8%;
  width: 900px;
  height: 300px;
  border: 2px solid #a62d8e;

}

.hello {
  border: 5px solid red;
}


h3 {
  margin: 40px 0 0;
}

ul {
  list-style-type: none;
  padding: 0;
}

li {
  display: inline-block;
  margin: 0 10px;
}

a {
  color: #42b983;
}
</style>
