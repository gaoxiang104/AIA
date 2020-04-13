import Vue from 'vue';
import router from './router';
import store from './store';

import Antd from 'ant-design-vue';
import '@/assets/styles/base.scss';
import 'ant-design-vue/dist/antd.css';

import App from './App.vue';

Vue.config.productionTip = false;
Vue.use(Antd);

new Vue({
  router,
  store,
  render: (h) => h(App),
}).$mount('#app');
