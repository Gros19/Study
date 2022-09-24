<template>
  <div>
    <button type="button" v-on:click="increaseCounter">ADD  1</button>
    <p>the count is : {{counter}}</p>
    <button type="button" v-on:click="one(), two()">alert</button>

    <select v-model="city" @change="changeSelect">
      <option value="서울">서울</option>
      <option value="부산">부산</option>
      <option value="제주">제주</option>
    </select>

    <input type="text" v-model="textVal" @keyup.enter="showValue"/>
  </div>
</template>

<script>
export default {
  name: "EventCom",
  data() {
    return{
      counter : 1,
      city : '부산',
      textVal : ''
    };
  },
  methods:{
    increaseCounter(){
      this.counter = this.counter + 1;
    },
    one(){
      alert('One');
    },
    two(){
      alert('two');
    },
    changeSelect(){
      alert(this.city);
    },
    showValue(){
      alert(this.textVal);
    }
  }

}

</script>

<style scoped>

</style>

vbase-css
