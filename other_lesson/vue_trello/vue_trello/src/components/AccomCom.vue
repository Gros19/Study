<template>
  <div class="hello" v-on:click="accomPushData(this.responseData)" >
    여기를 누르면
    <p>sds</p>
    <p>sds</p>
    <p>sds</p>
    <div>ppp    </div>
    <div class="card" v-for="(obj, index) in responseData" :key="index">
      <div class="img_case_v">

        <img class="img_v" v-bind:src="obj['profilePath']">

      </div>
      <div class="card_info_v" v-on:click="log(obj['accomNm'])">
        여기를 누르면 로그
        <div>
          <div>{{obj["accomId"]}}</div>
          <div class="accomNm_v">{{obj["accomNm"]}}</div>
          <div class="description_v">{{obj["accomDesc"]}}</div>
          <button>숙소 선택하기</button>
        </div>

      </div>

    </div>

  </div>
</template>

<script>

import axios from "axios";
/*
[
    {
        "accomId": 1,
        "accomNm": "세인트존스 호텔 (St.John's Hotel)",
        "accomDesc": "모든 객실 내 무료 Wi-Fi이/가 제공되는 이 숙소에서 즐거운 여행을 시작하세요. 강릉의 동해 이스트사이드 씨에 위치한 본 숙소는 관광 명소 및 흥미로운 레스토랑과 가깝습니다. 떠나기 전 유명한 경포대을/를 방문해 보세요. 별 5개를 받은 본 고급 숙소는 투숙객에게 숙소 내 레스토랑, 스팀룸 및 피트니스 센터을/를 제공합니다.",
        "profilePath": "https://comgbucket.s3.ap-northeast-2.amazonaws.com/%E1%84%89%E1%85%B3%E1%84%8F%E1%85%B3%E1%84%85%E1%85%B5%E1%86%AB%E1%84%89%E1%85%A3%E1%86%BA+2022-09-27+%E1%84%8B%E1%85%A9%E1%84%92%E1%85%AE+2.35.09.png"
    },
    {
        "accomId": 2,
        "accomNm": "스카이베이 호텔 경포 (Skybay Hotel Gyeongpo)",
        "accomDesc": "주차 및 Wi-Fi가 항상 무료로 제공되므로 언제든지 차량을 입출차할 수 있으며 연락을 취하실 수 있습니다. 강릉의 동해 이스트사이드 씨에 위치한 본 숙소는 관광 명소 및 흥미로운 레스토랑과 가깝습니다. 시간을 내어 경포대 및 근처 경포 해수욕장을/를 방문해 보세요. 보다 나은 숙박을 위해 레스토랑, 실내 수영장 및 피트니스 센터 등 숙소 내 특별한 편의시설이 제공됩니다.",
        "profilePath": "https://comgbucket.s3.ap-northeast-2.amazonaws.com/%E1%84%89%E1%85%B3%E1%84%8F%E1%85%B3%E1%84%85%E1%85%B5%E1%86%AB%E1%84%89%E1%85%A3%E1%86%BA+2022-09-27+%E1%84%8B%E1%85%A9%E1%84%92%E1%85%AE+2.35.09.png"
    }
]
 */
export default {
  name: 'HelloWorld',
  setup(){
    return{
    };
  },
  data() {
    return {
      responseData:[],
      c:"ff",
      accomRegion:"강원도"
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
    },accomPushData(obj) {
      axios.post("http://localhost:8083/task/v1/workcation/getAccomList",{"accomRegion":this.accomRegion}).then(function (response) {
        let d = response.data["resultData"];

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
.accomNm_v {
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
