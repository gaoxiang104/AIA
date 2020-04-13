<template>
  <a-layout id="components-layout-demo-custom-trigger">
    <!-- 侧边栏 -->
    <SidebarComp :collapsed="collapsed" />

    <a-layout>
      <!-- 折叠按钮 -->
      <a-layout-header style="background: #fff; padding: 0">
        <a-icon
          class="trigger"
          :type="collapsed ? 'menu-unfold' : 'menu-fold'"
          @click="()=> collapsed = !collapsed"
        />
      </a-layout-header>
      <!-- 中间内容 -->
      <a-layout-content :style="{ margin: '24px 16px', padding: '24px', background: '#fff', minHeight: '280px' }">
        Content
      </a-layout-content>
    </a-layout>
  </a-layout>
</template>

<script lang="ts">
import { Component, Prop, Vue } from 'vue-property-decorator';
import SidebarComp from '@/components/layout/sidebar/SidebarComp.vue';
// import HeaderComp from '@/components/layout/header/HeaderComp.vue';
// import MainComp from '@/components/layout/main/MainComp.vue';

@Component({
  components: {
    // 侧边栏
    SidebarComp,
    // HeaderComp,
    // MainComp,
  },
})
export default class LayoutView extends Vue {
  // 左侧导航是否折叠
  private collapsed: boolean = false;
}
</script>

<style lang="scss" scoped>
#components-layout-demo-custom-trigger {
  height: 100%;
}
#components-layout-demo-custom-trigger .trigger {
  font-size: 18px;
  line-height: 64px;
  padding: 0 24px;
  cursor: pointer;
  transition: color 0.3s;
}

#components-layout-demo-custom-trigger .trigger:hover {
  color: #1890ff;
}

#components-layout-demo-custom-trigger .logo {
  height: 32px;
  background: rgba(255, 255, 255, 0.2);
  margin: 16px;
}
</style>