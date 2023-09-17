<script setup>
import { useField, useForm } from 'vee-validate'
import PrivacyOverlayComponent from '../components/PrivacyOverlayComponent.vue'
import { ref } from 'vue'

const { handleReset } = useForm({
    validationSchema: {
      name (value) {
        if (value?.length >= 2) return true

        return 'El nombre es obligatorio.'
      },
      phone (value) {
        if (value?.length == 9 && /[0-9]+/.test(value)) return true

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
const entryDate = useField('entrydate')
const exitDate = useField('exitdate')
const checkbox = useField('checkbox')

const formData = {
  name: '',
  phone: '',
  email:  '',
  entryDate:  '',
  exitDate:  '',
  comments:  '',
};
const buttonText = ref("Enviar");
const isActive = ref(false);
const showConfirmation = ref(false);

const submit = () =>{
    showConfirmation.value = true;
}

const emailAddress = 'campingelmolino@hotmail.com';
const emailLink = `mailto:${emailAddress}`;

const googleMapsLink = 'https://www.google.com/maps/d/viewer?mid=1dA0607HrkfUz313tOSZtq58dNPM&ie=UTF8&hl=es&msa=0&ll=43.625941%2C-5.811681999999993&spn=0.006997%2C0.012338&t=h&z=17';

const closeForm= () => {
      showConfirmation.value = false;
      buttonText.value = "Enviar";
      isActive.value = false;
      handleReset();
};

const thanks = () => {
  buttonText.value = "Gracias";
  isActive.value = true;
  showConfirmation.value = true;

  formData.name = name.value.value || '';
  formData.phone = phone.value.value || '';
  formData.email = email.value.value || '';
  formData.entryDate = entryDate.value.value || '';
  formData.exitDate = exitDate.value.value || '';
  formData.comments = comments.value.value || '';
}
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

  <div class="cardForm">    
    <h3 class="bg-blue-lighten-4">Formularío de reserva</h3>
    
    <form @submit.prevent="submit">
      <v-text-field v-model="name.value.value" :counter="10"
        :error-messages="name.errorMessage.value"
        label="Nombre"></v-text-field>
  
      <v-text-field v-model="phone.value.value" :counter="9" :error-messages="phone.errorMessage.value"
      label="Teléfono"></v-text-field>
  
      <v-text-field v-model="email.value.value" :error-messages="email.errorMessage.value"
        label="E-mail"></v-text-field>
      
      <v-text-field v-model="entryDate.value.value"
            label="Fecha de Entrada" type="date"></v-text-field>

      <v-text-field v-model="exitDate.value.value"
            label="Fecha de Salida" type="date"></v-text-field>
  
      <v-text-field v-model="comments.value.value" label="Comentarios"></v-text-field>

      <div class="formGroup">
        <span>Soy mayor de 14 años y he leído la <PrivacyOverlayComponent/></span>
        <v-checkbox id="checkbox" v-model="checkbox.value.value"
        :error-messages="checkbox.errorMessage.value" value="1" type="checkbox" ></v-checkbox>
      </div>    

  <div class="formAction">
        <v-btn class="me-2" @click="thanks" bock :disabled="!thanks" :class="{ active: isActive }">{{buttonText}}</v-btn> 
        <v-btn color="secondary" @click="handleReset">Borrar</v-btn>
  </div>
    <v-dialog v-model="showConfirmation" max-width="400">
      <v-card>
        <div class="py-2 text-center">
          <v-icon class="mb-6" color="primary" icon="mdi-check-circle-outline" size="120"></v-icon>
          <p style="font-weight: bold;">¡Pronto nos pondremos en contacto contigo!</p>
        </div>
        <v-card-text class="py-2 text-center">
          <div class="reservationData">
            <p class="text-center" style="font-weight: bold;">Tus datos de Reserva</p>
            <p class="reservationInfo">Nombre: {{ formData.name }}</p>
            <p class="reservationInfo">Teléfono: {{ formData.phone }}</p>
            <p class="reservationInfo">Email: {{ formData.email }}</p>
            <p class="reservationInfo">Fecha de Entrada: {{ formData.entryDate }}</p>
            <p class="reservationInfo">Fecha de Salida: {{ formData.exitDate }}</p>
            <p class="reservationInfo">Comentarios: {{ formData.comments }}</p>
          </div>
        </v-card-text>
        
        <v-card-actions class="d-flex justify-center">
          <v-btn style="font-weight: bold;" color="primary" @click="closeForm">Cerrar</v-btn>
        </v-card-actions>
      </v-card>
    </v-dialog>
  </form>
</div>
</template>

<style scoped>
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

.cardForm{
  width: 75vh;
  max-width: 600px;
  background-color: white;
  margin: 2rem auto ;
  padding: 20px;
  border-radius: 8px;
  box-shadow: 0 4px 8px #B3E5FC;
}

h3{
  margin-bottom: 1rem;
}

.active{
  background:#FFF176;
  transition: 1s;
}

.active{
  right: 0;
  opacity: 1;
  transition: 1s;
}

.active p{
  margin-right: 125px;
  transition: 1s;
}

.reservationData{
  text-align: left;
  background-color: #E3F2FD;
  padding: 10px;
  border-radius: 5px;
  margin: 10px 0;
  box-shadow: 0 4px 8px #FFF176;
}

.reservationData p {
  margin: 5px 0;
}

.reservationInfo{
  background-color: #E3F2FD;
  border-radius: 5px; 
}
</style>





