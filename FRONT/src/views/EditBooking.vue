<script setup>
import BookingService from '../services/BookingService';
import BookingComponent from '../components/BookingComponent.vue';

import { ref } from 'vue';

const emailData= ref('') ;
const booking = ref(null);
const searched = ref(false);
    
const searchEmail = async () => {
    try {
            const email = emailData.value;
            const response = await BookingService.getById(email);

        if (response && response.data) {
            booking.value = response.data;
            
        } else {
            booking.value = null;
            showConfirmation.value = true;
        }  
        searched.value = true;
        emailData.value = '';

    }catch (error) {
            console.log(error);
    }
}

const editForm = ref(false);

const showEdit = () => {
    editForm.value = !editForm.value;
}

const deleteBooking = async () => {
    try {
        const email = emailData.value;
        const response = await BookingService.delete(email);

        if (response) {
            console.log("La reserva ha sido eliminada");
        } else {
            console.log(error);
        }
    } catch (error) {
        console.error(error);
    }
}
const showConfirmation = ref(false);

const closeForm= () => {
    showConfirmation.value = false;
    emailData.value = '';
};
</script>

<template>
    <div class="cardContainer">
        <div class="searchPlace">
            <input ref="emailInput" v-model="emailData" type="text" class="search" placeholder="Busca tu reserva" />
            <button @click.prevent="searchEmail" class="searchButton">Buscar</button>
        </div>

        <div class="content-container">
        <div class="card" v-if="booking !== null && searched">
            <v-card-title class="bg-blue-lighten-2" style="font-weight: bold">Detalles de la reserva</v-card-title>
            <v-card-text>
                <p>Nombre: {{ booking.name }}</p>
                <p>Email: {{ booking.email }}</p>
                <p>Fecha de entrada: {{ booking.entryDate }}</p>
                <p>Fecha de salida: {{ booking.exitDate }}</p>
                <p>Teléfono: {{ booking.phone }}</p>
                <p>Comentarios: {{ booking.comments }}</p>
            </v-card-text>
            <div class="buttonContainer">
            <v-btn color="primary" class="me-2" @click.prevent="showEdit">Editar reserva</v-btn>
       
        <v-btn color="secondary" @click.prevent="deleteBooking" class="deleteButton">Anular reserva</v-btn>
        </div>
        </div>
    </div>
</div>
        <BookingComponent v-if="editForm" /> 
        <v-dialog v-model="showConfirmation" max-width="400">
            <div class="py-2 text-center">
            <v-icon class="mb-6" icon="mdi-close-circle-outline" color="primary" size="120"></v-icon>
            </div>
            <v-card-text class="py-2 text-center">
                <p class="text-center" style="font-weight: bold;">¡No hay datos con este E-mail!</p>
            </v-card-text>
            <v-card-actions class="d-flex justify-center">
            <v-btn style="font-weight: bold;" color="primary" @click="closeForm">Cerrar</v-btn>
            </v-card-actions>
         </v-dialog>
    
    
  </template>


<style scoped>
.cardContainer {
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
  padding: 20px;
}

.searchPlace {
  text-align: center;
  margin-bottom: 20px;
  box-shadow: 0 4px 8px #B3E5FC;
  padding: 20px;
  border-radius: 8px;
}

.searchPlace input:focus {
  outline: none;
}

.content-container {
  display: flex;
  flex-wrap: wrap;
  justify-content: center;
}

.card {
  width: 100%;
  max-width: 600px;
  text-align: center;
}


</style>



