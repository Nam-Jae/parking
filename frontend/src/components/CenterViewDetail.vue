<template>

    <v-card outlined>
        <v-card-title>
            Center # {{$route.params.id }}
        </v-card-title>

        <v-card-text>
            <div>
                <String label="ParkingId" v-model="item.parkingId" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="CustomerId" v-model="item.customerId" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="CarNumber" v-model="item.carNumber" :editMode="editMode" @change="change" />
            </div>
            <div>
                <Number label="Amount" v-model="item.amount" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="Status" v-model="item.status" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="CouponId" v-model="item.couponId" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="ReservationId" v-model="item.reservationId" :editMode="editMode" @change="change" />
            </div>
        </v-card-text>
    </v-card>

</template>

<script>
  const axios = require('axios').default;

  export default {
    name: 'CenterViewDetail',
    props: {
      value: Object,
    },
    data: () => ({
        item : [],
    }),
    async created() {
      var params = this.$route.params;
      var temp = await axios.get(axios.fixUrl('/centers/' + params.id))

      this.item = temp.data;

    },
    methods: {
    }
  }
</script>

