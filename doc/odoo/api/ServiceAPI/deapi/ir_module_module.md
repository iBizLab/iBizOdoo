# 模块(ir_module_module) :id=ir_module_module
## 创建模块

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/ir_module_modules" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">app_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|应用标识|
|<el-row justify="space-between"><el-col :span="20">order</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|排序值|
|<el-row justify="space-between"><el-col :span="20">res_code</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|资源标识|
|<el-row justify="space-between"><el-col :span="20">application</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|应用|
|<el-row justify="space-between"><el-col :span="20">author</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|作者|
|<el-row justify="space-between"><el-col :span="20">auto_install</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|自动安装|
|<el-row justify="space-between"><el-col :span="20">category_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|类别|
|<el-row justify="space-between"><el-col :span="20">contributors</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|协作者|
|<el-row justify="space-between"><el-col :span="20">demo</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|演示数据|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">icon</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|图标网址|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">imported</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|导入的模块|
|<el-row justify="space-between"><el-col :span="20">latest_version</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|已安装版本|
|<el-row justify="space-between"><el-col :span="20">license</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|许可证|
|<el-row justify="space-between"><el-col :span="20">maintainer</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|维护者|
|<el-row justify="space-between"><el-col :span="20">menus_by_module</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|菜单|
|<el-row justify="space-between"><el-col :span="20">module_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|模块类型|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">published_version</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|出版版本|
|<el-row justify="space-between"><el-col :span="20">reports_by_module</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|报表|
|<el-row justify="space-between"><el-col :span="20">sequence</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|序列|
|<el-row justify="space-between"><el-col :span="20">shortdesc</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|模块名|
|<el-row justify="space-between"><el-col :span="20">state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|状态|
|<el-row justify="space-between"><el-col :span="20">summary</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|摘要|
|<el-row justify="space-between"><el-col :span="20">to_buy</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|ERP 企业版专属模块|
|<el-row justify="space-between"><el-col :span="20">url</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|URL|
|<el-row justify="space-between"><el-col :span="20">views_by_module</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|视图|
|<el-row justify="space-between"><el-col :span="20">website</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|网站|



##### 请求示例： {docsify-ignore}
```json
{
  "app_id" : null,
  "order" : null,
  "res_code" : null,
  "application" : null,
  "author" : null,
  "auto_install" : null,
  "category_id" : null,
  "contributors" : null,
  "create_date" : null,
  "create_uid" : null,
  "demo" : null,
  "description" : null,
  "display_name" : null,
  "icon" : null,
  "id" : null,
  "imported" : null,
  "latest_version" : null,
  "license" : null,
  "maintainer" : null,
  "menus_by_module" : null,
  "module_type" : null,
  "name" : null,
  "published_version" : null,
  "reports_by_module" : null,
  "sequence" : null,
  "shortdesc" : null,
  "state" : null,
  "summary" : null,
  "to_buy" : null,
  "url" : null,
  "views_by_module" : null,
  "website" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "app_id" : null,
  "order" : null,
  "res_code" : null,
  "application" : null,
  "author" : null,
  "auto_install" : null,
  "category_id" : null,
  "contributors" : null,
  "create_date" : null,
  "create_uid" : null,
  "demo" : null,
  "description" : null,
  "display_name" : null,
  "icon" : null,
  "id" : null,
  "imported" : null,
  "latest_version" : null,
  "license" : null,
  "maintainer" : null,
  "menus_by_module" : null,
  "module_type" : null,
  "name" : null,
  "published_version" : null,
  "reports_by_module" : null,
  "sequence" : null,
  "shortdesc" : null,
  "state" : null,
  "summary" : null,
  "to_buy" : null,
  "url" : null,
  "views_by_module" : null,
  "website" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 获取模块

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/ir_module_modules/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|标识|




##### 响应示例： {docsify-ignore}
```json

