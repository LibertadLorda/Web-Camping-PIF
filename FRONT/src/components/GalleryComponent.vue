<script setup>
const props = defineProps({
    photos: String,
})
</script>

<template>
    <v-carousel cycle height="500" hide-delimiter-background show-arrows="hover">
      <v-carousel-item v-for="(photo, i) in photos" :key="i">
        <img :src="photo.src" alt="Foto" class="carouselImg" >
      </v-carousel-item>
    </v-carousel>
</template>

<style scoped>

*{
  margin-bottom: 2rem;
}

.carouselImg {
  object-fit: cover; 
  width: 100%;
  height: 100%;
  margin-bottom: 2rem;
}

</style>