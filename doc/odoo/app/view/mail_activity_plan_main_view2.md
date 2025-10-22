# 员工计划(mail_activity_plan_main_view2)  <!-- {docsify-ignore-all} -->



## 控件
#### CAPTIONBAR(captionbar)
#### DATAINFOBAR(datainfobar)
#### 编辑表单(form)
#### 工具栏(toolbar)
#### 工具栏(toolbar1)


### 关联界面行为
  * [活动计划(MAIL_ACTIVITY_PLAN)](module/mail/mail_activity_plan) : [编辑界面_保存操作](module/mail/mail_activity_plan#界面行为)
  * [活动计划(MAIL_ACTIVITY_PLAN)](module/mail/mail_activity_plan) : [编辑界面_保存并新建操作](module/mail/mail_activity_plan#界面行为)
  * [活动计划(MAIL_ACTIVITY_PLAN)](module/mail/mail_activity_plan) : [取消变更](module/mail/mail_activity_plan#界面行为)

### 关联视图
  * [待创建的活动(mail_activity_plan_template_grid_view)](app/view/mail_activity_plan_template_grid_view)
  * [公司(res_company_pickup_view)](app/view/res_company_pickup_view)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>