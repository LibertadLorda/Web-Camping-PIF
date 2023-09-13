<script setup>
import { ref } from 'vue';

const model = ref(null);
const image = ref ([
    {
    src: 'src/assets/CT001_Camping_El_Molino_3.jpg',
    },
    {
    src: 'src/assets/ocio.jpg',
    },
    {
    src: 'src/assets/rutas.jpeg',
    },
    {
    src: 'src/assets/relax.jpeg',
    },
    {
    src: 'src/assets/autocaravanas05.jpg',
    },
])

const title = ref ([
    'Nuestro camping',
    'Zona de ocio',
    'El entorno',
    'Trae a tu mascota',
    'Zona para autocaravanas'
]);

const text =  ref ([
    'Tenemos parcelas grandes dotadas de césped y sombra de árboles.',
    'Disponemos de restaurante y zona de juegos para los más pequeños.',
    'Situado a 50 metros de la playa de Bañugues y de rutas verdes.',
    '¡Disfruta de la experiencia con tu mascota!',
    'Tenemos una zona de parking con todo lo necesario para autocaravanas',
]);

</script>

<template>
<RouterLink to="/Facilities"><p class="text-right pa-3">Ver todas las instalaciones <v-icon>mdi-chevron-right</v-icon></p>
    </RouterLink>
  <v-sheet
    class="mx-auto"
    max-width="1400"
  >
    <v-slide-group
      v-model="model"
      class="pa-7"
      center-active
      show-arrows
    >
      <v-slide-group-item
        v-for="(item, index) in image"
        :key="index"
        v-slot="{ toggle }"
      >
        <v-card
          height="300"
          width="350"
          @click="toggle"
          style="position: relative; overflow: hidden;"
        >
        <v-img
            :src= "item.src"
            height="160"
          ></v-img>
        
          <div class="text-left pa-3">
            <p class="title"> {{ title [index] }}</p>
            <p class="text"> {{ text[index] }}</p>
          </div>        
        </v-card>
      </v-slide-group-item>
    </v-slide-group>
  </v-sheet>
</template>


<style scoped>

.title {
    font-weight: bold;
    font-size: 1.2rem;
    margin: 10px;
    position: relative; 
    display: inline-block; 
}

.title::after ,
.text-right::after {
    content: ''; 
    position: absolute;
    left: 0;
    bottom: -2px; 
    width: 0;
    height: 2px; 
    background-color: #007BFF; 
    transition: width 0.3s ease; 
}

.title:hover::after {
    width: 100%; 
}

.text {
    font-size: 1rem;
}

.text-right{
    font-weight: bold;
    font-size: 1.2rem;
    margin: 10px;
    position: relative; 
    display: inline-block; 
    color: black;
}
</style>