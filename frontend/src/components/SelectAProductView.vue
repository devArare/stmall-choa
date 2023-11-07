<template>

    <v-data-table
        :headers="headers"
        :items="selectAProduct"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'SelectAProductView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
            ],
            selectAProduct : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/selectAProducts'))

            temp.data._embedded.selectAProducts.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.selectAProduct = temp.data._embedded.selectAProducts;
        },
        methods: {
        }
    }
</script>

