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

const form = ref("");
const showConfirmation = ref(false);

const closeForm= () => {
      showConfirmation.value = false;
};

const formOk = computed(() =>{
    return (
        !! nameSurname.value >= 2 &&
        (phone.value.length === 9 && /[0-9-]+/.test(value)) &&
        !! email.value (/^[a-z.-]+@[a-z.-]+\.[a-z]+$/i.test(value)) &&
        (language.value === 'Español' || language.value === 'Inglés')
    );
});

const validateForm = async () => {
    if(formOk.value){
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
    formOk.value = false;  
};

const clearForm = () => {
    nameSurname.value = null;
    phone.value = null;
    email.value = null;
    language.value = null;
    form.value.resetValidation();
    showConfirmation.value = false;
    formOk.value = false;
};

</script>

<template>
    <form ref="form">
      <v-text-field
        v-model="nameSurname"
        :counter="20"
        :rules="[v => !!v || 'El nombre es necesario.']"
        label="Nombre y apellidos"
        required
      ></v-text-field>
  
      <v-text-field
        v-model="phone"
        :counter="9"
        :rules="[v => !!v || 'El número de teléfono es obligatorio.']"
        label="Número de teléfono"
        required
      ></v-text-field>
  
      <v-text-field
        v-model="email"
        :rules="[v => !!v || 'El email es necesario.']"
        label="E-mail"
        required
      ></v-text-field>
  
      <v-select
        v-model="language"
        :items="items"
        :rules="[v => !!v || 'El idioma es necesario.']"
        label="Seleccione el idioma del boletín."
        required
      ></v-select>
        <div class="btnForm">
      <v-btn ref="formBtn" class="mt-4" block :disabled="!formOk" @click="validateForm">Enviar</v-btn>
    </div>
    <div class="btnForm">
      <v-btn @click="clearForm">Borrar</v-btn>
    </div>
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
    </form>
  </template>

<style scoped>

.mt-4 {
  text-decoration: none;
  transition: 0.3s;
  background-color: green;
  color: white;
}

.mt-4:hover{
  letter-spacing: 0.15rem;
  padding: 0 1rem;
  font-weight: bolder;
}

.confirmMessage {
    color: green;
    margin-top: 10px;
}

form{
    width: 50vh;
    margin: 0 auto;
    padding: 20px;
    background-color: #f0f0f0;
    border-radius: 10px;
    box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
}

.btnForm{
    text-align: center;
    display: inline-block;
    margin: 0 30px;
    width: 30%;
}

</style>