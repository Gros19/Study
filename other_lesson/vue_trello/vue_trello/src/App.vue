<template>
  <h3>123{{msg2}}</h3>
  <NavBar/>
  <router-view></router-view>
</template>

<script>
//import HelloWorld from './components/HelloWorld.vue'
import NavBar from './components/NavBar.vue'
export default {
  name: 'App',
  components: {
    NavBar
  },
  data(){
    return{
      msg2: "hello"
    }
  }
}
</script>

<style>
</style>
