<script >
  export default {
    data () {
      return {
        dialog: false,
      }
    },
  }
  
</script>

<template>
  
    <v-dialog
      v-model="dialog"
      width="800"
    >
      <template v-slot:activator="{ on }">
        <span style="cursor: pointer; text-decoration: underline;" @click="dialog = !dialog">Política de Privacidad</span>
      </template>
      <v-card>
        <v-card-title>
          <span class="text-h5">Política de Privacidad</span>
        </v-card-title>
        <v-card-text @click="dialog = false">
          Lorem ipsum dolor sit amet, semper quis, sapien id natoque elit. Nostra urna at, magna at neque sed sed ante imperdiet, dolor mauris cursus velit, velit non, sem nec. Volutpat sem ridiculus placerat leo, augue in, duis erat proin condimentum in a eget, sed fermentum sed vestibulum varius ac, vestibulum volutpat orci ut elit eget tortor. Ultrices nascetur nulla gravida ante arcu. Pharetra rhoncus morbi ipsum, nunc tempor debitis, ipsum pellentesque, vitae id quam ut mauris dui tempor, aptent non. Quisque turpis. Phasellus quis lectus luctus orci eget rhoncus. Amet donec vestibulum mattis commodo, nulla aliquet, nibh praesent, elementum nulla. Sit lacus pharetra tempus magna neque pellentesque, nulla vel erat.
          
        </v-card-text>
      </v-card>
    </v-dialog>
 
</template>