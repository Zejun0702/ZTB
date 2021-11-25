<template>

  <div>
    <vue-markdown :source="content"></vue-markdown>
  </div>
</template>

<script>


import VueMarkdown from 'vue-markdown';
import MarkdownEditor from '@/components/MarkdownEditor'
import  data from "/src/views/example/README.md"
export default {
  components: {
    VueMarkdown
  },

  data(){
    return {
      content: data,
    }
  },

}
</script>

