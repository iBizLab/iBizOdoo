<p class="panel-title"><b>执行代码</b></p>

```javascript
// 获取表格控制器并进行存在性检查
var gridCtrl = view.getCtrl("GRID", "grid");
if (gridCtrl) {
  // 调用表格新建行方法
  await gridCtrl.newRow();
}

```
