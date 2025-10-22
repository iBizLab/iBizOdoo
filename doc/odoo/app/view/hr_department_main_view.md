# 部门(hr_department_main_view)  <!-- {docsify-ignore-all} -->



## 控件
#### CAPTIONBAR(captionbar)
#### 单视图面板(control)
#### DATAINFOBAR(datainfobar)
#### 数据关系栏(drbar)
#### 编辑表单(form)
#### 工具栏(toolbar)
#### 工具栏(toolbar1)


### 关联界面行为
  * [消息(MAIL_MESSAGE)](module/mail/mail_message) : [删除评论](module/mail/mail_message#界面行为)
  * [部门(HR_DEPARTMENT)](module/hr/hr_department) : [编辑界面_保存并新建操作](module/hr/hr_department#界面行为)
  * [消息(MAIL_MESSAGE)](module/mail/mail_message) : [回复](module/mail/mail_message#界面行为)
  * [邮件会话(MAIL_THREAD)](module/mail/mail_thread) : [清空评论](module/mail/mail_thread#界面行为)
  * [邮件会话(MAIL_THREAD)](module/mail/mail_thread) : [打开安排活动视图](module/mail/mail_thread#界面行为)
  * [邮件会话(MAIL_THREAD)](module/mail/mail_thread) : [发送评论](module/mail/mail_thread#界面行为)
  * [部门(HR_DEPARTMENT)](module/hr/hr_department) : [编辑界面_保存操作](module/hr/hr_department#界面行为)
  * [部门(HR_DEPARTMENT)](module/hr/hr_department) : [取消变更](module/hr/hr_department#界面行为)
  * [附件(IR_ATTACHMENT)](module/base/ir_attachment) : [附件下载](module/base/ir_attachment#界面行为)
  * [消息(MAIL_MESSAGE)](module/mail/mail_message) : [编辑](module/mail/mail_message#界面行为)
  * [邮件会话(MAIL_THREAD)](module/mail/mail_thread) : [添加附件](module/mail/mail_thread#界面行为)

### 关联界面逻辑
  * [附件(IR_ATTACHMENT)](module/base/ir_attachment) : [删除附件数据](module/base/ir_attachment/uilogic/delete_attachment)
  * [消息(MAIL_MESSAGE)](module/mail/mail_message) : [控制评论按钮显示](module/mail/mail_message/uilogic/comment_icon_show)
  * [消息(MAIL_MESSAGE)](module/mail/mail_message) : [控制评论按钮隐藏](module/mail/mail_message/uilogic/comment_icon_hidden)
  * [单据关注者(MAIL_FOLLOWERS)](module/mail/mail_followers) : [关注人员更新(嵌入)](module/mail/mail_followers/uilogic/attention_personnel_update_emb)

### 关联视图
  * [组织架构(hr_department_department_hierarchy_view)](app/view/hr_department_department_hierarchy_view)
  * [部门(hr_department_pickup_view)](app/view/hr_department_pickup_view)
  * [员工(hr_employee_multi_data_view)](app/view/hr_employee_multi_data_view)
  * [员工计划(mail_activity_plan_multi_data_view)](app/view/mail_activity_plan_multi_data_view)
  * [安排活动(mail_activity_schedule_quick_create_view)](app/view/mail_activity_schedule_quick_create_view)
  * [邮件会话(mail_thread_component_view)](app/view/mail_thread_component_view)
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