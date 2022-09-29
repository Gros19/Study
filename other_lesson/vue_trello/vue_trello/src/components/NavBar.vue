<template>
  <div>
    <p>NavBar</p>
    <h4><router-link to="/">hello</router-link></h4>
    <h4><router-link to="/bye">bye</router-link></h4>
    <h4><router-link to="/123">notfound</router-link></h4>
  </div>
</template>

<script>
export default {
  name: "NavBar"
}
</script>

<style scoped>
 div{

   border: 2px solid #42b983;

 }
</style>