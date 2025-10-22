# 基础模块(base) <!-- {docsify-ignore-all} -->



### 实体

|    名称col200   | 代码名col150      |  实体类型col150   | 存储模式col100 | 表名称col200   |    联合主键col100   |  主状态col100   |  权限控制col150  |  启用审计col100    |  备注col500  |
| --------  |------------| -----   |  --------|  --------|  --------|    -------- | -------- | -------- |-------- |
|[头像混合(AVATAR_MIXIN)](module/base/avatar_mixin)|avatar_mixin|主实体|无存储||否|否|自控制|否||
|[用户，更改密码向导(CHANGE_PASSWORD_OWN)](module/base/change_password_own)|change_password_own|主实体|SQL|change_password_own|否|否|自控制|否||
|[用户，更改密码向导(CHANGE_PASSWORD_USER)](module/base/change_password_user)|change_password_user|主实体|SQL|change_password_user|否|否|自控制|否||
|[修改密码向导(CHANGE_PASSWORD_WIZARD)](module/base/change_password_wizard)|change_password_wizard|主实体|SQL|change_password_wizard|否|否|自控制|否||
|[变更生产数量(CHANGE_PRODUCTION_QTY)](module/base/change_production_qty)|change_production_qty|主实体|SQL|change_production_qty|否|否|自控制|否||
|[集成应用(HUB_APP)](module/base/hub_app)|hub_app|主实体|SQL|hub_app|否|否|自控制|否||
|[图片混合(IMAGE_MIXIN)](module/base/image_mixin)|image_mixin|主实体|无存储||否|否|自控制|否|文件、图片属性应当特殊标记，保存是转为由attachment实体进行保存。当前临时使用逻辑附加进行保存模式确认|
|[服务器动作(IR_ACTIONS_SERVER)](module/base/ir_actions_server)|ir_actions_server|主实体|SQL|ir_actions_server|否|否|自控制|否||
|[附件(IR_ATTACHMENT)](module/base/ir_attachment)|ir_attachment|主实体|SQL|ir_attachment|否|否|自控制|否||
|[系统参数(IR_CONFIG_PARAMETER)](module/base/ir_config_parameter)|ir_config_parameter|主实体|SQL|ir_config_parameter|是|否|自控制|否||
|[计划的操作(IR_CRON)](module/base/ir_cron)|ir_cron|主实体|SQL|ir_cron|否|否|自控制|否||
|[预定操作进度(IR_CRON_PROGRESS)](module/base/ir_cron_progress)|ir_cron_progress|主实体|SQL|ir_cron_progress|否|否|自控制|否||
|[触发行动(IR_CRON_TRIGGER)](module/base/ir_cron_trigger)|ir_cron_trigger|主实体|SQL|ir_cron_trigger|否|否|自控制|否||
|[默认值(IR_DEFAULT)](module/base/ir_default)|ir_default|主实体|SQL|ir_default|是|否|自控制|否||
|[邮件服务器(IR_MAIL_SERVER)](module/base/ir_mail_server)|ir_mail_server|主实体|SQL|ir_mail_server|否|否|自控制|否||
|[模型(IR_MODEL)](module/base/ir_model)|ir_model|主实体|SQL|ir_model|否|否|自控制|否||
|[模型访问(IR_MODEL_ACCESS)](module/base/ir_model_access)|ir_model_access|主实体|SQL|ir_model_access|否|否|自控制|否||
|[模块限制(IR_MODEL_CONSTRAINT)](module/base/ir_model_constraint)|ir_model_constraint|主实体|SQL|ir_model_constraint|否|否|自控制|否||
|[模型数据(IR_MODEL_DATA)](module/base/ir_model_data)|ir_model_data|主实体|SQL|ir_model_data|否|否|自控制|否||
|[字段(IR_MODEL_FIELDS)](module/base/ir_model_fields)|ir_model_fields|主实体|SQL|ir_model_fields|否|否|自控制|否||
|[字段选择(IR_MODEL_FIELDS_SELECTION)](module/base/ir_model_fields_selection)|ir_model_fields_selection|主实体|SQL|ir_model_fields_selection|否|否|自控制|否||
|[模型继承树(IR_MODEL_INHERIT)](module/base/ir_model_inherit)|ir_model_inherit|主实体|SQL|ir_model_inherit|否|否|自控制|否||
|[关系模型(IR_MODEL_RELATION)](module/base/ir_model_relation)|ir_model_relation|主实体|SQL|ir_model_relation|否|否|自控制|否||
|[应用(IR_MODULE_CATEGORY)](module/base/ir_module_category)|ir_module_category|主实体|SQL|ir_module_category|否|否|自控制|否||
|[模块(IR_MODULE_MODULE)](module/base/ir_module_module)|ir_module_module|主实体|SQL|ir_module_module|否|否|自控制|否||
|[模块依赖性(IR_MODULE_MODULE_DEPENDENCY)](module/base/ir_module_module_dependency)|ir_module_module_dependency|主实体|SQL|ir_module_module_dependency|否|否|自控制|否||
|[模块排除(IR_MODULE_MODULE_EXCLUSION)](module/base/ir_module_module_exclusion)|ir_module_module_exclusion|主实体|SQL|ir_module_module_exclusion|否|否|自控制|否||
|[规则(IR_RULE)](module/base/ir_rule)|ir_rule|主实体|SQL|ir_rule|否|否|自控制|否||
|[序列(IR_SEQUENCE)](module/base/ir_sequence)|ir_sequence|主实体|SQL|ir_sequence|否|否|自控制|否||
|[银行(RES_BANK)](module/base/res_bank)|res_bank|主实体|SQL|res_bank|否|否|自控制|否||
|[公司(RES_COMPANY)](module/base/res_company)|res_company|主实体|SQL|res_company|否|否|自控制|否||
|[配置(RES_CONFIG)](module/base/res_config)|res_config|主实体|SQL|res_config|否|否|自控制|否||
|[配置设定(RES_CONFIG_SETTINGS)](module/base/res_config_settings)|res_config_settings|主实体|SQL|res_config_settings|否|否|自控制|否||
|[国家/地区(RES_COUNTRY)](module/base/res_country)|res_country|主实体|SQL|res_country|否|否|自控制|否||
|[国家/地区组(RES_COUNTRY_GROUP)](module/base/res_country_group)|res_country_group|主实体|SQL|res_country_group|否|否|自控制|否||
|[国家省/州(RES_COUNTRY_STATE)](module/base/res_country_state)|res_country_state|主实体|SQL|res_country_state|否|否|自控制|否||
|[币别(RES_CURRENCY)](module/base/res_currency)|res_currency|主实体|SQL|res_currency|否|否|自控制|否||
|[汇率(RES_CURRENCY_RATE)](module/base/res_currency_rate)|res_currency_rate|主实体|SQL|res_currency_rate|否|否|自控制|否||
|[设备(RES_DEVICE)](module/base/res_device)|res_device|主实体|SQL|res_device|否|否|自控制|否||
|[设备记录(RES_DEVICE_LOG)](module/base/res_device_log)|res_device_log|主实体|SQL|res_device_log|否|否|自控制|否||
|[权限组(RES_GROUPS)](module/base/res_groups)|res_groups|主实体|SQL|res_groups|否|否|自控制|否||
|[权限组继承(RES_GROUPS_IMPLIED_REL)](module/base/res_groups_implied_rel)|res_groups_implied_rel|关系实体|SQL|res_groups_implied_rel|是|否|附属主实体控制|否||
|[权限组成员(RES_GROUPS_USERS_REL)](module/base/res_groups_users_rel)|res_groups_users_rel|关系实体|SQL|res_groups_users_rel|是|否|附属主实体控制|否|NN中间表|
|[语言(RES_LANG)](module/base/res_lang)|res_lang|主实体|SQL|res_lang|否|否|自控制|否||
|[联系人(RES_PARTNER)](module/base/res_partner)|res_partner|主实体|SQL|res_partner|否|否|自控制|否||
|[合作伙伴自动完成同步(RES_PARTNER_AUTOCOMPLETE_SYNC)](module/base/res_partner_autocomplete_sync)|res_partner_autocomplete_sync|主实体|SQL|res_partner_autocomplete_sync|否|否|自控制|否||
|[银行账号(RES_PARTNER_BANK)](module/base/res_partner_bank)|res_partner_bank|主实体|SQL|res_partner_bank|否|否|自控制|否||
|[联系人标签(RES_PARTNER_CATEGORY)](module/base/res_partner_category)|res_partner_category|主实体|SQL|res_partner_category|否|否|自控制|否||
|[行业(RES_PARTNER_INDUSTRY)](module/base/res_partner_industry)|res_partner_industry|主实体|SQL|res_partner_industry|否|否|自控制|否||
|[合作伙伴标题(RES_PARTNER_TITLE)](module/base/res_partner_title)|res_partner_title|主实体|SQL|res_partner_title|否|否|自控制|否||
|[用户(RES_USERS)](module/base/res_users)|res_users|主实体|SQL|res_users|否|否|自控制|否||
|[用户 API 密钥(RES_USERS_APIKEYS)](module/base/res_users_apikeys)|res_users_apikeys|主实体|SQL|res_users_apikeys|否|否|自控制|否||
|[API 密钥说明(RES_USERS_APIKEYS_DESCRIPTION)](module/base/res_users_apikeys_description)|res_users_apikeys_description|主实体|SQL|res_users_apikeys_description|否|否|自控制|否||
|[显示应用程序接口密钥(RES_USERS_APIKEYS_SHOW)](module/base/res_users_apikeys_show)|res_users_apikeys_show|主实体|SQL|res_users_apikeys_show|否|否|自控制|否||
|[用户删除请求(RES_USERS_DELETION)](module/base/res_users_deletion)|res_users_deletion|主实体|SQL|res_users_deletion|否|否|自控制|否||
|[密码检查向导(RES_USERS_IDENTITYCHECK)](module/base/res_users_identitycheck)|res_users_identitycheck|主实体|SQL|res_users_identitycheck|否|否|自控制|否||
|[用户日志(RES_USERS_LOG)](module/base/res_users_log)|res_users_log|主实体|SQL|res_users_log|否|否|自控制|否||
|[用户设置(RES_USERS_SETTINGS)](module/base/res_users_settings)|res_users_settings|主实体|SQL|res_users_settings|否|否|自控制|否||
|[用户设置数量(RES_USERS_SETTINGS_VOLUMES)](module/base/res_users_settings_volumes)|res_users_settings_volumes|主实体|SQL|res_users_settings_volumes|否|否|自控制|否||
|[权限组关联规则(RULE_GROUP_REL)](module/base/rule_group_rel)|rule_group_rel|关系实体|SQL|rule_group_rel|是|否|附属主实体控制|否||

