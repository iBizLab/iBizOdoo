# 模型访问(ir_model_access_grid_view)  <!-- {docsify-ignore-all} -->



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
#### 搜索表单(searchform)
#### 工具栏(toolbar)

## 视图界面逻辑
  * newdata(预置新建数据逻辑)
  * opendata(预置打开数据逻辑)


### 关联界面行为
  * [模型访问(IR_MODEL_ACCESS)](module/base/ir_model_access) : [表格界面_删除操作](module/base/ir_model_access#界面行为)
  * [模型访问(IR_MODEL_ACCESS)](module/base/ir_model_access) : [表格界面_新建行](module/base/ir_model_access#界面行为)

### 关联视图
  * [模型访问(ir_model_access_edit_view)](app/view/ir_model_access_edit_view)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>