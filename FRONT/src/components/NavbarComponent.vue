<template>
    <div>
    <v-app-bar :elevation="6" color="primary" >
        <v-toolbar-title class="text-no-wrap" title="Application">Camping el Molino</v-toolbar-title>
        <v-btn class="button" size="medium" color="surface-variant" variant="text"><i class="fas fa-campground fa-lg"></i>Fotos</v-btn>
        <RouterLink :to="'/Facilities'"><v-btn class="button" size="medium" color="surface-variant" variant="text"><i class="fas fa-leaf fa-lg"></i>Instalaciones</v-btn></RouterLink>
        <RouterLink :to="'/Prices'"><v-btn class="button" size="medium" color="surface-variant" variant="text"><i class="fas fa-euro-sign fa-lg"></i>Tarifas</v-btn></RouterLink>
        <v-btn class="button" size="medium" color="surface-variant" variant="text"><i class="fas fa-video fa-lg"></i>Webcam</v-btn>
    </v-app-bar>

    
    </div>
</template>

<style scoped>

.button {
  margin-right: 2rem;
}



</style>