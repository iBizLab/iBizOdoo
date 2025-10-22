# 服务器操作(ir_actions_server_main_view)  <!-- {docsify-ignore-all} -->



## 控件
#### CAPTIONBAR(captionbar)
#### DATAINFOBAR(datainfobar)
#### 编辑表单(form)
#### 工具栏(toolbar)
#### 工具栏(toolbar1)


### 关联界面行为
  * [服务器动作(IR_ACTIONS_SERVER)](module/base/ir_actions_server) : [取消变更](module/base/ir_actions_server#界面行为)
  * [服务器动作(IR_ACTIONS_SERVER)](module/base/ir_actions_server) : [编辑界面_保存操作](module/base/ir_actions_server#界面行为)
  * [服务器动作(IR_ACTIONS_SERVER)](module/base/ir_actions_server) : [编辑界面_保存并新建操作](module/base/ir_actions_server#界面行为)

### 关联视图
  * [活动类型(mail_activity_type_pickup_view)](app/view/mail_activity_type_pickup_view)
  * [EMail模板(mail_template_pickup_view)](app/view/mail_template_pickup_view)
  * [用户(res_users_pickup_view)](app/view/res_users_pickup_view)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>