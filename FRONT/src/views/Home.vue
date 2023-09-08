<script setup>
import { ref, onMounted } from 'vue';
import videoSource from '../assets/';
const videoPlayer = ref(null);

onMounted(() => {
  videoPlayer.value.play();
});
</script>

<template>
  <div class="container">
    <div class="video-container">
    <video class="camp" ref="videoPlayer" autoplay loop muted>
      <source :src="videoSource" type="video/mp4">
      Tu navegador no soporta la reproducción de videos.
    </video>
    <div class="text-overlay">
        <h2>Camping El Molino</h2>
        <h3>#Gozón</h3>
    </div>
  </div>
  </div>
</template>

<style scoped>
.camp{
    width: 100%;
    z-index: 1;
    opacity: 80%; 
}
  
.text-overlay {
  position: absolute;
  top: 0;
  left: 0;
  width: 100%;
  height: 80%;
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  background: rgba(0, 0, 0, 0.5);
}

h2 {
  color: white; 
  font-size: 5rem;
}

h3{
  color: white; 
  font-size: 5rem;
}
</style>