<template>
  <div>
    <select v-model="city">
      <option v-bind:value="city.v" :key="i" v-for="(city, i) in options "> {{city.t}}</option>
    </select>
  </div>
  <table>
    <thead>
      <tr>
        <th>제품</th>
        <th>제품가격</th>
        <th>배송비</th>
        <th>카테고리</th>
      </tr>
    </thead>
    <tbody>
    <tr v-for="(produce, i) in productList" :key="i">
      <td>{{produce.product_name}}</td><td>{{i}}</td>
      <td>{{produce.price}}</td><td>{{i}}</td>
      <td>{{produce.delivery_price}}</td><td>{{i}}</td>
      <td>{{produce.category}}</td><td>{{i}}</td>
    </tr>
    </tbody>
  </table>
</template>

<script>
export default {
  name: "ListCom",
  data(){
    return{
      options:[
        {v:'02', t:'서울'},
        {v:'03', t:'서울3'},
        {v:'04', t:'서울4'},
        {v:'05', t:'서울5'},
        {v:'06', t:'서울6'}
      ],
      city: '06',
      productList:[
        {product_name:'기계식 키보드', price:25000,delivery_price:5000,category:'전자제품'},
        {product_name:'마우스', price:25000,delivery_price:5000,category:'전자제품'},
        {product_name:'접시', price:25000,delivery_price:5000,category:'식기'}
      ]
    }
  }
}
</script>

<style scoped>

</style>