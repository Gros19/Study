<template>
  <div>
    <input type="text" v-model="userInfo.name">
    <input type="text" v-model.number="userInfo.age">
    <input type="text" v-model="userInfo.job">
    <button type="button" @click="saveUserInfo">저장</button>
    <div>{{ userInfo.name }}</div>
    <div>{{ userInfo.age }}</div>
    <div>{{ userInfo.job }}</div>
    <div>{{ userInfo }}</div>
  </div>
</template>
<script>
export default {
  name: 'SearchCom',
  components: {},
  data() {
    return {

      userInfo: {
        name: "",
        age: 0,
        job: ""
      }
    };
  },
  setup() {
  },
  created() {
  },
  mounted() {
  },
  unmounted() {
  },
  methods: {
    saveUserInfo() {
      if (this.userInfo.name == '') {
        return this.$swal("사용자 이름을 입력하세요.");
      }
      if (this.userInfo.age == '') {
        return alert("나이를 입력하세요.");
      }
      /*const params = {
        name: this.name,
        age: this.age,
        job: this.job
      }*/
      const r = this.saveData(this.userInfo);
      if (r == 'S') {
        alert('사용자 정보가 생성됨');
      }
    },
    saveData(userInfo) {
      console.log(userInfo);
      const r = 'S';
      return r;
    }
  }
}
</script>

