# 休息时间(resource_calendar_leaves_multi_data_view)  <!-- {docsify-ignore-all} -->



## 控件
#### CAPTIONBAR(captionbar)
#### 数据表格(grid)

##### 部件逻辑
* `onMounted`
```
var gridCtrl = view.getCtrl("GRID", "grid");
if (gridCtrl) {
  gridCtrl.state.rowEditOpen=true;
}
```
#### 搜索栏(searchbar)
#### 工具栏(toolbar)

## 视图界面逻辑
  * newdata(预置新建数据逻辑)
  * opendata(预置打开数据逻辑)


### 关联界面行为
  * [休假详细信息(RESOURCE_CALENDAR_LEAVES)](module/resource/resource_calendar_leaves) : [表格新建行_脚本](module/resource/resource_calendar_leaves#界面行为)

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