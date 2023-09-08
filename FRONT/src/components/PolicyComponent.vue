<script setup>

const props = defineProps({
    imageSrc: String,
    title: String,
    subtitle: String,
    content: String,
});
</script>

<template>
    <div class="mx-auto cardPolicy">
        <v-list-head class="title">{{ title }}</v-list-head>
        <v-list-item class="subtitle" >{{ subtitle }}</v-list-item>
        <v-list-item class="content">
            <div class="content-text">{{ content }}</div>
        </v-list-item>    
        <v-divider></v-divider>
    </div>
    
</template>

<style>
.cardPolicy {
    max-width: 900px;
     padding: 1rem;
}
.content{
    margin-top: 1rem;
}
.title {
    font-weight: bold;
    font-style: italic; 
    font-size: 2rem;
}

.subtitle {
    font-weight: bold;
    font-size: 1rem;
}

.content-text{
    padding-bottom: 1rem;
}


</style>