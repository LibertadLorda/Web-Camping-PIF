import { createRouter, createWebHistory } from 'vue-router'
import Home from '../views/Home.vue'
import Booking from '../views/Booking.vue'
import Facilities from '../views/Facilities.vue'
import Legacy from '../views/Legacy.vue'
import Privacy from '../views/Privacy.vue'
import Prices from '../views/Prices.vue'
import Gallery from '../views/Gallery.vue'


const routes = [
      {
        path: '/',
        name: 'Home',
        component: Home,
      },
      {
        path: '/Facilities',
        name: 'Facilities',
        component: Facilities,
      },
      {
        path: '/Booking',
        name: 'Booking',
        component: Booking,
      },
      {
        path: '/Legacy',
        name: 'Legacy',
        component: Legacy,
      },
      {
        path: '/Privacy',
        name: 'Privacy',
        component: Privacy,
      },
      {
        path: '/Prices',
        name: 'Prices',
        component: Prices,
      },
      {
        path: '/Gallery',
        name: 'Gallery',
        component: Gallery,
      },
    ]

const router = createRouter({
  history: createWebHistory(),
  routes,
})

export default router
