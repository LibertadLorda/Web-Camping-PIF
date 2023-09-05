<script setup>
import { ref, onMounted } from 'vue';
import videoSource from '../assets/Nature.mp4';
const videoPlayer = ref(null);

onMounted(() => {
  videoPlayer.value.play();
});
</script>

<template>
  <div class="container">
    <video ref="videoPlayer" autoplay loop muted>
      <source :src="videoSource" type="video/mp4">
      Tu navegador no soporta la reproducción de videos.
    </video>
  </div>
</template>

<style scoped>
.container{
    width: 100%;
    height: 100%;
    position:relative;
    top: 0;
    left: 0;
    z-index: 1;
    opacity: 0.3; 
}
  
</style>