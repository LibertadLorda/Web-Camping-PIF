<script setup>
import { RouterLink } from 'vue-router';

const links = [
    {
        name: 'Inicio',
        route: '/',
    },
    {
        name: 'Reserva',
        route: '/Booking',
    },
    {
        name: 'Aviso Legal',
        route: '/Legacy',
    },
    {
        name: 'Política de Privacidad',
        route: 'Privacy',
    },
];

</script>

<template>
  <div>
    <v-footer class="bg-grey-lighten-1" color="primary">
      <v-row justify="center" no-gutters>
        <RouterLink
          v-for="link in links"
          :key="link.name"
          :to="link.route"
          variant="text"
          class="mx-2 links"
          rounded="xl"
        >
        {{ link.name }}
        </RouterLink>
        <v-col class="text-center mt-4 footerText" cols="12">
          {{ new Date().getFullYear() }} —
          <strong>Camping de Bañugues S.L.</strong>
        </v-col>
      </v-row>
    </v-footer>
  </div>
</template>
  

<style scoped>

footer {
  height: 100px !important;
  background: linear-gradient(to bottom,#B3E5FC,#0091EA);
  color: white;
  opacity: 0.9; 
  position: relative; 
  z-index: 1;
}

.links {
  color: black;
  text-decoration: none;
  transition: 0.2s;
}
.links:hover{
  text-decoration: none;
  color: white;
  letter-spacing: 0.08rem;
  padding: 0 1rem;
  font-weight: bolder;
}
</style>

  