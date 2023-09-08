<script setup>

const generalInfo = [
        { details: "Camping situado a 50 m. de la playa de Bañugues" },
        { details: "Parcelas con césped y arbolado" },
        { details: "Parcelas con agua y desagüe, conexión eléctrica (220V 4Amp)" },
        { details: "Admisión de animales de compañía" },
        { details: "Zona de acampada para grandes grupos" },
        { details: "Zona de parking exclusiva para autocaravanas, recinto para Guardería de Autocaravanas y Caravanas" },
        { details: "Admisión de tarjetas de pago" },
      ];
</script>

<template>
    <div>
      <table>
        <thead>
          <tr>
            <th>Información General</th>
          </tr>
        </thead>
        <tbody>
          <tr v-for="(General, index) in generalInfo" :key="index">
            <td>{{ General.details }}</td>
          </tr>
        </tbody>
      </table>
    </div>
  </template>
  