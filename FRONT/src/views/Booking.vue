<script setup>
import BookingComponent from '../components/BookingComponent.vue'

const emailAddress = 'campingelmolino@hotmail.com';
const emailLink = `mailto:${emailAddress}`;

const googleMapsLink = 'https://www.google.com/maps/d/viewer?mid=1dA0607HrkfUz313tOSZtq58dNPM&ie=UTF8&hl=es&msa=0&ll=43.625941%2C-5.811681999999993&spn=0.006997%2C0.012338&t=h&z=17';

</script>

<template>
    <div class="cardContainer">
      <div class="card">
        <h3 class="bg-blue-lighten-4">Datos de Contacto</h3>
        <p>Bañugues S/N</p>
        <p>33448 Gozón, Asturias</p>
        <br>
        <p>Playa de Bañugues</p>
        <p>Carretera GO-1</p>
        <p>(De Luanco al Cabo Peñas) Km 1,5.</p>
        <br>
        <p>Tlf.: + 34 985 88 07 85</p>
        <br>    
        Email: <a :href="emailLink"> {{ emailAddress }}</a>
        <p>Bañugues S/N</p>
        <p>G.P.S. N 43° 37' 32'' / O 5° 48' 40''</p>
    </div>
  
    <div class="card">
      <h3 class="bg-blue-lighten-4">Localización</h3>
      <h4>(Clic en la imagen para acceder al mapa)</h4>
      <a :href="googleMapsLink" target="_blank">
        <div style="text-align: center; padding-top: 20px;">
          <img src="../assets/mapa_contacto.jpeg" alt="Map">
        </div>
      </a>
    </div>
  </div>
  <BookingComponent/>
</template>

<style>
.cardContainer {
  margin: 2rem ;
  display: flex;
  flex-wrap: wrap;
  justify-content: space-around;
}

.card {
  flex: 1;
  background-color: white;
  border: 1px solid #B3E5FC;
  padding: 20px;
  box-shadow: 0 4px 8px #B3E5FC;
  border-radius: 5px;
  max-width: 400px; 
  box-sizing: border-box;
}
</style>



