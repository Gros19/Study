<template>
  <router-link to="/trello">Home</router-link>
  <router-link to="/trello/login">Login</router-link>
  <router-view id="router_vue"></router-view>
</template>

<script>


export default {
  name: 'App',
  data(){
    return{
      msg2: "메인화면"
    }
  }
}
</script>

<style>
.line{
  border: 2px solid black;
}
#router_vue{
  border: 2px solid aqua;
}

#root_v{
  border: 1px solid darkblue;
}
</style>
