# 活动(mail_activity_main_view)  <!-- {docsify-ignore-all} -->



## 控件
#### CAPTIONBAR(captionbar)
#### DATAINFOBAR(datainfobar)
#### 数据关系栏(drbar)
#### 编辑表单(form)
#### 工具栏(toolbar)


### 关联界面行为
  * [活动(MAIL_ACTIVITY)](module/mail/mail_activity) : [取消变更](module/mail/mail_activity#界面行为)
  * [活动(MAIL_ACTIVITY)](module/mail/mail_activity) : [编辑界面_保存操作](module/mail/mail_activity#界面行为)

### 关联视图
  * [线索/商机(crm_lead_main_view)](app/view/crm_lead_main_view)
  * [部门(hr_department_main_view)](app/view/hr_department_main_view)
  * [员工(hr_employee_main_view)](app/view/hr_employee_main_view)
  * [活动(mail_activity_redirect_view)](app/view/mail_activity_redirect_view)
  * [活动类型(mail_activity_type_pickup_view)](app/view/mail_activity_type_pickup_view)
  * [公司(res_company_main_view)](app/view/res_company_main_view)
  * [联系人(res_partner_main_view)](app/view/res_partner_main_view)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>