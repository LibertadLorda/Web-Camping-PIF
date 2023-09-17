<script setup>
import { ref, watch } from 'vue';
import { RouterLink } from 'vue-router';

const drawer = ref(false);
const group = ref(null);

const items = [
  {
    title: 'Fotos',
    route: '/Gallery',
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
    title: 'Reserva',
    route: '/Booking',
  },
  {
    title: 'Modifica tu reserva',
    route: '/EditBooking',
  },
];

watch(group, () => {
  drawer.value = false;
});

</script>

<template>
  <div>
    <v-app-bar class="appNav" :elevation="6" color="primary" >
      <v-app-bar-nav-icon variant="text" @click.stop="drawer = !drawer" color="surface-variant"></v-app-bar-nav-icon>

        <v-toolbar-title class="text-no-wrap icon-navbar" title="Application">
          <RouterLink to="/">
            <p>Camping El Molino</p>
          </RouterLink>
        </v-toolbar-title>

      <v-spacer></v-spacer>
      
        <RouterLink :to="'/Gallery'"><v-btn class="button" color="surface-variant" variant="text">Fotos</v-btn></RouterLink>
        <RouterLink :to="'/Facilities'"><v-btn class="button"  color="surface-variant" variant="text">Instalaciones</v-btn></RouterLink>
        <RouterLink :to="'/Prices'"><v-btn class="button"  color="surface-variant" variant="text">Tarifas</v-btn></RouterLink>
        <RouterLink :to="'/Booking'"><v-btn class="button"  color="surface-variant" variant="text">Reserva</v-btn></RouterLink>
        <RouterLink :to="'/EditBooking'"><v-btn class="button"  color="surface-variant" variant="text">Modifica tu Reserva</v-btn></RouterLink>

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
  background: linear-gradient(to top,#0091EA,#B3E5FC); 
  opacity: 0.8; 
}

p{
  color: rgb(84, 82, 82);
}

.itemList {
  text-decoration: none;
  color: rgb(84, 82, 82);
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

a{
  text-decoration: none;
}

.icon-navbar{
  transition: 0.3s;
}
</style>