{
  "app_id" : null,
  "order" : null,
  "res_code" : null,
  "application" : null,
  "author" : null,
  "auto_install" : null,
  "category_id" : null,
  "contributors" : null,
  "create_date" : null,
  "create_uid" : null,
  "demo" : null,
  "description" : null,
  "display_name" : null,
  "icon" : null,
  "id" : null,
  "imported" : null,
  "latest_version" : null,
  "license" : null,
  "maintainer" : null,
  "menus_by_module" : null,
  "module_type" : null,
  "name" : null,
  "published_version" : null,
  "reports_by_module" : null,
  "sequence" : null,
  "shortdesc" : null,
  "state" : null,
  "summary" : null,
  "to_buy" : null,
  "url" : null,
  "views_by_module" : null,
  "website" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 删除模块

<el-row>
<div style="width: 80px">
<el-alert center title="DELETE" type="error" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/ir_module_modules/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`DELETE`

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|标识|





## 更新模块

<el-row>
<div style="width: 80px">
<el-alert center title="PUT" type="warning" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/ir_module_modules/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`UPDATE`

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|标识|



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">app_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|应用标识|
|<el-row justify="space-between"><el-col :span="20">order</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|排序值|
|<el-row justify="space-between"><el-col :span="20">res_code</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|资源标识|
|<el-row justify="space-between"><el-col :span="20">application</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|应用|
|<el-row justify="space-between"><el-col :span="20">author</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|作者|
|<el-row justify="space-between"><el-col :span="20">auto_install</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|自动安装|
|<el-row justify="space-between"><el-col :span="20">category_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|类别|
|<el-row justify="space-between"><el-col :span="20">contributors</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|协作者|
|<el-row justify="space-between"><el-col :span="20">demo</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|演示数据|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">icon</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|图标网址|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">imported</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|导入的模块|
|<el-row justify="space-between"><el-col :span="20">latest_version</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|已安装版本|
|<el-row justify="space-between"><el-col :span="20">license</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|许可证|
|<el-row justify="space-between"><el-col :span="20">maintainer</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|维护者|
|<el-row justify="space-between"><el-col :span="20">menus_by_module</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|菜单|
|<el-row justify="space-between"><el-col :span="20">module_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|模块类型|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">published_version</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|出版版本|
|<el-row justify="space-between"><el-col :span="20">reports_by_module</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|报表|
|<el-row justify="space-between"><el-col :span="20">sequence</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|序列|
|<el-row justify="space-between"><el-col :span="20">shortdesc</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|模块名|
|<el-row justify="space-between"><el-col :span="20">state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|状态|
|<el-row justify="space-between"><el-col :span="20">summary</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|摘要|
|<el-row justify="space-between"><el-col :span="20">to_buy</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|ERP 企业版专属模块|
|<el-row justify="space-between"><el-col :span="20">url</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|URL|
|<el-row justify="space-between"><el-col :span="20">views_by_module</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|视图|
|<el-row justify="space-between"><el-col :span="20">website</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|网站|



##### 请求示例： {docsify-ignore}
```json
{
  "app_id" : null,
  "order" : null,
  "res_code" : null,
  "application" : null,
  "author" : null,
  "auto_install" : null,
  "category_id" : null,
  "contributors" : null,
  "create_date" : null,
  "create_uid" : null,
  "demo" : null,
  "description" : null,
  "display_name" : null,
  "icon" : null,
  "id" : null,
  "imported" : null,
  "latest_version" : null,
  "license" : null,
  "maintainer" : null,
  "menus_by_module" : null,
  "module_type" : null,
  "name" : null,
  "published_version" : null,
  "reports_by_module" : null,
  "sequence" : null,
  "shortdesc" : null,
  "state" : null,
  "summary" : null,
  "to_buy" : null,
  "url" : null,
  "views_by_module" : null,
  "website" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "app_id" : null,
  "order" : null,
  "res_code" : null,
  "application" : null,
  "author" : null,
  "auto_install" : null,
  "category_id" : null,
  "contributors" : null,
  "create_date" : null,
  "create_uid" : null,
  "demo" : null,
  "description" : null,
  "display_name" : null,
  "icon" : null,
  "id" : null,
  "imported" : null,
  "latest_version" : null,
  "license" : null,
  "maintainer" : null,
  "menus_by_module" : null,
  "module_type" : null,
  "name" : null,
  "published_version" : null,
  "reports_by_module" : null,
  "sequence" : null,
  "shortdesc" : null,
  "state" : null,
  "summary" : null,
  "to_buy" : null,
  "url" : null,
  "views_by_module" : null,
  "website" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 检查模块主键

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/ir_module_modules/check_key" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">app_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|应用标识|
|<el-row justify="space-between"><el-col :span="20">order</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|排序值|
|<el-row justify="space-between"><el-col :span="20">res_code</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|资源标识|
|<el-row justify="space-between"><el-col :span="20">application</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|应用|
|<el-row justify="space-between"><el-col :span="20">author</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|作者|
|<el-row justify="space-between"><el-col :span="20">auto_install</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|自动安装|
|<el-row justify="space-between"><el-col :span="20">category_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|类别|
|<el-row justify="space-between"><el-col :span="20">contributors</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|协作者|
|<el-row justify="space-between"><el-col :span="20">demo</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|演示数据|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">icon</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|图标网址|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">imported</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|导入的模块|
|<el-row justify="space-between"><el-col :span="20">latest_version</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|已安装版本|
|<el-row justify="space-between"><el-col :span="20">license</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|许可证|
|<el-row justify="space-between"><el-col :span="20">maintainer</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|维护者|
|<el-row justify="space-between"><el-col :span="20">menus_by_module</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|菜单|
|<el-row justify="space-between"><el-col :span="20">module_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|模块类型|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">published_version</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|出版版本|
|<el-row justify="space-between"><el-col :span="20">reports_by_module</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|报表|
|<el-row justify="space-between"><el-col :span="20">sequence</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|序列|
|<el-row justify="space-between"><el-col :span="20">shortdesc</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|模块名|
|<el-row justify="space-between"><el-col :span="20">state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|状态|
|<el-row justify="space-between"><el-col :span="20">summary</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|摘要|
|<el-row justify="space-between"><el-col :span="20">to_buy</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|ERP 企业版专属模块|
|<el-row justify="space-between"><el-col :span="20">url</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|URL|
|<el-row justify="space-between"><el-col :span="20">views_by_module</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|视图|
|<el-row justify="space-between"><el-col :span="20">website</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|网站|



##### 请求示例： {docsify-ignore}
```json
{
  "app_id" : null,
  "order" : null,
  "res_code" : null,
  "application" : null,
  "author" : null,
  "auto_install" : null,
  "category_id" : null,
  "contributors" : null,
  "create_date" : null,
  "create_uid" : null,
  "demo" : null,
  "description" : null,
  "display_name" : null,
  "icon" : null,
  "id" : null,
  "imported" : null,
  "latest_version" : null,
  "license" : null,
  "maintainer" : null,
  "menus_by_module" : null,
  "module_type" : null,
  "name" : null,
  "published_version" : null,
  "reports_by_module" : null,
  "sequence" : null,
  "shortdesc" : null,
  "state" : null,
  "summary" : null,
  "to_buy" : null,
  "url" : null,
  "views_by_module" : null,
  "website" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
Integer
```

## 获取模块草稿

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/ir_module_modules/get_draft" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">app_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|应用标识|
|<el-row justify="space-between"><el-col :span="20">order</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|排序值|
|<el-row justify="space-between"><el-col :span="20">res_code</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|资源标识|
|<el-row justify="space-between"><el-col :span="20">application</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|应用|
|<el-row justify="space-between"><el-col :span="20">author</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|作者|
|<el-row justify="space-between"><el-col :span="20">auto_install</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|自动安装|
|<el-row justify="space-between"><el-col :span="20">category_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|类别|
|<el-row justify="space-between"><el-col :span="20">contributors</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|协作者|
|<el-row justify="space-between"><el-col :span="20">demo</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|演示数据|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">icon</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|图标网址|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">imported</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|导入的模块|
|<el-row justify="space-between"><el-col :span="20">latest_version</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|已安装版本|
|<el-row justify="space-between"><el-col :span="20">license</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|许可证|
|<el-row justify="space-between"><el-col :span="20">maintainer</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|维护者|
|<el-row justify="space-between"><el-col :span="20">menus_by_module</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|菜单|
|<el-row justify="space-between"><el-col :span="20">module_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|模块类型|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">published_version</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|出版版本|
|<el-row justify="space-between"><el-col :span="20">reports_by_module</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|报表|
|<el-row justify="space-between"><el-col :span="20">sequence</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|序列|
|<el-row justify="space-between"><el-col :span="20">shortdesc</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|模块名|
|<el-row justify="space-between"><el-col :span="20">state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|状态|
|<el-row justify="space-between"><el-col :span="20">summary</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|摘要|
|<el-row justify="space-between"><el-col :span="20">to_buy</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|ERP 企业版专属模块|
|<el-row justify="space-between"><el-col :span="20">url</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|URL|
|<el-row justify="space-between"><el-col :span="20">views_by_module</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|视图|
|<el-row justify="space-between"><el-col :span="20">website</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|网站|



##### 请求示例： {docsify-ignore}
```json
{
  "app_id" : null,
  "order" : null,
  "res_code" : null,
  "application" : null,
  "author" : null,
  "auto_install" : null,
  "category_id" : null,
  "contributors" : null,
  "create_date" : null,
  "create_uid" : null,
  "demo" : null,
  "description" : null,
  "display_name" : null,
  "icon" : null,
  "id" : null,
  "imported" : null,
  "latest_version" : null,
  "license" : null,
  "maintainer" : null,
  "menus_by_module" : null,
  "module_type" : null,
  "name" : null,
  "published_version" : null,
  "reports_by_module" : null,
  "sequence" : null,
  "shortdesc" : null,
  "state" : null,
  "summary" : null,
  "to_buy" : null,
  "url" : null,
  "views_by_module" : null,
  "website" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "app_id" : null,
  "order" : null,
  "res_code" : null,
  "application" : null,
  "author" : null,
  "auto_install" : null,
  "category_id" : null,
  "contributors" : null,
  "create_date" : null,
  "create_uid" : null,
  "demo" : null,
  "description" : null,
  "display_name" : null,
  "icon" : null,
  "id" : null,
  "imported" : null,
  "latest_version" : null,
  "license" : null,
  "maintainer" : null,
  "menus_by_module" : null,
  "module_type" : null,
  "name" : null,
  "published_version" : null,
  "reports_by_module" : null,
  "sequence" : null,
  "shortdesc" : null,
  "state" : null,
  "summary" : null,
  "to_buy" : null,
  "url" : null,
  "views_by_module" : null,
  "website" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 保存模块

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/ir_module_modules/save" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">app_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|应用标识|
|<el-row justify="space-between"><el-col :span="20">order</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|排序值|
|<el-row justify="space-between"><el-col :span="20">res_code</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|资源标识|
|<el-row justify="space-between"><el-col :span="20">application</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|应用|
|<el-row justify="space-between"><el-col :span="20">author</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|作者|
|<el-row justify="space-between"><el-col :span="20">auto_install</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|自动安装|
|<el-row justify="space-between"><el-col :span="20">category_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|类别|
|<el-row justify="space-between"><el-col :span="20">contributors</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|协作者|
|<el-row justify="space-between"><el-col :span="20">demo</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|演示数据|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">icon</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|图标网址|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">imported</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|导入的模块|
|<el-row justify="space-between"><el-col :span="20">latest_version</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|已安装版本|
|<el-row justify="space-between"><el-col :span="20">license</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|许可证|
|<el-row justify="space-between"><el-col :span="20">maintainer</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|维护者|
|<el-row justify="space-between"><el-col :span="20">menus_by_module</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|菜单|
|<el-row justify="space-between"><el-col :span="20">module_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|模块类型|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">published_version</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|出版版本|
|<el-row justify="space-between"><el-col :span="20">reports_by_module</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|报表|
|<el-row justify="space-between"><el-col :span="20">sequence</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|序列|
|<el-row justify="space-between"><el-col :span="20">shortdesc</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|模块名|
|<el-row justify="space-between"><el-col :span="20">state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|状态|
|<el-row justify="space-between"><el-col :span="20">summary</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|摘要|
|<el-row justify="space-between"><el-col :span="20">to_buy</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|ERP 企业版专属模块|
|<el-row justify="space-between"><el-col :span="20">url</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|URL|
|<el-row justify="space-between"><el-col :span="20">views_by_module</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|视图|
|<el-row justify="space-between"><el-col :span="20">website</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|网站|



##### 请求示例： {docsify-ignore}
```json
{
  "app_id" : null,
  "order" : null,
  "res_code" : null,
  "application" : null,
  "author" : null,
  "auto_install" : null,
  "category_id" : null,
  "contributors" : null,
  "create_date" : null,
  "create_uid" : null,
  "demo" : null,
  "description" : null,
  "display_name" : null,
  "icon" : null,
  "id" : null,
  "imported" : null,
  "latest_version" : null,
  "license" : null,
  "maintainer" : null,
  "menus_by_module" : null,
  "module_type" : null,
  "name" : null,
  "published_version" : null,
  "reports_by_module" : null,
  "sequence" : null,
  "shortdesc" : null,
  "state" : null,
  "summary" : null,
  "to_buy" : null,
  "url" : null,
  "views_by_module" : null,
  "website" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "app_id" : null,
  "order" : null,
  "res_code" : null,
  "application" : null,
  "author" : null,
  "auto_install" : null,
  "category_id" : null,
  "contributors" : null,
  "create_date" : null,
  "create_uid" : null,
  "demo" : null,
  "description" : null,
  "display_name" : null,
  "icon" : null,
  "id" : null,
  "imported" : null,
  "latest_version" : null,
  "license" : null,
  "maintainer" : null,
  "menus_by_module" : null,
  "module_type" : null,
  "name" : null,
  "published_version" : null,
  "reports_by_module" : null,
  "sequence" : null,
  "shortdesc" : null,
  "state" : null,
  "summary" : null,
  "to_buy" : null,
  "url" : null,
  "views_by_module" : null,
  "website" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 当前用户授权应用

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/ir_module_modules/fetch_cur_user_app" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_category_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|类别|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_license_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|许可证|
|<el-row justify="space-between"><el-col :span="20">n_module_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|模块类型|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">n_state_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|状态|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_category_id_eq" : null,
  "n_id_eq" : null,
  "n_license_eq" : null,
  "n_module_type_eq" : null,
  "n_name_like" : null,
  "n_state_eq" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "app_id" : null,
    "order" : null,
    "res_code" : null,
    "application" : null,
    "author" : null,
    "auto_install" : null,
    "category_id" : null,
    "contributors" : null,
    "create_date" : null,
    "create_uid" : null,
    "demo" : null,
    "description" : null,
    "display_name" : null,
    "icon" : null,
    "id" : null,
    "imported" : null,
    "latest_version" : null,
    "license" : null,
    "maintainer" : null,
    "menus_by_module" : null,
    "module_type" : null,
    "name" : null,
    "published_version" : null,
    "reports_by_module" : null,
    "sequence" : null,
    "shortdesc" : null,
    "state" : null,
    "summary" : null,
    "to_buy" : null,
    "url" : null,
    "views_by_module" : null,
    "website" : null,
    "write_date" : null,
    "write_uid" : null,
  }
]
```

## DEFAULT

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/ir_module_modules/fetch_default" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_category_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|类别|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_license_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|许可证|
|<el-row justify="space-between"><el-col :span="20">n_module_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|模块类型|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">n_state_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|状态|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_category_id_eq" : null,
  "n_id_eq" : null,
  "n_license_eq" : null,
  "n_module_type_eq" : null,
  "n_name_like" : null,
  "n_state_eq" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "app_id" : null,
    "order" : null,
    "res_code" : null,
    "application" : null,
    "author" : null,
    "auto_install" : null,
    "category_id" : null,
    "contributors" : null,
    "create_date" : null,
    "create_uid" : null,
    "demo" : null,
    "description" : null,
    "display_name" : null,
    "icon" : null,
    "id" : null,
    "imported" : null,
    "latest_version" : null,
    "license" : null,
    "maintainer" : null,
    "menus_by_module" : null,
    "module_type" : null,
    "name" : null,
    "published_version" : null,
    "reports_by_module" : null,
    "sequence" : null,
    "shortdesc" : null,
    "state" : null,
    "summary" : null,
    "to_buy" : null,
    "url" : null,
    "views_by_module" : null,
    "website" : null,
    "write_date" : null,
    "write_uid" : null,
  }
]
```

## 已安装应用

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/ir_module_modules/fetch_installed" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_category_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|类别|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_license_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|许可证|
|<el-row justify="space-between"><el-col :span="20">n_module_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|模块类型|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">n_state_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|状态|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_category_id_eq" : null,
  "n_id_eq" : null,
  "n_license_eq" : null,
  "n_module_type_eq" : null,
  "n_name_like" : null,
  "n_state_eq" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "app_id" : null,
    "order" : null,
    "res_code" : null,
    "application" : null,
    "author" : null,
    "auto_install" : null,
    "category_id" : null,
    "contributors" : null,
    "create_date" : null,
    "create_uid" : null,
    "demo" : null,
    "description" : null,
    "display_name" : null,
    "icon" : null,
    "id" : null,
    "imported" : null,
    "latest_version" : null,
    "license" : null,
    "maintainer" : null,
    "menus_by_module" : null,
    "module_type" : null,
    "name" : null,
    "published_version" : null,
    "reports_by_module" : null,
    "sequence" : null,
    "shortdesc" : null,
    "state" : null,
    "summary" : null,
    "to_buy" : null,
    "url" : null,
    "views_by_module" : null,
    "website" : null,
    "write_date" : null,
    "write_uid" : null,
  }
]
```

## 已安装应用

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/ir_module_modules/fetch_installed_app" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_category_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|类别|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_license_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|许可证|
|<el-row justify="space-between"><el-col :span="20">n_module_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|模块类型|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">n_state_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|状态|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_category_id_eq" : null,
  "n_id_eq" : null,
  "n_license_eq" : null,
  "n_module_type_eq" : null,
  "n_name_like" : null,
  "n_state_eq" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "app_id" : null,
    "order" : null,
    "res_code" : null,
    "application" : null,
    "author" : null,
    "auto_install" : null,
    "category_id" : null,
    "contributors" : null,
    "create_date" : null,
    "create_uid" : null,
    "demo" : null,
    "description" : null,
    "display_name" : null,
    "icon" : null,
    "id" : null,
    "imported" : null,
    "latest_version" : null,
    "license" : null,
    "maintainer" : null,
    "menus_by_module" : null,
    "module_type" : null,
    "name" : null,
    "published_version" : null,
    "reports_by_module" : null,
    "sequence" : null,
    "shortdesc" : null,
    "state" : null,
    "summary" : null,
    "to_buy" : null,
    "url" : null,
    "views_by_module" : null,
    "website" : null,
    "write_date" : null,
    "write_uid" : null,
  }
]
```



## 下载导入模板
<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/ir_module_modules/importtemplate" type="info" :closable="false" ></el-alert>
</div>
</el-row>


##### 查询参数 {docsify-ignore}

|字段col300|类型col150|备注col400|
|---|---|----|
| srfimporttag | String | 导入标识 |



## 数据导出

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/ir_module_modules/exportdata/{param},/ir_module_modules/exportdata/{param}/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|param|String|导出集合方法名称|
|key|String|数据主键|

##### 查询参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|srfexporttag|String|导出模板标识|

##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|page|Integer|page|
|size|Integer|分页大小|
|n_xxx_eq|String|过滤参数|


## 数据导入

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/ir_module_modules/importdata" type="info" :closable="false" ></el-alert>
</div>
</el-row>

##### 查询参数 {docsify-ignore}

|字段col300|类型col150|备注col400|
|---|---|----|
| srfimporttag | String | 导入标识 |

##### 请求参数 {docsify-ignore}

|字段col300|类型col150|备注col400|
|---|---|----|
| file | file | 导入数据文具 |

## 数据导入（返回错误excel）

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/ir_module_modules/importdata2" type="info" :closable="false" ></el-alert>
</div>
</el-row>

##### 查询参数 {docsify-ignore}

|字段col300|类型col150|备注col400|
|---|---|----|
| srfimporttag | String | 导入标识 |

##### 请求参数 {docsify-ignore}

|字段col300|类型col150|备注col400|
|---|---|----|
| file | file | 导入数据文具 |

## 自定义表头导入（异步）
<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/ir_module_modules/asyncimportdata2" type="info" :closable="false" ></el-alert>
</div>
</el-row>

##### 查询参数 {docsify-ignore}

|字段col300|类型col150|备注col400|
|---|---|----|
| srfimporttag | String | 导入标识 |
| srfossfileid | String | 导入文件 |
| srfimportschemaid | String | 表头定义 |


## 数据打印
<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/ir_module_modules/printdata/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|数据主键|

##### 查询参数 {docsify-ignore}

|字段col300|类型col150|备注col400|
|---|---|----|
| srfprinttag | String | 打印标识 |
| srfcontenttype | String | 打印类型 |



## 报表打印

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/ir_module_modules/report" type="info" :closable="false" ></el-alert>
</div>
</el-row>


##### 查询参数 {docsify-ignore}

|字段col300|类型col150|备注col400|
|---|---|----|
| srfreporttag | String | 报表标识 |
| srfcontenttype | String | 报表类型 |




<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    },
    methods: {

    }
  }).use(ElementPlus).mount('#app')
</script>