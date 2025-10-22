# 用户(res_users_personal_view)  <!-- {docsify-ignore-all} -->



## 控件
#### CAPTIONBAR(captionbar)
#### DATAINFOBAR(datainfobar)
#### 数据关系栏(drbar)
#### 编辑表单(form)

##### 部件逻辑
* `onFormDataChange`
```
console.log("数据变更了");
console.log("view",view);

var toolBarCtrl = view.getCtrl("TOOLBAR", "toolbar");
if (toolBarCtrl) {
  toolBarCtrl.state.visible = false;
}
```
#### 工具栏(toolbar)
#### 工具栏(toolbar1)


### 关联界面行为
  * [用户(RES_USERS)](module/base/res_users) : [编辑界面_保存并新建操作](module/base/res_users#界面行为)
  * [用户(RES_USERS)](module/base/res_users) : [取消变更](module/base/res_users#界面行为)
  * [用户(RES_USERS)](module/base/res_users) : [编辑界面_保存操作](module/base/res_users#界面行为)

### 关联视图
  * [员工(hr_employee_main_view)](app/view/hr_employee_main_view)
  * [模型访问(ir_model_access_multi_data_view)](app/view/ir_model_access_multi_data_view)
  * [规则(ir_rule_multi_data_view)](app/view/ir_rule_multi_data_view)
  * [用户所属群组(res_groups_multi_data_view_user)](app/view/res_groups_multi_data_view_user)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>