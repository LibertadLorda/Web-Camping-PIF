<template>
<div class="gallery">
    <img src="../assets/caminos.jpeg" alt="">
    <img src="../assets/peñas.jpeg" alt="">
    <img src="../assets/relax2.jpg" alt="">
    <img src="../assets/fondoplaya.jpg" alt="">
    <img src="../assets/ocio.jpg" alt="">
    <img src="../assets/playacan.jpeg" alt="">
    <img src="../assets/tiendas1.jpeg" alt="">
    <img src="../assets/vistas.jpeg" alt="">
    <img src="../assets/arena.jpg" alt=""> 
    <img src="../assets/IMG_6593 2.jpeg" alt="">
    <img src="../assets/Sin2.png" alt="">
    <img src="../assets/autocaravanas04.jpg" alt="">
  </div>
</template>

<style scoped>
.gallery {
  --g: 6px; 
  --columns: 3; 
  display: grid;
  grid-template-columns: repeat(var(--columns), 1fr);
  gap: var(--g);
  padding: 2rem;
}

.gallery img {
  width: 100%;
  height: 100%;
  object-fit: cover;
  filter: grayscale();
  cursor: pointer;
  transition: .5s;
}

.gallery img:hover {
  filter: grayscale(0);
}

.gallery img:nth-child(2n) {
  clip-path: polygon(0 0, 100% 0, 100% 100%, calc(50% + var(--g)/4) 100%, 0 calc(50% - var(--g)/4));
}

.gallery img:nth-child(2n+1) {
  clip-path: polygon(0 0, calc(50% - var(--g)/4) 0, 100% calc(50% + var(--g)/4), 100% 100%, 0 100%);
}

@media (max-width: 768px) {
  .gallery {
    --columns: 2; 
    }
}
@media (max-width: 480px) {
  .gallery {
    --columns: 1; 
  }
}
</style>