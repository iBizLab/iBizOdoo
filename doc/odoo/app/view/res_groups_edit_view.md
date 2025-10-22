# 群组(res_groups_edit_view)  <!-- {docsify-ignore-all} -->



## 控件
#### CAPTIONBAR(captionbar)
#### DATAINFOBAR(datainfobar)
#### 编辑表单(form)
#### 工具栏(toolbar)


### 关联界面行为
  * [权限组(RES_GROUPS)](module/base/res_groups) : [编辑界面_保存操作](module/base/res_groups#界面行为)

### 关联视图
  * [模型访问(ir_model_access_grid_view)](app/view/ir_model_access_grid_view)
  * [应用(ir_module_category_pickup_view)](app/view/ir_module_category_pickup_view)
  * [权限组继承(res_groups_implied_rel_grid_view)](app/view/res_groups_implied_rel_grid_view)
  * [权限组成员(res_groups_users_rel_grid_view)](app/view/res_groups_users_rel_grid_view)
  * [权限组关联规则(rule_group_rel_nested_group_grid_view)](app/view/rule_group_rel_nested_group_grid_view)
  * [权限组关联统一资源(unires_group_rel_nested_group_grid_view)](app/view/unires_group_rel_nested_group_grid_view)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>