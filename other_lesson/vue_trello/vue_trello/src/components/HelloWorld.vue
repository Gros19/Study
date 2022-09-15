<template>
  <div class="hello">
    <h1>{{ msg }}</h1>
    <h3>hello</h3>
    <div>
      Board List:
      <ul>
        <il>
          <h5><router-link to ="/b/1">Board 1</router-link></h5>
          <h5><router-link to ="/b/2">Board 2</router-link></h5>
        </il>
      </ul>
    </div>
  </div>
</template>

<script>
export default {
  name: 'HelloWorld',
  props: {
    msg: String
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h3 {
  margin: 40px 0 0;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
</style>
