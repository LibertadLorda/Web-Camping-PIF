<script setup>
import DataService from '../services/DataService';
import { ref, onMounted } from "vue";

const tab = ref('all');
const prices = ref([]);

const filteredPrices = (type) => {
  return prices.value.filter((price) => type === 'all' || price.typeFee === type);
};

const dataPrices = async () =>{
    try {
    const response = await DataService.getAll();
    prices.value = response.data.map((data) => ({
      id: data.id,
      typeFee: data.typeFee,
      typeService: data.typeService,
      price: data.price,
      gap: 2
    }));
  } catch (error) {
    console.log(error);
  }
};

onMounted(dataPrices);

</script>

<template>
   
    <v-tabs class="filterTab" v-model="tab" bg-color="primary" grow centered>
        <v-tab value="all">Todas</v-tab>
        <v-tab value="Tarifas Temporada" >Tarifas temporada</v-tab>
        <v-tab value="Tarifas Reducidas" >Tarifas reducidas</v-tab>
    </v-tabs>
    
    <v-window v-model="tab">
        <v-window-item value="all">
            <v-table class="filterTable">
            <thead>
              <tr>
                  <th class="text-left">Tarifas</th>
                  <th class="text-left">Precio</th>
              </tr>
            </thead>
            <tbody>
              <tr v-for="price in filteredPrices('all')" :cols="price.flex" :key="price.id">
                  <td>{{ price.typeService }}</td>
                  <td>{{ price.price }} €</td> 
              </tr>
            </tbody>
        </v-table>
        </v-window-item>

        <v-window-item value="Tarifas Temporada">
          <v-table class="filterTable">
              <thead>
                <tr>
                    <th class="text-left"> Tarifas Temporada 2023</th>
                    <th class="text-left">Precio</th>
                </tr>
              </thead>
              <tbody>
                <tr v-for="price in filteredPrices('Tarifas Temporada')" :cols="price.flex" :key="price.id">
                    <td>{{ price.typeService }}</td>
                    <td>{{ price.price }} €</td> 
                </tr>
              </tbody>
          </v-table>
        </v-window-item>
    
        <v-window-item value="Tarifas Reducidas">
          <v-table class="filterTable">
            <thead>
              <tr>
                  <th class="text-left">Tarifas temporada alta (15 de mayo al 15 de septiembre)</th>
                  <th class="text-left">Precio</th>
              </tr>
            </thead>
            <tbody>
              <tr v-for="price in filteredPrices('Tarifas Reducidas')" :cols="price.flex" :key="price.id">
                  <td>{{ price.typeService }}</td>
                  <td>{{ price.price }} €</td> 
              </tr>
            </tbody>
          </v-table>
        </v-window-item>
    </v-window>

</template>

<style scoped>

.filterTable
 {
    width: 70%; 
    border-collapse: collapse; 
    margin: 2rem auto;
    border-radius: 10px;
    box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
}

.filterTab {
  border-radius: 10px;
  margin: 2rem auto;
  width: 80%;
}

.filterTable  th,
.filterTable  td {
    border: 1px solid #cccccc; 
    text-align: left;
    padding: 10px;
}

.filterTable  th {
    background-color: #64B5F6; 
    font-weight: bold; 
    text-transform: uppercase; 
}

.filterTable tbody tr:nth-child(odd) {
    background-color: #E3F2FD; 
    opacity: 0.8;
}


@media screen and (max-width: 768px) {
  .filterTab {
    flex-direction: column; 
    align-items: center; 
  }
  
  .filterTab v-tab {
    margin: 10px;
  }
}
</style>

  
