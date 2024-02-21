<template>

    <v-data-table
        :headers="headers"
        :items="center"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'CenterView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
                { text: "parkingId", value: "parkingId" },
                { text: "customerId", value: "customerId" },
                { text: "carNumber", value: "carNumber" },
                { text: "amount", value: "amount" },
                { text: "status", value: "status" },
                { text: "couponId", value: "couponId" },
                { text: "reservationId", value: "reservationId" },
            ],
            center : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/centers'))

            temp.data._embedded.centers.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.center = temp.data._embedded.centers;
        },
        methods: {
        }
    }
</script>

