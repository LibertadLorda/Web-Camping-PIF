<script setup>
const props = defineProps({
    title: String,
    content: String,
});
</script>

<template>
    <div class="mx-auto cardInformation">
        <v-list-head class="title">{{ title }}</v-list-head>
        <v-list-item class="content">
            <pre class="content-text">{{ content }}</pre>
        </v-list-item>     
    </div>
</template>

<style>

.cardInformation {
    max-width: 900px;
    padding: 1rem;
}

.content{
    margin-top: 1rem;
}

.title {
    font-weight: bold;
    font-style: italic; 
    font-size: 20px;
}

.content-text{
    padding-bottom: 1rem;
    font-family: inherit; 
    white-space: pre-wrap;
    align-items: left;
    font-size: 15px;
}
</style>