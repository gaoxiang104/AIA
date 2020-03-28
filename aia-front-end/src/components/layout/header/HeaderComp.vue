<template>
  <div>
    <el-dropdown>
      <i
        class="el-icon-setting"
        style="margin-right: 15px"
      />
      <el-dropdown-menu slot="dropdown">
        <el-dropdown-item>查看</el-dropdown-item>
        <el-dropdown-item>新增</el-dropdown-item>
        <el-dropdown-item>删除</el-dropdown-item>
      </el-dropdown-menu>
    </el-dropdown>
    <span>王小虎</span>
  </div>
</template>

<script lang="ts">
import { Component, Prop, Vue } from 'vue-property-decorator';

// 头部组件
@Component({
  components: {

  },
})
export default class HeaderComp extends Vue {

}
</script>

<style lang="scss" scoped>
</style>