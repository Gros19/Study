<template>
  <div class="hello">
    <select v-model="city" @change="log">
        <option v-bind:key="i" v-for="(i) in division" @change="sel">
          {{i}}
        </option>
    </select>
    <input type="date"/>
    <input type="date"/>
    <button type="button" @click="pushData">조회</button>
  </div>
</template>

<script>
import axios from 'axios'
import store from "@/store/store";
export default {
  name: 'HelloWorld',
  data(){
    return{
      city:"",
      division:["서울특별시","부산광역시","대구광역시","인천광역시","광주광역시","대전광역시","울산광역시","세종특별자치시","경기도","강원도",],
      wrkplaceRegion:""
      /*
      강원도	16,875.03	1,540,445	춘천시	7	11	빈칸
충청북도	7,407.29	1,598,868	청주시	3	8	(4)
충청남도	8,226.14	2,125,372	예산군, 홍성군	8	7	(2)
전라북도	8,069.05	1,832,227	전주시	6	8	(2)
전라남도	12,318.79	1,875,862	무안군	5	17	빈칸
경상북도	19,031.42	2,671,587	안동시, 예천군[8]
포항시[9]	10	13	(2)
경상남도	10,539.56	3,371,016	창원시[10]
진주시[11]	8	10	(5)
제주특별자치도
       */
    }
  },
  props: {
    msg: String
  },
  methods:{
    log(){
      console.log(this.city);
      this.wrkplaceRegion = this.city;
    },
    pushData:function () {
      axios.post("http://localhost:8083/task/v1/workcation/getWorkPlaceList",{"wrkplaceRegion":this.wrkplaceRegion}).then(function (response) {
        console.log('maincom::',response.data["resultData"]);
        const jsonarray = response.data["resultData"]

        if(jsonarray.length > 0){
          store.commit('setObj',jsonarray);

          for(var i = 0; i < jsonarray.length; i++){
            console.log('maincom::',jsonarray[i]["wrkplaceNm"]);
          }
        }

        console.log();
      })
          .catch(function (error) {
            console.log('maincom::',error);
          });
    }
  },
  mutation:{

  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
.hello{
  border: 3px solid antiquewhite;
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
