<template>
  <v-app>
    <NavbarComponent/>
    <v-main>
      <RouterView></RouterView>
    </v-main>
    <FooterComponent/>
  </v-app>
</template>

<script setup>
import NavbarComponent from './components/NavbarComponent.vue';
import FooterComponent from './components/FooterComponent.vue';
import { RouterView} from 'vue-router';

</script>

