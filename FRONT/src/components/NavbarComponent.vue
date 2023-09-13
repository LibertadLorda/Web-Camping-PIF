<script setup>
import { ref, watch } from 'vue';
import { RouterLink } from 'vue-router';

const drawer = ref(false);
const group = ref(null);

const items = [
  {
    title: 'Home',
    route: '/',
  },
  {
    title: 'Precios',
    route: '/Prices',
  },
  {
    title: 'Instalaciones',
    route: '/Facilities',
  },
  {
    title: 'Login',
    route: '/login',
  },
];

watch(group, () => {
  drawer.value = false;
});

const closeOverlay = (newValue) => {
  overlay.value = newValue;
};
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
      
      <v-btn class="button" size="medium" color="surface-variant" variant="text"><i class="fas fa-campground fa-lg"></i>Fotos</v-btn>
        <RouterLink :to="'/Facilities'"><v-btn class="button" size="medium" color="surface-variant" variant="text"><i class="fas fa-leaf fa-lg"></i>Instalaciones</v-btn></RouterLink>
        <RouterLink :to="'/Prices'"><v-btn class="button" size="medium" color="surface-variant" variant="text"><i class="fas fa-euro-sign fa-lg"></i>Tarifas</v-btn></RouterLink>
        <v-btn class="button" size="medium" color="surface-variant" variant="text"><i class="fas fa-video fa-lg"></i>Webcam</v-btn>

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
.button {
  margin-right: 2rem;
}

.nav {
  max-width: 300px; 
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

.banner {
    background-position: center;
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