# 休息时间(resource_calendar_leaves_multi_data_view1)  <!-- {docsify-ignore-all} -->



## 控件
#### CAPTIONBAR(captionbar)
#### 数据表格(grid)
#### 搜索栏(searchbar)
#### 工具栏(toolbar)

## 视图界面逻辑
  * newdata(预置新建数据逻辑)
  * opendata(预置打开数据逻辑)


### 关联界面行为
  * [休假详细信息(RESOURCE_CALENDAR_LEAVES)](module/resource/resource_calendar_leaves) : [表格界面_新建操作](module/resource/resource_calendar_leaves#界面行为)

### 关联视图
  * [休假详细信息(resource_calendar_leaves_main_view)](app/view/resource_calendar_leaves_main_view)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>