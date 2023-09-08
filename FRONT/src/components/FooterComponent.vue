<script setup>
import { RouterLink } from 'vue-router';

const links = [
    {
        name: 'Home',
        route: '/',
    },
    {
        name: 'Team',
        route: '/Team',
    },
    {
        name: 'Contacto',
        route: '/Contact',
    },
    {
        name: 'Aviso Legal',
        route: '/Legacy',
    },
    {
        name: 'Política de Privacidad',
        route: 'Privacy',
    },
    {
        name: 'Política de Cookies',
        route: '/Cookies',
    }
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
  height: 200px !important;
}
.links {
    color: white;
    text-decoration: none;
    transition: 0.2s;
}
.links:hover{
  color: rgb(45, 44, 44);
  letter-spacing: 0.08rem;
  padding: 0 1rem;
  font-weight: bolder;
}
</style>

  