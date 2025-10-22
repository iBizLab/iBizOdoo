# 权限组成员(res_groups_users_rel_grid_view)  <!-- {docsify-ignore-all} -->



## 控件
#### CAPTIONBAR(captionbar)
#### 数据表格(grid)
#### 搜索栏(searchbar)
#### 搜索表单(searchform)
#### 工具栏(toolbar)

## 视图界面逻辑
  * newdata(预置新建数据逻辑)
  * opendata(预置打开数据逻辑)


### 关联界面行为
  * [权限组成员(RES_GROUPS_USERS_REL)](module/base/res_groups_users_rel) : [表格界面_新建操作](module/base/res_groups_users_rel#界面行为)
  * [权限组成员(RES_GROUPS_USERS_REL)](module/base/res_groups_users_rel) : [表格界面_删除操作](module/base/res_groups_users_rel#界面行为)

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