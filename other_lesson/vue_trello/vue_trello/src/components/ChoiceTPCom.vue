<template>
  <div class="hello">
    <h1>{{ msg }}</h1>
    <h3>hello</h3>
    <div>
      <ul>
        <il>
          <h5><router-link to ="/b/1">Board 1</router-link></h5>
          <h5><router-link to ="/b/2">Board 2</router-link></h5>
        </il>
      </ul>
    </div>
    <div>
      <button type="button" color="primary" @click="fetchData">getData</button>
      <button type="button" color="primary" @click="pushData">putData</button>
              <br/><br/><br/>
<!--s3 주소-->
              <img src="https://comgbucket.s3.ap-northeast-2.amazonaws.com/24042936.jpg/%EB%8B%A4%EC%9A%B4%EB%A1%9C%EB%93%9C.jp"/>
<!--인터넷 이미지 주소-->
              <img src="https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2Fdztaib%2Fbtq5bd8nkBD%2FJySqiuBzYAMMfcCZUzRkK1%2Fimg.png"/>
    </div>
  </div>
</template>

<script>
import axios from 'axios'
export default {
  name: 'HelloWorld',
  props: {
    msg: String
  },
  methods:{
    fetchData:function () {
      axios.get("http://localhost:8082/task/v1/sample/gettest").then(function (response) {
        console.log(response);
      })
          .catch(function (error) {
            console.log(error);
          });
    },
    pushData:function () {
      axios.post("http://localhost:8082/task/v1/sample/puttest",{1:111,2:222,3:333,4:444},).then(function (response) {
        console.log(response);
      })
          .catch(function (error) {
            console.log(error);
          });
    }
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
