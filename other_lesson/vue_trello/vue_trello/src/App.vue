<template>
  <div id="root_v">
    <h3>{{msg2}}</h3>
    <NavBar/>
    <p class="line">WorkPlace</p>
    <router-view id="router_vue"></router-view>
    <p class="line">AccomCom</p>
    <AccomCom/>
    <p class="line">RoomCom</p>
    <RoomCom/>
    <p class="line">ActivityCom</p>
    <ActivityCom/>


  </div>
</template>

<script>

// import WorkPlace from '@/components/WorkPlaceCom.vue'
import NavBar from './components/NavBar.vue'
import AccomCom from './components/AccomCom.vue'
import RoomCom from './components/RoomCom.vue'
import ActivityCom from './components/ActivityCom.vue'
export default {
  name: 'App',
  components: {
    NavBar,AccomCom,RoomCom, ActivityCom
  },
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
