<template>
  <el-container>
    <!-- 侧边栏容器 -->
    <SidebarComp />

    <el-container>
      <!-- 头部 -->
      <el-header style="text-align: right; font-size: 12px">
        <HeaderComp />
      </el-header>
      <!-- 中间主体 -->
      <!-- <MainComp /> -->
      <!-- <el-header style="text-align: right; font-size: 12px">
        <el-dropdown>
          <i
            class="el-icon-setting"
            style="margin-right: 15px"
          ></i>
          <el-dropdown-menu slot="dropdown">
            <el-dropdown-item>查看</el-dropdown-item>
            <el-dropdown-item>新增</el-dropdown-item>
            <el-dropdown-item>删除</el-dropdown-item>
          </el-dropdown-menu>
        </el-dropdown>
        <span>王小虎</span>
      </el-header> -->

      <el-main>
        <el-table
          :data="tableData"
          :height="tableHeigth"
          border
          stripe
        >
          <el-table-column
            prop="date"
            label="日期"
            width="140"
          >
          </el-table-column>
          <el-table-column
            prop="name"
            label="姓名"
            width="120"
          >
          </el-table-column>
          <el-table-column
            prop="address"
            label="地址"
          >
          </el-table-column>
        </el-table>
      </el-main>
    </el-container>
  </el-container>
</template>

<script lang="ts">
import { Component, Prop, Vue } from 'vue-property-decorator';
import SidebarComp from '@/components/layout/sidebar/SidebarComp.vue';
import HeaderComp from '@/components/layout/header/HeaderComp.vue';
import MainComp from '@/components/layout/main/MainComp.vue';

@Component({
  components: {
    // 侧边栏
    SidebarComp,
    HeaderComp,
    MainComp,
  },
})
export default class LayoutView extends Vue {

}
</script>

<style lang="scss" scoped>
.el-header {
  background-color: #b3c0d1;
  color: #333;
  line-height: 60px;
}
</style>