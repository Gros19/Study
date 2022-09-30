<template>
  <div class="hello">
   <p> vue store:: {{isSampleStore}}</p>
   <p> vue store map:: {{getWorkObj}}</p>

    <select v-model="wrkplaceRegion">
      <option v-bind:key="i" v-for="(i) in division">
        {{i}}
      </option>
    </select>
    <div>{{wrkplaceRegion}}</div>
    <div>{{startDt}}</div>
    <div>{{endDt}}</div>

    <input v-model="startDt" type="date"/>
    <input v-model="endDt" type="date"/>

    <p @click="requestData(this.responseData)">여기를 클릭하면</p>
    <div class="card" v-for="(obj, index) in responseData" :key="index">
      <br/>
      <br/>
      <div class="img_case_v">
        <img class="img_v" v-bind:src="obj['wrkplacePath']"/>
      </div>

      <div class="card_info_v" v-on:click="log(obj['wrkplaceNm'],setStore(obj))">
        <div>{{obj["wrkplaceId"]}}</div>
        <div class="wp_name_v">{{obj["wrkplaceNm"]}}</div>
        <div class="description_v">{{obj["wrkplaceDesc"]}}</div>
        <div class="asset_v">{{obj["wrkplaceMoney"]}}</div>
        <div>{{obj["wrkplaceMaxCnt"]}}</div>
      </div>
    </div>

  </div>

</template>

<script>
import axios from "axios";
import {mapGetters} from 'vuex';
// import {mapGetters, mapMutations, mapState} from 'vuex';
export default {
  name: 'HelloWorld',
  data() {
    return {
      division: ["서울특별시", "부산광역시", "대구광역시", "인천광역시", "광주광역시", "대전광역시", "울산광역시", "세종특별자치시", "경기도", "강원도",]
      ,wrkplaceRegion: ""
      ,responseData: []
      ,startDt: ""
      ,endDt: ""
    }
  },

  methods:{

    // ...mapMutations(["setWorkObj"]),
    // ...mapState(["workObj"]),
    log(){
      console.log("log:: ", this.workObj)
    },
    setStore(obj){
      this.setWorkObj(obj)
    },
    requestData(obj){
      console.log("어디로? ",this.wrkplaceRegion)
      axios.post("http://localhost:8083/task/v1/workcation/getWorkPlaceList",{"wrkplaceRegion":this.wrkplaceRegion})
          .then(function (response) {
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
    }
  },
  computed:{
    isSampleStore(){
      return this.$store.getters.getWorkObj
    },
    isGetterMap(){
      return this.getWorkObj
    },
    ...mapGetters(["getWorkObj"])
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
.wp_name_v {
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
