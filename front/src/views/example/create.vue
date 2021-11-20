<template>

  <div id="app">
    <div class="ArticleSection" style="text-align:center;">2222</div>
    <div class="p1">

      <h1>一级标题</h1>
      <p>远程开户</p>
    </div>
<!--    <div v-html="message"></div>.-->
  </div>
</template>

<script>

import VueMarkdown from 'vue-markdown';
export default {

  data(){
    return {
      comment : '#nihao'
    }
  },

  name: 'CreateArticle',
  components: VueMarkdown,
}
</script>

