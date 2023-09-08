<script setup>
import { useField, useForm } from 'vee-validate'
import PrivacyComponent from '../components/PrivacyComponent.vue'

const { handleSubmit, handleReset } = useForm({
    validationSchema: {
      name (value) {
        if (value?.length >= 2) return true

        return 'El nombre es obligatorio.'
      },
      phone (value) {
        if (value?.length > 9 && /[0-9-]+/.test(value)) return true

        return 'El teléfono debe tener al menos 9 números.'
      },
      email (value) {
        if (/^[a-z.-]+@[a-z.-]+\.[a-z]+$/i.test(value)) return true

        return 'El email es obligatorio.'
      },
      comments (value){
        if (value?.length != " ") return true
      },
      checkbox (value) {
        if (value === '1') return true

        return 'Obligatorio'
      },
    },
  })
  const name = useField('name')
  const phone = useField('phone')
  const email = useField('email')
  const comments = useField('comments')
  const checkbox = useField('checkbox')

  const submit = handleSubmit(values => {
    alert(JSON.stringify(values, null, 2))
  })

const emailAddress = 'campingelmolino@hotmail.com';
const emailLink = `mailto:${emailAddress}`;

const googleMapsLink = 'https://www.google.com/maps/d/viewer?mid=1dA0607HrkfUz313tOSZtq58dNPM&ie=UTF8&hl=es&msa=0&ll=43.625941%2C-5.811681999999993&spn=0.006997%2C0.012338&t=h&z=17';

</script>

<template>
    <div class="cardContainer">
      <div class="card">
        <h3 class="bg-yellow-lighten-3">Datos de Contacto</h3>
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
        <h3 class="bg-yellow-lighten-3">Localización</h3>
        <h4>(Clic en la imagen para acceder al mapa)</h4>
        <a :href="googleMapsLink" target="_blank">
        <img src="../assets/mapa_contacto.jpeg" alt="Map">
        </a>
    </div>
  </div>
    <div class="cardForm">    
    <h3 class="bg-yellow-lighten-3">Formularío de Envío</h3>
    <form @submit.prevent="submit">
      <v-text-field v-model="name.value.value" :counter="10"
        :error-messages="name.errorMessage.value"
        label="Nombre"></v-text-field>
  
      <v-text-field v-model="phone.value.value" :counter="9" :error-messages="phone.errorMessage.value"
      label="Teléfono"></v-text-field>
  
      <v-text-field v-model="email.value.value" :error-messages="email.errorMessage.value"
        label="E-mail"></v-text-field>
  
      <v-text-field v-model="comments.value.value" label="Comentarios"></v-text-field>
  
      Soy mayor de 14 años y he leído la <PrivacyComponent/>
        
        <v-checkbox v-model="checkbox.value.value"
        :error-messages="checkbox.errorMessage.value" value="1" type="checkbox">
        </v-checkbox>
        <v-spacer></v-spacer>
        <v-btn class="me-4" type="submit">Enviar</v-btn>
        <v-btn @click="handleReset">Borrar</v-btn></form>
    </div>
  </template>

<style scoped>
.cardContainer {
  margin: 2rem ;
  display: flex;
  flex-wrap: wrap;
  justify-content: space-between;
}

.card {
  flex: 1;
  background-color: white;
  border: 1px solid #ccc;
  padding: 20px;
  box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
  border-radius: 5px;
  max-width: 400px; 
  box-sizing: border-box;
}

.cardForm{
  flex: 1;
  background-color: white;
  border: 1px solid #ccc;
  padding: 20px;
  box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
  border-radius: 5px;
  max-width: 700px; 
  box-sizing: border-box;
}
</style>





