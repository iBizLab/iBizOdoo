# 应用分类(ir_module_category_grid_view)  <!-- {docsify-ignore-all} -->



## 控件
#### CAPTIONBAR(captionbar)
#### 数据表格(grid)
#### 搜索栏(searchbar)
#### 搜索表单(searchform)
#### 工具栏(toolbar)

## 视图界面逻辑
  * newdata(预置新建数据逻辑)
  * opendata(预置打开数据逻辑)


### 关联界面行为
  * [应用(IR_MODULE_CATEGORY)](module/base/ir_module_category) : [表格界面_新建操作](module/base/ir_module_category#界面行为)
  * [应用(IR_MODULE_CATEGORY)](module/base/ir_module_category) : [表格界面_导出数据模型](module/base/ir_module_category#界面行为)
  * [应用(IR_MODULE_CATEGORY)](module/base/ir_module_category) : [表格界面_删除操作](module/base/ir_module_category#界面行为)
  * [应用(IR_MODULE_CATEGORY)](module/base/ir_module_category) : [表格界面_编辑操作](module/base/ir_module_category#界面行为)

### 关联视图
  * [应用(ir_module_category_edit_view)](app/view/ir_module_category_edit_view)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>