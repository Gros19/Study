<template>
  <div>
    <input type="text" v-model="lastName" />
    <input type="text" v-model="firstName"/>
    <h1>Hello {{ lastName + firstName }}</h1>
    <h1>Hello {{ getFLName() }}{{this.ccnt}}</h1>
    <h1>Hello {{ getFLName() }}</h1>
    <h1>Hello {{ getComputedName }}{{this.mcnt}}</h1>
    <h1>Hello {{ getComputedName }}</h1>
    <textarea v-text="getFLName()"></textarea>
  </div>
</template>
<script>
export default {

  name: 'ComputedCom',
  components: {},
  data() {
    return {
      firstName: '재석',
      lastName: "유",
      mcnt: 0,
      ccnt: 0

    };
  },
  computed: {
    getComputedName() {
      //this.ccnt++;  //오류
      this.cCountincrease();
      return this.lastName + this.firstName;
    }
  }
  ,
  methods: {
    cCountincrease(){
      this.ccnt++;
    },
    getFLName() {
      this.mcnt++;
      return this.lastName + this.firstName;
    }
  }
}
</script>