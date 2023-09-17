<script setup>
import { ref, watch } from 'vue';
import { RouterLink } from 'vue-router';

const drawer = ref(false);
const group = ref(null);

const items = [
  {
    title: 'Inicio',
    route: '/',
  },
  {
    title: 'Instalaciones',
    route: '/Facilities',
  },
  {
    title: 'Precios',
    route: '/Prices',
  },
  {
    title: 'Contacto',
    route: '/Contact',
  },
  {
    title: 'Fotos',
    route: '/Gallery',
  },
  
];

watch(group, () => {
  drawer.value = false;
});

</script>

<template>
  <div>
    <v-app-bar class="appNav" :elevation="6" color="primary" >
      <v-app-bar-nav-icon variant="text" @click.stop="drawer = !drawer"></v-app-bar-nav-icon>

        <v-toolbar-title class="text-no-wrap icon-navbar" title="Application">
          <RouterLink to="/">
            Camping El Molino
          </RouterLink>
        </v-toolbar-title>

      <v-spacer></v-spacer>
      
      <RouterLink :to="'/Gallery'"><v-btn class="button" size="medium" color="surface-variant" variant="text"><i class="fas fa-campground fa-lg"></i>Fotos</v-btn></RouterLink>
        <RouterLink :to="'/Facilities'"><v-btn class="button" size="medium" color="surface-variant" variant="text"><i class="fas fa-leaf fa-lg"></i>Instalaciones</v-btn></RouterLink>
        <RouterLink :to="'/Prices'"><v-btn class="button" size="medium" color="surface-variant" variant="text"><i class="fas fa-euro-sign fa-lg"></i>Tarifas</v-btn></RouterLink>
    </v-app-bar>

    <div v-if="$route.path === '/'" class="banner"></div>

    <v-navigation-drawer class="nav" color="primary" v-model="drawer" location="top" temporary >
      <v-list>
        <RouterLink
        class="itemList"
        v-for="item in items"
        :key="item.title"
        :to="item.route"
        >
          {{ item.title }}
        </RouterLink>
      </v-list>
    </v-navigation-drawer>
</div>
</template>

<style scoped>
.appNav::before {
  content: '';
  position: absolute;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  background: linear-gradient(to bottom,#0091EA,#B3E5FC); 
  opacity: 0.8; 
  z-index: -1;
}

.button {
  margin-right: 2rem;
  
}

.nav {
  max-width: 200px; 
  background: linear-gradient(to bottom,#0091EA,#B3E5FC); 
  opacity: 0.8; 
}

.itemList {
  text-decoration: none;
  color: black;
  padding-left: 10px;
  padding-top: 15px;
}

.itemList:hover {
  letter-spacing: 0.3rem;
  font-weight: bolder;
}

.v-list {
  display: flex;
  flex-direction: column;
  gap: 0.6rem;
  margin-left: 1rem;
}

.my-overlay-content {
  border-radius: 0.3rem;
}

a{
  text-decoration: none;
  color: black;
}

.icon-navbar{
  transition: 0.3s;
}

.icon-navbar:hover{
  letter-spacing: 0.1rem;
  color: white;
}

.i-navbar{
  transition: 0.3s;
}

</style>