# 工作时间表(resource_calendar_main_view)  <!-- {docsify-ignore-all} -->



## 控件
#### CAPTIONBAR(captionbar)
#### DATAINFOBAR(datainfobar)
#### 数据关系栏(drbar)
#### 编辑表单(form)
#### 工具栏(toolbar)
#### 工具栏(toolbar1)


### 关联界面行为
  * [资源工作时间(RESOURCE_CALENDAR)](module/resource/resource_calendar) : [编辑界面_保存操作](module/resource/resource_calendar#界面行为)
  * [资源工作时间(RESOURCE_CALENDAR)](module/resource/resource_calendar) : [取消变更](module/resource/resource_calendar#界面行为)
  * [资源工作时间(RESOURCE_CALENDAR)](module/resource/resource_calendar) : [编辑界面_保存并新建操作](module/resource/resource_calendar#界面行为)

### 关联视图
  * [公司(res_company_pickup_view)](app/view/res_company_pickup_view)
  * [工作细节(resource_calendar_attendance_grid_view_nested)](app/view/resource_calendar_attendance_grid_view_nested)
  * [休息时间(resource_calendar_leaves_multi_data_view)](app/view/resource_calendar_leaves_multi_data_view)
  * [休息时间(resource_calendar_leaves_multi_data_view1)](app/view/resource_calendar_leaves_multi_data_view1)
  * [资源(resource_resource_multi_data_view)](app/view/resource_resource_multi_data_view)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>