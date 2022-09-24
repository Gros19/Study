<template>

  <div>
    <div><!---->
      <select v-model="selectedList"> <!--selectedList 변수에 담아서 -->

        <option :value="name.name" v-for="(name,i) in mylist" :key="i"> {{ name.name }}</option> <!--선택하면 value로 name.name-->
        <option :value="name.code" v-for="(name,i) in mylist" :key="i"> {{ name.name }}</option><!--선택하면 value로 name.code가 select 쪽 모델로 들어감-->
      </select>
      <div>{{selectedList}}</div> <!--select쪽 model에 넣었던 값이 출력-->

      <input type="text" v-model="userName" @keyup.enter="searchUserList(1)"/> <!--입력한 값이 userName로 들어가는데 엔터 이벤트로 searchUserList() 함수를 호출-->
      <button type="button" @click="searchUserList(2)">조회</button>
    </div>
  </div>
  <div>
    <table>
      <thead>
        <tr>
          <th>이름</th>
          <th>나이</th>
          <th>직업</th>
        </tr>
      </thead>
      <tbody>
      <tr v-for="(person,i) in userList" :key="i">
        <td>{{person.name}}</td>
        <td>{{person.name}}</td>
        <td>{{person.name}}</td>
      </tr>
      </tbody>
    </table>
  </div>
</template>

<script>
export default {
  name: "DisplyCom",
  components: {},
  data() {
    return {

      mylist: [
        {name: '서울', code: '1'},
        {name: '부산', code: '3'},
        {name: '광주', code: '2'}
      ],
      selectedList: "",
      userName: "",
      userList: []


    };
  },
  methods: {
    searchUserList(k) {
      console.log(k);
      const params = {
        selectedCity: this.selectedCity,
        username: this.userName
      }
      this.userList = this.getUserList(params);
    },
    getUserList(params) {
      console.log(params);

      let list = [
        {name: '유재석', age: 50, jop: '연에인'},
        {name: '유재석1', age: 51, jop: '연에인1'},
        {name: '유재석2', age: 52, jop: '연에인2'},
        {name: '유재석3', age: 53, jop: '연에인3'}
      ];
      return list;
    }
  }
}
</script>

<style scoped>

</style>