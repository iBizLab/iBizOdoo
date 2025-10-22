## 表格新建行 <!-- {docsify-ignore-all} -->

   

### 处理过程

```plantuml
@startuml
hide footbox
<style>
root {
  HyperlinkColor #42b983
}
</style>

hide empty description
state "开始" as Begin <<start>> [[$./new_row#begin {开始}]]
state "新建行" as RAWJSCODE_01  [[$./new_row#rawjscode_01 {新建行}]]
state "结束" as END_01 <<end>> [[$./new_row#end_01 {结束}]]


Begin --> RAWJSCODE_01
RAWJSCODE_01 --> END_01


@enduml
```


### 处理步骤说明

#### 新建行 :id=RAWJSCODE_01<sup class="footnote-symbol"> <font color=gray size=1>[直接前台代码]</font></sup>



<p class="panel-title"><b>执行代码</b></p>

```javascript
// 获取表格控制器并进行存在性检查
var gridCtrl = view.getCtrl("GRID", "grid");
if (gridCtrl) {
  // 调用表格新建行方法
  await gridCtrl.newRow();
}

```

#### 开始 :id=Begin<sup class="footnote-symbol"> <font color=gray size=1>[开始]</font></sup>




#### 结束 :id=END_01<sup class="footnote-symbol"> <font color=gray size=1>[结束]</font></sup>






### 实体逻辑参数

|    中文名   |    代码名    |  数据类型      |备注 |
| --------| --------| --------  | --------   |
|传入变量(<i class="fa fa-check"/></i>)|Default|数据对象||
