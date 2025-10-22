# 配置设定(res_config_settings)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|默认信用额度|ACCOUNT_DEFAULT_CREDIT_LIMIT|数值||是||
|有效用户数量|ACTIVE_USER_COUNT|整型||是||
|允许在登录页开启密码重置功能|AUTH_SIGNUP_RESET_PASSWORD|是否逻辑||是||
|用作通过注册创建的新用户的模版|AUTH_SIGNUP_TEMPLATE_USER_ID|外键值|100|是||
|客户帐号|AUTH_SIGNUP_UNINVITED|[单项选择(文本值)](index/dictionary_index#res_config_settings_auth_signup_uninvited "客户帐号")|60|是||
|自动发票|AUTOMATIC_INVOICE|是否逻辑||是||
|分隔符|BARCODE_SEPARATOR|文本，可指定长度|500|是||
|公司数量|COMPANY_COUNT|整型||是||
|公司|COMPANY_ID|外键值|100|否||
|公司信息|COMPANY_INFORMATIONS|长文本，没有长度限制|1048576|是||
|公司|COMPANY_NAME|外键值文本|200|否||
|建立时间|CREATE_DATE|日期时间型||否||
|建立人|CREATE_UID|文本，可指定长度|100|否||
|自动分配操作|CRM_AUTO_ASSIGNMENT_ACTION|[单项选择(文本值)](index/dictionary_index#res_config_settings_crm_auto_assignment_action "自动分配操作")|60|是||
|重复间隔为每|CRM_AUTO_ASSIGNMENT_INTERVAL_NUMBER|整型||是||
|自动分配间隔单位|CRM_AUTO_ASSIGNMENT_INTERVAL_TYPE|[单项选择(文本值)](index/dictionary_index#res_config_settings_crm_auto_assignment_interval_type "自动分配间隔单位")|60|是||
|自动指派下次执行日期|CRM_AUTO_ASSIGNMENT_RUN_DATETIME|日期时间型||是||
|基于规则的分配|CRM_USE_AUTO_ASSIGNMENT|是否逻辑||是||
|开票原则|DEFAULT_INVOICE_POLICY|[单项选择(文本值)](index/dictionary_index#res_config_settings_default_invoice_policy "开票原则")|60|是||
|拣货策略|DEFAULT_PICKING_POLICY|[单项选择(文本值)](index/dictionary_index#res_config_settings_default_picking_policy "拣货策略")|60|是||
|账单管理|DEFAULT_PURCHASE_METHOD|[单项选择(文本值)](index/dictionary_index#res_config_settings_default_purchase_method "账单管理")|60|是||
|合同逾期延时预警|DELAY_ALERT_CONTRACT|整型||是||
|摘要邮件|DIGEST_EMAILS|是否逻辑||是||
|显示名称|DISPLAY_NAME|文本，可指定长度|500|是||
|使用自定义电子邮件服务器|EXTERNAL_EMAIL_SERVER_DEFAULT|是否逻辑||是||
|失败的邮件|FAIL_COUNTER|整型||是||
|Gmail 客户端 ID|GOOGLE_GMAIL_CLIENT_IDENTIFIER|文本，可指定长度|500|是||
|Gmail客户端Secret|GOOGLE_GMAIL_CLIENT_SECRET|文本，可指定长度|500|是||
|消息翻译 API 密钥|GOOGLE_TRANSLATE_API_KEY|文本，可指定长度|500|是||
|分析会计|GROUP_ANALYTIC_ACCOUNTING|是否逻辑||是||
|团体申请人简历展示|GROUP_APPLICANT_CV_DISPLAY|是否逻辑||是||
|锁定已确认的销售订单|GROUP_AUTO_DONE_SETTING|是否逻辑||是||
|现金舍入|GROUP_CASH_ROUNDING|是否逻辑||是||
|折扣|GROUP_DISCOUNT_PER_SO_LINE|是否逻辑||是||
|在送货单上显示批次 / 序列号|GROUP_LOT_ON_DELIVERY_SLIP|是否逻辑||是||
|在结算单上显示批次 / 序列号|GROUP_LOT_ON_INVOICE|是否逻辑||是||
|邮件营销|GROUP_MASS_MAILING_CAMPAIGN|是否逻辑||是||
|副产品|GROUP_MRP_BYPRODUCTS|是否逻辑||是||
|制造订单分配报表|GROUP_MRP_RECEPTION_REPORT|是否逻辑||是||
|物料需求计划（MRP）工单|GROUP_MRP_ROUTINGS|是否逻辑||是||
|工单依赖性|GROUP_MRP_WORKORDER_DEPENDENCIES|是否逻辑||是||
|多币别|GROUP_MULTI_CURRENCY|是否逻辑||是||
|价格表|GROUP_PRODUCT_PRICELIST|是否逻辑||是||
|变体|GROUP_PRODUCT_VARIANT|是否逻辑||是||
|形式发票|GROUP_PROFORMA_SALES|是否逻辑||是||
|里程碑|GROUP_PROJECT_MILESTONE|是否逻辑||是||
|客户点评|GROUP_PROJECT_RATING|是否逻辑||是||
|周期任务|GROUP_PROJECT_RECURRING_TASKS|是否逻辑||是||
|项目阶段|GROUP_PROJECT_STAGES|是否逻辑||是||
|任务依赖|GROUP_PROJECT_TASK_DEPENDENCIES|是否逻辑||是||
|客户地址|GROUP_SALE_DELIVERY_ADDRESS|是否逻辑||是||
|报价模板|GROUP_SALE_ORDER_TEMPLATE|是否逻辑||是||
|收货提醒|GROUP_SEND_REMINDER|是否逻辑||是||
|采购收据|GROUP_SHOW_PURCHASE_RECEIPTS|是否逻辑||是||
|销售收据|GROUP_SHOW_SALE_RECEIPTS|是否逻辑||是||
|自动库存会计|GROUP_STOCK_ACCOUNTING_AUTOMATIC|是否逻辑||是||
|多步路线|GROUP_STOCK_ADV_LOCATION|是否逻辑||是||
|使用GS1编码格式打印批号和序列号|GROUP_STOCK_LOT_PRINT_GS1|是否逻辑||是||
|储存位置|GROUP_STOCK_MULTI_LOCATIONS|是否逻辑||是||
|产品包装|GROUP_STOCK_PACKAGING|是否逻辑||是||
|批次 / 序列号|GROUP_STOCK_PRODUCTION_LOT|是否逻辑||是||
|库存接收报表|GROUP_STOCK_RECEPTION_REPORT|是否逻辑||是||
|签名|GROUP_STOCK_SIGN_DELIVERY|是否逻辑||是||
|包裹|GROUP_STOCK_TRACKING_LOT|是否逻辑||是||
|寄售|GROUP_STOCK_TRACKING_OWNER|是否逻辑||是||
|解锁制造订单|GROUP_UNLOCKED_BY_DEFAULT|是否逻辑||是||
|计量单位|GROUP_UOM|是否逻辑||是||
|线索|GROUP_USE_LEAD|是否逻辑||是||
|经常性收入|GROUP_USE_RECURRING_REVENUES|是否逻辑||是||
|发票中的警告|GROUP_WARNING_ACCOUNT|是否逻辑||是||
|采购警告|GROUP_WARNING_PURCHASE|是否逻辑||是||
|销售订单警告信息|GROUP_WARNING_SALE|是否逻辑||是||
|库存警报|GROUP_WARNING_STOCK|是否逻辑||是||
|Has Accounting Entries|HAS_ACCOUNTING_ENTRIES|是否逻辑||是||
|Company has a chart of accounts|HAS_CHART_OF_ACCOUNTS|是否逻辑||是||
|员工编辑|HR_EMPLOYEE_SELF_EDIT|是否逻辑||是||
|默认的费用别名|HR_EXPENSE_ALIAS_PREFIX|文本，可指定长度|500|是||
|允许员工通过电子邮件记录费用|HR_EXPENSE_USE_MAILGATEWAY|是否逻辑||是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|发票电子邮件模板|INVOICE_MAIL_TEMPLATE_ID|外键值|100|是||
|PEPPOL 符合条件|IS_ACCOUNT_PEPPOL_ELIGIBLE|是否逻辑||是||
|销售模块是否已安装|IS_INSTALLED_SALE|是否逻辑||是||
|多团队|IS_MEMBERSHIP_MULTI|是否逻辑||是||
|是母公司|IS_ROOT_COMPANY|是否逻辑||是||
|语言数量|LANGUAGE_COUNT|整型||是||
|自动丰富线索|LEAD_ENRICH_AUTO|[单项选择(文本值)](index/dictionary_index#res_config_settings_lead_enrich_auto "自动丰富线索")|60|是||
|直接从商机商机创建线索挖掘申请。|LEAD_MINING_IN_PIPELINE|是否逻辑||是||
|锁定已确认的订单|LOCK_CONFIRMED_PO|是否逻辑||是||
|专门服务器|MASS_MAILING_OUTGOING_MAIL_SERVER|是否逻辑||是||
|24小时统计邮寄报告|MASS_MAILING_REPORTS|是否逻辑||是||
|拆分名字和姓氏|MASS_MAILING_SPLIT_CONTACT_NAME|是否逻辑||是||
|3单匹配:采购订单，收货单与发票|MODULE_ACCOUNT_3WAY_MATCH|是否逻辑||是||
|会计|MODULE_ACCOUNT_ACCOUNTANT|是否逻辑||是||
|Bank Statement Digitization|MODULE_ACCOUNT_BANK_STATEMENT_EXTRACT|是否逻辑||是||
|以CAMT.053 格式导入|MODULE_ACCOUNT_BANK_STATEMENT_IMPORT_CAMT|是否逻辑||是||
|以.csv、.xls和.xlsx格式导入|MODULE_ACCOUNT_BANK_STATEMENT_IMPORT_CSV|是否逻辑||是||
|以.ofx格式导入|MODULE_ACCOUNT_BANK_STATEMENT_IMPORT_OFX|是否逻辑||是||
|导入.qif单据|MODULE_ACCOUNT_BANK_STATEMENT_IMPORT_QIF|是否逻辑||是||
|使用批量付款|MODULE_ACCOUNT_BATCH_PAYMENT|是否逻辑||是||
|预算管理|MODULE_ACCOUNT_BUDGET|是否逻辑||是||
|Allow check printing and deposits|MODULE_ACCOUNT_CHECK_PRINTING|是否逻辑||是||
|Document Digitization|MODULE_ACCOUNT_EXTRACT|是否逻辑||是||
|管理公司间交易|MODULE_ACCOUNT_INTER_COMPANY_RULES|是否逻辑||是||
|国际联盟|MODULE_ACCOUNT_INTRASTAT|是否逻辑||是||
|Invoice Digitization|MODULE_ACCOUNT_INVOICE_EXTRACT|是否逻辑||是||
|SEPA Credit Transfer / ISO20022|MODULE_ACCOUNT_ISO20022|是否逻辑||是||
|Invoice Online Payment|MODULE_ACCOUNT_PAYMENT|是否逻辑||是||
|PEPPOL 开具发票|MODULE_ACCOUNT_PEPPOL|是否逻辑||是||
|Dynamic Reports|MODULE_ACCOUNT_REPORTS|是否逻辑||是||
|Use SEPA Direct Debit|MODULE_ACCOUNT_SEPA_DIRECT_DEBIT|是否逻辑||是||
|LDAP认证|MODULE_AUTH_LDAP|是否逻辑||是||
|使用外部验证提供者 (OAuth)|MODULE_AUTH_OAUTH|是否逻辑||是||
|地理定位|MODULE_BASE_GEOLOCALIZE|是否逻辑||是||
|允许用户导入 CSV/XLS/XLSX/ODS格式的文档数据|MODULE_BASE_IMPORT|是否逻辑||是||
|根据线索的电子邮箱地址、使用公司数据自动丰富线索。|MODULE_CRM_IAP_ENRICH|是否逻辑||是||
|基于国家/地区、行业、规模等信息生成新的线索。|MODULE_CRM_IAP_MINE|是否逻辑||是||
|自动汇率|MODULE_CURRENCY_RATE_LIVE|是否逻辑||是||
|交付方式|MODULE_DELIVERY|是否逻辑||是||
|bpost连接器|MODULE_DELIVERY_BPOST|是否逻辑||是||
|DHL快递连接器|MODULE_DELIVERY_DHL|是否逻辑||是||
|Easypost连接器|MODULE_DELIVERY_EASYPOST|是否逻辑||是||
|FedEx连接器|MODULE_DELIVERY_FEDEX|是否逻辑||是||
|Sendcloud连接器|MODULE_DELIVERY_SENDCLOUD|是否逻辑||是||
|Shiprocket 连接器|MODULE_DELIVERY_SHIPROCKET|是否逻辑||是||
|Starshipit 连接器|MODULE_DELIVERY_STARSHIPIT|是否逻辑||是||
|UPS连接器|MODULE_DELIVERY_UPS|是否逻辑||是||
|USPS连接器|MODULE_DELIVERY_USPS|是否逻辑||是||
|允许用户同步谷歌日历|MODULE_GOOGLE_CALENDAR|是否逻辑||是||
|支持Gmail身份验证|MODULE_GOOGLE_GMAIL|是否逻辑||是||
|验证码|MODULE_GOOGLE_RECAPTCHA|是否逻辑||是||
|向OCR发送账单以产生费用|MODULE_HR_EXPENSE_EXTRACT|是否逻辑||是||
|远程工作|MODULE_HR_HOMEWORKING|是否逻辑||是||
|工资单上的报销费用|MODULE_HR_PAYROLL_EXPENSE|是否逻辑||是||
|高级出席控制|MODULE_HR_PRESENCE|是否逻辑||是||
|将简历发送到 OCR 以填写申请|MODULE_HR_RECRUITMENT_EXTRACT|是否逻辑||是||
|面试表单|MODULE_HR_RECRUITMENT_SURVEY|是否逻辑||是||
|技能管理|MODULE_HR_SKILLS|是否逻辑||是||
|任务日志|MODULE_HR_TIMESHEET|是否逻辑||是||
|欧盟共同体内部远程销售|MODULE_L10N_EU_OSS|是否逻辑||是||
|促销、优惠券、礼品卡和会员方案|MODULE_LOYALTY|是否逻辑||是||
|允许与邮件插件集成|MODULE_MAIL_PLUGIN|是否逻辑||是||
|定制维护工作表|MODULE_MAINTENANCE_WORKSHEET|是否逻辑||是||
|允许用户同步Outlook日历|MODULE_MICROSOFT_CALENDAR|是否逻辑||是||
|支持Outlook身份验证|MODULE_MICROSOFT_OUTLOOK|是否逻辑||是||
|主生产计划|MODULE_MRP_MPS|是否逻辑||是||
|产品生命周期管理（PLM）|MODULE_MRP_PLM|是否逻辑||是||
|外包|MODULE_MRP_SUBCONTRACTING|是否逻辑||是||
|合作伙伴自动完成|MODULE_PARTNER_AUTOCOMPLETE|是否逻辑||是||
|特定的电子邮件|MODULE_PRODUCT_EMAIL_TEMPLATE|是否逻辑||是||
|到期日期|MODULE_PRODUCT_EXPIRY|是否逻辑||是||
|使用条形码获取产品图片|MODULE_PRODUCT_IMAGES|是否逻辑||是||
|允许产品毛利|MODULE_PRODUCT_MARGIN|是否逻辑||是||
|采购表格入口|MODULE_PURCHASE_PRODUCT_MATRIX|是否逻辑||是||
|采购协议|MODULE_PURCHASE_REQUISITION|是否逻辑||是||
|质量|MODULE_QUALITY_CONTROL|是否逻辑||是||
|质量工作表|MODULE_QUALITY_CONTROL_WORKSHEET|是否逻辑||是||
|亚马逊同步|MODULE_SALE_AMAZON|是否逻辑||是||
|佣金|MODULE_SALE_COMMISSION|是否逻辑||是||
|优惠券和会员|MODULE_SALE_LOYALTY|是否逻辑||是||
|毛利|MODULE_SALE_MARGIN|是否逻辑||是||
|PDF 报价生成器|MODULE_SALE_PDF_QUOTE_BUILDER|是否逻辑||是||
|销售表格录入|MODULE_SALE_PRODUCT_MATRIX|是否逻辑||是||
|短信息|MODULE_SMS|是否逻辑||是||
|传统信件|MODULE_SNAILMAIL_ACCOUNT|是否逻辑||是||
|条码扫描器|MODULE_STOCK_BARCODE|是否逻辑||是||
|库存条形码数据库|MODULE_STOCK_BARCODE_BARCODELOOKUP|是否逻辑||是||
|代发货|MODULE_STOCK_DROPSHIPPING|是否逻辑||是||
|配送管理系统|MODULE_STOCK_FLEET|是否逻辑||是||
|到岸成本|MODULE_STOCK_LANDED_COSTS|是否逻辑||是||
|批量、波次和集群调拨|MODULE_STOCK_PICKING_BATCH|是否逻辑||是||
|短信息确认|MODULE_STOCK_SMS|是否逻辑||是||
|网络电话|MODULE_VOIP|是否逻辑||是||
|Cloudflare Turnstile|MODULE_WEBSITE_CF_TURNSTILE|是否逻辑||是||
|从网站流量创建线索/商机|MODULE_WEBSITE_CRM_IAP_REVEAL|是否逻辑||是||
|线上发布|MODULE_WEBSITE_HR_RECRUITMENT|是否逻辑||是||
|Unsplash图像库|MODULE_WEB_UNSPLASH|是否逻辑||是||
|对公司有利的宽容时间|OVERTIME_COMPANY_THRESHOLD|整型||是||
|对员工有利的宽容时间|OVERTIME_EMPLOYEE_THRESHOLD|整型||是||
|信用不足|PARTNER_AUTOCOMPLETE_INSUFFICIENT_CREDIT|是否逻辑||是||
|在线支付发票|PAY_INVOICES_ONLINE|是否逻辑||是||
|客户 API 密钥|PORTAL_ALLOW_API_KEYS|是否逻辑||是||
|订单审批|PO_ORDER_APPROVAL|是否逻辑||是||
|字符串中的线索评分频率字段|PREDICTIVE_LEAD_SCORING_FIELDS_STR|文本，可指定长度|500|是||
|预测线索评分字段标签|PREDICTIVE_LEAD_SCORING_FIELD_LABELS|文本，可指定长度|500|是||
|线索评分开始日期|PREDICTIVE_LEAD_SCORING_START_DATE|日期型||是||
|字符串中的线索评分开始日期|PREDICTIVE_LEAD_SCORING_START_DATE_STR|文本，可指定长度|500|是||
|Display preview button|PREVIEW_READY|是否逻辑||是||
|体积单位|PRODUCT_VOLUME_VOLUME_IN_CUBIC_FEET|[单项选择(文本值)](index/dictionary_index#res_config_settings_product_volume_volume_in_cubic_feet "体积单位")|60|是||
|重量单位|PRODUCT_WEIGHT_IN_LBS|[单项选择(文本值)](index/dictionary_index#res_config_settings_product_weight_in_lbs "重量单位")|60|是||
|启用分析直到|PROFILING_ENABLED_UNTIL|日期时间型||是||
|限制模板渲染|RESTRICT_TEMPLATE_RENDERING|是否逻辑||是||
|SFU 服务器密钥|SFU_SERVER_KEY|文本，可指定长度|500|是||
|SFU 服务器 URL|SFU_SERVER_URL|文本，可指定长度|500|是||
|退订时黑名单选项|SHOW_BLACKLIST_BUTTONS|是否逻辑||是||
|显示效果|SHOW_EFFECT|是否逻辑||是||
|蜗牛邮件封面只读|SNAILMAIL_COVER_READONLY|是否逻辑||是||
|Tenor API 密钥|TENOR_API_KEY|文本，可指定长度|500|是||
|Tenor 内容过滤器|TENOR_CONTENT_FILTER|[单项选择(文本值)](index/dictionary_index#res_config_settings_tenor_content_filter "Tenor 内容过滤器")|60|是||
|Tenor Gif 限额|TENOR_GIF_LIMIT|整型||是||
|Twilio 帐户 SID|TWILIO_ACCOUNT_SID|文本，可指定长度|500|是||
|Twilio 帐户身份验证令牌|TWILIO_ACCOUNT_TOKEN|文本，可指定长度|500|是||
|访问秘钥|UNSPLASH_ACCESS_KEY|文本，可指定长度|500|是||
|应用程序ID|UNSPLASH_APP_ID|文本，可指定长度|500|是||
|默认访问权限|USER_DEFAULT_RIGHTS|是否逻辑||是||
|默认条款和条件|USE_INVOICE_TERMS|是否逻辑||是||
|默认制造提前期|USE_MANUFACTURING_LEAD|是否逻辑||是||
|安全交货时间|USE_PO_LEAD|是否逻辑||是||
|销售的安全提前期|USE_SECURITY_LEAD|是否逻辑||是||
|使用 Twilio ICE 服务器|USE_TWILIO_RTC_SERVERS|是否逻辑||是||
|网络应用程序名称|WEB_APP_NAME|文本，可指定长度|500|是||
|更新时间|WRITE_DATE|日期时间型||否||
|更新人|WRITE_UID|文本，可指定长度|100|否||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="从关系" name="minor">

|  名称col350   | 主实体col200   | 关系类型col200   |    备注col500  |
| -------- |---------- |-----------|----- |
|[DER1N_RES_CONFIG_SETTINGS_MAIL_TEMPLATE_INVOICE_MAIL_TEMPLATE_ID](der/DER1N_RES_CONFIG_SETTINGS_MAIL_TEMPLATE_INVOICE_MAIL_TEMPLATE_ID)|[EMail模板(MAIL_TEMPLATE)](module/mail/mail_template)|1:N关系||
|[DER1N_RES_CONFIG_SETTINGS_RES_COMPANY_COMPANY_ID](der/DER1N_RES_CONFIG_SETTINGS_RES_COMPANY_COMPANY_ID)|[公司(RES_COMPANY)](module/base/res_company)|1:N关系||
|[DER1N_RES_CONFIG_SETTINGS_RES_USERS_AUTH_SIGNUP_TEMPLATE_USER_ID](der/DER1N_RES_CONFIG_SETTINGS_RES_USERS_AUTH_SIGNUP_TEMPLATE_USER_ID)|[用户(RES_USERS)](module/base/res_users)|1:N关系||

</el-tab-pane>
</el-tabs>
</el-row>

## 行为
| 中文名col200    | 代码名col150    | 类型col150    | 事务col100   | 批处理col100   | 附加操作col100  | 插件col150    |  备注col300  |
| -------- |---------- |----------- |:----:|:----:|---------| ----- | ----- |
|CheckKey|CheckKey|内置方法|默认|不支持||||
|Create|Create|内置方法|默认|不支持|[附加操作](index/action_logic_index#res_config_settings_Create)|||
|CreateTemp|CreateTemp|内置方法|默认|不支持||||
|CreateTempMajor|CreateTempMajor|内置方法|默认|不支持||||
|Get|Get|内置方法|默认|不支持|[附加操作](index/action_logic_index#res_config_settings_Get)|||
|GetDraft|GetDraft|内置方法|默认|不支持||||
|GetDraftTemp|GetDraftTemp|内置方法|默认|不支持||||
|GetDraftTempMajor|GetDraftTempMajor|内置方法|默认|不支持||||
|GetTemp|GetTemp|内置方法|默认|不支持||||
|GetTempMajor|GetTempMajor|内置方法|默认|不支持||||
|Remove|Remove|内置方法|默认|支持||||
|RemoveTemp|RemoveTemp|内置方法|默认|支持||||
|RemoveTempMajor|RemoveTempMajor|内置方法|默认|支持||||
|Save|Save|内置方法|默认|不支持||||
|Update|Update|内置方法|默认|不支持|[附加操作](index/action_logic_index#res_config_settings_Update)|||
|UpdateTemp|UpdateTemp|内置方法|默认|不支持||||
|UpdateTempMajor|UpdateTempMajor|内置方法|默认|不支持||||
|默认提取固定标识属性值|default_get|[实体处理逻辑](module/base/res_config_settings/logic/default_get "默认获取数据逻辑")|默认|不支持||||
|获取配置值|get_values|用户自定义|默认|不支持||||
|nothing|nothing|[实体处理逻辑](module/base/res_config_settings/logic/nothing "nothing")|默认|不支持||||
|设置配置值|set_values|用户自定义|默认|不支持||||

## 处理逻辑
| 中文名col200    | 代码名col150    | 子类型col150    | 插件col200    |  备注col550  |
| -------- |---------- |----------- |------------|----------|
|[nothing](module/base/res_config_settings/logic/nothing)|nothing|无|||
|[默认获取数据逻辑](module/base/res_config_settings/logic/default_get)|default_get|无|||

## 数据查询
| 中文名col200    | 代码名col150    | 默认查询col100 | 权限使用col100 | 自定义SQLcol100 |  备注col600|
| --------  | --------   | :----:  |:----:  | :----:  |----- |
|[DEFAULT](module/base/res_config_settings/query/Default)|DEFAULT|是|否 |否 ||
|[默认（全部数据）(VIEW)](module/base/res_config_settings/query/View)|VIEW|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[DEFAULT](module/base/res_config_settings/dataset/Default)|DEFAULT|数据查询|是|||

## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_AUTH_SIGNUP_TEMPLATE_USER_ID_EQ|用作通过注册创建的新用户的模版|EQ||
|N_AUTH_SIGNUP_UNINVITED_EQ|客户帐号|EQ||
|N_COMPANY_ID_EQ|公司|EQ||
|N_COMPANY_NAME_EQ|公司|EQ||
|N_COMPANY_NAME_LIKE|公司|LIKE||
|N_CRM_AUTO_ASSIGNMENT_ACTION_EQ|自动分配操作|EQ||
|N_CRM_AUTO_ASSIGNMENT_INTERVAL_TYPE_EQ|自动分配间隔单位|EQ||
|N_DEFAULT_INVOICE_POLICY_EQ|开票原则|EQ||
|N_DEFAULT_PICKING_POLICY_EQ|拣货策略|EQ||
|N_DEFAULT_PURCHASE_METHOD_EQ|账单管理|EQ||
|N_ID_EQ|标识|EQ||
|N_INVOICE_MAIL_TEMPLATE_ID_EQ|发票电子邮件模板|EQ||
|N_LEAD_ENRICH_AUTO_EQ|自动丰富线索|EQ||
|N_PRODUCT_VOLUME_VOLUME_IN_CUBIC_FEET_EQ|体积单位|EQ||
|N_PRODUCT_WEIGHT_IN_LBS_EQ|重量单位|EQ||
|N_TENOR_CONTENT_FILTER_EQ|Tenor 内容过滤器|EQ||

## 界面行为
|  中文名col200 |  代码名col150 |  标题col100   |     处理目标col100   |    处理类型col200        |  备注col500       |
| --------| --------| -------- |------------|------------|------------|
| 打开配置设定视图 | open_settings_view | 配置设定 |无数据|<details><summary>打开视图或向导（模态）</summary>[配置设定](app/view/res_config_settings_modify_setting)</details>||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/base/res_config_settings?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/base/res_config_settings?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/base/res_config_settings?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/base/res_config_settings?id=处理逻辑`">
  处理逻辑
</el-anchor-link>
<el-anchor-link :href="`#/module/base/res_config_settings?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/base/res_config_settings?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/base/res_config_settings?id=搜索模式`">
  搜索模式
</el-anchor-link>
<el-anchor-link :href="`#/module/base/res_config_settings?id=界面行为`">
  界面行为
</el-anchor-link>
</el-anchor>
</div>

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {
show_der:'minor',


      }
    },
    methods: {
    }
  }).use(ElementPlus).mount('#app')
</script>