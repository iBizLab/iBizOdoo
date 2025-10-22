# 权限组成员(res_groups_users_rel_user_group_mgr_view)  <!-- {docsify-ignore-all} -->



## 控件
#### CAPTIONBAR(captionbar)
#### 数据表格(grid)
#### 搜索栏(searchbar)
#### 搜索表单(searchform)

## 视图界面逻辑
  * newdata(预置新建数据逻辑)
  * opendata(预置打开数据逻辑)


### 关联视图
  * [权限组(res_groups_m_pickup_view)](app/view/res_groups_m_pickup_view)
  * [权限组成员(res_groups_users_rel_edit_view)](app/view/res_groups_users_rel_edit_view)
  * [用户(res_users_m_pickup_view)](app/view/res_users_m_pickup_view)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>