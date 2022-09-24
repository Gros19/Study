<template>
  <h1>{{bid}}</h1>
  <div>
    Board {{this.$route["params"]["bid"]}}
  </div>
</template>

<script>
export default {
  name: 'BoardCom',
  data(){
    return {
      bid: 0
    }
  },


  created() {
    console.log(this.$route);
    this.bid = this.$route.params.bid
  }
}
</script>

<style scoped>

</style>