# 员工标签(hr_employee_category_multi_data_view)  <!-- {docsify-ignore-all} -->



## 控件
#### CAPTIONBAR(captionbar)
#### 数据表格(grid)

##### 部件逻辑
* `onMounted`
```
console.log(11111111111111);
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
  * [员工类别(HR_EMPLOYEE_CATEGORY)](module/hr/hr_employee_category) : [表格新建行_脚本](module/hr/hr_employee_category#界面行为)

### 关联视图
  * [员工类别(hr_employee_category_edit_view)](app/view/hr_employee_category_edit_view)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>