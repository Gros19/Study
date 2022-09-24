<template>
  <div>
    <h1 v-html="htmlStr"></h1>
  </div>
</template>

<script>
export default {
  name: "DataBindingHtml",
  data(){
    return {
      htmlStr: '<p style="color:red;"> This is a red string.</p>'
    };
  }
}
</script>

<style scoped>

</style>