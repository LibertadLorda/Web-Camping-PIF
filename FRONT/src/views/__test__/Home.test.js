import { mount } from '@vue/test-utils'
import { expect, test } from 'vitest'
import { createVuetify } from 'vuetify'
import * as components from 'vuetify/components'
import * as directives from 'vuetify/directives'
<<<<<<< HEAD
import HelloWorld from '/Users/libertadlorda/Desktop/Pif-CampingWeb/FRONT/src/components/HelloWorld.vue'
=======
import HelloWorld from '/Users/libertadlorda/Desktop/Web-Camping-PIF/FRONT/src/components/HelloWorld.vue'
>>>>>>> be59bd924a803cbef46defa7ceb9f2c6bb0c6cd6

const vuetify = createVuetify({
  components,
  directives,
})

global.ResizeObserver = require('resize-observer-polyfill')

test('displays message', () => {
  const wrapper = mount({
    template: '<v-layout><hello-world></hello-world></v-layout>'
  }, {
    props: {},
    global: {
      components: {
        HelloWorld,
      },
      plugins: [vuetify],
    }
  })

  // Assert the rendered text of the component
  expect(wrapper.text()).toContain('Components')
})
