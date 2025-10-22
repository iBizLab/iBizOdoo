<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
// 获取默认参数对象
def _default = logic.param("Default").getReal()
// 获取过滤器参数实际对象
def filterEntity = logic.param("filterParam").getReal()

// 获取子实体运行时
def childDataDataEntityRuntime = net.ibizsys.runtime.util.DataEntityRuntimeHolder.peekChildDataEntityRuntime()

//获取跟踪属性名
def filterField = "__None__"
def psDEFieldList = childDataDataEntityRuntime.getPSDataEntity().getAllPSDEFields();
if(!org.springframework.util.ObjectUtils.isEmpty(psDEFieldList)) {
  for(def iPSDEField : psDEFieldList) {
      String strTag = iPSDEField.getFieldTag();
      if (!org.springframework.util.StringUtils.hasLength(strTag)) {
          continue;
      }
      if("DURATION_TRACK".equals(strTag)){
        filterField = iPSDEField.getName();
        break;
      }
  }
}

// 直接设置属性值
filterEntity.set("n_res_id_eq", _default.get("id"))
filterEntity.set("n_model_eq", childDataDataEntityRuntime.getName())
filterEntity.set("n_field_id_eq", filterField)
filterEntity.set("size", 100)

```
