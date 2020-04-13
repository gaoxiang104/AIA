<template>
  <a-layout-sider
    :trigger="null"
    collapsible
    v-model="collapsed"
  >
    <div class="logo">
      <span class="logo-name">AIA</span>
    </div>
    <a-menu
      theme="dark"
      mode="inline"
      :defaultSelectedKeys="['1']"
    >
      <a-menu-item key="1">
        <a-icon type="home" />
        <span>首页</span>
      </a-menu-item>
      <a-menu-item key="2">
        <a-icon type="book" />
        <span>图书管理</span>
      </a-menu-item>
      <a-menu-item key="3">
        <a-icon type="upload" />
        <span>nav 3</span>
      </a-menu-item>
    </a-menu>
  </a-layout-sider>
</template>

<script lang="ts">
import { Component, Prop, Vue } from 'vue-property-decorator';

// 侧边栏组件
@Component({
  components: {

  },
})
export default class SidebarComp extends Vue {
  @Prop({ default: false, required: true })
  private collapsed!: boolean;

  public mounted() {
    console.log('collapsible : ', this.collapsed);
  }
}
</script>

<style lang="scss" scoped>
.logo {
  height: 38px;
  // background: rgba(255, 255, 255, 0.2);
  margin: 16px;
  line-height: 38px;
  text-align: center;
}
.logo-name {
  color: #e6f7ff;
  font-size: 30px;
  letter-spacing: 3px;
}
</style>