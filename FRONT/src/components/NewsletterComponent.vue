<script setup>
import { ref, computed } from 'vue'
import NewsletterService from '../services/NewsletterService';

const nameSurname = ref('');
const phone = ref('');
const email = ref('');
const language = ref('');
const items = ref([
    'Español',
    'Inglés',
  ]);

const form = ref(null);
const showConfirmation = ref(false);

const closeForm= () => {
      showConfirmation.value = false;
};

const validateForm = async () => {
  const formOk = (
    nameSurname.value.length >= 2 &&
    phone.value.length === 9 &&
    /^[0-9-]+$/.test(phone.value) &&
    /^[a-z.-]+@[a-z.-]+\.[a-z]+$/i.test(email.value) &&
    (language.value === 'Español' || language.value === 'Inglés')
  );
    if(formOk){
        const Data = {
            nameSurname: nameSurname.value,
            email: email.value,
            phone: phone.value,
            language: language.value,
    };
    try {
            await NewsletterService.post(Data);
            console.log(Data);
            showConfirmation.value = true;
        }
        catch (error) {
            console.log(error);
    }
    }
    nameSurname.value = null;
    phone.value = null;
    email.value = null;
    language.value = null;
};


</script>

<template>
    <v-form ref="form" class="form">
      <v-text-field
        v-model="nameSurname"
        :counter="20"
        :rules="[v => !!v  || 'El nombre es necesario.']"
        label="Nombre y apellidos"
        required
      ></v-text-field>
  
      <v-text-field
        v-model="phone"
        :counter="9"
        :rules="[v => !!v || 'El número de teléfono es obligatorio.', v => /^[0-9]+$/.test(v) || 'El número de teléfono debe contener solo números']"
        label="Número de teléfono"
        required
      ></v-text-field>
  
      <v-text-field
        v-model="email"
        :rules="[v => !!v || 'El email es necesario.', v => /^[a-z.-]+@[a-z.-]+\.[a-z]+$/i.test(v) || 'Formato de email inválido']"
        label="E-mail"
        required
      ></v-text-field>
  
      <v-select
        v-model="language"
        :items="items"
        :rules="[v => v !== null|| 'El idioma es necesario.']"
        label="Seleccione el idioma del boletín."
        required
      ></v-select>
       
      <v-btn ref="formBtn" class="mt-4" block :disabled="!validateForm" @click="validateForm">Enviar</v-btn>
    
    
      <v-dialog v-model="showConfirmation" max-width="400">
      <v-card>
        <div class="py-4 text-center">
          <v-icon class="mb-6" color="primary" icon="mdi-check-circle-outline" size="120"></v-icon>
        </div>
        <v-card-text class="py-3 text-center">
          ¡Pronto recibirás noticias nuestras!
        </v-card-text>
        <v-card-actions class="d-flex justify-center">
          <v-btn color="primary" @click="closeForm">Cerrar</v-btn>
        </v-card-actions>
      </v-card>
    </v-dialog>
    </v-form>
  </template>

<style scoped>

.mt-4 {
  text-decoration: none;
  transition: 0.3s;
  background-color: #64B5F6;
  color: white;
}

.mt-4:hover{
  letter-spacing: 0.15rem;
  padding: 0 1rem;
  font-weight: bolder;
}

.form{
    width: 50vh;
    margin: 0 auto;
    padding: 20px;
    border-radius: 10px;
    border: 1px solid #ccc;
    box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
    box-sizing: border-box;
}


</style>