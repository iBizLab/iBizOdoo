<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
  def defaultListParam = []
  def moduleListParam= []
  def groupListParam= []
  def  configListParam= []
  
  // 获取实体运行时对象（通过逻辑参数中的实体参数）
  def _default = logic.param("Default")
  def entityRuntime = _default.getDataEntityRuntime()
  
  // 遍历属性进行分类
  entityRuntime.getPSDEFields(true).each { field ->
    def _name = field.getName()
    def fieldtag = field.getUserTag()
    if(_name.startsWith('default_')) {
      defaultListParam.add(_name)
    } else if(_name.startsWith('module_')) {
      moduleListParam.add(_name)
    } else if(_name.startsWith('group_')) {
      groupListParam.add(_name)
    } else if(fieldtag != null && fieldtag.startsWith('config_parameter')) {
      configListParam.add(_name)
    }
  }
  
  // 绑定更新后的列表到参数（如果需要显式绑定）
  logic.param("defaultList").bind(defaultListParam)
  logic.param("moduleList").bind(moduleListParam)
  logic.param("groupList").bind(groupListParam)
  logic.param("configList").bind(configListParam)

```
