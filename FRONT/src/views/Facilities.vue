<script setup>
import PolicyComponent from '../components/PolicyComponent.vue';
import {ref} from 'vue'

const dialog= ref(false);
</script>

<template>
  <div class="cardContainer">
    <div class="facilitiesInfo">
      <PolicyComponent
        title="Información general"
        content="
• Camping situado a 50 m. de la playa de Bañugues
• Parcelas con césped y arbolado
• Parcelas con agua y desagüe.
• Conexión eléctrica. 220 Vol 4Amp
• Admisión de animales de compañía.
• Zona de acampada para grandes grupos.
• Zona parking exclusiva para autocaravanas.
• Recinto para Guardería de Autocaravanas y Caravanas.
• Admisión de tarjetas de pago."
/>
     <PolicyComponent
        title="Equipamientos sanitarios"
        content="
• Agua caliente en todas las duchas.
• Máquinas automáticas de Lavado y secado.
• Lavaderos y fregaderos.
• Puntos de vaciado WC químicos.
• Servicio higiénico adaptado para minusválidos.
• Botiquín.
• Reciclaje de basuras.
"
/>
    </div>
    <div class="facilitiesInfo">
      <PolicyComponent
        title="Ocio y deporte"
        content="
- Parque infantil.
- Ping-Pong.
- Pista de petanca.
- Campo de futbol.
- Zona verdes de juego y esparcimiento.
- Zona de picnic."/>
       
      <PolicyComponent
        title="Servicios"
        content="
- Restaurante.
- Bar y cafetería con terraza.
- Tienda de víveres."/>

      <PolicyComponent
        title="Accesos"
        content="
- Accesible a vehículos grandes.
- Accesos adaptados para minusválidos."/>
    </div>

    <div class="facilitiesInfo">
      <PolicyComponent
        title="Horarios"
        content="
- Recepción: De 08:00 a 00:00h.
- Restaurante y tienda de víveres: De 10:00 a 00:00"/>

      <PolicyComponent
        title="Periodos de apertura"
        content="
- Temporada verano: del 15.05 al 15.09.
- Otras temporadas: Semana Santa y fines de semana de invierno."/>

        <img @click="dialog = !dialog" class="imgSmall" src="../assets/PlanoCamping.jpeg" alt="Plano"/>
        <v-dialog v-model="dialog" @click="dialog = false">
          <div class="d-flex justify-center align-center">
            <img class="imgOverlay" src="../assets/PlanoCamping.jpeg" alt="Plano" />
          </div>
        </v-dialog>
    </div>
  </div>
</template>

<style scoped>

.cardContainer{
  display: flex;
  flex-direction: column; 
  align-items: center; 
}

.facilitiesInfo{
  display:flex;
  background-color: #fff;
  border-radius: 8px;
  box-shadow: 0 4px 8px #B3E5FC;
  padding: 2rem;
  margin: 1rem;
  width: calc(66.66% - 20px); 
  transition: transform 0.2s;
}

.facilitiesInfo:hover {
  transform: translateY(-10px);
}

.imgSmall{
  max-width: 40%;
}

.imgOverlay{
  max-width: 70%;
}
</style>