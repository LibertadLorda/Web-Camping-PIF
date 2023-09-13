<script setup>
import { ref, onMounted } from 'vue';
import videoSource from '../assets/Nature.mp4';
import GalleryComponent from '../components/GalleryComponent.vue'
import NewsletterComponent from '../components/NewsletterComponent.vue'
import FacilitiesComponent from '../components/FacilitiesComponent.vue';

const videoPlayer = ref(null);
const overlay = ref(false);

const closeOverlay = (newValue) => {
  overlay.value = newValue; 
};

onMounted(() => {
  videoPlayer.value.play();
});

const photos= ref ([

  { 
    src: 'src/assets/autocaravanas03.jpg',
  },
  {
    src: 'src/assets/panoramica.jpg',
  },
  {
    src: 'src/assets/autocaravanas04.jpg',
  },

  {
    src: 'src/assets/tiendas1.jpeg',
  },

  {
    src: 'src/assets/playa.jpg',
  },
  
  {
    src: 'src/assets/peñas3.jpeg',
  },
])

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
  <div class="welcome">
    <h1>¡Bienvenidos!</h1>
    <p>Camping "El Molino" está situado en la misma playa de Bañugues, Gozón. 
      <br>¡Disfruta de la naturaleza sin renunciar a la comodidad!<br>
      Dispone de parcelas con agua, deshagüe y conexión eléctrica y terreno llano con sombra. 
      Ambiente familiar, y en un entorno agradable para <i>RE-CONECTAR</i>.</p>
  </div>
  <div>
    <FacilitiesComponent/>
  </div>
   <div class="btn_custom_block">
    <v-btn class="btn_custom" color="primary" rounded="xl" @click.stop="overlay = true">¡Subscríbete a nuestra Newsletter!</v-btn>
    <v-overlay v-model="overlay" class="d-flex align-center justify-center" scrim="#000" @click:outside="closeOverlay">
      <div class="my-overlay-content" style="max-height: 80vh; overflow-y: auto; background-color: white; z-index: 2001;">
        <NewsletterComponent :overlay="overlay" @closeOverlay="closeOverlay" />
      </div>
    </v-overlay>
  </div>
  <div>
    <GalleryComponent :photos="photos"/>
  </div>
</template>

<style scoped>

.camp{
    width: 100%;
    z-index: 1;
    opacity: 80%; 
}

.container{
  position: relative;
  overflow: hidden;
}

.text-overlay {
  position: absolute;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  max-width: 100%;
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  background: rgba(0, 0, 0, 0.5);
  
}

h2, h3 {
  color:white;
  font-size: 6vw;
}

.welcome {
  display: flex;
  flex-direction: column;
  text-align: center;
  max-width: 800px; 
  padding: 2rem;
  margin: 0 auto;
}

.btn_custom {
  margin-top: 15px;
  text-decoration: none;
  transition: 0.3s;
  padding: 0 50px;
}

.btn_custom :hover{
  letter-spacing: 0.15rem;
  padding: 0 1rem;
  font-weight: bolder;
}

.btn_custom_block{
  text-align: center;
  padding-top: 30px;
}

.v-btn{
  margin-bottom: 25px ;
}
</style>