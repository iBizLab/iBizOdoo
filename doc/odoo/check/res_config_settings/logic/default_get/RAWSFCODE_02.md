<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def _default = logic.param("Default").getReal()
def parameter_temp = logic.param("parameter_temp").getReal()
_default.set(parameter_temp.get("key"),parameter_temp.get("value"))
```
