import { createRouter, createWebHistory } from 'vue-router'
import Home from '../views/Home.vue'
import Contact from '../views/Contact.vue'
import Facilities from '../views/Facilities.vue'
import Legacy from '../views/Legacy.vue'
import Privacy from '../views/Privacy.vue'
import Prices from '../views/Prices.vue'


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
        path: '/Contact',
        name: 'Contact',
        component: Contact,
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
    ]

const router = createRouter({
  history: createWebHistory(),
  routes,
})

export default router
