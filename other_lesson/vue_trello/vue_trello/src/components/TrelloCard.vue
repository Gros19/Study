<template>
  <div>
    Card

    <div v-if="loading">
      loading card ...
    </div>
    <div v-else>
      <div>
        Card{{cid}}
      </div>
    </div>
  </div>
</template>
<script>
export default {
  data(){
    return {
      cid: 0,
      loading: false
    }
  },
  watch: {
    // '$route'() {
    //   this.fetchData()
    // }
    '$route' : {
      handler: 'fetchData',
      immediate : true
    }
  },
  created() {
    this.fetchData()
  },
  methods:{
    fetchData(){
      this.loading = true
      setTimeout(()=>{
        this.cid = this.$route.params.cid
        this.loading = false
      }, 500)

    }
  }
}
</script>

<style scoped>
#BoardId{
  border: 2px solid #bb6b41;
}
</style>
