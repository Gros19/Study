<template>
    <div>
      <h1 v-if="type=='A'">A</h1>
      <h1 v-else-if="type=='B'">B</h1>
      <h1 v-else>
        C
      </h1>

      <select v-model="type">
        <option value="A">A</option>
        <option value="B">B</option>
        <option value="C">C</option>
      </select>

      <h1 v-show="bRender">A</h1>
    </div>
</template>
<script>
    export default{
    name: 'RenderCom',
    components: {},
    data() {
        return{
        type:'ds',
          bRender: true
    };
    },
    setup() {},
    created() {},
    mounted() {},
    unmounted() {},
    methods: {}
    }
</script>




