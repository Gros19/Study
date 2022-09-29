<template>
  <div class="hello" v-on:click="why" > 여기를 누르면

    <div class="card" v-for="(obj, index) in workdata" :key="index">
      <div class="img_case_v">

        <img class="img_v" v-bind:src="obj['wrkplacePath']">

      </div>
      <div class="card_info_v" v-on:click="log(obj['wrkplaceNm'])">
        여기 누르면 로그
        <div>
          <div>{{obj["wrkplaceId"]}}</div>
          <div class="wp_name_v">{{obj["wrkplaceNm"]}}</div>
          <div class="description_v">{{obj["wrkplaceDesc"]}}</div>
          <div class="asset_v">{{obj["wrkplaceMoney"]}}</div>
          <div>{{obj["wrkplaceMaxCnt"]}}</div>
          <button>숙소 선택하기</button>
        </div>

      </div>

    </div>
  </div>
</template>

<script>

export default {
  name: 'HelloWorld',
  data() {
    return {
      workdata:[]
    };
  },
  props: {
    msg: String
  },methods:{
    why(){
      this.workdata = this.$store.state.obj;
      console.log('workplacecom::',this.workdata);
    },
    log(pram){
      console.log(pram);
    }
  }

}
</script>
import store from "@/store/store";
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
