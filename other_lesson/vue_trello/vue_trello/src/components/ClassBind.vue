<template>
  <div class="container" v-bind:class="{'active':isActive, 'text-red':isRed}">asdf</div>
  <div class="container" v-bind:class="[activeClass, redClass]">Claasss</div>
  <p>ppp</p>
  <div v-bind:style="[baseStyle, addStyle]">인라인 스타일 Binding</div>
</template>

<script>

export default {

  name: "ClassBind",
  components:{

  },
  data(){
    return {
      isActive:true,
      isRed:true,
      styleObject: {
        backgroundColor: 'yellow',
        color:'red',
        fontWeight:'bold'
      },
      activeClass: 'active',
      redClass: 'text-red',
      addStyle: 'color:red;font-weight:bold',
      baseStyle: 'background-color:blue;width:100%;height:300px'
    };
  }
}
</script>

<style scoped>
.container{
  width: 100%;
  height: 200px;
}

.active{
  background-color: yellow;
  font-weight: bold;
}
.text-red{
  color:red;
}
</style>