<template>
  <div>
    Board
    <div v-if="loading">
      loading board...
    </div>
    <div v-else>
      <div> bid: {{ bid }}</div>
      <div>
        <router-link :to="`/trello/b/${bid}/c/1`">Card 1</router-link>
        <router-link :to="`/trello/b/${bid}/c/2`">Card 2</router-link>
      </div>
    </div>
    <hr/>

    <router-view></router-view>
  </div>
</template>
<script>
export default {
  name: 'BoardCom',
  data() {
    return {
      bid: 0,
      loading: false
    }
  },
  methods:{
    fetchData() {
      this.loading = true

      setTimeout(() =>{
        this.bid = this.$route.params.bid
        this.loading = false
      }, 500)
    }
  },

  created() {
    this.fetchData()
  }
}
</script>

<style scoped>
#BoardId {
  border: 2px solid #bb6b41;
}
</style>
