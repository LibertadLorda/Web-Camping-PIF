<!-- <script setup>
  import { ref } from 'vue'
  import NewsletterService from '../services/NewsletterService';

  const { handleSubmit, handleReset } = useForm({
    validationSchema: {
      nameSurname (value) {
        if (!value || value.length < 2) 
        return 'Este campo debe tener al menos 2 caracteres';
        return true;
      },
      phone (value) {
        if (!value || (value.length <= 9 && !/[0-9-]+/.test(value))) 
        return 'Este campo debe ser un número de teléfono válido';
        return true;
      },
      email (value) {
        if (!value || !/^[a-z.-]+@[a-z.-]+\.[a-z]+$/i.test(value)) 
        return 'Este campo debe ser un correo electrónico válido';
        return true;
      },
      language (value) {
        if (!value) return 'Seleccione el idioma en que lo quiere recibir.'
        return true;
      },
    },
  })
  const nameSurname = useField('nameSurname')
  const phone = useField('phone')
  const email = useField('email')
  const language = useField('language')

  const items = ref([
    'Español',
    'Inglés',
  ])

  const submit = handleSubmit(values => {
    alert(JSON.stringify(values, null, 2))
  })

const dataNews = async () =>{
    if (nameSurname.value && phone.value && email.value && language.value ){
        const Data = {
            nameSurname: nameSurname.value.value,
            email: email.value.value,
            phone: phone.value.value,
            language: language.value.value,
    };
        try {
            await NewsletterService.post(Data);
            console.log(Data);
        }
        catch (error) {
            console.log(error);
    }
    }
  
};
</script>
<template>
    <form @submit.prevent="submitForm">
      <v-text-field
        v-model="nameSurname.value.value"
        :counter="10"
        :error-messages="nameSurname.errorMessage.value"
        label="Nombre y apellidos"
      ></v-text-field>
  
      <v-text-field
        v-model="phone.value.value"
        :counter="9"
        :error-messages="phone.errorMessage.value"
        label="Número de teléfono"
      ></v-text-field>
  
      <v-text-field
        v-model="email.value.value"
        :error-messages="email.errorMessage.value"
        label="E-mail"
      ></v-text-field>
  
      <v-select
        v-model="language.value.value"
        :items="items"
        :error-messages="language.errorMessage.value"
        label="Idioma"
      ></v-select>
  
      <v-btn
        class="me-4"
        type="submit"
        @click="dataNews()"
      >
        Enviar
      </v-btn>
  
      <v-btn @click="handleReset">
        Borrar 
      </v-btn>
    </form>
  </template> -->
<!-- 
  <template>
    <form @submit.prevent="submitForm">
      <v-text-field
        v-model="formData.nameSurname"
        label="Nombre y apellidos"
      ></v-text-field>
      <span v-if="nameError" class="error">{{ nameError }}</span>
  
      <v-text-field
        v-model="formData.phone"
        label="Número de teléfono"
      ></v-text-field>
      <span v-if="phoneError" class="error">{{ phoneError }}</span>
  
      <v-text-field
        v-model="formData.email"
        label="E-mail"
      ></v-text-field>
      <span v-if="emailError" class="error">{{ emailError }}</span>
  
      <v-select
        v-model="formData.language"
        :items="items"
        label="Idioma"
      ></v-select>
      <span v-if="languageError" class="error">{{ languageError }}</span>

  
      <v-btn type="submit">Enviar</v-btn>
      <v-btn @click="resetForm">Borrar</v-btn>
    </form>
  </template>
  
  <script setup>
  import { ref } from 'vue'
  import NewsletterService from '../services/NewsletterService';
  
  const formData = {
    nameSurname: '',
    phone: '',
    email: '',
    language: '',
  };
  
  const nameSurnameError = ref('');
  const phoneError = ref('');
  const emailError = ref('');
  const languageError = ref('');
  
  const items = ref(['Español', 'Inglés']);
  
  const validateForm = () => {
    nameSurnameError.value = formData.nameSurname.length < 2 ? 'Este campo debe tener al menos 2 caracteres' : '';
    phoneError.value = !/^\d{9}$/.test(formData.phone) ? 'Este campo debe ser un número de teléfono válido' : '';
    emailError.value = !/^[a-z.-]+@[a-z.-]+\.[a-z]+$/i.test(formData.email) ? 'Este campo debe ser un correo electrónico válido' : '';
    languageError.value = !formData.language ? 'Seleccione el idioma en que lo quiere recibir.' : '';
  };
  
  const submitForm = async () => {
    validateForm();
  
    if (!nameSurnameError.value && !phoneError.value && !emailError.value && !languageError.value) {
        const Data = {
        nameSurname: formData.nameSurname,
        email: formData.email,
        phone: formData.phone,
        language: formData.language,
    };
    try {
            await NewsletterService.post(Data);
            console.log(Data);
            resetForm();
        }
        catch (error) {
            console.log(error);
    }
    }  
}
  
  const resetForm = () => {
    formData.nameSurname = '';
    formData.phone = '';
    formData.email = '';
    formData.language = '';
  
    nameSurnameError.value = '';
    phoneError.value = '';
    emailError.value = '';
    languageError.value = '';
  };
  </script>
  
  <style>
  .error {
    color: red;
  }
  </style>
   -->

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

const formOk = computed(() =>{
    return (
        !! nameSurname.value &&
        phone.value.length === 9 &&
        !! email.value &&
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
        label="Seleccione el idioma en el que quiere recibir el boletín."
        required
      ></v-select>

      <v-btn ref="formBtn" class="mt-4" block :disabled="!formOk" @click="validateForm">Enviar</v-btn>
      <v-btn @click="clearForm">Borrar</v-btn>
      <div v-if="showConfirmation" class="confirmMessage">
        ¡El formulario se ha enviado correctamente!
      </div>
    </form>
  </template>

<style scoped>

.mt-4 {
  text-decoration: none;
  transition: 0.3s;
  background-color: rgba(54, 157, 178, 1);
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
</style>