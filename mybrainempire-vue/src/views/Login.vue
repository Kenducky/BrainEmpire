<template>
  <div>
    <div>
      登陆
    </div>
    <div class="center">
      <el-form ref="form" model="form" label-width="80px">
        <el-form-item label="用户名">
          <el-input type="text" name="name" width="80px"></el-input>
        </el-form-item>
        <el-form-item label="密码">
          <el-input type="password" name="password"></el-input>
        </el-form-item>
      </el-form>
    </div>

<el-alert></el-alert>
    <el-button>默认按钮</el-button>

  </div>

</template>

<script>
export default {
  name: "Login.vue"
}
</script>

<style scoped>

</style>