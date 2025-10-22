# 配置设定(res_config_settings) :id=res_config_settings
## 创建配置设定

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/res_config_settings" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">account_default_credit_limit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|默认信用额度|
|<el-row justify="space-between"><el-col :span="20">active_user_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效用户数量|
|<el-row justify="space-between"><el-col :span="20">auth_signup_reset_password</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|允许在登录页开启密码重置功能|
|<el-row justify="space-between"><el-col :span="20">auth_signup_template_user_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用作通过注册创建的新用户的模版|
|<el-row justify="space-between"><el-col :span="20">auth_signup_uninvited</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|客户帐号|
|<el-row justify="space-between"><el-col :span="20">automatic_invoice</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|自动发票|
|<el-row justify="space-between"><el-col :span="20">barcode_separator</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|分隔符|
|<el-row justify="space-between"><el-col :span="20">company_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|公司数量|
|<el-row justify="space-between"><el-col :span="20">company_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">company_informations</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司信息|
|<el-row justify="space-between"><el-col :span="20">company_name</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">crm_auto_assignment_action</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|自动分配操作|
|<el-row justify="space-between"><el-col :span="20">crm_auto_assignment_interval_number</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|重复间隔为每|
|<el-row justify="space-between"><el-col :span="20">crm_auto_assignment_interval_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|自动分配间隔单位|
|<el-row justify="space-between"><el-col :span="20">crm_auto_assignment_run_datetime</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|自动指派下次执行日期|
|<el-row justify="space-between"><el-col :span="20">crm_use_auto_assignment</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|基于规则的分配|
|<el-row justify="space-between"><el-col :span="20">default_invoice_policy</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|开票原则|
|<el-row justify="space-between"><el-col :span="20">default_picking_policy</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|拣货策略|
|<el-row justify="space-between"><el-col :span="20">default_purchase_method</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|账单管理|
|<el-row justify="space-between"><el-col :span="20">delay_alert_contract</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|合同逾期延时预警|
|<el-row justify="space-between"><el-col :span="20">digest_emails</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|摘要邮件|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">external_email_server_default</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|使用自定义电子邮件服务器|
|<el-row justify="space-between"><el-col :span="20">fail_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|失败的邮件|
|<el-row justify="space-between"><el-col :span="20">google_gmail_client_identifier</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Gmail 客户端 ID|
|<el-row justify="space-between"><el-col :span="20">google_gmail_client_secret</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Gmail客户端Secret|
|<el-row justify="space-between"><el-col :span="20">google_translate_api_key</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|消息翻译 API 密钥|
|<el-row justify="space-between"><el-col :span="20">group_analytic_accounting</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|分析会计|
|<el-row justify="space-between"><el-col :span="20">group_applicant_cv_display</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|团体申请人简历展示|
|<el-row justify="space-between"><el-col :span="20">group_auto_done_setting</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|锁定已确认的销售订单|
|<el-row justify="space-between"><el-col :span="20">group_cash_rounding</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|现金舍入|
|<el-row justify="space-between"><el-col :span="20">group_discount_per_so_line</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|折扣|
|<el-row justify="space-between"><el-col :span="20">group_lot_on_delivery_slip</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|在送货单上显示批次 / 序列号|
|<el-row justify="space-between"><el-col :span="20">group_lot_on_invoice</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|在结算单上显示批次 / 序列号|
|<el-row justify="space-between"><el-col :span="20">group_mass_mailing_campaign</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|邮件营销|
|<el-row justify="space-between"><el-col :span="20">group_mrp_byproducts</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|副产品|
|<el-row justify="space-between"><el-col :span="20">group_mrp_reception_report</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|制造订单分配报表|
|<el-row justify="space-between"><el-col :span="20">group_mrp_routings</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|物料需求计划（MRP）工单|
|<el-row justify="space-between"><el-col :span="20">group_mrp_workorder_dependencies</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|工单依赖性|
|<el-row justify="space-between"><el-col :span="20">group_multi_currency</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|多币别|
|<el-row justify="space-between"><el-col :span="20">group_product_pricelist</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|价格表|
|<el-row justify="space-between"><el-col :span="20">group_product_variant</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|变体|
|<el-row justify="space-between"><el-col :span="20">group_proforma_sales</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|形式发票|
|<el-row justify="space-between"><el-col :span="20">group_project_milestone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|里程碑|
|<el-row justify="space-between"><el-col :span="20">group_project_rating</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|客户点评|
|<el-row justify="space-between"><el-col :span="20">group_project_recurring_tasks</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|周期任务|
|<el-row justify="space-between"><el-col :span="20">group_project_stages</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|项目阶段|
|<el-row justify="space-between"><el-col :span="20">group_project_task_dependencies</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|任务依赖|
|<el-row justify="space-between"><el-col :span="20">group_sale_delivery_address</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|客户地址|
|<el-row justify="space-between"><el-col :span="20">group_sale_order_template</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|报价模板|
|<el-row justify="space-between"><el-col :span="20">group_send_reminder</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|收货提醒|
|<el-row justify="space-between"><el-col :span="20">group_show_purchase_receipts</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|采购收据|
|<el-row justify="space-between"><el-col :span="20">group_show_sale_receipts</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|销售收据|
|<el-row justify="space-between"><el-col :span="20">group_stock_accounting_automatic</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|自动库存会计|
|<el-row justify="space-between"><el-col :span="20">group_stock_adv_location</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|多步路线|
|<el-row justify="space-between"><el-col :span="20">group_stock_lot_print_gs1</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|使用GS1编码格式打印批号和序列号|
|<el-row justify="space-between"><el-col :span="20">group_stock_multi_locations</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|储存位置|
|<el-row justify="space-between"><el-col :span="20">group_stock_packaging</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|产品包装|
|<el-row justify="space-between"><el-col :span="20">group_stock_production_lot</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|批次 / 序列号|
|<el-row justify="space-between"><el-col :span="20">group_stock_reception_report</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|库存接收报表|
|<el-row justify="space-between"><el-col :span="20">group_stock_sign_delivery</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|签名|
|<el-row justify="space-between"><el-col :span="20">group_stock_tracking_lot</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|包裹|
|<el-row justify="space-between"><el-col :span="20">group_stock_tracking_owner</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|寄售|
|<el-row justify="space-between"><el-col :span="20">group_unlocked_by_default</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|解锁制造订单|
|<el-row justify="space-between"><el-col :span="20">group_uom</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|计量单位|
|<el-row justify="space-between"><el-col :span="20">group_use_lead</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|线索|
|<el-row justify="space-between"><el-col :span="20">group_use_recurring_revenues</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|经常性收入|
|<el-row justify="space-between"><el-col :span="20">group_warning_account</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|发票中的警告|
|<el-row justify="space-between"><el-col :span="20">group_warning_purchase</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|采购警告|
|<el-row justify="space-between"><el-col :span="20">group_warning_sale</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|销售订单警告信息|
|<el-row justify="space-between"><el-col :span="20">group_warning_stock</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|库存警报|
|<el-row justify="space-between"><el-col :span="20">has_accounting_entries</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Has Accounting Entries|
|<el-row justify="space-between"><el-col :span="20">has_chart_of_accounts</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Company has a chart of accounts|
|<el-row justify="space-between"><el-col :span="20">hr_employee_self_edit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|员工编辑|
|<el-row justify="space-between"><el-col :span="20">hr_expense_alias_prefix</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|默认的费用别名|
|<el-row justify="space-between"><el-col :span="20">hr_expense_use_mailgateway</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|允许员工通过电子邮件记录费用|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">invoice_mail_template_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|发票电子邮件模板|
|<el-row justify="space-between"><el-col :span="20">is_account_peppol_eligible</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|PEPPOL 符合条件|
|<el-row justify="space-between"><el-col :span="20">is_installed_sale</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|销售模块是否已安装|
|<el-row justify="space-between"><el-col :span="20">is_membership_multi</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|多团队|
|<el-row justify="space-between"><el-col :span="20">is_root_company</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是母公司|
|<el-row justify="space-between"><el-col :span="20">language_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|语言数量|
|<el-row justify="space-between"><el-col :span="20">lead_enrich_auto</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|自动丰富线索|
|<el-row justify="space-between"><el-col :span="20">lead_mining_in_pipeline</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|直接从商机商机创建线索挖掘申请。|
|<el-row justify="space-between"><el-col :span="20">lock_confirmed_po</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|锁定已确认的订单|
|<el-row justify="space-between"><el-col :span="20">mass_mailing_outgoing_mail_server</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|专门服务器|
|<el-row justify="space-between"><el-col :span="20">mass_mailing_reports</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|24小时统计邮寄报告|
|<el-row justify="space-between"><el-col :span="20">mass_mailing_split_contact_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|拆分名字和姓氏|
|<el-row justify="space-between"><el-col :span="20">module_account3way_match</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|3单匹配:采购订单，收货单与发票|
|<el-row justify="space-between"><el-col :span="20">module_account_accountant</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|会计|
|<el-row justify="space-between"><el-col :span="20">module_account_bank_statement_extract</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Bank Statement Digitization|
|<el-row justify="space-between"><el-col :span="20">module_account_bank_statement_import_camt</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|以CAMT.053 格式导入|
|<el-row justify="space-between"><el-col :span="20">module_account_bank_statement_import_csv</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|以.csv、.xls和.xlsx格式导入|
|<el-row justify="space-between"><el-col :span="20">module_account_bank_statement_import_ofx</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|以.ofx格式导入|
|<el-row justify="space-between"><el-col :span="20">module_account_bank_statement_import_qif</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|导入.qif单据|
|<el-row justify="space-between"><el-col :span="20">module_account_batch_payment</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|使用批量付款|
|<el-row justify="space-between"><el-col :span="20">module_account_budget</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|预算管理|
|<el-row justify="space-between"><el-col :span="20">module_account_check_printing</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Allow check printing and deposits|
|<el-row justify="space-between"><el-col :span="20">module_account_extract</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Document Digitization|
|<el-row justify="space-between"><el-col :span="20">module_account_inter_company_rules</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|管理公司间交易|
|<el-row justify="space-between"><el-col :span="20">module_account_intrastat</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|国际联盟|
|<el-row justify="space-between"><el-col :span="20">module_account_invoice_extract</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Invoice Digitization|
|<el-row justify="space-between"><el-col :span="20">module_account_iso20022</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|SEPA Credit Transfer / ISO20022|
|<el-row justify="space-between"><el-col :span="20">module_account_payment</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Invoice Online Payment|
|<el-row justify="space-between"><el-col :span="20">module_account_peppol</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|PEPPOL 开具发票|
|<el-row justify="space-between"><el-col :span="20">module_account_reports</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Dynamic Reports|
|<el-row justify="space-between"><el-col :span="20">module_account_sepa_direct_debit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Use SEPA Direct Debit|
|<el-row justify="space-between"><el-col :span="20">module_auth_ldap</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|LDAP认证|
|<el-row justify="space-between"><el-col :span="20">module_auth_oauth</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|使用外部验证提供者 (OAuth)|
|<el-row justify="space-between"><el-col :span="20">module_base_geolocalize</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|地理定位|
|<el-row justify="space-between"><el-col :span="20">module_base_import</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|允许用户导入 CSV/XLS/XLSX/ODS格式的文档数据|
|<el-row justify="space-between"><el-col :span="20">module_crm_iap_enrich</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|根据线索的电子邮箱地址、使用公司数据自动丰富线索。|
|<el-row justify="space-between"><el-col :span="20">module_crm_iap_mine</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|基于国家/地区、行业、规模等信息生成新的线索。|
|<el-row justify="space-between"><el-col :span="20">module_currency_rate_live</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|自动汇率|
|<el-row justify="space-between"><el-col :span="20">module_delivery</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|交付方式|
|<el-row justify="space-between"><el-col :span="20">module_delivery_bpost</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|bpost连接器|
|<el-row justify="space-between"><el-col :span="20">module_delivery_dhl</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|DHL快递连接器|
|<el-row justify="space-between"><el-col :span="20">module_delivery_easypost</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Easypost连接器|
|<el-row justify="space-between"><el-col :span="20">module_delivery_fedex</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|FedEx连接器|
|<el-row justify="space-between"><el-col :span="20">module_delivery_sendcloud</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Sendcloud连接器|
|<el-row justify="space-between"><el-col :span="20">module_delivery_shiprocket</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Shiprocket 连接器|
|<el-row justify="space-between"><el-col :span="20">module_delivery_starshipit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Starshipit 连接器|
|<el-row justify="space-between"><el-col :span="20">module_delivery_ups</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|UPS连接器|
|<el-row justify="space-between"><el-col :span="20">module_delivery_usps</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|USPS连接器|
|<el-row justify="space-between"><el-col :span="20">module_google_calendar</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|允许用户同步谷歌日历|
|<el-row justify="space-between"><el-col :span="20">module_google_gmail</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|支持Gmail身份验证|
|<el-row justify="space-between"><el-col :span="20">module_google_recaptcha</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|验证码|
|<el-row justify="space-between"><el-col :span="20">module_hr_expense_extract</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|向OCR发送账单以产生费用|
|<el-row justify="space-between"><el-col :span="20">module_hr_homeworking</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|远程工作|
|<el-row justify="space-between"><el-col :span="20">module_hr_payroll_expense</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|工资单上的报销费用|
|<el-row justify="space-between"><el-col :span="20">module_hr_presence</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|高级出席控制|
|<el-row justify="space-between"><el-col :span="20">module_hr_recruitment_extract</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|将简历发送到 OCR 以填写申请|
|<el-row justify="space-between"><el-col :span="20">module_hr_recruitment_survey</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|面试表单|
|<el-row justify="space-between"><el-col :span="20">module_hr_skills</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|技能管理|
|<el-row justify="space-between"><el-col :span="20">module_hr_timesheet</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|任务日志|
|<el-row justify="space-between"><el-col :span="20">module_l10n_eu_oss</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|欧盟共同体内部远程销售|
|<el-row justify="space-between"><el-col :span="20">module_loyalty</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|促销、优惠券、礼品卡和会员方案|
|<el-row justify="space-between"><el-col :span="20">module_mail_plugin</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|允许与邮件插件集成|
|<el-row justify="space-between"><el-col :span="20">module_maintenance_worksheet</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|定制维护工作表|
|<el-row justify="space-between"><el-col :span="20">module_microsoft_calendar</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|允许用户同步Outlook日历|
|<el-row justify="space-between"><el-col :span="20">module_microsoft_outlook</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|支持Outlook身份验证|
|<el-row justify="space-between"><el-col :span="20">module_mrp_mps</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|主生产计划|
|<el-row justify="space-between"><el-col :span="20">module_mrp_plm</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|产品生命周期管理（PLM）|
|<el-row justify="space-between"><el-col :span="20">module_mrp_subcontracting</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|外包|
|<el-row justify="space-between"><el-col :span="20">module_partner_autocomplete</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|合作伙伴自动完成|
|<el-row justify="space-between"><el-col :span="20">module_product_email_template</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|特定的电子邮件|
|<el-row justify="space-between"><el-col :span="20">module_product_expiry</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|到期日期|
|<el-row justify="space-between"><el-col :span="20">module_product_images</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|使用条形码获取产品图片|
|<el-row justify="space-between"><el-col :span="20">module_product_margin</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|允许产品毛利|
|<el-row justify="space-between"><el-col :span="20">module_purchase_product_matrix</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|采购表格入口|
|<el-row justify="space-between"><el-col :span="20">module_purchase_requisition</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|采购协议|
|<el-row justify="space-between"><el-col :span="20">module_quality_control</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|质量|
|<el-row justify="space-between"><el-col :span="20">module_quality_control_worksheet</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|质量工作表|
|<el-row justify="space-between"><el-col :span="20">module_sale_amazon</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|亚马逊同步|
|<el-row justify="space-between"><el-col :span="20">module_sale_commission</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|佣金|
|<el-row justify="space-between"><el-col :span="20">module_sale_loyalty</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|优惠券和会员|
|<el-row justify="space-between"><el-col :span="20">module_sale_margin</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|毛利|
|<el-row justify="space-between"><el-col :span="20">module_sale_pdf_quote_builder</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|PDF 报价生成器|
|<el-row justify="space-between"><el-col :span="20">module_sale_product_matrix</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|销售表格录入|
|<el-row justify="space-between"><el-col :span="20">module_sms</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|短信息|
|<el-row justify="space-between"><el-col :span="20">module_snailmail_account</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|传统信件|
|<el-row justify="space-between"><el-col :span="20">module_stock_barcode</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|条码扫描器|
|<el-row justify="space-between"><el-col :span="20">module_stock_barcode_barcodelookup</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|库存条形码数据库|
|<el-row justify="space-between"><el-col :span="20">module_stock_dropshipping</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|代发货|
|<el-row justify="space-between"><el-col :span="20">module_stock_fleet</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|配送管理系统|
|<el-row justify="space-between"><el-col :span="20">module_stock_landed_costs</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|到岸成本|
|<el-row justify="space-between"><el-col :span="20">module_stock_picking_batch</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|批量、波次和集群调拨|
|<el-row justify="space-between"><el-col :span="20">module_stock_sms</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|短信息确认|
|<el-row justify="space-between"><el-col :span="20">module_voip</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|网络电话|
|<el-row justify="space-between"><el-col :span="20">module_web_unsplash</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Unsplash图像库|
|<el-row justify="space-between"><el-col :span="20">module_website_cf_turnstile</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Cloudflare Turnstile|
|<el-row justify="space-between"><el-col :span="20">module_website_crm_iap_reveal</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|从网站流量创建线索/商机|
|<el-row justify="space-between"><el-col :span="20">module_website_hr_recruitment</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|线上发布|
|<el-row justify="space-between"><el-col :span="20">overtime_company_threshold</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|对公司有利的宽容时间|
|<el-row justify="space-between"><el-col :span="20">overtime_employee_threshold</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|对员工有利的宽容时间|
|<el-row justify="space-between"><el-col :span="20">partner_autocomplete_insufficient_credit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|信用不足|
|<el-row justify="space-between"><el-col :span="20">pay_invoices_online</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|在线支付发票|
|<el-row justify="space-between"><el-col :span="20">po_order_approval</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|订单审批|
|<el-row justify="space-between"><el-col :span="20">portal_allow_api_keys</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|客户 API 密钥|
|<el-row justify="space-between"><el-col :span="20">predictive_lead_scoring_field_labels</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|预测线索评分字段标签|
|<el-row justify="space-between"><el-col :span="20">predictive_lead_scoring_fields_str</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|字符串中的线索评分频率字段|
|<el-row justify="space-between"><el-col :span="20">predictive_lead_scoring_start_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|线索评分开始日期|
|<el-row justify="space-between"><el-col :span="20">predictive_lead_scoring_start_date_str</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|字符串中的线索评分开始日期|
|<el-row justify="space-between"><el-col :span="20">preview_ready</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Display preview button|
|<el-row justify="space-between"><el-col :span="20">product_volume_volume_in_cubic_feet</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|体积单位|
|<el-row justify="space-between"><el-col :span="20">product_weight_in_lbs</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|重量单位|
|<el-row justify="space-between"><el-col :span="20">profiling_enabled_until</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|启用分析直到|
|<el-row justify="space-between"><el-col :span="20">restrict_template_rendering</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|限制模板渲染|
|<el-row justify="space-between"><el-col :span="20">sfu_server_key</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|SFU 服务器密钥|
|<el-row justify="space-between"><el-col :span="20">sfu_server_url</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|SFU 服务器 URL|
|<el-row justify="space-between"><el-col :span="20">show_blacklist_buttons</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|退订时黑名单选项|
|<el-row justify="space-between"><el-col :span="20">show_effect</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|显示效果|
|<el-row justify="space-between"><el-col :span="20">snailmail_cover_readonly</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|蜗牛邮件封面只读|
|<el-row justify="space-between"><el-col :span="20">tenor_api_key</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Tenor API 密钥|
|<el-row justify="space-between"><el-col :span="20">tenor_content_filter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Tenor 内容过滤器|
|<el-row justify="space-between"><el-col :span="20">tenor_gif_limit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Tenor Gif 限额|
|<el-row justify="space-between"><el-col :span="20">twilio_account_sid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Twilio 帐户 SID|
|<el-row justify="space-between"><el-col :span="20">twilio_account_token</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Twilio 帐户身份验证令牌|
|<el-row justify="space-between"><el-col :span="20">unsplash_access_key</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|访问秘钥|
|<el-row justify="space-between"><el-col :span="20">unsplash_app_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|应用程序ID|
|<el-row justify="space-between"><el-col :span="20">use_invoice_terms</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|默认条款和条件|
|<el-row justify="space-between"><el-col :span="20">use_manufacturing_lead</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|默认制造提前期|
|<el-row justify="space-between"><el-col :span="20">use_po_lead</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|安全交货时间|
|<el-row justify="space-between"><el-col :span="20">use_security_lead</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|销售的安全提前期|
|<el-row justify="space-between"><el-col :span="20">use_twilio_rtc_servers</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|使用 Twilio ICE 服务器|
|<el-row justify="space-between"><el-col :span="20">user_default_rights</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|默认访问权限|
|<el-row justify="space-between"><el-col :span="20">web_app_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|网络应用程序名称|



##### 请求示例： {docsify-ignore}
```json
{
  "account_default_credit_limit" : null,
  "active_user_count" : null,
  "auth_signup_reset_password" : null,
  "auth_signup_template_user_id" : null,
  "auth_signup_uninvited" : null,
  "automatic_invoice" : null,
  "barcode_separator" : null,
  "company_count" : null,
  "company_id" : null,
  "company_informations" : null,
  "company_name" : null,
  "create_date" : null,
  "create_uid" : null,
  "crm_auto_assignment_action" : null,
  "crm_auto_assignment_interval_number" : null,
  "crm_auto_assignment_interval_type" : null,
  "crm_auto_assignment_run_datetime" : null,
  "crm_use_auto_assignment" : null,
  "default_invoice_policy" : null,
  "default_picking_policy" : null,
  "default_purchase_method" : null,
  "delay_alert_contract" : null,
  "digest_emails" : null,
  "display_name" : null,
  "external_email_server_default" : null,
  "fail_counter" : null,
  "google_gmail_client_identifier" : null,
  "google_gmail_client_secret" : null,
  "google_translate_api_key" : null,
  "group_analytic_accounting" : null,
  "group_applicant_cv_display" : null,
  "group_auto_done_setting" : null,
  "group_cash_rounding" : null,
  "group_discount_per_so_line" : null,
  "group_lot_on_delivery_slip" : null,
  "group_lot_on_invoice" : null,
  "group_mass_mailing_campaign" : null,
  "group_mrp_byproducts" : null,
  "group_mrp_reception_report" : null,
  "group_mrp_routings" : null,
  "group_mrp_workorder_dependencies" : null,
  "group_multi_currency" : null,
  "group_product_pricelist" : null,
  "group_product_variant" : null,
  "group_proforma_sales" : null,
  "group_project_milestone" : null,
  "group_project_rating" : null,
  "group_project_recurring_tasks" : null,
  "group_project_stages" : null,
  "group_project_task_dependencies" : null,
  "group_sale_delivery_address" : null,
  "group_sale_order_template" : null,
  "group_send_reminder" : null,
  "group_show_purchase_receipts" : null,
  "group_show_sale_receipts" : null,
  "group_stock_accounting_automatic" : null,
  "group_stock_adv_location" : null,
  "group_stock_lot_print_gs1" : null,
  "group_stock_multi_locations" : null,
  "group_stock_packaging" : null,
  "group_stock_production_lot" : null,
  "group_stock_reception_report" : null,
  "group_stock_sign_delivery" : null,
  "group_stock_tracking_lot" : null,
  "group_stock_tracking_owner" : null,
  "group_unlocked_by_default" : null,
  "group_uom" : null,
  "group_use_lead" : null,
  "group_use_recurring_revenues" : null,
  "group_warning_account" : null,
  "group_warning_purchase" : null,
  "group_warning_sale" : null,
  "group_warning_stock" : null,
  "has_accounting_entries" : null,
  "has_chart_of_accounts" : null,
  "hr_employee_self_edit" : null,
  "hr_expense_alias_prefix" : null,
  "hr_expense_use_mailgateway" : null,
  "id" : null,
  "invoice_mail_template_id" : null,
  "is_account_peppol_eligible" : null,
  "is_installed_sale" : null,
  "is_membership_multi" : null,
  "is_root_company" : null,
  "language_count" : null,
  "lead_enrich_auto" : null,
  "lead_mining_in_pipeline" : null,
  "lock_confirmed_po" : null,
  "mass_mailing_outgoing_mail_server" : null,
  "mass_mailing_reports" : null,
  "mass_mailing_split_contact_name" : null,
  "module_account3way_match" : null,
  "module_account_accountant" : null,
  "module_account_bank_statement_extract" : null,
  "module_account_bank_statement_import_camt" : null,
  "module_account_bank_statement_import_csv" : null,
  "module_account_bank_statement_import_ofx" : null,
  "module_account_bank_statement_import_qif" : null,
  "module_account_batch_payment" : null,
  "module_account_budget" : null,
  "module_account_check_printing" : null,
  "module_account_extract" : null,
  "module_account_inter_company_rules" : null,
  "module_account_intrastat" : null,
  "module_account_invoice_extract" : null,
  "module_account_iso20022" : null,
  "module_account_payment" : null,
  "module_account_peppol" : null,
  "module_account_reports" : null,
  "module_account_sepa_direct_debit" : null,
  "module_auth_ldap" : null,
  "module_auth_oauth" : null,
  "module_base_geolocalize" : null,
  "module_base_import" : null,
  "module_crm_iap_enrich" : null,
  "module_crm_iap_mine" : null,
  "module_currency_rate_live" : null,
  "module_delivery" : null,
  "module_delivery_bpost" : null,
  "module_delivery_dhl" : null,
  "module_delivery_easypost" : null,
  "module_delivery_fedex" : null,
  "module_delivery_sendcloud" : null,
  "module_delivery_shiprocket" : null,
  "module_delivery_starshipit" : null,
  "module_delivery_ups" : null,
  "module_delivery_usps" : null,
  "module_google_calendar" : null,
  "module_google_gmail" : null,
  "module_google_recaptcha" : null,
  "module_hr_expense_extract" : null,
  "module_hr_homeworking" : null,
  "module_hr_payroll_expense" : null,
  "module_hr_presence" : null,
  "module_hr_recruitment_extract" : null,
  "module_hr_recruitment_survey" : null,
  "module_hr_skills" : null,
  "module_hr_timesheet" : null,
  "module_l10n_eu_oss" : null,
  "module_loyalty" : null,
  "module_mail_plugin" : null,
  "module_maintenance_worksheet" : null,
  "module_microsoft_calendar" : null,
  "module_microsoft_outlook" : null,
  "module_mrp_mps" : null,
  "module_mrp_plm" : null,
  "module_mrp_subcontracting" : null,
  "module_partner_autocomplete" : null,
  "module_product_email_template" : null,
  "module_product_expiry" : null,
  "module_product_images" : null,
  "module_product_margin" : null,
  "module_purchase_product_matrix" : null,
  "module_purchase_requisition" : null,
  "module_quality_control" : null,
  "module_quality_control_worksheet" : null,
  "module_sale_amazon" : null,
  "module_sale_commission" : null,
  "module_sale_loyalty" : null,
  "module_sale_margin" : null,
  "module_sale_pdf_quote_builder" : null,
  "module_sale_product_matrix" : null,
  "module_sms" : null,
  "module_snailmail_account" : null,
  "module_stock_barcode" : null,
  "module_stock_barcode_barcodelookup" : null,
  "module_stock_dropshipping" : null,
  "module_stock_fleet" : null,
  "module_stock_landed_costs" : null,
  "module_stock_picking_batch" : null,
  "module_stock_sms" : null,
  "module_voip" : null,
  "module_web_unsplash" : null,
  "module_website_cf_turnstile" : null,
  "module_website_crm_iap_reveal" : null,
  "module_website_hr_recruitment" : null,
  "overtime_company_threshold" : null,
  "overtime_employee_threshold" : null,
  "partner_autocomplete_insufficient_credit" : null,
  "pay_invoices_online" : null,
  "po_order_approval" : null,
  "portal_allow_api_keys" : null,
  "predictive_lead_scoring_field_labels" : null,
  "predictive_lead_scoring_fields_str" : null,
  "predictive_lead_scoring_start_date" : null,
  "predictive_lead_scoring_start_date_str" : null,
  "preview_ready" : null,
  "product_volume_volume_in_cubic_feet" : null,
  "product_weight_in_lbs" : null,
  "profiling_enabled_until" : null,
  "restrict_template_rendering" : null,
  "sfu_server_key" : null,
  "sfu_server_url" : null,
  "show_blacklist_buttons" : null,
  "show_effect" : null,
  "snailmail_cover_readonly" : null,
  "tenor_api_key" : null,
  "tenor_content_filter" : null,
  "tenor_gif_limit" : null,
  "twilio_account_sid" : null,
  "twilio_account_token" : null,
  "unsplash_access_key" : null,
  "unsplash_app_id" : null,
  "use_invoice_terms" : null,
  "use_manufacturing_lead" : null,
  "use_po_lead" : null,
  "use_security_lead" : null,
  "use_twilio_rtc_servers" : null,
  "user_default_rights" : null,
  "web_app_name" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "account_default_credit_limit" : null,
  "active_user_count" : null,
  "auth_signup_reset_password" : null,
  "auth_signup_template_user_id" : null,
  "auth_signup_uninvited" : null,
  "automatic_invoice" : null,
  "barcode_separator" : null,
  "company_count" : null,
  "company_id" : null,
  "company_informations" : null,
  "company_name" : null,
  "create_date" : null,
  "create_uid" : null,
  "crm_auto_assignment_action" : null,
  "crm_auto_assignment_interval_number" : null,
  "crm_auto_assignment_interval_type" : null,
  "crm_auto_assignment_run_datetime" : null,
  "crm_use_auto_assignment" : null,
  "default_invoice_policy" : null,
  "default_picking_policy" : null,
  "default_purchase_method" : null,
  "delay_alert_contract" : null,
  "digest_emails" : null,
  "display_name" : null,
  "external_email_server_default" : null,
  "fail_counter" : null,
  "google_gmail_client_identifier" : null,
  "google_gmail_client_secret" : null,
  "google_translate_api_key" : null,
  "group_analytic_accounting" : null,
  "group_applicant_cv_display" : null,
  "group_auto_done_setting" : null,
  "group_cash_rounding" : null,
  "group_discount_per_so_line" : null,
  "group_lot_on_delivery_slip" : null,
  "group_lot_on_invoice" : null,
  "group_mass_mailing_campaign" : null,
  "group_mrp_byproducts" : null,
  "group_mrp_reception_report" : null,
  "group_mrp_routings" : null,
  "group_mrp_workorder_dependencies" : null,
  "group_multi_currency" : null,
  "group_product_pricelist" : null,
  "group_product_variant" : null,
  "group_proforma_sales" : null,
  "group_project_milestone" : null,
  "group_project_rating" : null,
  "group_project_recurring_tasks" : null,
  "group_project_stages" : null,
  "group_project_task_dependencies" : null,
  "group_sale_delivery_address" : null,
  "group_sale_order_template" : null,
  "group_send_reminder" : null,
  "group_show_purchase_receipts" : null,
  "group_show_sale_receipts" : null,
  "group_stock_accounting_automatic" : null,
  "group_stock_adv_location" : null,
  "group_stock_lot_print_gs1" : null,
  "group_stock_multi_locations" : null,
  "group_stock_packaging" : null,
  "group_stock_production_lot" : null,
  "group_stock_reception_report" : null,
  "group_stock_sign_delivery" : null,
  "group_stock_tracking_lot" : null,
  "group_stock_tracking_owner" : null,
  "group_unlocked_by_default" : null,
  "group_uom" : null,
  "group_use_lead" : null,
  "group_use_recurring_revenues" : null,
  "group_warning_account" : null,
  "group_warning_purchase" : null,
  "group_warning_sale" : null,
  "group_warning_stock" : null,
  "has_accounting_entries" : null,
  "has_chart_of_accounts" : null,
  "hr_employee_self_edit" : null,
  "hr_expense_alias_prefix" : null,
  "hr_expense_use_mailgateway" : null,
  "id" : null,
  "invoice_mail_template_id" : null,
  "is_account_peppol_eligible" : null,
  "is_installed_sale" : null,
  "is_membership_multi" : null,
  "is_root_company" : null,
  "language_count" : null,
  "lead_enrich_auto" : null,
  "lead_mining_in_pipeline" : null,
  "lock_confirmed_po" : null,
  "mass_mailing_outgoing_mail_server" : null,
  "mass_mailing_reports" : null,
  "mass_mailing_split_contact_name" : null,
  "module_account3way_match" : null,
  "module_account_accountant" : null,
  "module_account_bank_statement_extract" : null,
  "module_account_bank_statement_import_camt" : null,
  "module_account_bank_statement_import_csv" : null,
  "module_account_bank_statement_import_ofx" : null,
  "module_account_bank_statement_import_qif" : null,
  "module_account_batch_payment" : null,
  "module_account_budget" : null,
  "module_account_check_printing" : null,
  "module_account_extract" : null,
  "module_account_inter_company_rules" : null,
  "module_account_intrastat" : null,
  "module_account_invoice_extract" : null,
  "module_account_iso20022" : null,
  "module_account_payment" : null,
  "module_account_peppol" : null,
  "module_account_reports" : null,
  "module_account_sepa_direct_debit" : null,
  "module_auth_ldap" : null,
  "module_auth_oauth" : null,
  "module_base_geolocalize" : null,
  "module_base_import" : null,
  "module_crm_iap_enrich" : null,
  "module_crm_iap_mine" : null,
  "module_currency_rate_live" : null,
  "module_delivery" : null,
  "module_delivery_bpost" : null,
  "module_delivery_dhl" : null,
  "module_delivery_easypost" : null,
  "module_delivery_fedex" : null,
  "module_delivery_sendcloud" : null,
  "module_delivery_shiprocket" : null,
  "module_delivery_starshipit" : null,
  "module_delivery_ups" : null,
  "module_delivery_usps" : null,
  "module_google_calendar" : null,
  "module_google_gmail" : null,
  "module_google_recaptcha" : null,
  "module_hr_expense_extract" : null,
  "module_hr_homeworking" : null,
  "module_hr_payroll_expense" : null,
  "module_hr_presence" : null,
  "module_hr_recruitment_extract" : null,
  "module_hr_recruitment_survey" : null,
  "module_hr_skills" : null,
  "module_hr_timesheet" : null,
  "module_l10n_eu_oss" : null,
  "module_loyalty" : null,
  "module_mail_plugin" : null,
  "module_maintenance_worksheet" : null,
  "module_microsoft_calendar" : null,
  "module_microsoft_outlook" : null,
  "module_mrp_mps" : null,
  "module_mrp_plm" : null,
  "module_mrp_subcontracting" : null,
  "module_partner_autocomplete" : null,
  "module_product_email_template" : null,
  "module_product_expiry" : null,
  "module_product_images" : null,
  "module_product_margin" : null,
  "module_purchase_product_matrix" : null,
  "module_purchase_requisition" : null,
  "module_quality_control" : null,
  "module_quality_control_worksheet" : null,
  "module_sale_amazon" : null,
  "module_sale_commission" : null,
  "module_sale_loyalty" : null,
  "module_sale_margin" : null,
  "module_sale_pdf_quote_builder" : null,
  "module_sale_product_matrix" : null,
  "module_sms" : null,
  "module_snailmail_account" : null,
  "module_stock_barcode" : null,
  "module_stock_barcode_barcodelookup" : null,
  "module_stock_dropshipping" : null,
  "module_stock_fleet" : null,
  "module_stock_landed_costs" : null,
  "module_stock_picking_batch" : null,
  "module_stock_sms" : null,
  "module_voip" : null,
  "module_web_unsplash" : null,
  "module_website_cf_turnstile" : null,
  "module_website_crm_iap_reveal" : null,
  "module_website_hr_recruitment" : null,
  "overtime_company_threshold" : null,
  "overtime_employee_threshold" : null,
  "partner_autocomplete_insufficient_credit" : null,
  "pay_invoices_online" : null,
  "po_order_approval" : null,
  "portal_allow_api_keys" : null,
  "predictive_lead_scoring_field_labels" : null,
  "predictive_lead_scoring_fields_str" : null,
  "predictive_lead_scoring_start_date" : null,
  "predictive_lead_scoring_start_date_str" : null,
  "preview_ready" : null,
  "product_volume_volume_in_cubic_feet" : null,
  "product_weight_in_lbs" : null,
  "profiling_enabled_until" : null,
  "restrict_template_rendering" : null,
  "sfu_server_key" : null,
  "sfu_server_url" : null,
  "show_blacklist_buttons" : null,
  "show_effect" : null,
  "snailmail_cover_readonly" : null,
  "tenor_api_key" : null,
  "tenor_content_filter" : null,
  "tenor_gif_limit" : null,
  "twilio_account_sid" : null,
  "twilio_account_token" : null,
  "unsplash_access_key" : null,
  "unsplash_app_id" : null,
  "use_invoice_terms" : null,
  "use_manufacturing_lead" : null,
  "use_po_lead" : null,
  "use_security_lead" : null,
  "use_twilio_rtc_servers" : null,
  "user_default_rights" : null,
  "web_app_name" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 获取配置设定

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/res_config_settings/{key}" type="info" :closable="false" ></el-alert>
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
  "account_default_credit_limit" : null,
  "active_user_count" : null,
  "auth_signup_reset_password" : null,
  "auth_signup_template_user_id" : null,
  "auth_signup_uninvited" : null,
  "automatic_invoice" : null,
  "barcode_separator" : null,
  "company_count" : null,
  "company_id" : null,
  "company_informations" : null,
  "company_name" : null,
  "create_date" : null,
  "create_uid" : null,
  "crm_auto_assignment_action" : null,
  "crm_auto_assignment_interval_number" : null,
  "crm_auto_assignment_interval_type" : null,
  "crm_auto_assignment_run_datetime" : null,
  "crm_use_auto_assignment" : null,
  "default_invoice_policy" : null,
  "default_picking_policy" : null,
  "default_purchase_method" : null,
  "delay_alert_contract" : null,
  "digest_emails" : null,
  "display_name" : null,
  "external_email_server_default" : null,
  "fail_counter" : null,
  "google_gmail_client_identifier" : null,
  "google_gmail_client_secret" : null,
  "google_translate_api_key" : null,
  "group_analytic_accounting" : null,
  "group_applicant_cv_display" : null,
  "group_auto_done_setting" : null,
  "group_cash_rounding" : null,
  "group_discount_per_so_line" : null,
  "group_lot_on_delivery_slip" : null,
  "group_lot_on_invoice" : null,
  "group_mass_mailing_campaign" : null,
  "group_mrp_byproducts" : null,
  "group_mrp_reception_report" : null,
  "group_mrp_routings" : null,
  "group_mrp_workorder_dependencies" : null,
  "group_multi_currency" : null,
  "group_product_pricelist" : null,
  "group_product_variant" : null,
  "group_proforma_sales" : null,
  "group_project_milestone" : null,
  "group_project_rating" : null,
  "group_project_recurring_tasks" : null,
  "group_project_stages" : null,
  "group_project_task_dependencies" : null,
  "group_sale_delivery_address" : null,
  "group_sale_order_template" : null,
  "group_send_reminder" : null,
  "group_show_purchase_receipts" : null,
  "group_show_sale_receipts" : null,
  "group_stock_accounting_automatic" : null,
  "group_stock_adv_location" : null,
  "group_stock_lot_print_gs1" : null,
  "group_stock_multi_locations" : null,
  "group_stock_packaging" : null,
  "group_stock_production_lot" : null,
  "group_stock_reception_report" : null,
  "group_stock_sign_delivery" : null,
  "group_stock_tracking_lot" : null,
  "group_stock_tracking_owner" : null,
  "group_unlocked_by_default" : null,
  "group_uom" : null,
  "group_use_lead" : null,
  "group_use_recurring_revenues" : null,
  "group_warning_account" : null,
  "group_warning_purchase" : null,
  "group_warning_sale" : null,
  "group_warning_stock" : null,
  "has_accounting_entries" : null,
  "has_chart_of_accounts" : null,
  "hr_employee_self_edit" : null,
  "hr_expense_alias_prefix" : null,
  "hr_expense_use_mailgateway" : null,
  "id" : null,
  "invoice_mail_template_id" : null,
  "is_account_peppol_eligible" : null,
  "is_installed_sale" : null,
  "is_membership_multi" : null,
  "is_root_company" : null,
  "language_count" : null,
  "lead_enrich_auto" : null,
  "lead_mining_in_pipeline" : null,
  "lock_confirmed_po" : null,
  "mass_mailing_outgoing_mail_server" : null,
  "mass_mailing_reports" : null,
  "mass_mailing_split_contact_name" : null,
  "module_account3way_match" : null,
  "module_account_accountant" : null,
  "module_account_bank_statement_extract" : null,
  "module_account_bank_statement_import_camt" : null,
  "module_account_bank_statement_import_csv" : null,
  "module_account_bank_statement_import_ofx" : null,
  "module_account_bank_statement_import_qif" : null,
  "module_account_batch_payment" : null,
  "module_account_budget" : null,
  "module_account_check_printing" : null,
  "module_account_extract" : null,
  "module_account_inter_company_rules" : null,
  "module_account_intrastat" : null,
  "module_account_invoice_extract" : null,
  "module_account_iso20022" : null,
  "module_account_payment" : null,
  "module_account_peppol" : null,
  "module_account_reports" : null,
  "module_account_sepa_direct_debit" : null,
  "module_auth_ldap" : null,
  "module_auth_oauth" : null,
  "module_base_geolocalize" : null,
  "module_base_import" : null,
  "module_crm_iap_enrich" : null,
  "module_crm_iap_mine" : null,
  "module_currency_rate_live" : null,
  "module_delivery" : null,
  "module_delivery_bpost" : null,
  "module_delivery_dhl" : null,
  "module_delivery_easypost" : null,
  "module_delivery_fedex" : null,
  "module_delivery_sendcloud" : null,
  "module_delivery_shiprocket" : null,
  "module_delivery_starshipit" : null,
  "module_delivery_ups" : null,
  "module_delivery_usps" : null,
  "module_google_calendar" : null,
  "module_google_gmail" : null,
  "module_google_recaptcha" : null,
  "module_hr_expense_extract" : null,
  "module_hr_homeworking" : null,
  "module_hr_payroll_expense" : null,
  "module_hr_presence" : null,
  "module_hr_recruitment_extract" : null,
  "module_hr_recruitment_survey" : null,
  "module_hr_skills" : null,
  "module_hr_timesheet" : null,
  "module_l10n_eu_oss" : null,
  "module_loyalty" : null,
  "module_mail_plugin" : null,
  "module_maintenance_worksheet" : null,
  "module_microsoft_calendar" : null,
  "module_microsoft_outlook" : null,
  "module_mrp_mps" : null,
  "module_mrp_plm" : null,
  "module_mrp_subcontracting" : null,
  "module_partner_autocomplete" : null,
  "module_product_email_template" : null,
  "module_product_expiry" : null,
  "module_product_images" : null,
  "module_product_margin" : null,
  "module_purchase_product_matrix" : null,
  "module_purchase_requisition" : null,
  "module_quality_control" : null,
  "module_quality_control_worksheet" : null,
  "module_sale_amazon" : null,
  "module_sale_commission" : null,
  "module_sale_loyalty" : null,
  "module_sale_margin" : null,
  "module_sale_pdf_quote_builder" : null,
  "module_sale_product_matrix" : null,
  "module_sms" : null,
  "module_snailmail_account" : null,
  "module_stock_barcode" : null,
  "module_stock_barcode_barcodelookup" : null,
  "module_stock_dropshipping" : null,
  "module_stock_fleet" : null,
  "module_stock_landed_costs" : null,
  "module_stock_picking_batch" : null,
  "module_stock_sms" : null,
  "module_voip" : null,
  "module_web_unsplash" : null,
  "module_website_cf_turnstile" : null,
  "module_website_crm_iap_reveal" : null,
  "module_website_hr_recruitment" : null,
  "overtime_company_threshold" : null,
  "overtime_employee_threshold" : null,
  "partner_autocomplete_insufficient_credit" : null,
  "pay_invoices_online" : null,
  "po_order_approval" : null,
  "portal_allow_api_keys" : null,
  "predictive_lead_scoring_field_labels" : null,
  "predictive_lead_scoring_fields_str" : null,
  "predictive_lead_scoring_start_date" : null,
  "predictive_lead_scoring_start_date_str" : null,
  "preview_ready" : null,
  "product_volume_volume_in_cubic_feet" : null,
  "product_weight_in_lbs" : null,
  "profiling_enabled_until" : null,
  "restrict_template_rendering" : null,
  "sfu_server_key" : null,
  "sfu_server_url" : null,
  "show_blacklist_buttons" : null,
  "show_effect" : null,
  "snailmail_cover_readonly" : null,
  "tenor_api_key" : null,
  "tenor_content_filter" : null,
  "tenor_gif_limit" : null,
  "twilio_account_sid" : null,
  "twilio_account_token" : null,
  "unsplash_access_key" : null,
  "unsplash_app_id" : null,
  "use_invoice_terms" : null,
  "use_manufacturing_lead" : null,
  "use_po_lead" : null,
  "use_security_lead" : null,
  "use_twilio_rtc_servers" : null,
  "user_default_rights" : null,
  "web_app_name" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 删除配置设定

<el-row>
<div style="width: 80px">
<el-alert center title="DELETE" type="error" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/res_config_settings/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`DELETE`

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|标识|





## 更新配置设定

<el-row>
<div style="width: 80px">
<el-alert center title="PUT" type="warning" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/res_config_settings/{key}" type="info" :closable="false" ></el-alert>
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
|<el-row justify="space-between"><el-col :span="20">account_default_credit_limit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|默认信用额度|
|<el-row justify="space-between"><el-col :span="20">active_user_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效用户数量|
|<el-row justify="space-between"><el-col :span="20">auth_signup_reset_password</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|允许在登录页开启密码重置功能|
|<el-row justify="space-between"><el-col :span="20">auth_signup_template_user_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用作通过注册创建的新用户的模版|
|<el-row justify="space-between"><el-col :span="20">auth_signup_uninvited</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|客户帐号|
|<el-row justify="space-between"><el-col :span="20">automatic_invoice</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|自动发票|
|<el-row justify="space-between"><el-col :span="20">barcode_separator</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|分隔符|
|<el-row justify="space-between"><el-col :span="20">company_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|公司数量|
|<el-row justify="space-between"><el-col :span="20">company_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">company_informations</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司信息|
|<el-row justify="space-between"><el-col :span="20">company_name</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">crm_auto_assignment_action</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|自动分配操作|
|<el-row justify="space-between"><el-col :span="20">crm_auto_assignment_interval_number</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|重复间隔为每|
|<el-row justify="space-between"><el-col :span="20">crm_auto_assignment_interval_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|自动分配间隔单位|
|<el-row justify="space-between"><el-col :span="20">crm_auto_assignment_run_datetime</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|自动指派下次执行日期|
|<el-row justify="space-between"><el-col :span="20">crm_use_auto_assignment</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|基于规则的分配|
|<el-row justify="space-between"><el-col :span="20">default_invoice_policy</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|开票原则|
|<el-row justify="space-between"><el-col :span="20">default_picking_policy</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|拣货策略|
|<el-row justify="space-between"><el-col :span="20">default_purchase_method</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|账单管理|
|<el-row justify="space-between"><el-col :span="20">delay_alert_contract</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|合同逾期延时预警|
|<el-row justify="space-between"><el-col :span="20">digest_emails</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|摘要邮件|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">external_email_server_default</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|使用自定义电子邮件服务器|
|<el-row justify="space-between"><el-col :span="20">fail_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|失败的邮件|
|<el-row justify="space-between"><el-col :span="20">google_gmail_client_identifier</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Gmail 客户端 ID|
|<el-row justify="space-between"><el-col :span="20">google_gmail_client_secret</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Gmail客户端Secret|
|<el-row justify="space-between"><el-col :span="20">google_translate_api_key</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|消息翻译 API 密钥|
|<el-row justify="space-between"><el-col :span="20">group_analytic_accounting</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|分析会计|
|<el-row justify="space-between"><el-col :span="20">group_applicant_cv_display</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|团体申请人简历展示|
|<el-row justify="space-between"><el-col :span="20">group_auto_done_setting</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|锁定已确认的销售订单|
|<el-row justify="space-between"><el-col :span="20">group_cash_rounding</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|现金舍入|
|<el-row justify="space-between"><el-col :span="20">group_discount_per_so_line</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|折扣|
|<el-row justify="space-between"><el-col :span="20">group_lot_on_delivery_slip</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|在送货单上显示批次 / 序列号|
|<el-row justify="space-between"><el-col :span="20">group_lot_on_invoice</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|在结算单上显示批次 / 序列号|
|<el-row justify="space-between"><el-col :span="20">group_mass_mailing_campaign</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|邮件营销|
|<el-row justify="space-between"><el-col :span="20">group_mrp_byproducts</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|副产品|
|<el-row justify="space-between"><el-col :span="20">group_mrp_reception_report</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|制造订单分配报表|
|<el-row justify="space-between"><el-col :span="20">group_mrp_routings</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|物料需求计划（MRP）工单|
|<el-row justify="space-between"><el-col :span="20">group_mrp_workorder_dependencies</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|工单依赖性|
|<el-row justify="space-between"><el-col :span="20">group_multi_currency</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|多币别|
|<el-row justify="space-between"><el-col :span="20">group_product_pricelist</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|价格表|
|<el-row justify="space-between"><el-col :span="20">group_product_variant</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|变体|
|<el-row justify="space-between"><el-col :span="20">group_proforma_sales</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|形式发票|
|<el-row justify="space-between"><el-col :span="20">group_project_milestone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|里程碑|
|<el-row justify="space-between"><el-col :span="20">group_project_rating</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|客户点评|
|<el-row justify="space-between"><el-col :span="20">group_project_recurring_tasks</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|周期任务|
|<el-row justify="space-between"><el-col :span="20">group_project_stages</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|项目阶段|
|<el-row justify="space-between"><el-col :span="20">group_project_task_dependencies</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|任务依赖|
|<el-row justify="space-between"><el-col :span="20">group_sale_delivery_address</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|客户地址|
|<el-row justify="space-between"><el-col :span="20">group_sale_order_template</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|报价模板|
|<el-row justify="space-between"><el-col :span="20">group_send_reminder</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|收货提醒|
|<el-row justify="space-between"><el-col :span="20">group_show_purchase_receipts</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|采购收据|
|<el-row justify="space-between"><el-col :span="20">group_show_sale_receipts</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|销售收据|
|<el-row justify="space-between"><el-col :span="20">group_stock_accounting_automatic</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|自动库存会计|
|<el-row justify="space-between"><el-col :span="20">group_stock_adv_location</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|多步路线|
|<el-row justify="space-between"><el-col :span="20">group_stock_lot_print_gs1</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|使用GS1编码格式打印批号和序列号|
|<el-row justify="space-between"><el-col :span="20">group_stock_multi_locations</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|储存位置|
|<el-row justify="space-between"><el-col :span="20">group_stock_packaging</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|产品包装|
|<el-row justify="space-between"><el-col :span="20">group_stock_production_lot</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|批次 / 序列号|
|<el-row justify="space-between"><el-col :span="20">group_stock_reception_report</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|库存接收报表|
|<el-row justify="space-between"><el-col :span="20">group_stock_sign_delivery</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|签名|
|<el-row justify="space-between"><el-col :span="20">group_stock_tracking_lot</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|包裹|
|<el-row justify="space-between"><el-col :span="20">group_stock_tracking_owner</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|寄售|
|<el-row justify="space-between"><el-col :span="20">group_unlocked_by_default</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|解锁制造订单|
|<el-row justify="space-between"><el-col :span="20">group_uom</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|计量单位|
|<el-row justify="space-between"><el-col :span="20">group_use_lead</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|线索|
|<el-row justify="space-between"><el-col :span="20">group_use_recurring_revenues</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|经常性收入|
|<el-row justify="space-between"><el-col :span="20">group_warning_account</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|发票中的警告|
|<el-row justify="space-between"><el-col :span="20">group_warning_purchase</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|采购警告|
|<el-row justify="space-between"><el-col :span="20">group_warning_sale</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|销售订单警告信息|
|<el-row justify="space-between"><el-col :span="20">group_warning_stock</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|库存警报|
|<el-row justify="space-between"><el-col :span="20">has_accounting_entries</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Has Accounting Entries|
|<el-row justify="space-between"><el-col :span="20">has_chart_of_accounts</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Company has a chart of accounts|
|<el-row justify="space-between"><el-col :span="20">hr_employee_self_edit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|员工编辑|
|<el-row justify="space-between"><el-col :span="20">hr_expense_alias_prefix</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|默认的费用别名|
|<el-row justify="space-between"><el-col :span="20">hr_expense_use_mailgateway</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|允许员工通过电子邮件记录费用|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">invoice_mail_template_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|发票电子邮件模板|
|<el-row justify="space-between"><el-col :span="20">is_account_peppol_eligible</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|PEPPOL 符合条件|
|<el-row justify="space-between"><el-col :span="20">is_installed_sale</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|销售模块是否已安装|
|<el-row justify="space-between"><el-col :span="20">is_membership_multi</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|多团队|
|<el-row justify="space-between"><el-col :span="20">is_root_company</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是母公司|
|<el-row justify="space-between"><el-col :span="20">language_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|语言数量|
|<el-row justify="space-between"><el-col :span="20">lead_enrich_auto</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|自动丰富线索|
|<el-row justify="space-between"><el-col :span="20">lead_mining_in_pipeline</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|直接从商机商机创建线索挖掘申请。|
|<el-row justify="space-between"><el-col :span="20">lock_confirmed_po</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|锁定已确认的订单|
|<el-row justify="space-between"><el-col :span="20">mass_mailing_outgoing_mail_server</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|专门服务器|
|<el-row justify="space-between"><el-col :span="20">mass_mailing_reports</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|24小时统计邮寄报告|
|<el-row justify="space-between"><el-col :span="20">mass_mailing_split_contact_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|拆分名字和姓氏|
|<el-row justify="space-between"><el-col :span="20">module_account3way_match</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|3单匹配:采购订单，收货单与发票|
|<el-row justify="space-between"><el-col :span="20">module_account_accountant</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|会计|
|<el-row justify="space-between"><el-col :span="20">module_account_bank_statement_extract</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Bank Statement Digitization|
|<el-row justify="space-between"><el-col :span="20">module_account_bank_statement_import_camt</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|以CAMT.053 格式导入|
|<el-row justify="space-between"><el-col :span="20">module_account_bank_statement_import_csv</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|以.csv、.xls和.xlsx格式导入|
|<el-row justify="space-between"><el-col :span="20">module_account_bank_statement_import_ofx</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|以.ofx格式导入|
|<el-row justify="space-between"><el-col :span="20">module_account_bank_statement_import_qif</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|导入.qif单据|
|<el-row justify="space-between"><el-col :span="20">module_account_batch_payment</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|使用批量付款|
|<el-row justify="space-between"><el-col :span="20">module_account_budget</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|预算管理|
|<el-row justify="space-between"><el-col :span="20">module_account_check_printing</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Allow check printing and deposits|
|<el-row justify="space-between"><el-col :span="20">module_account_extract</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Document Digitization|
|<el-row justify="space-between"><el-col :span="20">module_account_inter_company_rules</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|管理公司间交易|
|<el-row justify="space-between"><el-col :span="20">module_account_intrastat</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|国际联盟|
|<el-row justify="space-between"><el-col :span="20">module_account_invoice_extract</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Invoice Digitization|
|<el-row justify="space-between"><el-col :span="20">module_account_iso20022</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|SEPA Credit Transfer / ISO20022|
|<el-row justify="space-between"><el-col :span="20">module_account_payment</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Invoice Online Payment|
|<el-row justify="space-between"><el-col :span="20">module_account_peppol</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|PEPPOL 开具发票|
|<el-row justify="space-between"><el-col :span="20">module_account_reports</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Dynamic Reports|
|<el-row justify="space-between"><el-col :span="20">module_account_sepa_direct_debit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Use SEPA Direct Debit|
|<el-row justify="space-between"><el-col :span="20">module_auth_ldap</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|LDAP认证|
|<el-row justify="space-between"><el-col :span="20">module_auth_oauth</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|使用外部验证提供者 (OAuth)|
|<el-row justify="space-between"><el-col :span="20">module_base_geolocalize</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|地理定位|
|<el-row justify="space-between"><el-col :span="20">module_base_import</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|允许用户导入 CSV/XLS/XLSX/ODS格式的文档数据|
|<el-row justify="space-between"><el-col :span="20">module_crm_iap_enrich</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|根据线索的电子邮箱地址、使用公司数据自动丰富线索。|
|<el-row justify="space-between"><el-col :span="20">module_crm_iap_mine</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|基于国家/地区、行业、规模等信息生成新的线索。|
|<el-row justify="space-between"><el-col :span="20">module_currency_rate_live</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|自动汇率|
|<el-row justify="space-between"><el-col :span="20">module_delivery</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|交付方式|
|<el-row justify="space-between"><el-col :span="20">module_delivery_bpost</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|bpost连接器|
|<el-row justify="space-between"><el-col :span="20">module_delivery_dhl</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|DHL快递连接器|
|<el-row justify="space-between"><el-col :span="20">module_delivery_easypost</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Easypost连接器|
|<el-row justify="space-between"><el-col :span="20">module_delivery_fedex</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|FedEx连接器|
|<el-row justify="space-between"><el-col :span="20">module_delivery_sendcloud</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Sendcloud连接器|
|<el-row justify="space-between"><el-col :span="20">module_delivery_shiprocket</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Shiprocket 连接器|
|<el-row justify="space-between"><el-col :span="20">module_delivery_starshipit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Starshipit 连接器|
|<el-row justify="space-between"><el-col :span="20">module_delivery_ups</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|UPS连接器|
|<el-row justify="space-between"><el-col :span="20">module_delivery_usps</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|USPS连接器|
|<el-row justify="space-between"><el-col :span="20">module_google_calendar</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|允许用户同步谷歌日历|
|<el-row justify="space-between"><el-col :span="20">module_google_gmail</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|支持Gmail身份验证|
|<el-row justify="space-between"><el-col :span="20">module_google_recaptcha</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|验证码|
|<el-row justify="space-between"><el-col :span="20">module_hr_expense_extract</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|向OCR发送账单以产生费用|
|<el-row justify="space-between"><el-col :span="20">module_hr_homeworking</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|远程工作|
|<el-row justify="space-between"><el-col :span="20">module_hr_payroll_expense</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|工资单上的报销费用|
|<el-row justify="space-between"><el-col :span="20">module_hr_presence</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|高级出席控制|
|<el-row justify="space-between"><el-col :span="20">module_hr_recruitment_extract</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|将简历发送到 OCR 以填写申请|
|<el-row justify="space-between"><el-col :span="20">module_hr_recruitment_survey</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|面试表单|
|<el-row justify="space-between"><el-col :span="20">module_hr_skills</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|技能管理|
|<el-row justify="space-between"><el-col :span="20">module_hr_timesheet</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|任务日志|
|<el-row justify="space-between"><el-col :span="20">module_l10n_eu_oss</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|欧盟共同体内部远程销售|
|<el-row justify="space-between"><el-col :span="20">module_loyalty</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|促销、优惠券、礼品卡和会员方案|
|<el-row justify="space-between"><el-col :span="20">module_mail_plugin</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|允许与邮件插件集成|
|<el-row justify="space-between"><el-col :span="20">module_maintenance_worksheet</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|定制维护工作表|
|<el-row justify="space-between"><el-col :span="20">module_microsoft_calendar</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|允许用户同步Outlook日历|
|<el-row justify="space-between"><el-col :span="20">module_microsoft_outlook</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|支持Outlook身份验证|
|<el-row justify="space-between"><el-col :span="20">module_mrp_mps</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|主生产计划|
|<el-row justify="space-between"><el-col :span="20">module_mrp_plm</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|产品生命周期管理（PLM）|
|<el-row justify="space-between"><el-col :span="20">module_mrp_subcontracting</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|外包|
|<el-row justify="space-between"><el-col :span="20">module_partner_autocomplete</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|合作伙伴自动完成|
|<el-row justify="space-between"><el-col :span="20">module_product_email_template</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|特定的电子邮件|
|<el-row justify="space-between"><el-col :span="20">module_product_expiry</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|到期日期|
|<el-row justify="space-between"><el-col :span="20">module_product_images</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|使用条形码获取产品图片|
|<el-row justify="space-between"><el-col :span="20">module_product_margin</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|允许产品毛利|
|<el-row justify="space-between"><el-col :span="20">module_purchase_product_matrix</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|采购表格入口|
|<el-row justify="space-between"><el-col :span="20">module_purchase_requisition</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|采购协议|
|<el-row justify="space-between"><el-col :span="20">module_quality_control</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|质量|
|<el-row justify="space-between"><el-col :span="20">module_quality_control_worksheet</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|质量工作表|
|<el-row justify="space-between"><el-col :span="20">module_sale_amazon</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|亚马逊同步|
|<el-row justify="space-between"><el-col :span="20">module_sale_commission</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|佣金|
|<el-row justify="space-between"><el-col :span="20">module_sale_loyalty</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|优惠券和会员|
|<el-row justify="space-between"><el-col :span="20">module_sale_margin</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|毛利|
|<el-row justify="space-between"><el-col :span="20">module_sale_pdf_quote_builder</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|PDF 报价生成器|
|<el-row justify="space-between"><el-col :span="20">module_sale_product_matrix</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|销售表格录入|
|<el-row justify="space-between"><el-col :span="20">module_sms</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|短信息|
|<el-row justify="space-between"><el-col :span="20">module_snailmail_account</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|传统信件|
|<el-row justify="space-between"><el-col :span="20">module_stock_barcode</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|条码扫描器|
|<el-row justify="space-between"><el-col :span="20">module_stock_barcode_barcodelookup</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|库存条形码数据库|
|<el-row justify="space-between"><el-col :span="20">module_stock_dropshipping</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|代发货|
|<el-row justify="space-between"><el-col :span="20">module_stock_fleet</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|配送管理系统|
|<el-row justify="space-between"><el-col :span="20">module_stock_landed_costs</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|到岸成本|
|<el-row justify="space-between"><el-col :span="20">module_stock_picking_batch</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|批量、波次和集群调拨|
|<el-row justify="space-between"><el-col :span="20">module_stock_sms</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|短信息确认|
|<el-row justify="space-between"><el-col :span="20">module_voip</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|网络电话|
|<el-row justify="space-between"><el-col :span="20">module_web_unsplash</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Unsplash图像库|
|<el-row justify="space-between"><el-col :span="20">module_website_cf_turnstile</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Cloudflare Turnstile|
|<el-row justify="space-between"><el-col :span="20">module_website_crm_iap_reveal</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|从网站流量创建线索/商机|
|<el-row justify="space-between"><el-col :span="20">module_website_hr_recruitment</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|线上发布|
|<el-row justify="space-between"><el-col :span="20">overtime_company_threshold</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|对公司有利的宽容时间|
|<el-row justify="space-between"><el-col :span="20">overtime_employee_threshold</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|对员工有利的宽容时间|
|<el-row justify="space-between"><el-col :span="20">partner_autocomplete_insufficient_credit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|信用不足|
|<el-row justify="space-between"><el-col :span="20">pay_invoices_online</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|在线支付发票|
|<el-row justify="space-between"><el-col :span="20">po_order_approval</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|订单审批|
|<el-row justify="space-between"><el-col :span="20">portal_allow_api_keys</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|客户 API 密钥|
|<el-row justify="space-between"><el-col :span="20">predictive_lead_scoring_field_labels</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|预测线索评分字段标签|
|<el-row justify="space-between"><el-col :span="20">predictive_lead_scoring_fields_str</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|字符串中的线索评分频率字段|
|<el-row justify="space-between"><el-col :span="20">predictive_lead_scoring_start_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|线索评分开始日期|
|<el-row justify="space-between"><el-col :span="20">predictive_lead_scoring_start_date_str</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|字符串中的线索评分开始日期|
|<el-row justify="space-between"><el-col :span="20">preview_ready</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Display preview button|
|<el-row justify="space-between"><el-col :span="20">product_volume_volume_in_cubic_feet</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|体积单位|
|<el-row justify="space-between"><el-col :span="20">product_weight_in_lbs</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|重量单位|
|<el-row justify="space-between"><el-col :span="20">profiling_enabled_until</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|启用分析直到|
|<el-row justify="space-between"><el-col :span="20">restrict_template_rendering</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|限制模板渲染|
|<el-row justify="space-between"><el-col :span="20">sfu_server_key</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|SFU 服务器密钥|
|<el-row justify="space-between"><el-col :span="20">sfu_server_url</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|SFU 服务器 URL|
|<el-row justify="space-between"><el-col :span="20">show_blacklist_buttons</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|退订时黑名单选项|
|<el-row justify="space-between"><el-col :span="20">show_effect</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|显示效果|
|<el-row justify="space-between"><el-col :span="20">snailmail_cover_readonly</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|蜗牛邮件封面只读|
|<el-row justify="space-between"><el-col :span="20">tenor_api_key</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Tenor API 密钥|
|<el-row justify="space-between"><el-col :span="20">tenor_content_filter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Tenor 内容过滤器|
|<el-row justify="space-between"><el-col :span="20">tenor_gif_limit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Tenor Gif 限额|
|<el-row justify="space-between"><el-col :span="20">twilio_account_sid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Twilio 帐户 SID|
|<el-row justify="space-between"><el-col :span="20">twilio_account_token</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Twilio 帐户身份验证令牌|
|<el-row justify="space-between"><el-col :span="20">unsplash_access_key</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|访问秘钥|
|<el-row justify="space-between"><el-col :span="20">unsplash_app_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|应用程序ID|
|<el-row justify="space-between"><el-col :span="20">use_invoice_terms</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|默认条款和条件|
|<el-row justify="space-between"><el-col :span="20">use_manufacturing_lead</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|默认制造提前期|
|<el-row justify="space-between"><el-col :span="20">use_po_lead</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|安全交货时间|
|<el-row justify="space-between"><el-col :span="20">use_security_lead</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|销售的安全提前期|
|<el-row justify="space-between"><el-col :span="20">use_twilio_rtc_servers</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|使用 Twilio ICE 服务器|
|<el-row justify="space-between"><el-col :span="20">user_default_rights</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|默认访问权限|
|<el-row justify="space-between"><el-col :span="20">web_app_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|网络应用程序名称|



##### 请求示例： {docsify-ignore}
```json
{
  "account_default_credit_limit" : null,
  "active_user_count" : null,
  "auth_signup_reset_password" : null,
  "auth_signup_template_user_id" : null,
  "auth_signup_uninvited" : null,
  "automatic_invoice" : null,
  "barcode_separator" : null,
  "company_count" : null,
  "company_id" : null,
  "company_informations" : null,
  "company_name" : null,
  "create_date" : null,
  "create_uid" : null,
  "crm_auto_assignment_action" : null,
  "crm_auto_assignment_interval_number" : null,
  "crm_auto_assignment_interval_type" : null,
  "crm_auto_assignment_run_datetime" : null,
  "crm_use_auto_assignment" : null,
  "default_invoice_policy" : null,
  "default_picking_policy" : null,
  "default_purchase_method" : null,
  "delay_alert_contract" : null,
  "digest_emails" : null,
  "display_name" : null,
  "external_email_server_default" : null,
  "fail_counter" : null,
  "google_gmail_client_identifier" : null,
  "google_gmail_client_secret" : null,
  "google_translate_api_key" : null,
  "group_analytic_accounting" : null,
  "group_applicant_cv_display" : null,
  "group_auto_done_setting" : null,
  "group_cash_rounding" : null,
  "group_discount_per_so_line" : null,
  "group_lot_on_delivery_slip" : null,
  "group_lot_on_invoice" : null,
  "group_mass_mailing_campaign" : null,
  "group_mrp_byproducts" : null,
  "group_mrp_reception_report" : null,
  "group_mrp_routings" : null,
  "group_mrp_workorder_dependencies" : null,
  "group_multi_currency" : null,
  "group_product_pricelist" : null,
  "group_product_variant" : null,
  "group_proforma_sales" : null,
  "group_project_milestone" : null,
  "group_project_rating" : null,
  "group_project_recurring_tasks" : null,
  "group_project_stages" : null,
  "group_project_task_dependencies" : null,
  "group_sale_delivery_address" : null,
  "group_sale_order_template" : null,
  "group_send_reminder" : null,
  "group_show_purchase_receipts" : null,
  "group_show_sale_receipts" : null,
  "group_stock_accounting_automatic" : null,
  "group_stock_adv_location" : null,
  "group_stock_lot_print_gs1" : null,
  "group_stock_multi_locations" : null,
  "group_stock_packaging" : null,
  "group_stock_production_lot" : null,
  "group_stock_reception_report" : null,
  "group_stock_sign_delivery" : null,
  "group_stock_tracking_lot" : null,
  "group_stock_tracking_owner" : null,
  "group_unlocked_by_default" : null,
  "group_uom" : null,
  "group_use_lead" : null,
  "group_use_recurring_revenues" : null,
  "group_warning_account" : null,
  "group_warning_purchase" : null,
  "group_warning_sale" : null,
  "group_warning_stock" : null,
  "has_accounting_entries" : null,
  "has_chart_of_accounts" : null,
  "hr_employee_self_edit" : null,
  "hr_expense_alias_prefix" : null,
  "hr_expense_use_mailgateway" : null,
  "id" : null,
  "invoice_mail_template_id" : null,
  "is_account_peppol_eligible" : null,
  "is_installed_sale" : null,
  "is_membership_multi" : null,
  "is_root_company" : null,
  "language_count" : null,
  "lead_enrich_auto" : null,
  "lead_mining_in_pipeline" : null,
  "lock_confirmed_po" : null,
  "mass_mailing_outgoing_mail_server" : null,
  "mass_mailing_reports" : null,
  "mass_mailing_split_contact_name" : null,
  "module_account3way_match" : null,
  "module_account_accountant" : null,
  "module_account_bank_statement_extract" : null,
  "module_account_bank_statement_import_camt" : null,
  "module_account_bank_statement_import_csv" : null,
  "module_account_bank_statement_import_ofx" : null,
  "module_account_bank_statement_import_qif" : null,
  "module_account_batch_payment" : null,
  "module_account_budget" : null,
  "module_account_check_printing" : null,
  "module_account_extract" : null,
  "module_account_inter_company_rules" : null,
  "module_account_intrastat" : null,
  "module_account_invoice_extract" : null,
  "module_account_iso20022" : null,
  "module_account_payment" : null,
  "module_account_peppol" : null,
  "module_account_reports" : null,
  "module_account_sepa_direct_debit" : null,
  "module_auth_ldap" : null,
  "module_auth_oauth" : null,
  "module_base_geolocalize" : null,
  "module_base_import" : null,
  "module_crm_iap_enrich" : null,
  "module_crm_iap_mine" : null,
  "module_currency_rate_live" : null,
  "module_delivery" : null,
  "module_delivery_bpost" : null,
  "module_delivery_dhl" : null,
  "module_delivery_easypost" : null,
  "module_delivery_fedex" : null,
  "module_delivery_sendcloud" : null,
  "module_delivery_shiprocket" : null,
  "module_delivery_starshipit" : null,
  "module_delivery_ups" : null,
  "module_delivery_usps" : null,
  "module_google_calendar" : null,
  "module_google_gmail" : null,
  "module_google_recaptcha" : null,
  "module_hr_expense_extract" : null,
  "module_hr_homeworking" : null,
  "module_hr_payroll_expense" : null,
  "module_hr_presence" : null,
  "module_hr_recruitment_extract" : null,
  "module_hr_recruitment_survey" : null,
  "module_hr_skills" : null,
  "module_hr_timesheet" : null,
  "module_l10n_eu_oss" : null,
  "module_loyalty" : null,
  "module_mail_plugin" : null,
  "module_maintenance_worksheet" : null,
  "module_microsoft_calendar" : null,
  "module_microsoft_outlook" : null,
  "module_mrp_mps" : null,
  "module_mrp_plm" : null,
  "module_mrp_subcontracting" : null,
  "module_partner_autocomplete" : null,
  "module_product_email_template" : null,
  "module_product_expiry" : null,
  "module_product_images" : null,
  "module_product_margin" : null,
  "module_purchase_product_matrix" : null,
  "module_purchase_requisition" : null,
  "module_quality_control" : null,
  "module_quality_control_worksheet" : null,
  "module_sale_amazon" : null,
  "module_sale_commission" : null,
  "module_sale_loyalty" : null,
  "module_sale_margin" : null,
  "module_sale_pdf_quote_builder" : null,
  "module_sale_product_matrix" : null,
  "module_sms" : null,
  "module_snailmail_account" : null,
  "module_stock_barcode" : null,
  "module_stock_barcode_barcodelookup" : null,
  "module_stock_dropshipping" : null,
  "module_stock_fleet" : null,
  "module_stock_landed_costs" : null,
  "module_stock_picking_batch" : null,
  "module_stock_sms" : null,
  "module_voip" : null,
  "module_web_unsplash" : null,
  "module_website_cf_turnstile" : null,
  "module_website_crm_iap_reveal" : null,
  "module_website_hr_recruitment" : null,
  "overtime_company_threshold" : null,
  "overtime_employee_threshold" : null,
  "partner_autocomplete_insufficient_credit" : null,
  "pay_invoices_online" : null,
  "po_order_approval" : null,
  "portal_allow_api_keys" : null,
  "predictive_lead_scoring_field_labels" : null,
  "predictive_lead_scoring_fields_str" : null,
  "predictive_lead_scoring_start_date" : null,
  "predictive_lead_scoring_start_date_str" : null,
  "preview_ready" : null,
  "product_volume_volume_in_cubic_feet" : null,
  "product_weight_in_lbs" : null,
  "profiling_enabled_until" : null,
  "restrict_template_rendering" : null,
  "sfu_server_key" : null,
  "sfu_server_url" : null,
  "show_blacklist_buttons" : null,
  "show_effect" : null,
  "snailmail_cover_readonly" : null,
  "tenor_api_key" : null,
  "tenor_content_filter" : null,
  "tenor_gif_limit" : null,
  "twilio_account_sid" : null,
  "twilio_account_token" : null,
  "unsplash_access_key" : null,
  "unsplash_app_id" : null,
  "use_invoice_terms" : null,
  "use_manufacturing_lead" : null,
  "use_po_lead" : null,
  "use_security_lead" : null,
  "use_twilio_rtc_servers" : null,
  "user_default_rights" : null,
  "web_app_name" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "account_default_credit_limit" : null,
  "active_user_count" : null,
  "auth_signup_reset_password" : null,
  "auth_signup_template_user_id" : null,
  "auth_signup_uninvited" : null,
  "automatic_invoice" : null,
  "barcode_separator" : null,
  "company_count" : null,
  "company_id" : null,
  "company_informations" : null,
  "company_name" : null,
  "create_date" : null,
  "create_uid" : null,
  "crm_auto_assignment_action" : null,
  "crm_auto_assignment_interval_number" : null,
  "crm_auto_assignment_interval_type" : null,
  "crm_auto_assignment_run_datetime" : null,
  "crm_use_auto_assignment" : null,
  "default_invoice_policy" : null,
  "default_picking_policy" : null,
  "default_purchase_method" : null,
  "delay_alert_contract" : null,
  "digest_emails" : null,
  "display_name" : null,
  "external_email_server_default" : null,
  "fail_counter" : null,
  "google_gmail_client_identifier" : null,
  "google_gmail_client_secret" : null,
  "google_translate_api_key" : null,
  "group_analytic_accounting" : null,
  "group_applicant_cv_display" : null,
  "group_auto_done_setting" : null,
  "group_cash_rounding" : null,
  "group_discount_per_so_line" : null,
  "group_lot_on_delivery_slip" : null,
  "group_lot_on_invoice" : null,
  "group_mass_mailing_campaign" : null,
  "group_mrp_byproducts" : null,
  "group_mrp_reception_report" : null,
  "group_mrp_routings" : null,
  "group_mrp_workorder_dependencies" : null,
  "group_multi_currency" : null,
  "group_product_pricelist" : null,
  "group_product_variant" : null,
  "group_proforma_sales" : null,
  "group_project_milestone" : null,
  "group_project_rating" : null,
  "group_project_recurring_tasks" : null,
  "group_project_stages" : null,
  "group_project_task_dependencies" : null,
  "group_sale_delivery_address" : null,
  "group_sale_order_template" : null,
  "group_send_reminder" : null,
  "group_show_purchase_receipts" : null,
  "group_show_sale_receipts" : null,
  "group_stock_accounting_automatic" : null,
  "group_stock_adv_location" : null,
  "group_stock_lot_print_gs1" : null,
  "group_stock_multi_locations" : null,
  "group_stock_packaging" : null,
  "group_stock_production_lot" : null,
  "group_stock_reception_report" : null,
  "group_stock_sign_delivery" : null,
  "group_stock_tracking_lot" : null,
  "group_stock_tracking_owner" : null,
  "group_unlocked_by_default" : null,
  "group_uom" : null,
  "group_use_lead" : null,
  "group_use_recurring_revenues" : null,
  "group_warning_account" : null,
  "group_warning_purchase" : null,
  "group_warning_sale" : null,
  "group_warning_stock" : null,
  "has_accounting_entries" : null,
  "has_chart_of_accounts" : null,
  "hr_employee_self_edit" : null,
  "hr_expense_alias_prefix" : null,
  "hr_expense_use_mailgateway" : null,
  "id" : null,
  "invoice_mail_template_id" : null,
  "is_account_peppol_eligible" : null,
  "is_installed_sale" : null,
  "is_membership_multi" : null,
  "is_root_company" : null,
  "language_count" : null,
  "lead_enrich_auto" : null,
  "lead_mining_in_pipeline" : null,
  "lock_confirmed_po" : null,
  "mass_mailing_outgoing_mail_server" : null,
  "mass_mailing_reports" : null,
  "mass_mailing_split_contact_name" : null,
  "module_account3way_match" : null,
  "module_account_accountant" : null,
  "module_account_bank_statement_extract" : null,
  "module_account_bank_statement_import_camt" : null,
  "module_account_bank_statement_import_csv" : null,
  "module_account_bank_statement_import_ofx" : null,
  "module_account_bank_statement_import_qif" : null,
  "module_account_batch_payment" : null,
  "module_account_budget" : null,
  "module_account_check_printing" : null,
  "module_account_extract" : null,
  "module_account_inter_company_rules" : null,
  "module_account_intrastat" : null,
  "module_account_invoice_extract" : null,
  "module_account_iso20022" : null,
  "module_account_payment" : null,
  "module_account_peppol" : null,
  "module_account_reports" : null,
  "module_account_sepa_direct_debit" : null,
  "module_auth_ldap" : null,
  "module_auth_oauth" : null,
  "module_base_geolocalize" : null,
  "module_base_import" : null,
  "module_crm_iap_enrich" : null,
  "module_crm_iap_mine" : null,
  "module_currency_rate_live" : null,
  "module_delivery" : null,
  "module_delivery_bpost" : null,
  "module_delivery_dhl" : null,
  "module_delivery_easypost" : null,
  "module_delivery_fedex" : null,
  "module_delivery_sendcloud" : null,
  "module_delivery_shiprocket" : null,
  "module_delivery_starshipit" : null,
  "module_delivery_ups" : null,
  "module_delivery_usps" : null,
  "module_google_calendar" : null,
  "module_google_gmail" : null,
  "module_google_recaptcha" : null,
  "module_hr_expense_extract" : null,
  "module_hr_homeworking" : null,
  "module_hr_payroll_expense" : null,
  "module_hr_presence" : null,
  "module_hr_recruitment_extract" : null,
  "module_hr_recruitment_survey" : null,
  "module_hr_skills" : null,
  "module_hr_timesheet" : null,
  "module_l10n_eu_oss" : null,
  "module_loyalty" : null,
  "module_mail_plugin" : null,
  "module_maintenance_worksheet" : null,
  "module_microsoft_calendar" : null,
  "module_microsoft_outlook" : null,
  "module_mrp_mps" : null,
  "module_mrp_plm" : null,
  "module_mrp_subcontracting" : null,
  "module_partner_autocomplete" : null,
  "module_product_email_template" : null,
  "module_product_expiry" : null,
  "module_product_images" : null,
  "module_product_margin" : null,
  "module_purchase_product_matrix" : null,
  "module_purchase_requisition" : null,
  "module_quality_control" : null,
  "module_quality_control_worksheet" : null,
  "module_sale_amazon" : null,
  "module_sale_commission" : null,
  "module_sale_loyalty" : null,
  "module_sale_margin" : null,
  "module_sale_pdf_quote_builder" : null,
  "module_sale_product_matrix" : null,
  "module_sms" : null,
  "module_snailmail_account" : null,
  "module_stock_barcode" : null,
  "module_stock_barcode_barcodelookup" : null,
  "module_stock_dropshipping" : null,
  "module_stock_fleet" : null,
  "module_stock_landed_costs" : null,
  "module_stock_picking_batch" : null,
  "module_stock_sms" : null,
  "module_voip" : null,
  "module_web_unsplash" : null,
  "module_website_cf_turnstile" : null,
  "module_website_crm_iap_reveal" : null,
  "module_website_hr_recruitment" : null,
  "overtime_company_threshold" : null,
  "overtime_employee_threshold" : null,
  "partner_autocomplete_insufficient_credit" : null,
  "pay_invoices_online" : null,
  "po_order_approval" : null,
  "portal_allow_api_keys" : null,
  "predictive_lead_scoring_field_labels" : null,
  "predictive_lead_scoring_fields_str" : null,
  "predictive_lead_scoring_start_date" : null,
  "predictive_lead_scoring_start_date_str" : null,
  "preview_ready" : null,
  "product_volume_volume_in_cubic_feet" : null,
  "product_weight_in_lbs" : null,
  "profiling_enabled_until" : null,
  "restrict_template_rendering" : null,
  "sfu_server_key" : null,
  "sfu_server_url" : null,
  "show_blacklist_buttons" : null,
  "show_effect" : null,
  "snailmail_cover_readonly" : null,
  "tenor_api_key" : null,
  "tenor_content_filter" : null,
  "tenor_gif_limit" : null,
  "twilio_account_sid" : null,
  "twilio_account_token" : null,
  "unsplash_access_key" : null,
  "unsplash_app_id" : null,
  "use_invoice_terms" : null,
  "use_manufacturing_lead" : null,
  "use_po_lead" : null,
  "use_security_lead" : null,
  "use_twilio_rtc_servers" : null,
  "user_default_rights" : null,
  "web_app_name" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 检查配置设定主键

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/res_config_settings/check_key" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">account_default_credit_limit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|默认信用额度|
|<el-row justify="space-between"><el-col :span="20">active_user_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效用户数量|
|<el-row justify="space-between"><el-col :span="20">auth_signup_reset_password</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|允许在登录页开启密码重置功能|
|<el-row justify="space-between"><el-col :span="20">auth_signup_template_user_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用作通过注册创建的新用户的模版|
|<el-row justify="space-between"><el-col :span="20">auth_signup_uninvited</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|客户帐号|
|<el-row justify="space-between"><el-col :span="20">automatic_invoice</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|自动发票|
|<el-row justify="space-between"><el-col :span="20">barcode_separator</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|分隔符|
|<el-row justify="space-between"><el-col :span="20">company_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|公司数量|
|<el-row justify="space-between"><el-col :span="20">company_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">company_informations</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司信息|
|<el-row justify="space-between"><el-col :span="20">company_name</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">crm_auto_assignment_action</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|自动分配操作|
|<el-row justify="space-between"><el-col :span="20">crm_auto_assignment_interval_number</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|重复间隔为每|
|<el-row justify="space-between"><el-col :span="20">crm_auto_assignment_interval_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|自动分配间隔单位|
|<el-row justify="space-between"><el-col :span="20">crm_auto_assignment_run_datetime</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|自动指派下次执行日期|
|<el-row justify="space-between"><el-col :span="20">crm_use_auto_assignment</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|基于规则的分配|
|<el-row justify="space-between"><el-col :span="20">default_invoice_policy</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|开票原则|
|<el-row justify="space-between"><el-col :span="20">default_picking_policy</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|拣货策略|
|<el-row justify="space-between"><el-col :span="20">default_purchase_method</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|账单管理|
|<el-row justify="space-between"><el-col :span="20">delay_alert_contract</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|合同逾期延时预警|
|<el-row justify="space-between"><el-col :span="20">digest_emails</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|摘要邮件|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">external_email_server_default</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|使用自定义电子邮件服务器|
|<el-row justify="space-between"><el-col :span="20">fail_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|失败的邮件|
|<el-row justify="space-between"><el-col :span="20">google_gmail_client_identifier</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Gmail 客户端 ID|
|<el-row justify="space-between"><el-col :span="20">google_gmail_client_secret</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Gmail客户端Secret|
|<el-row justify="space-between"><el-col :span="20">google_translate_api_key</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|消息翻译 API 密钥|
|<el-row justify="space-between"><el-col :span="20">group_analytic_accounting</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|分析会计|
|<el-row justify="space-between"><el-col :span="20">group_applicant_cv_display</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|团体申请人简历展示|
|<el-row justify="space-between"><el-col :span="20">group_auto_done_setting</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|锁定已确认的销售订单|
|<el-row justify="space-between"><el-col :span="20">group_cash_rounding</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|现金舍入|
|<el-row justify="space-between"><el-col :span="20">group_discount_per_so_line</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|折扣|
|<el-row justify="space-between"><el-col :span="20">group_lot_on_delivery_slip</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|在送货单上显示批次 / 序列号|
|<el-row justify="space-between"><el-col :span="20">group_lot_on_invoice</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|在结算单上显示批次 / 序列号|
|<el-row justify="space-between"><el-col :span="20">group_mass_mailing_campaign</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|邮件营销|
|<el-row justify="space-between"><el-col :span="20">group_mrp_byproducts</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|副产品|
|<el-row justify="space-between"><el-col :span="20">group_mrp_reception_report</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|制造订单分配报表|
|<el-row justify="space-between"><el-col :span="20">group_mrp_routings</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|物料需求计划（MRP）工单|
|<el-row justify="space-between"><el-col :span="20">group_mrp_workorder_dependencies</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|工单依赖性|
|<el-row justify="space-between"><el-col :span="20">group_multi_currency</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|多币别|
|<el-row justify="space-between"><el-col :span="20">group_product_pricelist</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|价格表|
|<el-row justify="space-between"><el-col :span="20">group_product_variant</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|变体|
|<el-row justify="space-between"><el-col :span="20">group_proforma_sales</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|形式发票|
|<el-row justify="space-between"><el-col :span="20">group_project_milestone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|里程碑|
|<el-row justify="space-between"><el-col :span="20">group_project_rating</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|客户点评|
|<el-row justify="space-between"><el-col :span="20">group_project_recurring_tasks</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|周期任务|
|<el-row justify="space-between"><el-col :span="20">group_project_stages</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|项目阶段|
|<el-row justify="space-between"><el-col :span="20">group_project_task_dependencies</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|任务依赖|
|<el-row justify="space-between"><el-col :span="20">group_sale_delivery_address</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|客户地址|
|<el-row justify="space-between"><el-col :span="20">group_sale_order_template</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|报价模板|
|<el-row justify="space-between"><el-col :span="20">group_send_reminder</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|收货提醒|
|<el-row justify="space-between"><el-col :span="20">group_show_purchase_receipts</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|采购收据|
|<el-row justify="space-between"><el-col :span="20">group_show_sale_receipts</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|销售收据|
|<el-row justify="space-between"><el-col :span="20">group_stock_accounting_automatic</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|自动库存会计|
|<el-row justify="space-between"><el-col :span="20">group_stock_adv_location</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|多步路线|
|<el-row justify="space-between"><el-col :span="20">group_stock_lot_print_gs1</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|使用GS1编码格式打印批号和序列号|
|<el-row justify="space-between"><el-col :span="20">group_stock_multi_locations</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|储存位置|
|<el-row justify="space-between"><el-col :span="20">group_stock_packaging</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|产品包装|
|<el-row justify="space-between"><el-col :span="20">group_stock_production_lot</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|批次 / 序列号|
|<el-row justify="space-between"><el-col :span="20">group_stock_reception_report</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|库存接收报表|
|<el-row justify="space-between"><el-col :span="20">group_stock_sign_delivery</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|签名|
|<el-row justify="space-between"><el-col :span="20">group_stock_tracking_lot</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|包裹|
|<el-row justify="space-between"><el-col :span="20">group_stock_tracking_owner</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|寄售|
|<el-row justify="space-between"><el-col :span="20">group_unlocked_by_default</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|解锁制造订单|
|<el-row justify="space-between"><el-col :span="20">group_uom</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|计量单位|
|<el-row justify="space-between"><el-col :span="20">group_use_lead</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|线索|
|<el-row justify="space-between"><el-col :span="20">group_use_recurring_revenues</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|经常性收入|
|<el-row justify="space-between"><el-col :span="20">group_warning_account</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|发票中的警告|
|<el-row justify="space-between"><el-col :span="20">group_warning_purchase</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|采购警告|
|<el-row justify="space-between"><el-col :span="20">group_warning_sale</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|销售订单警告信息|
|<el-row justify="space-between"><el-col :span="20">group_warning_stock</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|库存警报|
|<el-row justify="space-between"><el-col :span="20">has_accounting_entries</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Has Accounting Entries|
|<el-row justify="space-between"><el-col :span="20">has_chart_of_accounts</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Company has a chart of accounts|
|<el-row justify="space-between"><el-col :span="20">hr_employee_self_edit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|员工编辑|
|<el-row justify="space-between"><el-col :span="20">hr_expense_alias_prefix</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|默认的费用别名|
|<el-row justify="space-between"><el-col :span="20">hr_expense_use_mailgateway</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|允许员工通过电子邮件记录费用|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">invoice_mail_template_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|发票电子邮件模板|
|<el-row justify="space-between"><el-col :span="20">is_account_peppol_eligible</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|PEPPOL 符合条件|
|<el-row justify="space-between"><el-col :span="20">is_installed_sale</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|销售模块是否已安装|
|<el-row justify="space-between"><el-col :span="20">is_membership_multi</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|多团队|
|<el-row justify="space-between"><el-col :span="20">is_root_company</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是母公司|
|<el-row justify="space-between"><el-col :span="20">language_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|语言数量|
|<el-row justify="space-between"><el-col :span="20">lead_enrich_auto</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|自动丰富线索|
|<el-row justify="space-between"><el-col :span="20">lead_mining_in_pipeline</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|直接从商机商机创建线索挖掘申请。|
|<el-row justify="space-between"><el-col :span="20">lock_confirmed_po</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|锁定已确认的订单|
|<el-row justify="space-between"><el-col :span="20">mass_mailing_outgoing_mail_server</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|专门服务器|
|<el-row justify="space-between"><el-col :span="20">mass_mailing_reports</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|24小时统计邮寄报告|
|<el-row justify="space-between"><el-col :span="20">mass_mailing_split_contact_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|拆分名字和姓氏|
|<el-row justify="space-between"><el-col :span="20">module_account3way_match</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|3单匹配:采购订单，收货单与发票|
|<el-row justify="space-between"><el-col :span="20">module_account_accountant</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|会计|
|<el-row justify="space-between"><el-col :span="20">module_account_bank_statement_extract</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Bank Statement Digitization|
|<el-row justify="space-between"><el-col :span="20">module_account_bank_statement_import_camt</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|以CAMT.053 格式导入|
|<el-row justify="space-between"><el-col :span="20">module_account_bank_statement_import_csv</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|以.csv、.xls和.xlsx格式导入|
|<el-row justify="space-between"><el-col :span="20">module_account_bank_statement_import_ofx</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|以.ofx格式导入|
|<el-row justify="space-between"><el-col :span="20">module_account_bank_statement_import_qif</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|导入.qif单据|
|<el-row justify="space-between"><el-col :span="20">module_account_batch_payment</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|使用批量付款|
|<el-row justify="space-between"><el-col :span="20">module_account_budget</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|预算管理|
|<el-row justify="space-between"><el-col :span="20">module_account_check_printing</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Allow check printing and deposits|
|<el-row justify="space-between"><el-col :span="20">module_account_extract</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Document Digitization|
|<el-row justify="space-between"><el-col :span="20">module_account_inter_company_rules</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|管理公司间交易|
|<el-row justify="space-between"><el-col :span="20">module_account_intrastat</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|国际联盟|
|<el-row justify="space-between"><el-col :span="20">module_account_invoice_extract</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Invoice Digitization|
|<el-row justify="space-between"><el-col :span="20">module_account_iso20022</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|SEPA Credit Transfer / ISO20022|
|<el-row justify="space-between"><el-col :span="20">module_account_payment</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Invoice Online Payment|
|<el-row justify="space-between"><el-col :span="20">module_account_peppol</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|PEPPOL 开具发票|
|<el-row justify="space-between"><el-col :span="20">module_account_reports</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Dynamic Reports|
|<el-row justify="space-between"><el-col :span="20">module_account_sepa_direct_debit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Use SEPA Direct Debit|
|<el-row justify="space-between"><el-col :span="20">module_auth_ldap</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|LDAP认证|
|<el-row justify="space-between"><el-col :span="20">module_auth_oauth</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|使用外部验证提供者 (OAuth)|
|<el-row justify="space-between"><el-col :span="20">module_base_geolocalize</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|地理定位|
|<el-row justify="space-between"><el-col :span="20">module_base_import</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|允许用户导入 CSV/XLS/XLSX/ODS格式的文档数据|
|<el-row justify="space-between"><el-col :span="20">module_crm_iap_enrich</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|根据线索的电子邮箱地址、使用公司数据自动丰富线索。|
|<el-row justify="space-between"><el-col :span="20">module_crm_iap_mine</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|基于国家/地区、行业、规模等信息生成新的线索。|
|<el-row justify="space-between"><el-col :span="20">module_currency_rate_live</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|自动汇率|
|<el-row justify="space-between"><el-col :span="20">module_delivery</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|交付方式|
|<el-row justify="space-between"><el-col :span="20">module_delivery_bpost</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|bpost连接器|
|<el-row justify="space-between"><el-col :span="20">module_delivery_dhl</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|DHL快递连接器|
|<el-row justify="space-between"><el-col :span="20">module_delivery_easypost</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Easypost连接器|
|<el-row justify="space-between"><el-col :span="20">module_delivery_fedex</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|FedEx连接器|
|<el-row justify="space-between"><el-col :span="20">module_delivery_sendcloud</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Sendcloud连接器|
|<el-row justify="space-between"><el-col :span="20">module_delivery_shiprocket</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Shiprocket 连接器|
|<el-row justify="space-between"><el-col :span="20">module_delivery_starshipit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Starshipit 连接器|
|<el-row justify="space-between"><el-col :span="20">module_delivery_ups</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|UPS连接器|
|<el-row justify="space-between"><el-col :span="20">module_delivery_usps</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|USPS连接器|
|<el-row justify="space-between"><el-col :span="20">module_google_calendar</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|允许用户同步谷歌日历|
|<el-row justify="space-between"><el-col :span="20">module_google_gmail</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|支持Gmail身份验证|
|<el-row justify="space-between"><el-col :span="20">module_google_recaptcha</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|验证码|
|<el-row justify="space-between"><el-col :span="20">module_hr_expense_extract</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|向OCR发送账单以产生费用|
|<el-row justify="space-between"><el-col :span="20">module_hr_homeworking</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|远程工作|
|<el-row justify="space-between"><el-col :span="20">module_hr_payroll_expense</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|工资单上的报销费用|
|<el-row justify="space-between"><el-col :span="20">module_hr_presence</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|高级出席控制|
|<el-row justify="space-between"><el-col :span="20">module_hr_recruitment_extract</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|将简历发送到 OCR 以填写申请|
|<el-row justify="space-between"><el-col :span="20">module_hr_recruitment_survey</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|面试表单|
|<el-row justify="space-between"><el-col :span="20">module_hr_skills</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|技能管理|
|<el-row justify="space-between"><el-col :span="20">module_hr_timesheet</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|任务日志|
|<el-row justify="space-between"><el-col :span="20">module_l10n_eu_oss</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|欧盟共同体内部远程销售|
|<el-row justify="space-between"><el-col :span="20">module_loyalty</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|促销、优惠券、礼品卡和会员方案|
|<el-row justify="space-between"><el-col :span="20">module_mail_plugin</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|允许与邮件插件集成|
|<el-row justify="space-between"><el-col :span="20">module_maintenance_worksheet</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|定制维护工作表|
|<el-row justify="space-between"><el-col :span="20">module_microsoft_calendar</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|允许用户同步Outlook日历|
|<el-row justify="space-between"><el-col :span="20">module_microsoft_outlook</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|支持Outlook身份验证|
|<el-row justify="space-between"><el-col :span="20">module_mrp_mps</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|主生产计划|
|<el-row justify="space-between"><el-col :span="20">module_mrp_plm</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|产品生命周期管理（PLM）|
|<el-row justify="space-between"><el-col :span="20">module_mrp_subcontracting</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|外包|
|<el-row justify="space-between"><el-col :span="20">module_partner_autocomplete</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|合作伙伴自动完成|
|<el-row justify="space-between"><el-col :span="20">module_product_email_template</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|特定的电子邮件|
|<el-row justify="space-between"><el-col :span="20">module_product_expiry</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|到期日期|
|<el-row justify="space-between"><el-col :span="20">module_product_images</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|使用条形码获取产品图片|
|<el-row justify="space-between"><el-col :span="20">module_product_margin</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|允许产品毛利|
|<el-row justify="space-between"><el-col :span="20">module_purchase_product_matrix</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|采购表格入口|
|<el-row justify="space-between"><el-col :span="20">module_purchase_requisition</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|采购协议|
|<el-row justify="space-between"><el-col :span="20">module_quality_control</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|质量|
|<el-row justify="space-between"><el-col :span="20">module_quality_control_worksheet</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|质量工作表|
|<el-row justify="space-between"><el-col :span="20">module_sale_amazon</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|亚马逊同步|
|<el-row justify="space-between"><el-col :span="20">module_sale_commission</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|佣金|
|<el-row justify="space-between"><el-col :span="20">module_sale_loyalty</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|优惠券和会员|
|<el-row justify="space-between"><el-col :span="20">module_sale_margin</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|毛利|
|<el-row justify="space-between"><el-col :span="20">module_sale_pdf_quote_builder</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|PDF 报价生成器|
|<el-row justify="space-between"><el-col :span="20">module_sale_product_matrix</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|销售表格录入|
|<el-row justify="space-between"><el-col :span="20">module_sms</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|短信息|
|<el-row justify="space-between"><el-col :span="20">module_snailmail_account</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|传统信件|
|<el-row justify="space-between"><el-col :span="20">module_stock_barcode</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|条码扫描器|
|<el-row justify="space-between"><el-col :span="20">module_stock_barcode_barcodelookup</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|库存条形码数据库|
|<el-row justify="space-between"><el-col :span="20">module_stock_dropshipping</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|代发货|
|<el-row justify="space-between"><el-col :span="20">module_stock_fleet</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|配送管理系统|
|<el-row justify="space-between"><el-col :span="20">module_stock_landed_costs</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|到岸成本|
|<el-row justify="space-between"><el-col :span="20">module_stock_picking_batch</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|批量、波次和集群调拨|
|<el-row justify="space-between"><el-col :span="20">module_stock_sms</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|短信息确认|
|<el-row justify="space-between"><el-col :span="20">module_voip</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|网络电话|
|<el-row justify="space-between"><el-col :span="20">module_web_unsplash</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Unsplash图像库|
|<el-row justify="space-between"><el-col :span="20">module_website_cf_turnstile</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Cloudflare Turnstile|
|<el-row justify="space-between"><el-col :span="20">module_website_crm_iap_reveal</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|从网站流量创建线索/商机|
|<el-row justify="space-between"><el-col :span="20">module_website_hr_recruitment</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|线上发布|
|<el-row justify="space-between"><el-col :span="20">overtime_company_threshold</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|对公司有利的宽容时间|
|<el-row justify="space-between"><el-col :span="20">overtime_employee_threshold</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|对员工有利的宽容时间|
|<el-row justify="space-between"><el-col :span="20">partner_autocomplete_insufficient_credit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|信用不足|
|<el-row justify="space-between"><el-col :span="20">pay_invoices_online</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|在线支付发票|
|<el-row justify="space-between"><el-col :span="20">po_order_approval</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|订单审批|
|<el-row justify="space-between"><el-col :span="20">portal_allow_api_keys</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|客户 API 密钥|
|<el-row justify="space-between"><el-col :span="20">predictive_lead_scoring_field_labels</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|预测线索评分字段标签|
|<el-row justify="space-between"><el-col :span="20">predictive_lead_scoring_fields_str</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|字符串中的线索评分频率字段|
|<el-row justify="space-between"><el-col :span="20">predictive_lead_scoring_start_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|线索评分开始日期|
|<el-row justify="space-between"><el-col :span="20">predictive_lead_scoring_start_date_str</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|字符串中的线索评分开始日期|
|<el-row justify="space-between"><el-col :span="20">preview_ready</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Display preview button|
|<el-row justify="space-between"><el-col :span="20">product_volume_volume_in_cubic_feet</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|体积单位|
|<el-row justify="space-between"><el-col :span="20">product_weight_in_lbs</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|重量单位|
|<el-row justify="space-between"><el-col :span="20">profiling_enabled_until</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|启用分析直到|
|<el-row justify="space-between"><el-col :span="20">restrict_template_rendering</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|限制模板渲染|
|<el-row justify="space-between"><el-col :span="20">sfu_server_key</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|SFU 服务器密钥|
|<el-row justify="space-between"><el-col :span="20">sfu_server_url</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|SFU 服务器 URL|
|<el-row justify="space-between"><el-col :span="20">show_blacklist_buttons</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|退订时黑名单选项|
|<el-row justify="space-between"><el-col :span="20">show_effect</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|显示效果|
|<el-row justify="space-between"><el-col :span="20">snailmail_cover_readonly</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|蜗牛邮件封面只读|
|<el-row justify="space-between"><el-col :span="20">tenor_api_key</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Tenor API 密钥|
|<el-row justify="space-between"><el-col :span="20">tenor_content_filter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Tenor 内容过滤器|
|<el-row justify="space-between"><el-col :span="20">tenor_gif_limit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Tenor Gif 限额|
|<el-row justify="space-between"><el-col :span="20">twilio_account_sid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Twilio 帐户 SID|
|<el-row justify="space-between"><el-col :span="20">twilio_account_token</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Twilio 帐户身份验证令牌|
|<el-row justify="space-between"><el-col :span="20">unsplash_access_key</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|访问秘钥|
|<el-row justify="space-between"><el-col :span="20">unsplash_app_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|应用程序ID|
|<el-row justify="space-between"><el-col :span="20">use_invoice_terms</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|默认条款和条件|
|<el-row justify="space-between"><el-col :span="20">use_manufacturing_lead</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|默认制造提前期|
|<el-row justify="space-between"><el-col :span="20">use_po_lead</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|安全交货时间|
|<el-row justify="space-between"><el-col :span="20">use_security_lead</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|销售的安全提前期|
|<el-row justify="space-between"><el-col :span="20">use_twilio_rtc_servers</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|使用 Twilio ICE 服务器|
|<el-row justify="space-between"><el-col :span="20">user_default_rights</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|默认访问权限|
|<el-row justify="space-between"><el-col :span="20">web_app_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|网络应用程序名称|



##### 请求示例： {docsify-ignore}
```json
{
  "account_default_credit_limit" : null,
  "active_user_count" : null,
  "auth_signup_reset_password" : null,
  "auth_signup_template_user_id" : null,
  "auth_signup_uninvited" : null,
  "automatic_invoice" : null,
  "barcode_separator" : null,
  "company_count" : null,
  "company_id" : null,
  "company_informations" : null,
  "company_name" : null,
  "create_date" : null,
  "create_uid" : null,
  "crm_auto_assignment_action" : null,
  "crm_auto_assignment_interval_number" : null,
  "crm_auto_assignment_interval_type" : null,
  "crm_auto_assignment_run_datetime" : null,
  "crm_use_auto_assignment" : null,
  "default_invoice_policy" : null,
  "default_picking_policy" : null,
  "default_purchase_method" : null,
  "delay_alert_contract" : null,
  "digest_emails" : null,
  "display_name" : null,
  "external_email_server_default" : null,
  "fail_counter" : null,
  "google_gmail_client_identifier" : null,
  "google_gmail_client_secret" : null,
  "google_translate_api_key" : null,
  "group_analytic_accounting" : null,
  "group_applicant_cv_display" : null,
  "group_auto_done_setting" : null,
  "group_cash_rounding" : null,
  "group_discount_per_so_line" : null,
  "group_lot_on_delivery_slip" : null,
  "group_lot_on_invoice" : null,
  "group_mass_mailing_campaign" : null,
  "group_mrp_byproducts" : null,
  "group_mrp_reception_report" : null,
  "group_mrp_routings" : null,
  "group_mrp_workorder_dependencies" : null,
  "group_multi_currency" : null,
  "group_product_pricelist" : null,
  "group_product_variant" : null,
  "group_proforma_sales" : null,
  "group_project_milestone" : null,
  "group_project_rating" : null,
  "group_project_recurring_tasks" : null,
  "group_project_stages" : null,
  "group_project_task_dependencies" : null,
  "group_sale_delivery_address" : null,
  "group_sale_order_template" : null,
  "group_send_reminder" : null,
  "group_show_purchase_receipts" : null,
  "group_show_sale_receipts" : null,
  "group_stock_accounting_automatic" : null,
  "group_stock_adv_location" : null,
  "group_stock_lot_print_gs1" : null,
  "group_stock_multi_locations" : null,
  "group_stock_packaging" : null,
  "group_stock_production_lot" : null,
  "group_stock_reception_report" : null,
  "group_stock_sign_delivery" : null,
  "group_stock_tracking_lot" : null,
  "group_stock_tracking_owner" : null,
  "group_unlocked_by_default" : null,
  "group_uom" : null,
  "group_use_lead" : null,
  "group_use_recurring_revenues" : null,
  "group_warning_account" : null,
  "group_warning_purchase" : null,
  "group_warning_sale" : null,
  "group_warning_stock" : null,
  "has_accounting_entries" : null,
  "has_chart_of_accounts" : null,
  "hr_employee_self_edit" : null,
  "hr_expense_alias_prefix" : null,
  "hr_expense_use_mailgateway" : null,
  "id" : null,
  "invoice_mail_template_id" : null,
  "is_account_peppol_eligible" : null,
  "is_installed_sale" : null,
  "is_membership_multi" : null,
  "is_root_company" : null,
  "language_count" : null,
  "lead_enrich_auto" : null,
  "lead_mining_in_pipeline" : null,
  "lock_confirmed_po" : null,
  "mass_mailing_outgoing_mail_server" : null,
  "mass_mailing_reports" : null,
  "mass_mailing_split_contact_name" : null,
  "module_account3way_match" : null,
  "module_account_accountant" : null,
  "module_account_bank_statement_extract" : null,
  "module_account_bank_statement_import_camt" : null,
  "module_account_bank_statement_import_csv" : null,
  "module_account_bank_statement_import_ofx" : null,
  "module_account_bank_statement_import_qif" : null,
  "module_account_batch_payment" : null,
  "module_account_budget" : null,
  "module_account_check_printing" : null,
  "module_account_extract" : null,
  "module_account_inter_company_rules" : null,
  "module_account_intrastat" : null,
  "module_account_invoice_extract" : null,
  "module_account_iso20022" : null,
  "module_account_payment" : null,
  "module_account_peppol" : null,
  "module_account_reports" : null,
  "module_account_sepa_direct_debit" : null,
  "module_auth_ldap" : null,
  "module_auth_oauth" : null,
  "module_base_geolocalize" : null,
  "module_base_import" : null,
  "module_crm_iap_enrich" : null,
  "module_crm_iap_mine" : null,
  "module_currency_rate_live" : null,
  "module_delivery" : null,
  "module_delivery_bpost" : null,
  "module_delivery_dhl" : null,
  "module_delivery_easypost" : null,
  "module_delivery_fedex" : null,
  "module_delivery_sendcloud" : null,
  "module_delivery_shiprocket" : null,
  "module_delivery_starshipit" : null,
  "module_delivery_ups" : null,
  "module_delivery_usps" : null,
  "module_google_calendar" : null,
  "module_google_gmail" : null,
  "module_google_recaptcha" : null,
  "module_hr_expense_extract" : null,
  "module_hr_homeworking" : null,
  "module_hr_payroll_expense" : null,
  "module_hr_presence" : null,
  "module_hr_recruitment_extract" : null,
  "module_hr_recruitment_survey" : null,
  "module_hr_skills" : null,
  "module_hr_timesheet" : null,
  "module_l10n_eu_oss" : null,
  "module_loyalty" : null,
  "module_mail_plugin" : null,
  "module_maintenance_worksheet" : null,
  "module_microsoft_calendar" : null,
  "module_microsoft_outlook" : null,
  "module_mrp_mps" : null,
  "module_mrp_plm" : null,
  "module_mrp_subcontracting" : null,
  "module_partner_autocomplete" : null,
  "module_product_email_template" : null,
  "module_product_expiry" : null,
  "module_product_images" : null,
  "module_product_margin" : null,
  "module_purchase_product_matrix" : null,
  "module_purchase_requisition" : null,
  "module_quality_control" : null,
  "module_quality_control_worksheet" : null,
  "module_sale_amazon" : null,
  "module_sale_commission" : null,
  "module_sale_loyalty" : null,
  "module_sale_margin" : null,
  "module_sale_pdf_quote_builder" : null,
  "module_sale_product_matrix" : null,
  "module_sms" : null,
  "module_snailmail_account" : null,
  "module_stock_barcode" : null,
  "module_stock_barcode_barcodelookup" : null,
  "module_stock_dropshipping" : null,
  "module_stock_fleet" : null,
  "module_stock_landed_costs" : null,
  "module_stock_picking_batch" : null,
  "module_stock_sms" : null,
  "module_voip" : null,
  "module_web_unsplash" : null,
  "module_website_cf_turnstile" : null,
  "module_website_crm_iap_reveal" : null,
  "module_website_hr_recruitment" : null,
  "overtime_company_threshold" : null,
  "overtime_employee_threshold" : null,
  "partner_autocomplete_insufficient_credit" : null,
  "pay_invoices_online" : null,
  "po_order_approval" : null,
  "portal_allow_api_keys" : null,
  "predictive_lead_scoring_field_labels" : null,
  "predictive_lead_scoring_fields_str" : null,
  "predictive_lead_scoring_start_date" : null,
  "predictive_lead_scoring_start_date_str" : null,
  "preview_ready" : null,
  "product_volume_volume_in_cubic_feet" : null,
  "product_weight_in_lbs" : null,
  "profiling_enabled_until" : null,
  "restrict_template_rendering" : null,
  "sfu_server_key" : null,
  "sfu_server_url" : null,
  "show_blacklist_buttons" : null,
  "show_effect" : null,
  "snailmail_cover_readonly" : null,
  "tenor_api_key" : null,
  "tenor_content_filter" : null,
  "tenor_gif_limit" : null,
  "twilio_account_sid" : null,
  "twilio_account_token" : null,
  "unsplash_access_key" : null,
  "unsplash_app_id" : null,
  "use_invoice_terms" : null,
  "use_manufacturing_lead" : null,
  "use_po_lead" : null,
  "use_security_lead" : null,
  "use_twilio_rtc_servers" : null,
  "user_default_rights" : null,
  "web_app_name" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
Integer
```

## 默认提取固定标识属性值

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/res_config_settings/{key}/default_get" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|标识|



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">account_default_credit_limit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|默认信用额度|
|<el-row justify="space-between"><el-col :span="20">active_user_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效用户数量|
|<el-row justify="space-between"><el-col :span="20">auth_signup_reset_password</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|允许在登录页开启密码重置功能|
|<el-row justify="space-between"><el-col :span="20">auth_signup_template_user_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用作通过注册创建的新用户的模版|
|<el-row justify="space-between"><el-col :span="20">auth_signup_uninvited</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|客户帐号|
|<el-row justify="space-between"><el-col :span="20">automatic_invoice</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|自动发票|
|<el-row justify="space-between"><el-col :span="20">barcode_separator</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|分隔符|
|<el-row justify="space-between"><el-col :span="20">company_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|公司数量|
|<el-row justify="space-between"><el-col :span="20">company_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">company_informations</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司信息|
|<el-row justify="space-between"><el-col :span="20">company_name</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">crm_auto_assignment_action</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|自动分配操作|
|<el-row justify="space-between"><el-col :span="20">crm_auto_assignment_interval_number</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|重复间隔为每|
|<el-row justify="space-between"><el-col :span="20">crm_auto_assignment_interval_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|自动分配间隔单位|
|<el-row justify="space-between"><el-col :span="20">crm_auto_assignment_run_datetime</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|自动指派下次执行日期|
|<el-row justify="space-between"><el-col :span="20">crm_use_auto_assignment</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|基于规则的分配|
|<el-row justify="space-between"><el-col :span="20">default_invoice_policy</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|开票原则|
|<el-row justify="space-between"><el-col :span="20">default_picking_policy</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|拣货策略|
|<el-row justify="space-between"><el-col :span="20">default_purchase_method</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|账单管理|
|<el-row justify="space-between"><el-col :span="20">delay_alert_contract</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|合同逾期延时预警|
|<el-row justify="space-between"><el-col :span="20">digest_emails</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|摘要邮件|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">external_email_server_default</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|使用自定义电子邮件服务器|
|<el-row justify="space-between"><el-col :span="20">fail_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|失败的邮件|
|<el-row justify="space-between"><el-col :span="20">google_gmail_client_identifier</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Gmail 客户端 ID|
|<el-row justify="space-between"><el-col :span="20">google_gmail_client_secret</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Gmail客户端Secret|
|<el-row justify="space-between"><el-col :span="20">google_translate_api_key</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|消息翻译 API 密钥|
|<el-row justify="space-between"><el-col :span="20">group_analytic_accounting</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|分析会计|
|<el-row justify="space-between"><el-col :span="20">group_applicant_cv_display</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|团体申请人简历展示|
|<el-row justify="space-between"><el-col :span="20">group_auto_done_setting</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|锁定已确认的销售订单|
|<el-row justify="space-between"><el-col :span="20">group_cash_rounding</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|现金舍入|
|<el-row justify="space-between"><el-col :span="20">group_discount_per_so_line</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|折扣|
|<el-row justify="space-between"><el-col :span="20">group_lot_on_delivery_slip</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|在送货单上显示批次 / 序列号|
|<el-row justify="space-between"><el-col :span="20">group_lot_on_invoice</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|在结算单上显示批次 / 序列号|
|<el-row justify="space-between"><el-col :span="20">group_mass_mailing_campaign</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|邮件营销|
|<el-row justify="space-between"><el-col :span="20">group_mrp_byproducts</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|副产品|
|<el-row justify="space-between"><el-col :span="20">group_mrp_reception_report</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|制造订单分配报表|
|<el-row justify="space-between"><el-col :span="20">group_mrp_routings</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|物料需求计划（MRP）工单|
|<el-row justify="space-between"><el-col :span="20">group_mrp_workorder_dependencies</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|工单依赖性|
|<el-row justify="space-between"><el-col :span="20">group_multi_currency</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|多币别|
|<el-row justify="space-between"><el-col :span="20">group_product_pricelist</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|价格表|
|<el-row justify="space-between"><el-col :span="20">group_product_variant</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|变体|
|<el-row justify="space-between"><el-col :span="20">group_proforma_sales</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|形式发票|
|<el-row justify="space-between"><el-col :span="20">group_project_milestone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|里程碑|
|<el-row justify="space-between"><el-col :span="20">group_project_rating</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|客户点评|
|<el-row justify="space-between"><el-col :span="20">group_project_recurring_tasks</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|周期任务|
|<el-row justify="space-between"><el-col :span="20">group_project_stages</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|项目阶段|
|<el-row justify="space-between"><el-col :span="20">group_project_task_dependencies</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|任务依赖|
|<el-row justify="space-between"><el-col :span="20">group_sale_delivery_address</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|客户地址|
|<el-row justify="space-between"><el-col :span="20">group_sale_order_template</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|报价模板|
|<el-row justify="space-between"><el-col :span="20">group_send_reminder</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|收货提醒|
|<el-row justify="space-between"><el-col :span="20">group_show_purchase_receipts</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|采购收据|
|<el-row justify="space-between"><el-col :span="20">group_show_sale_receipts</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|销售收据|
|<el-row justify="space-between"><el-col :span="20">group_stock_accounting_automatic</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|自动库存会计|
|<el-row justify="space-between"><el-col :span="20">group_stock_adv_location</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|多步路线|
|<el-row justify="space-between"><el-col :span="20">group_stock_lot_print_gs1</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|使用GS1编码格式打印批号和序列号|
|<el-row justify="space-between"><el-col :span="20">group_stock_multi_locations</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|储存位置|
|<el-row justify="space-between"><el-col :span="20">group_stock_packaging</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|产品包装|
|<el-row justify="space-between"><el-col :span="20">group_stock_production_lot</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|批次 / 序列号|
|<el-row justify="space-between"><el-col :span="20">group_stock_reception_report</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|库存接收报表|
|<el-row justify="space-between"><el-col :span="20">group_stock_sign_delivery</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|签名|
|<el-row justify="space-between"><el-col :span="20">group_stock_tracking_lot</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|包裹|
|<el-row justify="space-between"><el-col :span="20">group_stock_tracking_owner</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|寄售|
|<el-row justify="space-between"><el-col :span="20">group_unlocked_by_default</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|解锁制造订单|
|<el-row justify="space-between"><el-col :span="20">group_uom</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|计量单位|
|<el-row justify="space-between"><el-col :span="20">group_use_lead</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|线索|
|<el-row justify="space-between"><el-col :span="20">group_use_recurring_revenues</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|经常性收入|
|<el-row justify="space-between"><el-col :span="20">group_warning_account</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|发票中的警告|
|<el-row justify="space-between"><el-col :span="20">group_warning_purchase</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|采购警告|
|<el-row justify="space-between"><el-col :span="20">group_warning_sale</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|销售订单警告信息|
|<el-row justify="space-between"><el-col :span="20">group_warning_stock</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|库存警报|
|<el-row justify="space-between"><el-col :span="20">has_accounting_entries</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Has Accounting Entries|
|<el-row justify="space-between"><el-col :span="20">has_chart_of_accounts</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Company has a chart of accounts|
|<el-row justify="space-between"><el-col :span="20">hr_employee_self_edit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|员工编辑|
|<el-row justify="space-between"><el-col :span="20">hr_expense_alias_prefix</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|默认的费用别名|
|<el-row justify="space-between"><el-col :span="20">hr_expense_use_mailgateway</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|允许员工通过电子邮件记录费用|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">invoice_mail_template_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|发票电子邮件模板|
|<el-row justify="space-between"><el-col :span="20">is_account_peppol_eligible</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|PEPPOL 符合条件|
|<el-row justify="space-between"><el-col :span="20">is_installed_sale</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|销售模块是否已安装|
|<el-row justify="space-between"><el-col :span="20">is_membership_multi</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|多团队|
|<el-row justify="space-between"><el-col :span="20">is_root_company</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是母公司|
|<el-row justify="space-between"><el-col :span="20">language_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|语言数量|
|<el-row justify="space-between"><el-col :span="20">lead_enrich_auto</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|自动丰富线索|
|<el-row justify="space-between"><el-col :span="20">lead_mining_in_pipeline</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|直接从商机商机创建线索挖掘申请。|
|<el-row justify="space-between"><el-col :span="20">lock_confirmed_po</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|锁定已确认的订单|
|<el-row justify="space-between"><el-col :span="20">mass_mailing_outgoing_mail_server</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|专门服务器|
|<el-row justify="space-between"><el-col :span="20">mass_mailing_reports</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|24小时统计邮寄报告|
|<el-row justify="space-between"><el-col :span="20">mass_mailing_split_contact_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|拆分名字和姓氏|
|<el-row justify="space-between"><el-col :span="20">module_account3way_match</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|3单匹配:采购订单，收货单与发票|
|<el-row justify="space-between"><el-col :span="20">module_account_accountant</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|会计|
|<el-row justify="space-between"><el-col :span="20">module_account_bank_statement_extract</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Bank Statement Digitization|
|<el-row justify="space-between"><el-col :span="20">module_account_bank_statement_import_camt</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|以CAMT.053 格式导入|
|<el-row justify="space-between"><el-col :span="20">module_account_bank_statement_import_csv</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|以.csv、.xls和.xlsx格式导入|
|<el-row justify="space-between"><el-col :span="20">module_account_bank_statement_import_ofx</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|以.ofx格式导入|
|<el-row justify="space-between"><el-col :span="20">module_account_bank_statement_import_qif</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|导入.qif单据|
|<el-row justify="space-between"><el-col :span="20">module_account_batch_payment</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|使用批量付款|
|<el-row justify="space-between"><el-col :span="20">module_account_budget</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|预算管理|
|<el-row justify="space-between"><el-col :span="20">module_account_check_printing</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Allow check printing and deposits|
|<el-row justify="space-between"><el-col :span="20">module_account_extract</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Document Digitization|
|<el-row justify="space-between"><el-col :span="20">module_account_inter_company_rules</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|管理公司间交易|
|<el-row justify="space-between"><el-col :span="20">module_account_intrastat</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|国际联盟|
|<el-row justify="space-between"><el-col :span="20">module_account_invoice_extract</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Invoice Digitization|
|<el-row justify="space-between"><el-col :span="20">module_account_iso20022</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|SEPA Credit Transfer / ISO20022|
|<el-row justify="space-between"><el-col :span="20">module_account_payment</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Invoice Online Payment|
|<el-row justify="space-between"><el-col :span="20">module_account_peppol</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|PEPPOL 开具发票|
|<el-row justify="space-between"><el-col :span="20">module_account_reports</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Dynamic Reports|
|<el-row justify="space-between"><el-col :span="20">module_account_sepa_direct_debit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Use SEPA Direct Debit|
|<el-row justify="space-between"><el-col :span="20">module_auth_ldap</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|LDAP认证|
|<el-row justify="space-between"><el-col :span="20">module_auth_oauth</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|使用外部验证提供者 (OAuth)|
|<el-row justify="space-between"><el-col :span="20">module_base_geolocalize</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|地理定位|
|<el-row justify="space-between"><el-col :span="20">module_base_import</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|允许用户导入 CSV/XLS/XLSX/ODS格式的文档数据|
|<el-row justify="space-between"><el-col :span="20">module_crm_iap_enrich</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|根据线索的电子邮箱地址、使用公司数据自动丰富线索。|
|<el-row justify="space-between"><el-col :span="20">module_crm_iap_mine</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|基于国家/地区、行业、规模等信息生成新的线索。|
|<el-row justify="space-between"><el-col :span="20">module_currency_rate_live</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|自动汇率|
|<el-row justify="space-between"><el-col :span="20">module_delivery</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|交付方式|
|<el-row justify="space-between"><el-col :span="20">module_delivery_bpost</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|bpost连接器|
|<el-row justify="space-between"><el-col :span="20">module_delivery_dhl</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|DHL快递连接器|
|<el-row justify="space-between"><el-col :span="20">module_delivery_easypost</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Easypost连接器|
|<el-row justify="space-between"><el-col :span="20">module_delivery_fedex</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|FedEx连接器|
|<el-row justify="space-between"><el-col :span="20">module_delivery_sendcloud</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Sendcloud连接器|
|<el-row justify="space-between"><el-col :span="20">module_delivery_shiprocket</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Shiprocket 连接器|
|<el-row justify="space-between"><el-col :span="20">module_delivery_starshipit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Starshipit 连接器|
|<el-row justify="space-between"><el-col :span="20">module_delivery_ups</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|UPS连接器|
|<el-row justify="space-between"><el-col :span="20">module_delivery_usps</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|USPS连接器|
|<el-row justify="space-between"><el-col :span="20">module_google_calendar</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|允许用户同步谷歌日历|
|<el-row justify="space-between"><el-col :span="20">module_google_gmail</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|支持Gmail身份验证|
|<el-row justify="space-between"><el-col :span="20">module_google_recaptcha</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|验证码|
|<el-row justify="space-between"><el-col :span="20">module_hr_expense_extract</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|向OCR发送账单以产生费用|
|<el-row justify="space-between"><el-col :span="20">module_hr_homeworking</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|远程工作|
|<el-row justify="space-between"><el-col :span="20">module_hr_payroll_expense</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|工资单上的报销费用|
|<el-row justify="space-between"><el-col :span="20">module_hr_presence</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|高级出席控制|
|<el-row justify="space-between"><el-col :span="20">module_hr_recruitment_extract</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|将简历发送到 OCR 以填写申请|
|<el-row justify="space-between"><el-col :span="20">module_hr_recruitment_survey</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|面试表单|
|<el-row justify="space-between"><el-col :span="20">module_hr_skills</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|技能管理|
|<el-row justify="space-between"><el-col :span="20">module_hr_timesheet</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|任务日志|
|<el-row justify="space-between"><el-col :span="20">module_l10n_eu_oss</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|欧盟共同体内部远程销售|
|<el-row justify="space-between"><el-col :span="20">module_loyalty</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|促销、优惠券、礼品卡和会员方案|
|<el-row justify="space-between"><el-col :span="20">module_mail_plugin</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|允许与邮件插件集成|
|<el-row justify="space-between"><el-col :span="20">module_maintenance_worksheet</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|定制维护工作表|
|<el-row justify="space-between"><el-col :span="20">module_microsoft_calendar</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|允许用户同步Outlook日历|
|<el-row justify="space-between"><el-col :span="20">module_microsoft_outlook</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|支持Outlook身份验证|
|<el-row justify="space-between"><el-col :span="20">module_mrp_mps</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|主生产计划|
|<el-row justify="space-between"><el-col :span="20">module_mrp_plm</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|产品生命周期管理（PLM）|
|<el-row justify="space-between"><el-col :span="20">module_mrp_subcontracting</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|外包|
|<el-row justify="space-between"><el-col :span="20">module_partner_autocomplete</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|合作伙伴自动完成|
|<el-row justify="space-between"><el-col :span="20">module_product_email_template</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|特定的电子邮件|
|<el-row justify="space-between"><el-col :span="20">module_product_expiry</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|到期日期|
|<el-row justify="space-between"><el-col :span="20">module_product_images</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|使用条形码获取产品图片|
|<el-row justify="space-between"><el-col :span="20">module_product_margin</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|允许产品毛利|
|<el-row justify="space-between"><el-col :span="20">module_purchase_product_matrix</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|采购表格入口|
|<el-row justify="space-between"><el-col :span="20">module_purchase_requisition</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|采购协议|
|<el-row justify="space-between"><el-col :span="20">module_quality_control</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|质量|
|<el-row justify="space-between"><el-col :span="20">module_quality_control_worksheet</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|质量工作表|
|<el-row justify="space-between"><el-col :span="20">module_sale_amazon</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|亚马逊同步|
|<el-row justify="space-between"><el-col :span="20">module_sale_commission</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|佣金|
|<el-row justify="space-between"><el-col :span="20">module_sale_loyalty</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|优惠券和会员|
|<el-row justify="space-between"><el-col :span="20">module_sale_margin</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|毛利|
|<el-row justify="space-between"><el-col :span="20">module_sale_pdf_quote_builder</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|PDF 报价生成器|
|<el-row justify="space-between"><el-col :span="20">module_sale_product_matrix</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|销售表格录入|
|<el-row justify="space-between"><el-col :span="20">module_sms</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|短信息|
|<el-row justify="space-between"><el-col :span="20">module_snailmail_account</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|传统信件|
|<el-row justify="space-between"><el-col :span="20">module_stock_barcode</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|条码扫描器|
|<el-row justify="space-between"><el-col :span="20">module_stock_barcode_barcodelookup</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|库存条形码数据库|
|<el-row justify="space-between"><el-col :span="20">module_stock_dropshipping</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|代发货|
|<el-row justify="space-between"><el-col :span="20">module_stock_fleet</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|配送管理系统|
|<el-row justify="space-between"><el-col :span="20">module_stock_landed_costs</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|到岸成本|
|<el-row justify="space-between"><el-col :span="20">module_stock_picking_batch</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|批量、波次和集群调拨|
|<el-row justify="space-between"><el-col :span="20">module_stock_sms</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|短信息确认|
|<el-row justify="space-between"><el-col :span="20">module_voip</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|网络电话|
|<el-row justify="space-between"><el-col :span="20">module_web_unsplash</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Unsplash图像库|
|<el-row justify="space-between"><el-col :span="20">module_website_cf_turnstile</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Cloudflare Turnstile|
|<el-row justify="space-between"><el-col :span="20">module_website_crm_iap_reveal</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|从网站流量创建线索/商机|
|<el-row justify="space-between"><el-col :span="20">module_website_hr_recruitment</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|线上发布|
|<el-row justify="space-between"><el-col :span="20">overtime_company_threshold</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|对公司有利的宽容时间|
|<el-row justify="space-between"><el-col :span="20">overtime_employee_threshold</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|对员工有利的宽容时间|
|<el-row justify="space-between"><el-col :span="20">partner_autocomplete_insufficient_credit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|信用不足|
|<el-row justify="space-between"><el-col :span="20">pay_invoices_online</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|在线支付发票|
|<el-row justify="space-between"><el-col :span="20">po_order_approval</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|订单审批|
|<el-row justify="space-between"><el-col :span="20">portal_allow_api_keys</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|客户 API 密钥|
|<el-row justify="space-between"><el-col :span="20">predictive_lead_scoring_field_labels</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|预测线索评分字段标签|
|<el-row justify="space-between"><el-col :span="20">predictive_lead_scoring_fields_str</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|字符串中的线索评分频率字段|
|<el-row justify="space-between"><el-col :span="20">predictive_lead_scoring_start_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|线索评分开始日期|
|<el-row justify="space-between"><el-col :span="20">predictive_lead_scoring_start_date_str</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|字符串中的线索评分开始日期|
|<el-row justify="space-between"><el-col :span="20">preview_ready</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Display preview button|
|<el-row justify="space-between"><el-col :span="20">product_volume_volume_in_cubic_feet</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|体积单位|
|<el-row justify="space-between"><el-col :span="20">product_weight_in_lbs</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|重量单位|
|<el-row justify="space-between"><el-col :span="20">profiling_enabled_until</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|启用分析直到|
|<el-row justify="space-between"><el-col :span="20">restrict_template_rendering</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|限制模板渲染|
|<el-row justify="space-between"><el-col :span="20">sfu_server_key</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|SFU 服务器密钥|
|<el-row justify="space-between"><el-col :span="20">sfu_server_url</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|SFU 服务器 URL|
|<el-row justify="space-between"><el-col :span="20">show_blacklist_buttons</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|退订时黑名单选项|
|<el-row justify="space-between"><el-col :span="20">show_effect</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|显示效果|
|<el-row justify="space-between"><el-col :span="20">snailmail_cover_readonly</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|蜗牛邮件封面只读|
|<el-row justify="space-between"><el-col :span="20">tenor_api_key</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Tenor API 密钥|
|<el-row justify="space-between"><el-col :span="20">tenor_content_filter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Tenor 内容过滤器|
|<el-row justify="space-between"><el-col :span="20">tenor_gif_limit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Tenor Gif 限额|
|<el-row justify="space-between"><el-col :span="20">twilio_account_sid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Twilio 帐户 SID|
|<el-row justify="space-between"><el-col :span="20">twilio_account_token</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Twilio 帐户身份验证令牌|
|<el-row justify="space-between"><el-col :span="20">unsplash_access_key</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|访问秘钥|
|<el-row justify="space-between"><el-col :span="20">unsplash_app_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|应用程序ID|
|<el-row justify="space-between"><el-col :span="20">use_invoice_terms</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|默认条款和条件|
|<el-row justify="space-between"><el-col :span="20">use_manufacturing_lead</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|默认制造提前期|
|<el-row justify="space-between"><el-col :span="20">use_po_lead</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|安全交货时间|
|<el-row justify="space-between"><el-col :span="20">use_security_lead</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|销售的安全提前期|
|<el-row justify="space-between"><el-col :span="20">use_twilio_rtc_servers</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|使用 Twilio ICE 服务器|
|<el-row justify="space-between"><el-col :span="20">user_default_rights</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|默认访问权限|
|<el-row justify="space-between"><el-col :span="20">web_app_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|网络应用程序名称|



##### 请求示例： {docsify-ignore}
```json
{
  "account_default_credit_limit" : null,
  "active_user_count" : null,
  "auth_signup_reset_password" : null,
  "auth_signup_template_user_id" : null,
  "auth_signup_uninvited" : null,
  "automatic_invoice" : null,
  "barcode_separator" : null,
  "company_count" : null,
  "company_id" : null,
  "company_informations" : null,
  "company_name" : null,
  "create_date" : null,
  "create_uid" : null,
  "crm_auto_assignment_action" : null,
  "crm_auto_assignment_interval_number" : null,
  "crm_auto_assignment_interval_type" : null,
  "crm_auto_assignment_run_datetime" : null,
  "crm_use_auto_assignment" : null,
  "default_invoice_policy" : null,
  "default_picking_policy" : null,
  "default_purchase_method" : null,
  "delay_alert_contract" : null,
  "digest_emails" : null,
  "display_name" : null,
  "external_email_server_default" : null,
  "fail_counter" : null,
  "google_gmail_client_identifier" : null,
  "google_gmail_client_secret" : null,
  "google_translate_api_key" : null,
  "group_analytic_accounting" : null,
  "group_applicant_cv_display" : null,
  "group_auto_done_setting" : null,
  "group_cash_rounding" : null,
  "group_discount_per_so_line" : null,
  "group_lot_on_delivery_slip" : null,
  "group_lot_on_invoice" : null,
  "group_mass_mailing_campaign" : null,
  "group_mrp_byproducts" : null,
  "group_mrp_reception_report" : null,
  "group_mrp_routings" : null,
  "group_mrp_workorder_dependencies" : null,
  "group_multi_currency" : null,
  "group_product_pricelist" : null,
  "group_product_variant" : null,
  "group_proforma_sales" : null,
  "group_project_milestone" : null,
  "group_project_rating" : null,
  "group_project_recurring_tasks" : null,
  "group_project_stages" : null,
  "group_project_task_dependencies" : null,
  "group_sale_delivery_address" : null,
  "group_sale_order_template" : null,
  "group_send_reminder" : null,
  "group_show_purchase_receipts" : null,
  "group_show_sale_receipts" : null,
  "group_stock_accounting_automatic" : null,
  "group_stock_adv_location" : null,
  "group_stock_lot_print_gs1" : null,
  "group_stock_multi_locations" : null,
  "group_stock_packaging" : null,
  "group_stock_production_lot" : null,
  "group_stock_reception_report" : null,
  "group_stock_sign_delivery" : null,
  "group_stock_tracking_lot" : null,
  "group_stock_tracking_owner" : null,
  "group_unlocked_by_default" : null,
  "group_uom" : null,
  "group_use_lead" : null,
  "group_use_recurring_revenues" : null,
  "group_warning_account" : null,
  "group_warning_purchase" : null,
  "group_warning_sale" : null,
  "group_warning_stock" : null,
  "has_accounting_entries" : null,
  "has_chart_of_accounts" : null,
  "hr_employee_self_edit" : null,
  "hr_expense_alias_prefix" : null,
  "hr_expense_use_mailgateway" : null,
  "id" : null,
  "invoice_mail_template_id" : null,
  "is_account_peppol_eligible" : null,
  "is_installed_sale" : null,
  "is_membership_multi" : null,
  "is_root_company" : null,
  "language_count" : null,
  "lead_enrich_auto" : null,
  "lead_mining_in_pipeline" : null,
  "lock_confirmed_po" : null,
  "mass_mailing_outgoing_mail_server" : null,
  "mass_mailing_reports" : null,
  "mass_mailing_split_contact_name" : null,
  "module_account3way_match" : null,
  "module_account_accountant" : null,
  "module_account_bank_statement_extract" : null,
  "module_account_bank_statement_import_camt" : null,
  "module_account_bank_statement_import_csv" : null,
  "module_account_bank_statement_import_ofx" : null,
  "module_account_bank_statement_import_qif" : null,
  "module_account_batch_payment" : null,
  "module_account_budget" : null,
  "module_account_check_printing" : null,
  "module_account_extract" : null,
  "module_account_inter_company_rules" : null,
  "module_account_intrastat" : null,
  "module_account_invoice_extract" : null,
  "module_account_iso20022" : null,
  "module_account_payment" : null,
  "module_account_peppol" : null,
  "module_account_reports" : null,
  "module_account_sepa_direct_debit" : null,
  "module_auth_ldap" : null,
  "module_auth_oauth" : null,
  "module_base_geolocalize" : null,
  "module_base_import" : null,
  "module_crm_iap_enrich" : null,
  "module_crm_iap_mine" : null,
  "module_currency_rate_live" : null,
  "module_delivery" : null,
  "module_delivery_bpost" : null,
  "module_delivery_dhl" : null,
  "module_delivery_easypost" : null,
  "module_delivery_fedex" : null,
  "module_delivery_sendcloud" : null,
  "module_delivery_shiprocket" : null,
  "module_delivery_starshipit" : null,
  "module_delivery_ups" : null,
  "module_delivery_usps" : null,
  "module_google_calendar" : null,
  "module_google_gmail" : null,
  "module_google_recaptcha" : null,
  "module_hr_expense_extract" : null,
  "module_hr_homeworking" : null,
  "module_hr_payroll_expense" : null,
  "module_hr_presence" : null,
  "module_hr_recruitment_extract" : null,
  "module_hr_recruitment_survey" : null,
  "module_hr_skills" : null,
  "module_hr_timesheet" : null,
  "module_l10n_eu_oss" : null,
  "module_loyalty" : null,
  "module_mail_plugin" : null,
  "module_maintenance_worksheet" : null,
  "module_microsoft_calendar" : null,
  "module_microsoft_outlook" : null,
  "module_mrp_mps" : null,
  "module_mrp_plm" : null,
  "module_mrp_subcontracting" : null,
  "module_partner_autocomplete" : null,
  "module_product_email_template" : null,
  "module_product_expiry" : null,
  "module_product_images" : null,
  "module_product_margin" : null,
  "module_purchase_product_matrix" : null,
  "module_purchase_requisition" : null,
  "module_quality_control" : null,
  "module_quality_control_worksheet" : null,
  "module_sale_amazon" : null,
  "module_sale_commission" : null,
  "module_sale_loyalty" : null,
  "module_sale_margin" : null,
  "module_sale_pdf_quote_builder" : null,
  "module_sale_product_matrix" : null,
  "module_sms" : null,
  "module_snailmail_account" : null,
  "module_stock_barcode" : null,
  "module_stock_barcode_barcodelookup" : null,
  "module_stock_dropshipping" : null,
  "module_stock_fleet" : null,
  "module_stock_landed_costs" : null,
  "module_stock_picking_batch" : null,
  "module_stock_sms" : null,
  "module_voip" : null,
  "module_web_unsplash" : null,
  "module_website_cf_turnstile" : null,
  "module_website_crm_iap_reveal" : null,
  "module_website_hr_recruitment" : null,
  "overtime_company_threshold" : null,
  "overtime_employee_threshold" : null,
  "partner_autocomplete_insufficient_credit" : null,
  "pay_invoices_online" : null,
  "po_order_approval" : null,
  "portal_allow_api_keys" : null,
  "predictive_lead_scoring_field_labels" : null,
  "predictive_lead_scoring_fields_str" : null,
  "predictive_lead_scoring_start_date" : null,
  "predictive_lead_scoring_start_date_str" : null,
  "preview_ready" : null,
  "product_volume_volume_in_cubic_feet" : null,
  "product_weight_in_lbs" : null,
  "profiling_enabled_until" : null,
  "restrict_template_rendering" : null,
  "sfu_server_key" : null,
  "sfu_server_url" : null,
  "show_blacklist_buttons" : null,
  "show_effect" : null,
  "snailmail_cover_readonly" : null,
  "tenor_api_key" : null,
  "tenor_content_filter" : null,
  "tenor_gif_limit" : null,
  "twilio_account_sid" : null,
  "twilio_account_token" : null,
  "unsplash_access_key" : null,
  "unsplash_app_id" : null,
  "use_invoice_terms" : null,
  "use_manufacturing_lead" : null,
  "use_po_lead" : null,
  "use_security_lead" : null,
  "use_twilio_rtc_servers" : null,
  "user_default_rights" : null,
  "web_app_name" : null,
  "write_date" : null,
  "write_uid" : null,
}
```



## 获取配置设定草稿

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/res_config_settings/get_draft" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">account_default_credit_limit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|默认信用额度|
|<el-row justify="space-between"><el-col :span="20">active_user_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效用户数量|
|<el-row justify="space-between"><el-col :span="20">auth_signup_reset_password</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|允许在登录页开启密码重置功能|
|<el-row justify="space-between"><el-col :span="20">auth_signup_template_user_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用作通过注册创建的新用户的模版|
|<el-row justify="space-between"><el-col :span="20">auth_signup_uninvited</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|客户帐号|
|<el-row justify="space-between"><el-col :span="20">automatic_invoice</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|自动发票|
|<el-row justify="space-between"><el-col :span="20">barcode_separator</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|分隔符|
|<el-row justify="space-between"><el-col :span="20">company_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|公司数量|
|<el-row justify="space-between"><el-col :span="20">company_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">company_informations</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司信息|
|<el-row justify="space-between"><el-col :span="20">company_name</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">crm_auto_assignment_action</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|自动分配操作|
|<el-row justify="space-between"><el-col :span="20">crm_auto_assignment_interval_number</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|重复间隔为每|
|<el-row justify="space-between"><el-col :span="20">crm_auto_assignment_interval_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|自动分配间隔单位|
|<el-row justify="space-between"><el-col :span="20">crm_auto_assignment_run_datetime</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|自动指派下次执行日期|
|<el-row justify="space-between"><el-col :span="20">crm_use_auto_assignment</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|基于规则的分配|
|<el-row justify="space-between"><el-col :span="20">default_invoice_policy</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|开票原则|
|<el-row justify="space-between"><el-col :span="20">default_picking_policy</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|拣货策略|
|<el-row justify="space-between"><el-col :span="20">default_purchase_method</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|账单管理|
|<el-row justify="space-between"><el-col :span="20">delay_alert_contract</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|合同逾期延时预警|
|<el-row justify="space-between"><el-col :span="20">digest_emails</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|摘要邮件|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">external_email_server_default</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|使用自定义电子邮件服务器|
|<el-row justify="space-between"><el-col :span="20">fail_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|失败的邮件|
|<el-row justify="space-between"><el-col :span="20">google_gmail_client_identifier</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Gmail 客户端 ID|
|<el-row justify="space-between"><el-col :span="20">google_gmail_client_secret</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Gmail客户端Secret|
|<el-row justify="space-between"><el-col :span="20">google_translate_api_key</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|消息翻译 API 密钥|
|<el-row justify="space-between"><el-col :span="20">group_analytic_accounting</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|分析会计|
|<el-row justify="space-between"><el-col :span="20">group_applicant_cv_display</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|团体申请人简历展示|
|<el-row justify="space-between"><el-col :span="20">group_auto_done_setting</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|锁定已确认的销售订单|
|<el-row justify="space-between"><el-col :span="20">group_cash_rounding</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|现金舍入|
|<el-row justify="space-between"><el-col :span="20">group_discount_per_so_line</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|折扣|
|<el-row justify="space-between"><el-col :span="20">group_lot_on_delivery_slip</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|在送货单上显示批次 / 序列号|
|<el-row justify="space-between"><el-col :span="20">group_lot_on_invoice</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|在结算单上显示批次 / 序列号|
|<el-row justify="space-between"><el-col :span="20">group_mass_mailing_campaign</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|邮件营销|
|<el-row justify="space-between"><el-col :span="20">group_mrp_byproducts</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|副产品|
|<el-row justify="space-between"><el-col :span="20">group_mrp_reception_report</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|制造订单分配报表|
|<el-row justify="space-between"><el-col :span="20">group_mrp_routings</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|物料需求计划（MRP）工单|
|<el-row justify="space-between"><el-col :span="20">group_mrp_workorder_dependencies</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|工单依赖性|
|<el-row justify="space-between"><el-col :span="20">group_multi_currency</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|多币别|
|<el-row justify="space-between"><el-col :span="20">group_product_pricelist</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|价格表|
|<el-row justify="space-between"><el-col :span="20">group_product_variant</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|变体|
|<el-row justify="space-between"><el-col :span="20">group_proforma_sales</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|形式发票|
|<el-row justify="space-between"><el-col :span="20">group_project_milestone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|里程碑|
|<el-row justify="space-between"><el-col :span="20">group_project_rating</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|客户点评|
|<el-row justify="space-between"><el-col :span="20">group_project_recurring_tasks</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|周期任务|
|<el-row justify="space-between"><el-col :span="20">group_project_stages</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|项目阶段|
|<el-row justify="space-between"><el-col :span="20">group_project_task_dependencies</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|任务依赖|
|<el-row justify="space-between"><el-col :span="20">group_sale_delivery_address</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|客户地址|
|<el-row justify="space-between"><el-col :span="20">group_sale_order_template</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|报价模板|
|<el-row justify="space-between"><el-col :span="20">group_send_reminder</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|收货提醒|
|<el-row justify="space-between"><el-col :span="20">group_show_purchase_receipts</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|采购收据|
|<el-row justify="space-between"><el-col :span="20">group_show_sale_receipts</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|销售收据|
|<el-row justify="space-between"><el-col :span="20">group_stock_accounting_automatic</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|自动库存会计|
|<el-row justify="space-between"><el-col :span="20">group_stock_adv_location</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|多步路线|
|<el-row justify="space-between"><el-col :span="20">group_stock_lot_print_gs1</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|使用GS1编码格式打印批号和序列号|
|<el-row justify="space-between"><el-col :span="20">group_stock_multi_locations</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|储存位置|
|<el-row justify="space-between"><el-col :span="20">group_stock_packaging</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|产品包装|
|<el-row justify="space-between"><el-col :span="20">group_stock_production_lot</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|批次 / 序列号|
|<el-row justify="space-between"><el-col :span="20">group_stock_reception_report</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|库存接收报表|
|<el-row justify="space-between"><el-col :span="20">group_stock_sign_delivery</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|签名|
|<el-row justify="space-between"><el-col :span="20">group_stock_tracking_lot</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|包裹|
|<el-row justify="space-between"><el-col :span="20">group_stock_tracking_owner</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|寄售|
|<el-row justify="space-between"><el-col :span="20">group_unlocked_by_default</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|解锁制造订单|
|<el-row justify="space-between"><el-col :span="20">group_uom</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|计量单位|
|<el-row justify="space-between"><el-col :span="20">group_use_lead</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|线索|
|<el-row justify="space-between"><el-col :span="20">group_use_recurring_revenues</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|经常性收入|
|<el-row justify="space-between"><el-col :span="20">group_warning_account</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|发票中的警告|
|<el-row justify="space-between"><el-col :span="20">group_warning_purchase</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|采购警告|
|<el-row justify="space-between"><el-col :span="20">group_warning_sale</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|销售订单警告信息|
|<el-row justify="space-between"><el-col :span="20">group_warning_stock</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|库存警报|
|<el-row justify="space-between"><el-col :span="20">has_accounting_entries</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Has Accounting Entries|
|<el-row justify="space-between"><el-col :span="20">has_chart_of_accounts</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Company has a chart of accounts|
|<el-row justify="space-between"><el-col :span="20">hr_employee_self_edit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|员工编辑|
|<el-row justify="space-between"><el-col :span="20">hr_expense_alias_prefix</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|默认的费用别名|
|<el-row justify="space-between"><el-col :span="20">hr_expense_use_mailgateway</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|允许员工通过电子邮件记录费用|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">invoice_mail_template_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|发票电子邮件模板|
|<el-row justify="space-between"><el-col :span="20">is_account_peppol_eligible</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|PEPPOL 符合条件|
|<el-row justify="space-between"><el-col :span="20">is_installed_sale</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|销售模块是否已安装|
|<el-row justify="space-between"><el-col :span="20">is_membership_multi</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|多团队|
|<el-row justify="space-between"><el-col :span="20">is_root_company</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是母公司|
|<el-row justify="space-between"><el-col :span="20">language_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|语言数量|
|<el-row justify="space-between"><el-col :span="20">lead_enrich_auto</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|自动丰富线索|
|<el-row justify="space-between"><el-col :span="20">lead_mining_in_pipeline</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|直接从商机商机创建线索挖掘申请。|
|<el-row justify="space-between"><el-col :span="20">lock_confirmed_po</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|锁定已确认的订单|
|<el-row justify="space-between"><el-col :span="20">mass_mailing_outgoing_mail_server</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|专门服务器|
|<el-row justify="space-between"><el-col :span="20">mass_mailing_reports</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|24小时统计邮寄报告|
|<el-row justify="space-between"><el-col :span="20">mass_mailing_split_contact_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|拆分名字和姓氏|
|<el-row justify="space-between"><el-col :span="20">module_account3way_match</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|3单匹配:采购订单，收货单与发票|
|<el-row justify="space-between"><el-col :span="20">module_account_accountant</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|会计|
|<el-row justify="space-between"><el-col :span="20">module_account_bank_statement_extract</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Bank Statement Digitization|
|<el-row justify="space-between"><el-col :span="20">module_account_bank_statement_import_camt</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|以CAMT.053 格式导入|
|<el-row justify="space-between"><el-col :span="20">module_account_bank_statement_import_csv</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|以.csv、.xls和.xlsx格式导入|
|<el-row justify="space-between"><el-col :span="20">module_account_bank_statement_import_ofx</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|以.ofx格式导入|
|<el-row justify="space-between"><el-col :span="20">module_account_bank_statement_import_qif</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|导入.qif单据|
|<el-row justify="space-between"><el-col :span="20">module_account_batch_payment</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|使用批量付款|
|<el-row justify="space-between"><el-col :span="20">module_account_budget</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|预算管理|
|<el-row justify="space-between"><el-col :span="20">module_account_check_printing</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Allow check printing and deposits|
|<el-row justify="space-between"><el-col :span="20">module_account_extract</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Document Digitization|
|<el-row justify="space-between"><el-col :span="20">module_account_inter_company_rules</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|管理公司间交易|
|<el-row justify="space-between"><el-col :span="20">module_account_intrastat</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|国际联盟|
|<el-row justify="space-between"><el-col :span="20">module_account_invoice_extract</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Invoice Digitization|
|<el-row justify="space-between"><el-col :span="20">module_account_iso20022</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|SEPA Credit Transfer / ISO20022|
|<el-row justify="space-between"><el-col :span="20">module_account_payment</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Invoice Online Payment|
|<el-row justify="space-between"><el-col :span="20">module_account_peppol</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|PEPPOL 开具发票|
|<el-row justify="space-between"><el-col :span="20">module_account_reports</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Dynamic Reports|
|<el-row justify="space-between"><el-col :span="20">module_account_sepa_direct_debit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Use SEPA Direct Debit|
|<el-row justify="space-between"><el-col :span="20">module_auth_ldap</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|LDAP认证|
|<el-row justify="space-between"><el-col :span="20">module_auth_oauth</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|使用外部验证提供者 (OAuth)|
|<el-row justify="space-between"><el-col :span="20">module_base_geolocalize</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|地理定位|
|<el-row justify="space-between"><el-col :span="20">module_base_import</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|允许用户导入 CSV/XLS/XLSX/ODS格式的文档数据|
|<el-row justify="space-between"><el-col :span="20">module_crm_iap_enrich</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|根据线索的电子邮箱地址、使用公司数据自动丰富线索。|
|<el-row justify="space-between"><el-col :span="20">module_crm_iap_mine</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|基于国家/地区、行业、规模等信息生成新的线索。|
|<el-row justify="space-between"><el-col :span="20">module_currency_rate_live</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|自动汇率|
|<el-row justify="space-between"><el-col :span="20">module_delivery</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|交付方式|
|<el-row justify="space-between"><el-col :span="20">module_delivery_bpost</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|bpost连接器|
|<el-row justify="space-between"><el-col :span="20">module_delivery_dhl</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|DHL快递连接器|
|<el-row justify="space-between"><el-col :span="20">module_delivery_easypost</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Easypost连接器|
|<el-row justify="space-between"><el-col :span="20">module_delivery_fedex</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|FedEx连接器|
|<el-row justify="space-between"><el-col :span="20">module_delivery_sendcloud</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Sendcloud连接器|
|<el-row justify="space-between"><el-col :span="20">module_delivery_shiprocket</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Shiprocket 连接器|
|<el-row justify="space-between"><el-col :span="20">module_delivery_starshipit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Starshipit 连接器|
|<el-row justify="space-between"><el-col :span="20">module_delivery_ups</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|UPS连接器|
|<el-row justify="space-between"><el-col :span="20">module_delivery_usps</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|USPS连接器|
|<el-row justify="space-between"><el-col :span="20">module_google_calendar</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|允许用户同步谷歌日历|
|<el-row justify="space-between"><el-col :span="20">module_google_gmail</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|支持Gmail身份验证|
|<el-row justify="space-between"><el-col :span="20">module_google_recaptcha</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|验证码|
|<el-row justify="space-between"><el-col :span="20">module_hr_expense_extract</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|向OCR发送账单以产生费用|
|<el-row justify="space-between"><el-col :span="20">module_hr_homeworking</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|远程工作|
|<el-row justify="space-between"><el-col :span="20">module_hr_payroll_expense</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|工资单上的报销费用|
|<el-row justify="space-between"><el-col :span="20">module_hr_presence</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|高级出席控制|
|<el-row justify="space-between"><el-col :span="20">module_hr_recruitment_extract</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|将简历发送到 OCR 以填写申请|
|<el-row justify="space-between"><el-col :span="20">module_hr_recruitment_survey</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|面试表单|
|<el-row justify="space-between"><el-col :span="20">module_hr_skills</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|技能管理|
|<el-row justify="space-between"><el-col :span="20">module_hr_timesheet</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|任务日志|
|<el-row justify="space-between"><el-col :span="20">module_l10n_eu_oss</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|欧盟共同体内部远程销售|
|<el-row justify="space-between"><el-col :span="20">module_loyalty</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|促销、优惠券、礼品卡和会员方案|
|<el-row justify="space-between"><el-col :span="20">module_mail_plugin</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|允许与邮件插件集成|
|<el-row justify="space-between"><el-col :span="20">module_maintenance_worksheet</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|定制维护工作表|
|<el-row justify="space-between"><el-col :span="20">module_microsoft_calendar</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|允许用户同步Outlook日历|
|<el-row justify="space-between"><el-col :span="20">module_microsoft_outlook</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|支持Outlook身份验证|
|<el-row justify="space-between"><el-col :span="20">module_mrp_mps</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|主生产计划|
|<el-row justify="space-between"><el-col :span="20">module_mrp_plm</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|产品生命周期管理（PLM）|
|<el-row justify="space-between"><el-col :span="20">module_mrp_subcontracting</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|外包|
|<el-row justify="space-between"><el-col :span="20">module_partner_autocomplete</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|合作伙伴自动完成|
|<el-row justify="space-between"><el-col :span="20">module_product_email_template</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|特定的电子邮件|
|<el-row justify="space-between"><el-col :span="20">module_product_expiry</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|到期日期|
|<el-row justify="space-between"><el-col :span="20">module_product_images</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|使用条形码获取产品图片|
|<el-row justify="space-between"><el-col :span="20">module_product_margin</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|允许产品毛利|
|<el-row justify="space-between"><el-col :span="20">module_purchase_product_matrix</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|采购表格入口|
|<el-row justify="space-between"><el-col :span="20">module_purchase_requisition</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|采购协议|
|<el-row justify="space-between"><el-col :span="20">module_quality_control</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|质量|
|<el-row justify="space-between"><el-col :span="20">module_quality_control_worksheet</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|质量工作表|
|<el-row justify="space-between"><el-col :span="20">module_sale_amazon</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|亚马逊同步|
|<el-row justify="space-between"><el-col :span="20">module_sale_commission</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|佣金|
|<el-row justify="space-between"><el-col :span="20">module_sale_loyalty</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|优惠券和会员|
|<el-row justify="space-between"><el-col :span="20">module_sale_margin</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|毛利|
|<el-row justify="space-between"><el-col :span="20">module_sale_pdf_quote_builder</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|PDF 报价生成器|
|<el-row justify="space-between"><el-col :span="20">module_sale_product_matrix</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|销售表格录入|
|<el-row justify="space-between"><el-col :span="20">module_sms</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|短信息|
|<el-row justify="space-between"><el-col :span="20">module_snailmail_account</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|传统信件|
|<el-row justify="space-between"><el-col :span="20">module_stock_barcode</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|条码扫描器|
|<el-row justify="space-between"><el-col :span="20">module_stock_barcode_barcodelookup</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|库存条形码数据库|
|<el-row justify="space-between"><el-col :span="20">module_stock_dropshipping</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|代发货|
|<el-row justify="space-between"><el-col :span="20">module_stock_fleet</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|配送管理系统|
|<el-row justify="space-between"><el-col :span="20">module_stock_landed_costs</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|到岸成本|
|<el-row justify="space-between"><el-col :span="20">module_stock_picking_batch</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|批量、波次和集群调拨|
|<el-row justify="space-between"><el-col :span="20">module_stock_sms</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|短信息确认|
|<el-row justify="space-between"><el-col :span="20">module_voip</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|网络电话|
|<el-row justify="space-between"><el-col :span="20">module_web_unsplash</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Unsplash图像库|
|<el-row justify="space-between"><el-col :span="20">module_website_cf_turnstile</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Cloudflare Turnstile|
|<el-row justify="space-between"><el-col :span="20">module_website_crm_iap_reveal</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|从网站流量创建线索/商机|
|<el-row justify="space-between"><el-col :span="20">module_website_hr_recruitment</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|线上发布|
|<el-row justify="space-between"><el-col :span="20">overtime_company_threshold</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|对公司有利的宽容时间|
|<el-row justify="space-between"><el-col :span="20">overtime_employee_threshold</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|对员工有利的宽容时间|
|<el-row justify="space-between"><el-col :span="20">partner_autocomplete_insufficient_credit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|信用不足|
|<el-row justify="space-between"><el-col :span="20">pay_invoices_online</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|在线支付发票|
|<el-row justify="space-between"><el-col :span="20">po_order_approval</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|订单审批|
|<el-row justify="space-between"><el-col :span="20">portal_allow_api_keys</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|客户 API 密钥|
|<el-row justify="space-between"><el-col :span="20">predictive_lead_scoring_field_labels</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|预测线索评分字段标签|
|<el-row justify="space-between"><el-col :span="20">predictive_lead_scoring_fields_str</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|字符串中的线索评分频率字段|
|<el-row justify="space-between"><el-col :span="20">predictive_lead_scoring_start_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|线索评分开始日期|
|<el-row justify="space-between"><el-col :span="20">predictive_lead_scoring_start_date_str</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|字符串中的线索评分开始日期|
|<el-row justify="space-between"><el-col :span="20">preview_ready</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Display preview button|
|<el-row justify="space-between"><el-col :span="20">product_volume_volume_in_cubic_feet</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|体积单位|
|<el-row justify="space-between"><el-col :span="20">product_weight_in_lbs</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|重量单位|
|<el-row justify="space-between"><el-col :span="20">profiling_enabled_until</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|启用分析直到|
|<el-row justify="space-between"><el-col :span="20">restrict_template_rendering</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|限制模板渲染|
|<el-row justify="space-between"><el-col :span="20">sfu_server_key</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|SFU 服务器密钥|
|<el-row justify="space-between"><el-col :span="20">sfu_server_url</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|SFU 服务器 URL|
|<el-row justify="space-between"><el-col :span="20">show_blacklist_buttons</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|退订时黑名单选项|
|<el-row justify="space-between"><el-col :span="20">show_effect</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|显示效果|
|<el-row justify="space-between"><el-col :span="20">snailmail_cover_readonly</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|蜗牛邮件封面只读|
|<el-row justify="space-between"><el-col :span="20">tenor_api_key</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Tenor API 密钥|
|<el-row justify="space-between"><el-col :span="20">tenor_content_filter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Tenor 内容过滤器|
|<el-row justify="space-between"><el-col :span="20">tenor_gif_limit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Tenor Gif 限额|
|<el-row justify="space-between"><el-col :span="20">twilio_account_sid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Twilio 帐户 SID|
|<el-row justify="space-between"><el-col :span="20">twilio_account_token</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Twilio 帐户身份验证令牌|
|<el-row justify="space-between"><el-col :span="20">unsplash_access_key</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|访问秘钥|
|<el-row justify="space-between"><el-col :span="20">unsplash_app_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|应用程序ID|
|<el-row justify="space-between"><el-col :span="20">use_invoice_terms</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|默认条款和条件|
|<el-row justify="space-between"><el-col :span="20">use_manufacturing_lead</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|默认制造提前期|
|<el-row justify="space-between"><el-col :span="20">use_po_lead</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|安全交货时间|
|<el-row justify="space-between"><el-col :span="20">use_security_lead</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|销售的安全提前期|
|<el-row justify="space-between"><el-col :span="20">use_twilio_rtc_servers</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|使用 Twilio ICE 服务器|
|<el-row justify="space-between"><el-col :span="20">user_default_rights</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|默认访问权限|
|<el-row justify="space-between"><el-col :span="20">web_app_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|网络应用程序名称|



##### 请求示例： {docsify-ignore}
```json
{
  "account_default_credit_limit" : null,
  "active_user_count" : null,
  "auth_signup_reset_password" : null,
  "auth_signup_template_user_id" : null,
  "auth_signup_uninvited" : null,
  "automatic_invoice" : null,
  "barcode_separator" : null,
  "company_count" : null,
  "company_id" : null,
  "company_informations" : null,
  "company_name" : null,
  "create_date" : null,
  "create_uid" : null,
  "crm_auto_assignment_action" : null,
  "crm_auto_assignment_interval_number" : null,
  "crm_auto_assignment_interval_type" : null,
  "crm_auto_assignment_run_datetime" : null,
  "crm_use_auto_assignment" : null,
  "default_invoice_policy" : null,
  "default_picking_policy" : null,
  "default_purchase_method" : null,
  "delay_alert_contract" : null,
  "digest_emails" : null,
  "display_name" : null,
  "external_email_server_default" : null,
  "fail_counter" : null,
  "google_gmail_client_identifier" : null,
  "google_gmail_client_secret" : null,
  "google_translate_api_key" : null,
  "group_analytic_accounting" : null,
  "group_applicant_cv_display" : null,
  "group_auto_done_setting" : null,
  "group_cash_rounding" : null,
  "group_discount_per_so_line" : null,
  "group_lot_on_delivery_slip" : null,
  "group_lot_on_invoice" : null,
  "group_mass_mailing_campaign" : null,
  "group_mrp_byproducts" : null,
  "group_mrp_reception_report" : null,
  "group_mrp_routings" : null,
  "group_mrp_workorder_dependencies" : null,
  "group_multi_currency" : null,
  "group_product_pricelist" : null,
  "group_product_variant" : null,
  "group_proforma_sales" : null,
  "group_project_milestone" : null,
  "group_project_rating" : null,
  "group_project_recurring_tasks" : null,
  "group_project_stages" : null,
  "group_project_task_dependencies" : null,
  "group_sale_delivery_address" : null,
  "group_sale_order_template" : null,
  "group_send_reminder" : null,
  "group_show_purchase_receipts" : null,
  "group_show_sale_receipts" : null,
  "group_stock_accounting_automatic" : null,
  "group_stock_adv_location" : null,
  "group_stock_lot_print_gs1" : null,
  "group_stock_multi_locations" : null,
  "group_stock_packaging" : null,
  "group_stock_production_lot" : null,
  "group_stock_reception_report" : null,
  "group_stock_sign_delivery" : null,
  "group_stock_tracking_lot" : null,
  "group_stock_tracking_owner" : null,
  "group_unlocked_by_default" : null,
  "group_uom" : null,
  "group_use_lead" : null,
  "group_use_recurring_revenues" : null,
  "group_warning_account" : null,
  "group_warning_purchase" : null,
  "group_warning_sale" : null,
  "group_warning_stock" : null,
  "has_accounting_entries" : null,
  "has_chart_of_accounts" : null,
  "hr_employee_self_edit" : null,
  "hr_expense_alias_prefix" : null,
  "hr_expense_use_mailgateway" : null,
  "id" : null,
  "invoice_mail_template_id" : null,
  "is_account_peppol_eligible" : null,
  "is_installed_sale" : null,
  "is_membership_multi" : null,
  "is_root_company" : null,
  "language_count" : null,
  "lead_enrich_auto" : null,
  "lead_mining_in_pipeline" : null,
  "lock_confirmed_po" : null,
  "mass_mailing_outgoing_mail_server" : null,
  "mass_mailing_reports" : null,
  "mass_mailing_split_contact_name" : null,
  "module_account3way_match" : null,
  "module_account_accountant" : null,
  "module_account_bank_statement_extract" : null,
  "module_account_bank_statement_import_camt" : null,
  "module_account_bank_statement_import_csv" : null,
  "module_account_bank_statement_import_ofx" : null,
  "module_account_bank_statement_import_qif" : null,
  "module_account_batch_payment" : null,
  "module_account_budget" : null,
  "module_account_check_printing" : null,
  "module_account_extract" : null,
  "module_account_inter_company_rules" : null,
  "module_account_intrastat" : null,
  "module_account_invoice_extract" : null,
  "module_account_iso20022" : null,
  "module_account_payment" : null,
  "module_account_peppol" : null,
  "module_account_reports" : null,
  "module_account_sepa_direct_debit" : null,
  "module_auth_ldap" : null,
  "module_auth_oauth" : null,
  "module_base_geolocalize" : null,
  "module_base_import" : null,
  "module_crm_iap_enrich" : null,
  "module_crm_iap_mine" : null,
  "module_currency_rate_live" : null,
  "module_delivery" : null,
  "module_delivery_bpost" : null,
  "module_delivery_dhl" : null,
  "module_delivery_easypost" : null,
  "module_delivery_fedex" : null,
  "module_delivery_sendcloud" : null,
  "module_delivery_shiprocket" : null,
  "module_delivery_starshipit" : null,
  "module_delivery_ups" : null,
  "module_delivery_usps" : null,
  "module_google_calendar" : null,
  "module_google_gmail" : null,
  "module_google_recaptcha" : null,
  "module_hr_expense_extract" : null,
  "module_hr_homeworking" : null,
  "module_hr_payroll_expense" : null,
  "module_hr_presence" : null,
  "module_hr_recruitment_extract" : null,
  "module_hr_recruitment_survey" : null,
  "module_hr_skills" : null,
  "module_hr_timesheet" : null,
  "module_l10n_eu_oss" : null,
  "module_loyalty" : null,
  "module_mail_plugin" : null,
  "module_maintenance_worksheet" : null,
  "module_microsoft_calendar" : null,
  "module_microsoft_outlook" : null,
  "module_mrp_mps" : null,
  "module_mrp_plm" : null,
  "module_mrp_subcontracting" : null,
  "module_partner_autocomplete" : null,
  "module_product_email_template" : null,
  "module_product_expiry" : null,
  "module_product_images" : null,
  "module_product_margin" : null,
  "module_purchase_product_matrix" : null,
  "module_purchase_requisition" : null,
  "module_quality_control" : null,
  "module_quality_control_worksheet" : null,
  "module_sale_amazon" : null,
  "module_sale_commission" : null,
  "module_sale_loyalty" : null,
  "module_sale_margin" : null,
  "module_sale_pdf_quote_builder" : null,
  "module_sale_product_matrix" : null,
  "module_sms" : null,
  "module_snailmail_account" : null,
  "module_stock_barcode" : null,
  "module_stock_barcode_barcodelookup" : null,
  "module_stock_dropshipping" : null,
  "module_stock_fleet" : null,
  "module_stock_landed_costs" : null,
  "module_stock_picking_batch" : null,
  "module_stock_sms" : null,
  "module_voip" : null,
  "module_web_unsplash" : null,
  "module_website_cf_turnstile" : null,
  "module_website_crm_iap_reveal" : null,
  "module_website_hr_recruitment" : null,
  "overtime_company_threshold" : null,
  "overtime_employee_threshold" : null,
  "partner_autocomplete_insufficient_credit" : null,
  "pay_invoices_online" : null,
  "po_order_approval" : null,
  "portal_allow_api_keys" : null,
  "predictive_lead_scoring_field_labels" : null,
  "predictive_lead_scoring_fields_str" : null,
  "predictive_lead_scoring_start_date" : null,
  "predictive_lead_scoring_start_date_str" : null,
  "preview_ready" : null,
  "product_volume_volume_in_cubic_feet" : null,
  "product_weight_in_lbs" : null,
  "profiling_enabled_until" : null,
  "restrict_template_rendering" : null,
  "sfu_server_key" : null,
  "sfu_server_url" : null,
  "show_blacklist_buttons" : null,
  "show_effect" : null,
  "snailmail_cover_readonly" : null,
  "tenor_api_key" : null,
  "tenor_content_filter" : null,
  "tenor_gif_limit" : null,
  "twilio_account_sid" : null,
  "twilio_account_token" : null,
  "unsplash_access_key" : null,
  "unsplash_app_id" : null,
  "use_invoice_terms" : null,
  "use_manufacturing_lead" : null,
  "use_po_lead" : null,
  "use_security_lead" : null,
  "use_twilio_rtc_servers" : null,
  "user_default_rights" : null,
  "web_app_name" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "account_default_credit_limit" : null,
  "active_user_count" : null,
  "auth_signup_reset_password" : null,
  "auth_signup_template_user_id" : null,
  "auth_signup_uninvited" : null,
  "automatic_invoice" : null,
  "barcode_separator" : null,
  "company_count" : null,
  "company_id" : null,
  "company_informations" : null,
  "company_name" : null,
  "create_date" : null,
  "create_uid" : null,
  "crm_auto_assignment_action" : null,
  "crm_auto_assignment_interval_number" : null,
  "crm_auto_assignment_interval_type" : null,
  "crm_auto_assignment_run_datetime" : null,
  "crm_use_auto_assignment" : null,
  "default_invoice_policy" : null,
  "default_picking_policy" : null,
  "default_purchase_method" : null,
  "delay_alert_contract" : null,
  "digest_emails" : null,
  "display_name" : null,
  "external_email_server_default" : null,
  "fail_counter" : null,
  "google_gmail_client_identifier" : null,
  "google_gmail_client_secret" : null,
  "google_translate_api_key" : null,
  "group_analytic_accounting" : null,
  "group_applicant_cv_display" : null,
  "group_auto_done_setting" : null,
  "group_cash_rounding" : null,
  "group_discount_per_so_line" : null,
  "group_lot_on_delivery_slip" : null,
  "group_lot_on_invoice" : null,
  "group_mass_mailing_campaign" : null,
  "group_mrp_byproducts" : null,
  "group_mrp_reception_report" : null,
  "group_mrp_routings" : null,
  "group_mrp_workorder_dependencies" : null,
  "group_multi_currency" : null,
  "group_product_pricelist" : null,
  "group_product_variant" : null,
  "group_proforma_sales" : null,
  "group_project_milestone" : null,
  "group_project_rating" : null,
  "group_project_recurring_tasks" : null,
  "group_project_stages" : null,
  "group_project_task_dependencies" : null,
  "group_sale_delivery_address" : null,
  "group_sale_order_template" : null,
  "group_send_reminder" : null,
  "group_show_purchase_receipts" : null,
  "group_show_sale_receipts" : null,
  "group_stock_accounting_automatic" : null,
  "group_stock_adv_location" : null,
  "group_stock_lot_print_gs1" : null,
  "group_stock_multi_locations" : null,
  "group_stock_packaging" : null,
  "group_stock_production_lot" : null,
  "group_stock_reception_report" : null,
  "group_stock_sign_delivery" : null,
  "group_stock_tracking_lot" : null,
  "group_stock_tracking_owner" : null,
  "group_unlocked_by_default" : null,
  "group_uom" : null,
  "group_use_lead" : null,
  "group_use_recurring_revenues" : null,
  "group_warning_account" : null,
  "group_warning_purchase" : null,
  "group_warning_sale" : null,
  "group_warning_stock" : null,
  "has_accounting_entries" : null,
  "has_chart_of_accounts" : null,
  "hr_employee_self_edit" : null,
  "hr_expense_alias_prefix" : null,
  "hr_expense_use_mailgateway" : null,
  "id" : null,
  "invoice_mail_template_id" : null,
  "is_account_peppol_eligible" : null,
  "is_installed_sale" : null,
  "is_membership_multi" : null,
  "is_root_company" : null,
  "language_count" : null,
  "lead_enrich_auto" : null,
  "lead_mining_in_pipeline" : null,
  "lock_confirmed_po" : null,
  "mass_mailing_outgoing_mail_server" : null,
  "mass_mailing_reports" : null,
  "mass_mailing_split_contact_name" : null,
  "module_account3way_match" : null,
  "module_account_accountant" : null,
  "module_account_bank_statement_extract" : null,
  "module_account_bank_statement_import_camt" : null,
  "module_account_bank_statement_import_csv" : null,
  "module_account_bank_statement_import_ofx" : null,
  "module_account_bank_statement_import_qif" : null,
  "module_account_batch_payment" : null,
  "module_account_budget" : null,
  "module_account_check_printing" : null,
  "module_account_extract" : null,
  "module_account_inter_company_rules" : null,
  "module_account_intrastat" : null,
  "module_account_invoice_extract" : null,
  "module_account_iso20022" : null,
  "module_account_payment" : null,
  "module_account_peppol" : null,
  "module_account_reports" : null,
  "module_account_sepa_direct_debit" : null,
  "module_auth_ldap" : null,
  "module_auth_oauth" : null,
  "module_base_geolocalize" : null,
  "module_base_import" : null,
  "module_crm_iap_enrich" : null,
  "module_crm_iap_mine" : null,
  "module_currency_rate_live" : null,
  "module_delivery" : null,
  "module_delivery_bpost" : null,
  "module_delivery_dhl" : null,
  "module_delivery_easypost" : null,
  "module_delivery_fedex" : null,
  "module_delivery_sendcloud" : null,
  "module_delivery_shiprocket" : null,
  "module_delivery_starshipit" : null,
  "module_delivery_ups" : null,
  "module_delivery_usps" : null,
  "module_google_calendar" : null,
  "module_google_gmail" : null,
  "module_google_recaptcha" : null,
  "module_hr_expense_extract" : null,
  "module_hr_homeworking" : null,
  "module_hr_payroll_expense" : null,
  "module_hr_presence" : null,
  "module_hr_recruitment_extract" : null,
  "module_hr_recruitment_survey" : null,
  "module_hr_skills" : null,
  "module_hr_timesheet" : null,
  "module_l10n_eu_oss" : null,
  "module_loyalty" : null,
  "module_mail_plugin" : null,
  "module_maintenance_worksheet" : null,
  "module_microsoft_calendar" : null,
  "module_microsoft_outlook" : null,
  "module_mrp_mps" : null,
  "module_mrp_plm" : null,
  "module_mrp_subcontracting" : null,
  "module_partner_autocomplete" : null,
  "module_product_email_template" : null,
  "module_product_expiry" : null,
  "module_product_images" : null,
  "module_product_margin" : null,
  "module_purchase_product_matrix" : null,
  "module_purchase_requisition" : null,
  "module_quality_control" : null,
  "module_quality_control_worksheet" : null,
  "module_sale_amazon" : null,
  "module_sale_commission" : null,
  "module_sale_loyalty" : null,
  "module_sale_margin" : null,
  "module_sale_pdf_quote_builder" : null,
  "module_sale_product_matrix" : null,
  "module_sms" : null,
  "module_snailmail_account" : null,
  "module_stock_barcode" : null,
  "module_stock_barcode_barcodelookup" : null,
  "module_stock_dropshipping" : null,
  "module_stock_fleet" : null,
  "module_stock_landed_costs" : null,
  "module_stock_picking_batch" : null,
  "module_stock_sms" : null,
  "module_voip" : null,
  "module_web_unsplash" : null,
  "module_website_cf_turnstile" : null,
  "module_website_crm_iap_reveal" : null,
  "module_website_hr_recruitment" : null,
  "overtime_company_threshold" : null,
  "overtime_employee_threshold" : null,
  "partner_autocomplete_insufficient_credit" : null,
  "pay_invoices_online" : null,
  "po_order_approval" : null,
  "portal_allow_api_keys" : null,
  "predictive_lead_scoring_field_labels" : null,
  "predictive_lead_scoring_fields_str" : null,
  "predictive_lead_scoring_start_date" : null,
  "predictive_lead_scoring_start_date_str" : null,
  "preview_ready" : null,
  "product_volume_volume_in_cubic_feet" : null,
  "product_weight_in_lbs" : null,
  "profiling_enabled_until" : null,
  "restrict_template_rendering" : null,
  "sfu_server_key" : null,
  "sfu_server_url" : null,
  "show_blacklist_buttons" : null,
  "show_effect" : null,
  "snailmail_cover_readonly" : null,
  "tenor_api_key" : null,
  "tenor_content_filter" : null,
  "tenor_gif_limit" : null,
  "twilio_account_sid" : null,
  "twilio_account_token" : null,
  "unsplash_access_key" : null,
  "unsplash_app_id" : null,
  "use_invoice_terms" : null,
  "use_manufacturing_lead" : null,
  "use_po_lead" : null,
  "use_security_lead" : null,
  "use_twilio_rtc_servers" : null,
  "user_default_rights" : null,
  "web_app_name" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 获取配置值

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/res_config_settings/{key}/get_values" type="info" :closable="false" ></el-alert>
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
  "account_default_credit_limit" : null,
  "active_user_count" : null,
  "auth_signup_reset_password" : null,
  "auth_signup_template_user_id" : null,
  "auth_signup_uninvited" : null,
  "automatic_invoice" : null,
  "barcode_separator" : null,
  "company_count" : null,
  "company_id" : null,
  "company_informations" : null,
  "company_name" : null,
  "create_date" : null,
  "create_uid" : null,
  "crm_auto_assignment_action" : null,
  "crm_auto_assignment_interval_number" : null,
  "crm_auto_assignment_interval_type" : null,
  "crm_auto_assignment_run_datetime" : null,
  "crm_use_auto_assignment" : null,
  "default_invoice_policy" : null,
  "default_picking_policy" : null,
  "default_purchase_method" : null,
  "delay_alert_contract" : null,
  "digest_emails" : null,
  "display_name" : null,
  "external_email_server_default" : null,
  "fail_counter" : null,
  "google_gmail_client_identifier" : null,
  "google_gmail_client_secret" : null,
  "google_translate_api_key" : null,
  "group_analytic_accounting" : null,
  "group_applicant_cv_display" : null,
  "group_auto_done_setting" : null,
  "group_cash_rounding" : null,
  "group_discount_per_so_line" : null,
  "group_lot_on_delivery_slip" : null,
  "group_lot_on_invoice" : null,
  "group_mass_mailing_campaign" : null,
  "group_mrp_byproducts" : null,
  "group_mrp_reception_report" : null,
  "group_mrp_routings" : null,
  "group_mrp_workorder_dependencies" : null,
  "group_multi_currency" : null,
  "group_product_pricelist" : null,
  "group_product_variant" : null,
  "group_proforma_sales" : null,
  "group_project_milestone" : null,
  "group_project_rating" : null,
  "group_project_recurring_tasks" : null,
  "group_project_stages" : null,
  "group_project_task_dependencies" : null,
  "group_sale_delivery_address" : null,
  "group_sale_order_template" : null,
  "group_send_reminder" : null,
  "group_show_purchase_receipts" : null,
  "group_show_sale_receipts" : null,
  "group_stock_accounting_automatic" : null,
  "group_stock_adv_location" : null,
  "group_stock_lot_print_gs1" : null,
  "group_stock_multi_locations" : null,
  "group_stock_packaging" : null,
  "group_stock_production_lot" : null,
  "group_stock_reception_report" : null,
  "group_stock_sign_delivery" : null,
  "group_stock_tracking_lot" : null,
  "group_stock_tracking_owner" : null,
  "group_unlocked_by_default" : null,
  "group_uom" : null,
  "group_use_lead" : null,
  "group_use_recurring_revenues" : null,
  "group_warning_account" : null,
  "group_warning_purchase" : null,
  "group_warning_sale" : null,
  "group_warning_stock" : null,
  "has_accounting_entries" : null,
  "has_chart_of_accounts" : null,
  "hr_employee_self_edit" : null,
  "hr_expense_alias_prefix" : null,
  "hr_expense_use_mailgateway" : null,
  "id" : null,
  "invoice_mail_template_id" : null,
  "is_account_peppol_eligible" : null,
  "is_installed_sale" : null,
  "is_membership_multi" : null,
  "is_root_company" : null,
  "language_count" : null,
  "lead_enrich_auto" : null,
  "lead_mining_in_pipeline" : null,
  "lock_confirmed_po" : null,
  "mass_mailing_outgoing_mail_server" : null,
  "mass_mailing_reports" : null,
  "mass_mailing_split_contact_name" : null,
  "module_account3way_match" : null,
  "module_account_accountant" : null,
  "module_account_bank_statement_extract" : null,
  "module_account_bank_statement_import_camt" : null,
  "module_account_bank_statement_import_csv" : null,
  "module_account_bank_statement_import_ofx" : null,
  "module_account_bank_statement_import_qif" : null,
  "module_account_batch_payment" : null,
  "module_account_budget" : null,
  "module_account_check_printing" : null,
  "module_account_extract" : null,
  "module_account_inter_company_rules" : null,
  "module_account_intrastat" : null,
  "module_account_invoice_extract" : null,
  "module_account_iso20022" : null,
  "module_account_payment" : null,
  "module_account_peppol" : null,
  "module_account_reports" : null,
  "module_account_sepa_direct_debit" : null,
  "module_auth_ldap" : null,
  "module_auth_oauth" : null,
  "module_base_geolocalize" : null,
  "module_base_import" : null,
  "module_crm_iap_enrich" : null,
  "module_crm_iap_mine" : null,
  "module_currency_rate_live" : null,
  "module_delivery" : null,
  "module_delivery_bpost" : null,
  "module_delivery_dhl" : null,
  "module_delivery_easypost" : null,
  "module_delivery_fedex" : null,
  "module_delivery_sendcloud" : null,
  "module_delivery_shiprocket" : null,
  "module_delivery_starshipit" : null,
  "module_delivery_ups" : null,
  "module_delivery_usps" : null,
  "module_google_calendar" : null,
  "module_google_gmail" : null,
  "module_google_recaptcha" : null,
  "module_hr_expense_extract" : null,
  "module_hr_homeworking" : null,
  "module_hr_payroll_expense" : null,
  "module_hr_presence" : null,
  "module_hr_recruitment_extract" : null,
  "module_hr_recruitment_survey" : null,
  "module_hr_skills" : null,
  "module_hr_timesheet" : null,
  "module_l10n_eu_oss" : null,
  "module_loyalty" : null,
  "module_mail_plugin" : null,
  "module_maintenance_worksheet" : null,
  "module_microsoft_calendar" : null,
  "module_microsoft_outlook" : null,
  "module_mrp_mps" : null,
  "module_mrp_plm" : null,
  "module_mrp_subcontracting" : null,
  "module_partner_autocomplete" : null,
  "module_product_email_template" : null,
  "module_product_expiry" : null,
  "module_product_images" : null,
  "module_product_margin" : null,
  "module_purchase_product_matrix" : null,
  "module_purchase_requisition" : null,
  "module_quality_control" : null,
  "module_quality_control_worksheet" : null,
  "module_sale_amazon" : null,
  "module_sale_commission" : null,
  "module_sale_loyalty" : null,
  "module_sale_margin" : null,
  "module_sale_pdf_quote_builder" : null,
  "module_sale_product_matrix" : null,
  "module_sms" : null,
  "module_snailmail_account" : null,
  "module_stock_barcode" : null,
  "module_stock_barcode_barcodelookup" : null,
  "module_stock_dropshipping" : null,
  "module_stock_fleet" : null,
  "module_stock_landed_costs" : null,
  "module_stock_picking_batch" : null,
  "module_stock_sms" : null,
  "module_voip" : null,
  "module_web_unsplash" : null,
  "module_website_cf_turnstile" : null,
  "module_website_crm_iap_reveal" : null,
  "module_website_hr_recruitment" : null,
  "overtime_company_threshold" : null,
  "overtime_employee_threshold" : null,
  "partner_autocomplete_insufficient_credit" : null,
  "pay_invoices_online" : null,
  "po_order_approval" : null,
  "portal_allow_api_keys" : null,
  "predictive_lead_scoring_field_labels" : null,
  "predictive_lead_scoring_fields_str" : null,
  "predictive_lead_scoring_start_date" : null,
  "predictive_lead_scoring_start_date_str" : null,
  "preview_ready" : null,
  "product_volume_volume_in_cubic_feet" : null,
  "product_weight_in_lbs" : null,
  "profiling_enabled_until" : null,
  "restrict_template_rendering" : null,
  "sfu_server_key" : null,
  "sfu_server_url" : null,
  "show_blacklist_buttons" : null,
  "show_effect" : null,
  "snailmail_cover_readonly" : null,
  "tenor_api_key" : null,
  "tenor_content_filter" : null,
  "tenor_gif_limit" : null,
  "twilio_account_sid" : null,
  "twilio_account_token" : null,
  "unsplash_access_key" : null,
  "unsplash_app_id" : null,
  "use_invoice_terms" : null,
  "use_manufacturing_lead" : null,
  "use_po_lead" : null,
  "use_security_lead" : null,
  "use_twilio_rtc_servers" : null,
  "user_default_rights" : null,
  "web_app_name" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 保存配置设定

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/res_config_settings/save" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">account_default_credit_limit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|默认信用额度|
|<el-row justify="space-between"><el-col :span="20">active_user_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效用户数量|
|<el-row justify="space-between"><el-col :span="20">auth_signup_reset_password</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|允许在登录页开启密码重置功能|
|<el-row justify="space-between"><el-col :span="20">auth_signup_template_user_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用作通过注册创建的新用户的模版|
|<el-row justify="space-between"><el-col :span="20">auth_signup_uninvited</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|客户帐号|
|<el-row justify="space-between"><el-col :span="20">automatic_invoice</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|自动发票|
|<el-row justify="space-between"><el-col :span="20">barcode_separator</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|分隔符|
|<el-row justify="space-between"><el-col :span="20">company_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|公司数量|
|<el-row justify="space-between"><el-col :span="20">company_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">company_informations</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司信息|
|<el-row justify="space-between"><el-col :span="20">company_name</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">crm_auto_assignment_action</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|自动分配操作|
|<el-row justify="space-between"><el-col :span="20">crm_auto_assignment_interval_number</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|重复间隔为每|
|<el-row justify="space-between"><el-col :span="20">crm_auto_assignment_interval_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|自动分配间隔单位|
|<el-row justify="space-between"><el-col :span="20">crm_auto_assignment_run_datetime</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|自动指派下次执行日期|
|<el-row justify="space-between"><el-col :span="20">crm_use_auto_assignment</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|基于规则的分配|
|<el-row justify="space-between"><el-col :span="20">default_invoice_policy</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|开票原则|
|<el-row justify="space-between"><el-col :span="20">default_picking_policy</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|拣货策略|
|<el-row justify="space-between"><el-col :span="20">default_purchase_method</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|账单管理|
|<el-row justify="space-between"><el-col :span="20">delay_alert_contract</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|合同逾期延时预警|
|<el-row justify="space-between"><el-col :span="20">digest_emails</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|摘要邮件|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">external_email_server_default</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|使用自定义电子邮件服务器|
|<el-row justify="space-between"><el-col :span="20">fail_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|失败的邮件|
|<el-row justify="space-between"><el-col :span="20">google_gmail_client_identifier</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Gmail 客户端 ID|
|<el-row justify="space-between"><el-col :span="20">google_gmail_client_secret</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Gmail客户端Secret|
|<el-row justify="space-between"><el-col :span="20">google_translate_api_key</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|消息翻译 API 密钥|
|<el-row justify="space-between"><el-col :span="20">group_analytic_accounting</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|分析会计|
|<el-row justify="space-between"><el-col :span="20">group_applicant_cv_display</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|团体申请人简历展示|
|<el-row justify="space-between"><el-col :span="20">group_auto_done_setting</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|锁定已确认的销售订单|
|<el-row justify="space-between"><el-col :span="20">group_cash_rounding</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|现金舍入|
|<el-row justify="space-between"><el-col :span="20">group_discount_per_so_line</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|折扣|
|<el-row justify="space-between"><el-col :span="20">group_lot_on_delivery_slip</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|在送货单上显示批次 / 序列号|
|<el-row justify="space-between"><el-col :span="20">group_lot_on_invoice</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|在结算单上显示批次 / 序列号|
|<el-row justify="space-between"><el-col :span="20">group_mass_mailing_campaign</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|邮件营销|
|<el-row justify="space-between"><el-col :span="20">group_mrp_byproducts</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|副产品|
|<el-row justify="space-between"><el-col :span="20">group_mrp_reception_report</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|制造订单分配报表|
|<el-row justify="space-between"><el-col :span="20">group_mrp_routings</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|物料需求计划（MRP）工单|
|<el-row justify="space-between"><el-col :span="20">group_mrp_workorder_dependencies</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|工单依赖性|
|<el-row justify="space-between"><el-col :span="20">group_multi_currency</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|多币别|
|<el-row justify="space-between"><el-col :span="20">group_product_pricelist</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|价格表|
|<el-row justify="space-between"><el-col :span="20">group_product_variant</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|变体|
|<el-row justify="space-between"><el-col :span="20">group_proforma_sales</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|形式发票|
|<el-row justify="space-between"><el-col :span="20">group_project_milestone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|里程碑|
|<el-row justify="space-between"><el-col :span="20">group_project_rating</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|客户点评|
|<el-row justify="space-between"><el-col :span="20">group_project_recurring_tasks</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|周期任务|
|<el-row justify="space-between"><el-col :span="20">group_project_stages</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|项目阶段|
|<el-row justify="space-between"><el-col :span="20">group_project_task_dependencies</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|任务依赖|
|<el-row justify="space-between"><el-col :span="20">group_sale_delivery_address</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|客户地址|
|<el-row justify="space-between"><el-col :span="20">group_sale_order_template</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|报价模板|
|<el-row justify="space-between"><el-col :span="20">group_send_reminder</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|收货提醒|
|<el-row justify="space-between"><el-col :span="20">group_show_purchase_receipts</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|采购收据|
|<el-row justify="space-between"><el-col :span="20">group_show_sale_receipts</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|销售收据|
|<el-row justify="space-between"><el-col :span="20">group_stock_accounting_automatic</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|自动库存会计|
|<el-row justify="space-between"><el-col :span="20">group_stock_adv_location</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|多步路线|
|<el-row justify="space-between"><el-col :span="20">group_stock_lot_print_gs1</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|使用GS1编码格式打印批号和序列号|
|<el-row justify="space-between"><el-col :span="20">group_stock_multi_locations</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|储存位置|
|<el-row justify="space-between"><el-col :span="20">group_stock_packaging</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|产品包装|
|<el-row justify="space-between"><el-col :span="20">group_stock_production_lot</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|批次 / 序列号|
|<el-row justify="space-between"><el-col :span="20">group_stock_reception_report</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|库存接收报表|
|<el-row justify="space-between"><el-col :span="20">group_stock_sign_delivery</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|签名|
|<el-row justify="space-between"><el-col :span="20">group_stock_tracking_lot</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|包裹|
|<el-row justify="space-between"><el-col :span="20">group_stock_tracking_owner</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|寄售|
|<el-row justify="space-between"><el-col :span="20">group_unlocked_by_default</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|解锁制造订单|
|<el-row justify="space-between"><el-col :span="20">group_uom</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|计量单位|
|<el-row justify="space-between"><el-col :span="20">group_use_lead</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|线索|
|<el-row justify="space-between"><el-col :span="20">group_use_recurring_revenues</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|经常性收入|
|<el-row justify="space-between"><el-col :span="20">group_warning_account</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|发票中的警告|
|<el-row justify="space-between"><el-col :span="20">group_warning_purchase</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|采购警告|
|<el-row justify="space-between"><el-col :span="20">group_warning_sale</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|销售订单警告信息|
|<el-row justify="space-between"><el-col :span="20">group_warning_stock</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|库存警报|
|<el-row justify="space-between"><el-col :span="20">has_accounting_entries</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Has Accounting Entries|
|<el-row justify="space-between"><el-col :span="20">has_chart_of_accounts</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Company has a chart of accounts|
|<el-row justify="space-between"><el-col :span="20">hr_employee_self_edit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|员工编辑|
|<el-row justify="space-between"><el-col :span="20">hr_expense_alias_prefix</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|默认的费用别名|
|<el-row justify="space-between"><el-col :span="20">hr_expense_use_mailgateway</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|允许员工通过电子邮件记录费用|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">invoice_mail_template_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|发票电子邮件模板|
|<el-row justify="space-between"><el-col :span="20">is_account_peppol_eligible</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|PEPPOL 符合条件|
|<el-row justify="space-between"><el-col :span="20">is_installed_sale</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|销售模块是否已安装|
|<el-row justify="space-between"><el-col :span="20">is_membership_multi</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|多团队|
|<el-row justify="space-between"><el-col :span="20">is_root_company</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是母公司|
|<el-row justify="space-between"><el-col :span="20">language_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|语言数量|
|<el-row justify="space-between"><el-col :span="20">lead_enrich_auto</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|自动丰富线索|
|<el-row justify="space-between"><el-col :span="20">lead_mining_in_pipeline</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|直接从商机商机创建线索挖掘申请。|
|<el-row justify="space-between"><el-col :span="20">lock_confirmed_po</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|锁定已确认的订单|
|<el-row justify="space-between"><el-col :span="20">mass_mailing_outgoing_mail_server</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|专门服务器|
|<el-row justify="space-between"><el-col :span="20">mass_mailing_reports</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|24小时统计邮寄报告|
|<el-row justify="space-between"><el-col :span="20">mass_mailing_split_contact_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|拆分名字和姓氏|
|<el-row justify="space-between"><el-col :span="20">module_account3way_match</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|3单匹配:采购订单，收货单与发票|
|<el-row justify="space-between"><el-col :span="20">module_account_accountant</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|会计|
|<el-row justify="space-between"><el-col :span="20">module_account_bank_statement_extract</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Bank Statement Digitization|
|<el-row justify="space-between"><el-col :span="20">module_account_bank_statement_import_camt</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|以CAMT.053 格式导入|
|<el-row justify="space-between"><el-col :span="20">module_account_bank_statement_import_csv</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|以.csv、.xls和.xlsx格式导入|
|<el-row justify="space-between"><el-col :span="20">module_account_bank_statement_import_ofx</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|以.ofx格式导入|
|<el-row justify="space-between"><el-col :span="20">module_account_bank_statement_import_qif</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|导入.qif单据|
|<el-row justify="space-between"><el-col :span="20">module_account_batch_payment</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|使用批量付款|
|<el-row justify="space-between"><el-col :span="20">module_account_budget</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|预算管理|
|<el-row justify="space-between"><el-col :span="20">module_account_check_printing</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Allow check printing and deposits|
|<el-row justify="space-between"><el-col :span="20">module_account_extract</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Document Digitization|
|<el-row justify="space-between"><el-col :span="20">module_account_inter_company_rules</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|管理公司间交易|
|<el-row justify="space-between"><el-col :span="20">module_account_intrastat</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|国际联盟|
|<el-row justify="space-between"><el-col :span="20">module_account_invoice_extract</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Invoice Digitization|
|<el-row justify="space-between"><el-col :span="20">module_account_iso20022</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|SEPA Credit Transfer / ISO20022|
|<el-row justify="space-between"><el-col :span="20">module_account_payment</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Invoice Online Payment|
|<el-row justify="space-between"><el-col :span="20">module_account_peppol</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|PEPPOL 开具发票|
|<el-row justify="space-between"><el-col :span="20">module_account_reports</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Dynamic Reports|
|<el-row justify="space-between"><el-col :span="20">module_account_sepa_direct_debit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Use SEPA Direct Debit|
|<el-row justify="space-between"><el-col :span="20">module_auth_ldap</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|LDAP认证|
|<el-row justify="space-between"><el-col :span="20">module_auth_oauth</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|使用外部验证提供者 (OAuth)|
|<el-row justify="space-between"><el-col :span="20">module_base_geolocalize</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|地理定位|
|<el-row justify="space-between"><el-col :span="20">module_base_import</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|允许用户导入 CSV/XLS/XLSX/ODS格式的文档数据|
|<el-row justify="space-between"><el-col :span="20">module_crm_iap_enrich</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|根据线索的电子邮箱地址、使用公司数据自动丰富线索。|
|<el-row justify="space-between"><el-col :span="20">module_crm_iap_mine</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|基于国家/地区、行业、规模等信息生成新的线索。|
|<el-row justify="space-between"><el-col :span="20">module_currency_rate_live</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|自动汇率|
|<el-row justify="space-between"><el-col :span="20">module_delivery</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|交付方式|
|<el-row justify="space-between"><el-col :span="20">module_delivery_bpost</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|bpost连接器|
|<el-row justify="space-between"><el-col :span="20">module_delivery_dhl</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|DHL快递连接器|
|<el-row justify="space-between"><el-col :span="20">module_delivery_easypost</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Easypost连接器|
|<el-row justify="space-between"><el-col :span="20">module_delivery_fedex</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|FedEx连接器|
|<el-row justify="space-between"><el-col :span="20">module_delivery_sendcloud</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Sendcloud连接器|
|<el-row justify="space-between"><el-col :span="20">module_delivery_shiprocket</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Shiprocket 连接器|
|<el-row justify="space-between"><el-col :span="20">module_delivery_starshipit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Starshipit 连接器|
|<el-row justify="space-between"><el-col :span="20">module_delivery_ups</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|UPS连接器|
|<el-row justify="space-between"><el-col :span="20">module_delivery_usps</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|USPS连接器|
|<el-row justify="space-between"><el-col :span="20">module_google_calendar</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|允许用户同步谷歌日历|
|<el-row justify="space-between"><el-col :span="20">module_google_gmail</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|支持Gmail身份验证|
|<el-row justify="space-between"><el-col :span="20">module_google_recaptcha</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|验证码|
|<el-row justify="space-between"><el-col :span="20">module_hr_expense_extract</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|向OCR发送账单以产生费用|
|<el-row justify="space-between"><el-col :span="20">module_hr_homeworking</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|远程工作|
|<el-row justify="space-between"><el-col :span="20">module_hr_payroll_expense</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|工资单上的报销费用|
|<el-row justify="space-between"><el-col :span="20">module_hr_presence</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|高级出席控制|
|<el-row justify="space-between"><el-col :span="20">module_hr_recruitment_extract</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|将简历发送到 OCR 以填写申请|
|<el-row justify="space-between"><el-col :span="20">module_hr_recruitment_survey</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|面试表单|
|<el-row justify="space-between"><el-col :span="20">module_hr_skills</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|技能管理|
|<el-row justify="space-between"><el-col :span="20">module_hr_timesheet</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|任务日志|
|<el-row justify="space-between"><el-col :span="20">module_l10n_eu_oss</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|欧盟共同体内部远程销售|
|<el-row justify="space-between"><el-col :span="20">module_loyalty</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|促销、优惠券、礼品卡和会员方案|
|<el-row justify="space-between"><el-col :span="20">module_mail_plugin</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|允许与邮件插件集成|
|<el-row justify="space-between"><el-col :span="20">module_maintenance_worksheet</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|定制维护工作表|
|<el-row justify="space-between"><el-col :span="20">module_microsoft_calendar</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|允许用户同步Outlook日历|
|<el-row justify="space-between"><el-col :span="20">module_microsoft_outlook</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|支持Outlook身份验证|
|<el-row justify="space-between"><el-col :span="20">module_mrp_mps</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|主生产计划|
|<el-row justify="space-between"><el-col :span="20">module_mrp_plm</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|产品生命周期管理（PLM）|
|<el-row justify="space-between"><el-col :span="20">module_mrp_subcontracting</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|外包|
|<el-row justify="space-between"><el-col :span="20">module_partner_autocomplete</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|合作伙伴自动完成|
|<el-row justify="space-between"><el-col :span="20">module_product_email_template</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|特定的电子邮件|
|<el-row justify="space-between"><el-col :span="20">module_product_expiry</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|到期日期|
|<el-row justify="space-between"><el-col :span="20">module_product_images</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|使用条形码获取产品图片|
|<el-row justify="space-between"><el-col :span="20">module_product_margin</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|允许产品毛利|
|<el-row justify="space-between"><el-col :span="20">module_purchase_product_matrix</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|采购表格入口|
|<el-row justify="space-between"><el-col :span="20">module_purchase_requisition</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|采购协议|
|<el-row justify="space-between"><el-col :span="20">module_quality_control</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|质量|
|<el-row justify="space-between"><el-col :span="20">module_quality_control_worksheet</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|质量工作表|
|<el-row justify="space-between"><el-col :span="20">module_sale_amazon</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|亚马逊同步|
|<el-row justify="space-between"><el-col :span="20">module_sale_commission</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|佣金|
|<el-row justify="space-between"><el-col :span="20">module_sale_loyalty</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|优惠券和会员|
|<el-row justify="space-between"><el-col :span="20">module_sale_margin</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|毛利|
|<el-row justify="space-between"><el-col :span="20">module_sale_pdf_quote_builder</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|PDF 报价生成器|
|<el-row justify="space-between"><el-col :span="20">module_sale_product_matrix</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|销售表格录入|
|<el-row justify="space-between"><el-col :span="20">module_sms</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|短信息|
|<el-row justify="space-between"><el-col :span="20">module_snailmail_account</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|传统信件|
|<el-row justify="space-between"><el-col :span="20">module_stock_barcode</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|条码扫描器|
|<el-row justify="space-between"><el-col :span="20">module_stock_barcode_barcodelookup</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|库存条形码数据库|
|<el-row justify="space-between"><el-col :span="20">module_stock_dropshipping</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|代发货|
|<el-row justify="space-between"><el-col :span="20">module_stock_fleet</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|配送管理系统|
|<el-row justify="space-between"><el-col :span="20">module_stock_landed_costs</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|到岸成本|
|<el-row justify="space-between"><el-col :span="20">module_stock_picking_batch</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|批量、波次和集群调拨|
|<el-row justify="space-between"><el-col :span="20">module_stock_sms</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|短信息确认|
|<el-row justify="space-between"><el-col :span="20">module_voip</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|网络电话|
|<el-row justify="space-between"><el-col :span="20">module_web_unsplash</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Unsplash图像库|
|<el-row justify="space-between"><el-col :span="20">module_website_cf_turnstile</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Cloudflare Turnstile|
|<el-row justify="space-between"><el-col :span="20">module_website_crm_iap_reveal</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|从网站流量创建线索/商机|
|<el-row justify="space-between"><el-col :span="20">module_website_hr_recruitment</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|线上发布|
|<el-row justify="space-between"><el-col :span="20">overtime_company_threshold</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|对公司有利的宽容时间|
|<el-row justify="space-between"><el-col :span="20">overtime_employee_threshold</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|对员工有利的宽容时间|
|<el-row justify="space-between"><el-col :span="20">partner_autocomplete_insufficient_credit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|信用不足|
|<el-row justify="space-between"><el-col :span="20">pay_invoices_online</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|在线支付发票|
|<el-row justify="space-between"><el-col :span="20">po_order_approval</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|订单审批|
|<el-row justify="space-between"><el-col :span="20">portal_allow_api_keys</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|客户 API 密钥|
|<el-row justify="space-between"><el-col :span="20">predictive_lead_scoring_field_labels</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|预测线索评分字段标签|
|<el-row justify="space-between"><el-col :span="20">predictive_lead_scoring_fields_str</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|字符串中的线索评分频率字段|
|<el-row justify="space-between"><el-col :span="20">predictive_lead_scoring_start_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|线索评分开始日期|
|<el-row justify="space-between"><el-col :span="20">predictive_lead_scoring_start_date_str</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|字符串中的线索评分开始日期|
|<el-row justify="space-between"><el-col :span="20">preview_ready</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Display preview button|
|<el-row justify="space-between"><el-col :span="20">product_volume_volume_in_cubic_feet</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|体积单位|
|<el-row justify="space-between"><el-col :span="20">product_weight_in_lbs</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|重量单位|
|<el-row justify="space-between"><el-col :span="20">profiling_enabled_until</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|启用分析直到|
|<el-row justify="space-between"><el-col :span="20">restrict_template_rendering</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|限制模板渲染|
|<el-row justify="space-between"><el-col :span="20">sfu_server_key</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|SFU 服务器密钥|
|<el-row justify="space-between"><el-col :span="20">sfu_server_url</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|SFU 服务器 URL|
|<el-row justify="space-between"><el-col :span="20">show_blacklist_buttons</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|退订时黑名单选项|
|<el-row justify="space-between"><el-col :span="20">show_effect</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|显示效果|
|<el-row justify="space-between"><el-col :span="20">snailmail_cover_readonly</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|蜗牛邮件封面只读|
|<el-row justify="space-between"><el-col :span="20">tenor_api_key</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Tenor API 密钥|
|<el-row justify="space-between"><el-col :span="20">tenor_content_filter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Tenor 内容过滤器|
|<el-row justify="space-between"><el-col :span="20">tenor_gif_limit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Tenor Gif 限额|
|<el-row justify="space-between"><el-col :span="20">twilio_account_sid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Twilio 帐户 SID|
|<el-row justify="space-between"><el-col :span="20">twilio_account_token</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Twilio 帐户身份验证令牌|
|<el-row justify="space-between"><el-col :span="20">unsplash_access_key</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|访问秘钥|
|<el-row justify="space-between"><el-col :span="20">unsplash_app_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|应用程序ID|
|<el-row justify="space-between"><el-col :span="20">use_invoice_terms</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|默认条款和条件|
|<el-row justify="space-between"><el-col :span="20">use_manufacturing_lead</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|默认制造提前期|
|<el-row justify="space-between"><el-col :span="20">use_po_lead</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|安全交货时间|
|<el-row justify="space-between"><el-col :span="20">use_security_lead</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|销售的安全提前期|
|<el-row justify="space-between"><el-col :span="20">use_twilio_rtc_servers</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|使用 Twilio ICE 服务器|
|<el-row justify="space-between"><el-col :span="20">user_default_rights</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|默认访问权限|
|<el-row justify="space-between"><el-col :span="20">web_app_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|网络应用程序名称|



##### 请求示例： {docsify-ignore}
```json
{
  "account_default_credit_limit" : null,
  "active_user_count" : null,
  "auth_signup_reset_password" : null,
  "auth_signup_template_user_id" : null,
  "auth_signup_uninvited" : null,
  "automatic_invoice" : null,
  "barcode_separator" : null,
  "company_count" : null,
  "company_id" : null,
  "company_informations" : null,
  "company_name" : null,
  "create_date" : null,
  "create_uid" : null,
  "crm_auto_assignment_action" : null,
  "crm_auto_assignment_interval_number" : null,
  "crm_auto_assignment_interval_type" : null,
  "crm_auto_assignment_run_datetime" : null,
  "crm_use_auto_assignment" : null,
  "default_invoice_policy" : null,
  "default_picking_policy" : null,
  "default_purchase_method" : null,
  "delay_alert_contract" : null,
  "digest_emails" : null,
  "display_name" : null,
  "external_email_server_default" : null,
  "fail_counter" : null,
  "google_gmail_client_identifier" : null,
  "google_gmail_client_secret" : null,
  "google_translate_api_key" : null,
  "group_analytic_accounting" : null,
  "group_applicant_cv_display" : null,
  "group_auto_done_setting" : null,
  "group_cash_rounding" : null,
  "group_discount_per_so_line" : null,
  "group_lot_on_delivery_slip" : null,
  "group_lot_on_invoice" : null,
  "group_mass_mailing_campaign" : null,
  "group_mrp_byproducts" : null,
  "group_mrp_reception_report" : null,
  "group_mrp_routings" : null,
  "group_mrp_workorder_dependencies" : null,
  "group_multi_currency" : null,
  "group_product_pricelist" : null,
  "group_product_variant" : null,
  "group_proforma_sales" : null,
  "group_project_milestone" : null,
  "group_project_rating" : null,
  "group_project_recurring_tasks" : null,
  "group_project_stages" : null,
  "group_project_task_dependencies" : null,
  "group_sale_delivery_address" : null,
  "group_sale_order_template" : null,
  "group_send_reminder" : null,
  "group_show_purchase_receipts" : null,
  "group_show_sale_receipts" : null,
  "group_stock_accounting_automatic" : null,
  "group_stock_adv_location" : null,
  "group_stock_lot_print_gs1" : null,
  "group_stock_multi_locations" : null,
  "group_stock_packaging" : null,
  "group_stock_production_lot" : null,
  "group_stock_reception_report" : null,
  "group_stock_sign_delivery" : null,
  "group_stock_tracking_lot" : null,
  "group_stock_tracking_owner" : null,
  "group_unlocked_by_default" : null,
  "group_uom" : null,
  "group_use_lead" : null,
  "group_use_recurring_revenues" : null,
  "group_warning_account" : null,
  "group_warning_purchase" : null,
  "group_warning_sale" : null,
  "group_warning_stock" : null,
  "has_accounting_entries" : null,
  "has_chart_of_accounts" : null,
  "hr_employee_self_edit" : null,
  "hr_expense_alias_prefix" : null,
  "hr_expense_use_mailgateway" : null,
  "id" : null,
  "invoice_mail_template_id" : null,
  "is_account_peppol_eligible" : null,
  "is_installed_sale" : null,
  "is_membership_multi" : null,
  "is_root_company" : null,
  "language_count" : null,
  "lead_enrich_auto" : null,
  "lead_mining_in_pipeline" : null,
  "lock_confirmed_po" : null,
  "mass_mailing_outgoing_mail_server" : null,
  "mass_mailing_reports" : null,
  "mass_mailing_split_contact_name" : null,
  "module_account3way_match" : null,
  "module_account_accountant" : null,
  "module_account_bank_statement_extract" : null,
  "module_account_bank_statement_import_camt" : null,
  "module_account_bank_statement_import_csv" : null,
  "module_account_bank_statement_import_ofx" : null,
  "module_account_bank_statement_import_qif" : null,
  "module_account_batch_payment" : null,
  "module_account_budget" : null,
  "module_account_check_printing" : null,
  "module_account_extract" : null,
  "module_account_inter_company_rules" : null,
  "module_account_intrastat" : null,
  "module_account_invoice_extract" : null,
  "module_account_iso20022" : null,
  "module_account_payment" : null,
  "module_account_peppol" : null,
  "module_account_reports" : null,
  "module_account_sepa_direct_debit" : null,
  "module_auth_ldap" : null,
  "module_auth_oauth" : null,
  "module_base_geolocalize" : null,
  "module_base_import" : null,
  "module_crm_iap_enrich" : null,
  "module_crm_iap_mine" : null,
  "module_currency_rate_live" : null,
  "module_delivery" : null,
  "module_delivery_bpost" : null,
  "module_delivery_dhl" : null,
  "module_delivery_easypost" : null,
  "module_delivery_fedex" : null,
  "module_delivery_sendcloud" : null,
  "module_delivery_shiprocket" : null,
  "module_delivery_starshipit" : null,
  "module_delivery_ups" : null,
  "module_delivery_usps" : null,
  "module_google_calendar" : null,
  "module_google_gmail" : null,
  "module_google_recaptcha" : null,
  "module_hr_expense_extract" : null,
  "module_hr_homeworking" : null,
  "module_hr_payroll_expense" : null,
  "module_hr_presence" : null,
  "module_hr_recruitment_extract" : null,
  "module_hr_recruitment_survey" : null,
  "module_hr_skills" : null,
  "module_hr_timesheet" : null,
  "module_l10n_eu_oss" : null,
  "module_loyalty" : null,
  "module_mail_plugin" : null,
  "module_maintenance_worksheet" : null,
  "module_microsoft_calendar" : null,
  "module_microsoft_outlook" : null,
  "module_mrp_mps" : null,
  "module_mrp_plm" : null,
  "module_mrp_subcontracting" : null,
  "module_partner_autocomplete" : null,
  "module_product_email_template" : null,
  "module_product_expiry" : null,
  "module_product_images" : null,
  "module_product_margin" : null,
  "module_purchase_product_matrix" : null,
  "module_purchase_requisition" : null,
  "module_quality_control" : null,
  "module_quality_control_worksheet" : null,
  "module_sale_amazon" : null,
  "module_sale_commission" : null,
  "module_sale_loyalty" : null,
  "module_sale_margin" : null,
  "module_sale_pdf_quote_builder" : null,
  "module_sale_product_matrix" : null,
  "module_sms" : null,
  "module_snailmail_account" : null,
  "module_stock_barcode" : null,
  "module_stock_barcode_barcodelookup" : null,
  "module_stock_dropshipping" : null,
  "module_stock_fleet" : null,
  "module_stock_landed_costs" : null,
  "module_stock_picking_batch" : null,
  "module_stock_sms" : null,
  "module_voip" : null,
  "module_web_unsplash" : null,
  "module_website_cf_turnstile" : null,
  "module_website_crm_iap_reveal" : null,
  "module_website_hr_recruitment" : null,
  "overtime_company_threshold" : null,
  "overtime_employee_threshold" : null,
  "partner_autocomplete_insufficient_credit" : null,
  "pay_invoices_online" : null,
  "po_order_approval" : null,
  "portal_allow_api_keys" : null,
  "predictive_lead_scoring_field_labels" : null,
  "predictive_lead_scoring_fields_str" : null,
  "predictive_lead_scoring_start_date" : null,
  "predictive_lead_scoring_start_date_str" : null,
  "preview_ready" : null,
  "product_volume_volume_in_cubic_feet" : null,
  "product_weight_in_lbs" : null,
  "profiling_enabled_until" : null,
  "restrict_template_rendering" : null,
  "sfu_server_key" : null,
  "sfu_server_url" : null,
  "show_blacklist_buttons" : null,
  "show_effect" : null,
  "snailmail_cover_readonly" : null,
  "tenor_api_key" : null,
  "tenor_content_filter" : null,
  "tenor_gif_limit" : null,
  "twilio_account_sid" : null,
  "twilio_account_token" : null,
  "unsplash_access_key" : null,
  "unsplash_app_id" : null,
  "use_invoice_terms" : null,
  "use_manufacturing_lead" : null,
  "use_po_lead" : null,
  "use_security_lead" : null,
  "use_twilio_rtc_servers" : null,
  "user_default_rights" : null,
  "web_app_name" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "account_default_credit_limit" : null,
  "active_user_count" : null,
  "auth_signup_reset_password" : null,
  "auth_signup_template_user_id" : null,
  "auth_signup_uninvited" : null,
  "automatic_invoice" : null,
  "barcode_separator" : null,
  "company_count" : null,
  "company_id" : null,
  "company_informations" : null,
  "company_name" : null,
  "create_date" : null,
  "create_uid" : null,
  "crm_auto_assignment_action" : null,
  "crm_auto_assignment_interval_number" : null,
  "crm_auto_assignment_interval_type" : null,
  "crm_auto_assignment_run_datetime" : null,
  "crm_use_auto_assignment" : null,
  "default_invoice_policy" : null,
  "default_picking_policy" : null,
  "default_purchase_method" : null,
  "delay_alert_contract" : null,
  "digest_emails" : null,
  "display_name" : null,
  "external_email_server_default" : null,
  "fail_counter" : null,
  "google_gmail_client_identifier" : null,
  "google_gmail_client_secret" : null,
  "google_translate_api_key" : null,
  "group_analytic_accounting" : null,
  "group_applicant_cv_display" : null,
  "group_auto_done_setting" : null,
  "group_cash_rounding" : null,
  "group_discount_per_so_line" : null,
  "group_lot_on_delivery_slip" : null,
  "group_lot_on_invoice" : null,
  "group_mass_mailing_campaign" : null,
  "group_mrp_byproducts" : null,
  "group_mrp_reception_report" : null,
  "group_mrp_routings" : null,
  "group_mrp_workorder_dependencies" : null,
  "group_multi_currency" : null,
  "group_product_pricelist" : null,
  "group_product_variant" : null,
  "group_proforma_sales" : null,
  "group_project_milestone" : null,
  "group_project_rating" : null,
  "group_project_recurring_tasks" : null,
  "group_project_stages" : null,
  "group_project_task_dependencies" : null,
  "group_sale_delivery_address" : null,
  "group_sale_order_template" : null,
  "group_send_reminder" : null,
  "group_show_purchase_receipts" : null,
  "group_show_sale_receipts" : null,
  "group_stock_accounting_automatic" : null,
  "group_stock_adv_location" : null,
  "group_stock_lot_print_gs1" : null,
  "group_stock_multi_locations" : null,
  "group_stock_packaging" : null,
  "group_stock_production_lot" : null,
  "group_stock_reception_report" : null,
  "group_stock_sign_delivery" : null,
  "group_stock_tracking_lot" : null,
  "group_stock_tracking_owner" : null,
  "group_unlocked_by_default" : null,
  "group_uom" : null,
  "group_use_lead" : null,
  "group_use_recurring_revenues" : null,
  "group_warning_account" : null,
  "group_warning_purchase" : null,
  "group_warning_sale" : null,
  "group_warning_stock" : null,
  "has_accounting_entries" : null,
  "has_chart_of_accounts" : null,
  "hr_employee_self_edit" : null,
  "hr_expense_alias_prefix" : null,
  "hr_expense_use_mailgateway" : null,
  "id" : null,
  "invoice_mail_template_id" : null,
  "is_account_peppol_eligible" : null,
  "is_installed_sale" : null,
  "is_membership_multi" : null,
  "is_root_company" : null,
  "language_count" : null,
  "lead_enrich_auto" : null,
  "lead_mining_in_pipeline" : null,
  "lock_confirmed_po" : null,
  "mass_mailing_outgoing_mail_server" : null,
  "mass_mailing_reports" : null,
  "mass_mailing_split_contact_name" : null,
  "module_account3way_match" : null,
  "module_account_accountant" : null,
  "module_account_bank_statement_extract" : null,
  "module_account_bank_statement_import_camt" : null,
  "module_account_bank_statement_import_csv" : null,
  "module_account_bank_statement_import_ofx" : null,
  "module_account_bank_statement_import_qif" : null,
  "module_account_batch_payment" : null,
  "module_account_budget" : null,
  "module_account_check_printing" : null,
  "module_account_extract" : null,
  "module_account_inter_company_rules" : null,
  "module_account_intrastat" : null,
  "module_account_invoice_extract" : null,
  "module_account_iso20022" : null,
  "module_account_payment" : null,
  "module_account_peppol" : null,
  "module_account_reports" : null,
  "module_account_sepa_direct_debit" : null,
  "module_auth_ldap" : null,
  "module_auth_oauth" : null,
  "module_base_geolocalize" : null,
  "module_base_import" : null,
  "module_crm_iap_enrich" : null,
  "module_crm_iap_mine" : null,
  "module_currency_rate_live" : null,
  "module_delivery" : null,
  "module_delivery_bpost" : null,
  "module_delivery_dhl" : null,
  "module_delivery_easypost" : null,
  "module_delivery_fedex" : null,
  "module_delivery_sendcloud" : null,
  "module_delivery_shiprocket" : null,
  "module_delivery_starshipit" : null,
  "module_delivery_ups" : null,
  "module_delivery_usps" : null,
  "module_google_calendar" : null,
  "module_google_gmail" : null,
  "module_google_recaptcha" : null,
  "module_hr_expense_extract" : null,
  "module_hr_homeworking" : null,
  "module_hr_payroll_expense" : null,
  "module_hr_presence" : null,
  "module_hr_recruitment_extract" : null,
  "module_hr_recruitment_survey" : null,
  "module_hr_skills" : null,
  "module_hr_timesheet" : null,
  "module_l10n_eu_oss" : null,
  "module_loyalty" : null,
  "module_mail_plugin" : null,
  "module_maintenance_worksheet" : null,
  "module_microsoft_calendar" : null,
  "module_microsoft_outlook" : null,
  "module_mrp_mps" : null,
  "module_mrp_plm" : null,
  "module_mrp_subcontracting" : null,
  "module_partner_autocomplete" : null,
  "module_product_email_template" : null,
  "module_product_expiry" : null,
  "module_product_images" : null,
  "module_product_margin" : null,
  "module_purchase_product_matrix" : null,
  "module_purchase_requisition" : null,
  "module_quality_control" : null,
  "module_quality_control_worksheet" : null,
  "module_sale_amazon" : null,
  "module_sale_commission" : null,
  "module_sale_loyalty" : null,
  "module_sale_margin" : null,
  "module_sale_pdf_quote_builder" : null,
  "module_sale_product_matrix" : null,
  "module_sms" : null,
  "module_snailmail_account" : null,
  "module_stock_barcode" : null,
  "module_stock_barcode_barcodelookup" : null,
  "module_stock_dropshipping" : null,
  "module_stock_fleet" : null,
  "module_stock_landed_costs" : null,
  "module_stock_picking_batch" : null,
  "module_stock_sms" : null,
  "module_voip" : null,
  "module_web_unsplash" : null,
  "module_website_cf_turnstile" : null,
  "module_website_crm_iap_reveal" : null,
  "module_website_hr_recruitment" : null,
  "overtime_company_threshold" : null,
  "overtime_employee_threshold" : null,
  "partner_autocomplete_insufficient_credit" : null,
  "pay_invoices_online" : null,
  "po_order_approval" : null,
  "portal_allow_api_keys" : null,
  "predictive_lead_scoring_field_labels" : null,
  "predictive_lead_scoring_fields_str" : null,
  "predictive_lead_scoring_start_date" : null,
  "predictive_lead_scoring_start_date_str" : null,
  "preview_ready" : null,
  "product_volume_volume_in_cubic_feet" : null,
  "product_weight_in_lbs" : null,
  "profiling_enabled_until" : null,
  "restrict_template_rendering" : null,
  "sfu_server_key" : null,
  "sfu_server_url" : null,
  "show_blacklist_buttons" : null,
  "show_effect" : null,
  "snailmail_cover_readonly" : null,
  "tenor_api_key" : null,
  "tenor_content_filter" : null,
  "tenor_gif_limit" : null,
  "twilio_account_sid" : null,
  "twilio_account_token" : null,
  "unsplash_access_key" : null,
  "unsplash_app_id" : null,
  "use_invoice_terms" : null,
  "use_manufacturing_lead" : null,
  "use_po_lead" : null,
  "use_security_lead" : null,
  "use_twilio_rtc_servers" : null,
  "user_default_rights" : null,
  "web_app_name" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 设置配置值

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/res_config_settings/{key}/set_values" type="info" :closable="false" ></el-alert>
</div>
</el-row>


##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|标识|



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">account_default_credit_limit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|默认信用额度|
|<el-row justify="space-between"><el-col :span="20">active_user_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效用户数量|
|<el-row justify="space-between"><el-col :span="20">auth_signup_reset_password</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|允许在登录页开启密码重置功能|
|<el-row justify="space-between"><el-col :span="20">auth_signup_template_user_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用作通过注册创建的新用户的模版|
|<el-row justify="space-between"><el-col :span="20">auth_signup_uninvited</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|客户帐号|
|<el-row justify="space-between"><el-col :span="20">automatic_invoice</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|自动发票|
|<el-row justify="space-between"><el-col :span="20">barcode_separator</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|分隔符|
|<el-row justify="space-between"><el-col :span="20">company_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|公司数量|
|<el-row justify="space-between"><el-col :span="20">company_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">company_informations</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司信息|
|<el-row justify="space-between"><el-col :span="20">company_name</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">crm_auto_assignment_action</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|自动分配操作|
|<el-row justify="space-between"><el-col :span="20">crm_auto_assignment_interval_number</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|重复间隔为每|
|<el-row justify="space-between"><el-col :span="20">crm_auto_assignment_interval_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|自动分配间隔单位|
|<el-row justify="space-between"><el-col :span="20">crm_auto_assignment_run_datetime</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|自动指派下次执行日期|
|<el-row justify="space-between"><el-col :span="20">crm_use_auto_assignment</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|基于规则的分配|
|<el-row justify="space-between"><el-col :span="20">default_invoice_policy</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|开票原则|
|<el-row justify="space-between"><el-col :span="20">default_picking_policy</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|拣货策略|
|<el-row justify="space-between"><el-col :span="20">default_purchase_method</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|账单管理|
|<el-row justify="space-between"><el-col :span="20">delay_alert_contract</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|合同逾期延时预警|
|<el-row justify="space-between"><el-col :span="20">digest_emails</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|摘要邮件|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">external_email_server_default</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|使用自定义电子邮件服务器|
|<el-row justify="space-between"><el-col :span="20">fail_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|失败的邮件|
|<el-row justify="space-between"><el-col :span="20">google_gmail_client_identifier</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Gmail 客户端 ID|
|<el-row justify="space-between"><el-col :span="20">google_gmail_client_secret</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Gmail客户端Secret|
|<el-row justify="space-between"><el-col :span="20">google_translate_api_key</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|消息翻译 API 密钥|
|<el-row justify="space-between"><el-col :span="20">group_analytic_accounting</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|分析会计|
|<el-row justify="space-between"><el-col :span="20">group_applicant_cv_display</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|团体申请人简历展示|
|<el-row justify="space-between"><el-col :span="20">group_auto_done_setting</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|锁定已确认的销售订单|
|<el-row justify="space-between"><el-col :span="20">group_cash_rounding</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|现金舍入|
|<el-row justify="space-between"><el-col :span="20">group_discount_per_so_line</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|折扣|
|<el-row justify="space-between"><el-col :span="20">group_lot_on_delivery_slip</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|在送货单上显示批次 / 序列号|
|<el-row justify="space-between"><el-col :span="20">group_lot_on_invoice</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|在结算单上显示批次 / 序列号|
|<el-row justify="space-between"><el-col :span="20">group_mass_mailing_campaign</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|邮件营销|
|<el-row justify="space-between"><el-col :span="20">group_mrp_byproducts</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|副产品|
|<el-row justify="space-between"><el-col :span="20">group_mrp_reception_report</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|制造订单分配报表|
|<el-row justify="space-between"><el-col :span="20">group_mrp_routings</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|物料需求计划（MRP）工单|
|<el-row justify="space-between"><el-col :span="20">group_mrp_workorder_dependencies</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|工单依赖性|
|<el-row justify="space-between"><el-col :span="20">group_multi_currency</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|多币别|
|<el-row justify="space-between"><el-col :span="20">group_product_pricelist</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|价格表|
|<el-row justify="space-between"><el-col :span="20">group_product_variant</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|变体|
|<el-row justify="space-between"><el-col :span="20">group_proforma_sales</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|形式发票|
|<el-row justify="space-between"><el-col :span="20">group_project_milestone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|里程碑|
|<el-row justify="space-between"><el-col :span="20">group_project_rating</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|客户点评|
|<el-row justify="space-between"><el-col :span="20">group_project_recurring_tasks</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|周期任务|
|<el-row justify="space-between"><el-col :span="20">group_project_stages</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|项目阶段|
|<el-row justify="space-between"><el-col :span="20">group_project_task_dependencies</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|任务依赖|
|<el-row justify="space-between"><el-col :span="20">group_sale_delivery_address</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|客户地址|
|<el-row justify="space-between"><el-col :span="20">group_sale_order_template</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|报价模板|
|<el-row justify="space-between"><el-col :span="20">group_send_reminder</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|收货提醒|
|<el-row justify="space-between"><el-col :span="20">group_show_purchase_receipts</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|采购收据|
|<el-row justify="space-between"><el-col :span="20">group_show_sale_receipts</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|销售收据|
|<el-row justify="space-between"><el-col :span="20">group_stock_accounting_automatic</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|自动库存会计|
|<el-row justify="space-between"><el-col :span="20">group_stock_adv_location</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|多步路线|
|<el-row justify="space-between"><el-col :span="20">group_stock_lot_print_gs1</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|使用GS1编码格式打印批号和序列号|
|<el-row justify="space-between"><el-col :span="20">group_stock_multi_locations</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|储存位置|
|<el-row justify="space-between"><el-col :span="20">group_stock_packaging</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|产品包装|
|<el-row justify="space-between"><el-col :span="20">group_stock_production_lot</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|批次 / 序列号|
|<el-row justify="space-between"><el-col :span="20">group_stock_reception_report</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|库存接收报表|
|<el-row justify="space-between"><el-col :span="20">group_stock_sign_delivery</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|签名|
|<el-row justify="space-between"><el-col :span="20">group_stock_tracking_lot</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|包裹|
|<el-row justify="space-between"><el-col :span="20">group_stock_tracking_owner</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|寄售|
|<el-row justify="space-between"><el-col :span="20">group_unlocked_by_default</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|解锁制造订单|
|<el-row justify="space-between"><el-col :span="20">group_uom</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|计量单位|
|<el-row justify="space-between"><el-col :span="20">group_use_lead</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|线索|
|<el-row justify="space-between"><el-col :span="20">group_use_recurring_revenues</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|经常性收入|
|<el-row justify="space-between"><el-col :span="20">group_warning_account</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|发票中的警告|
|<el-row justify="space-between"><el-col :span="20">group_warning_purchase</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|采购警告|
|<el-row justify="space-between"><el-col :span="20">group_warning_sale</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|销售订单警告信息|
|<el-row justify="space-between"><el-col :span="20">group_warning_stock</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|库存警报|
|<el-row justify="space-between"><el-col :span="20">has_accounting_entries</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Has Accounting Entries|
|<el-row justify="space-between"><el-col :span="20">has_chart_of_accounts</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Company has a chart of accounts|
|<el-row justify="space-between"><el-col :span="20">hr_employee_self_edit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|员工编辑|
|<el-row justify="space-between"><el-col :span="20">hr_expense_alias_prefix</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|默认的费用别名|
|<el-row justify="space-between"><el-col :span="20">hr_expense_use_mailgateway</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|允许员工通过电子邮件记录费用|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">invoice_mail_template_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|发票电子邮件模板|
|<el-row justify="space-between"><el-col :span="20">is_account_peppol_eligible</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|PEPPOL 符合条件|
|<el-row justify="space-between"><el-col :span="20">is_installed_sale</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|销售模块是否已安装|
|<el-row justify="space-between"><el-col :span="20">is_membership_multi</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|多团队|
|<el-row justify="space-between"><el-col :span="20">is_root_company</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是母公司|
|<el-row justify="space-between"><el-col :span="20">language_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|语言数量|
|<el-row justify="space-between"><el-col :span="20">lead_enrich_auto</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|自动丰富线索|
|<el-row justify="space-between"><el-col :span="20">lead_mining_in_pipeline</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|直接从商机商机创建线索挖掘申请。|
|<el-row justify="space-between"><el-col :span="20">lock_confirmed_po</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|锁定已确认的订单|
|<el-row justify="space-between"><el-col :span="20">mass_mailing_outgoing_mail_server</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|专门服务器|
|<el-row justify="space-between"><el-col :span="20">mass_mailing_reports</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|24小时统计邮寄报告|
|<el-row justify="space-between"><el-col :span="20">mass_mailing_split_contact_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|拆分名字和姓氏|
|<el-row justify="space-between"><el-col :span="20">module_account3way_match</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|3单匹配:采购订单，收货单与发票|
|<el-row justify="space-between"><el-col :span="20">module_account_accountant</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|会计|
|<el-row justify="space-between"><el-col :span="20">module_account_bank_statement_extract</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Bank Statement Digitization|
|<el-row justify="space-between"><el-col :span="20">module_account_bank_statement_import_camt</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|以CAMT.053 格式导入|
|<el-row justify="space-between"><el-col :span="20">module_account_bank_statement_import_csv</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|以.csv、.xls和.xlsx格式导入|
|<el-row justify="space-between"><el-col :span="20">module_account_bank_statement_import_ofx</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|以.ofx格式导入|
|<el-row justify="space-between"><el-col :span="20">module_account_bank_statement_import_qif</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|导入.qif单据|
|<el-row justify="space-between"><el-col :span="20">module_account_batch_payment</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|使用批量付款|
|<el-row justify="space-between"><el-col :span="20">module_account_budget</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|预算管理|
|<el-row justify="space-between"><el-col :span="20">module_account_check_printing</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Allow check printing and deposits|
|<el-row justify="space-between"><el-col :span="20">module_account_extract</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Document Digitization|
|<el-row justify="space-between"><el-col :span="20">module_account_inter_company_rules</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|管理公司间交易|
|<el-row justify="space-between"><el-col :span="20">module_account_intrastat</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|国际联盟|
|<el-row justify="space-between"><el-col :span="20">module_account_invoice_extract</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Invoice Digitization|
|<el-row justify="space-between"><el-col :span="20">module_account_iso20022</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|SEPA Credit Transfer / ISO20022|
|<el-row justify="space-between"><el-col :span="20">module_account_payment</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Invoice Online Payment|
|<el-row justify="space-between"><el-col :span="20">module_account_peppol</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|PEPPOL 开具发票|
|<el-row justify="space-between"><el-col :span="20">module_account_reports</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Dynamic Reports|
|<el-row justify="space-between"><el-col :span="20">module_account_sepa_direct_debit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Use SEPA Direct Debit|
|<el-row justify="space-between"><el-col :span="20">module_auth_ldap</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|LDAP认证|
|<el-row justify="space-between"><el-col :span="20">module_auth_oauth</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|使用外部验证提供者 (OAuth)|
|<el-row justify="space-between"><el-col :span="20">module_base_geolocalize</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|地理定位|
|<el-row justify="space-between"><el-col :span="20">module_base_import</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|允许用户导入 CSV/XLS/XLSX/ODS格式的文档数据|
|<el-row justify="space-between"><el-col :span="20">module_crm_iap_enrich</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|根据线索的电子邮箱地址、使用公司数据自动丰富线索。|
|<el-row justify="space-between"><el-col :span="20">module_crm_iap_mine</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|基于国家/地区、行业、规模等信息生成新的线索。|
|<el-row justify="space-between"><el-col :span="20">module_currency_rate_live</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|自动汇率|
|<el-row justify="space-between"><el-col :span="20">module_delivery</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|交付方式|
|<el-row justify="space-between"><el-col :span="20">module_delivery_bpost</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|bpost连接器|
|<el-row justify="space-between"><el-col :span="20">module_delivery_dhl</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|DHL快递连接器|
|<el-row justify="space-between"><el-col :span="20">module_delivery_easypost</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Easypost连接器|
|<el-row justify="space-between"><el-col :span="20">module_delivery_fedex</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|FedEx连接器|
|<el-row justify="space-between"><el-col :span="20">module_delivery_sendcloud</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Sendcloud连接器|
|<el-row justify="space-between"><el-col :span="20">module_delivery_shiprocket</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Shiprocket 连接器|
|<el-row justify="space-between"><el-col :span="20">module_delivery_starshipit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Starshipit 连接器|
|<el-row justify="space-between"><el-col :span="20">module_delivery_ups</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|UPS连接器|
|<el-row justify="space-between"><el-col :span="20">module_delivery_usps</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|USPS连接器|
|<el-row justify="space-between"><el-col :span="20">module_google_calendar</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|允许用户同步谷歌日历|
|<el-row justify="space-between"><el-col :span="20">module_google_gmail</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|支持Gmail身份验证|
|<el-row justify="space-between"><el-col :span="20">module_google_recaptcha</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|验证码|
|<el-row justify="space-between"><el-col :span="20">module_hr_expense_extract</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|向OCR发送账单以产生费用|
|<el-row justify="space-between"><el-col :span="20">module_hr_homeworking</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|远程工作|
|<el-row justify="space-between"><el-col :span="20">module_hr_payroll_expense</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|工资单上的报销费用|
|<el-row justify="space-between"><el-col :span="20">module_hr_presence</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|高级出席控制|
|<el-row justify="space-between"><el-col :span="20">module_hr_recruitment_extract</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|将简历发送到 OCR 以填写申请|
|<el-row justify="space-between"><el-col :span="20">module_hr_recruitment_survey</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|面试表单|
|<el-row justify="space-between"><el-col :span="20">module_hr_skills</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|技能管理|
|<el-row justify="space-between"><el-col :span="20">module_hr_timesheet</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|任务日志|
|<el-row justify="space-between"><el-col :span="20">module_l10n_eu_oss</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|欧盟共同体内部远程销售|
|<el-row justify="space-between"><el-col :span="20">module_loyalty</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|促销、优惠券、礼品卡和会员方案|
|<el-row justify="space-between"><el-col :span="20">module_mail_plugin</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|允许与邮件插件集成|
|<el-row justify="space-between"><el-col :span="20">module_maintenance_worksheet</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|定制维护工作表|
|<el-row justify="space-between"><el-col :span="20">module_microsoft_calendar</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|允许用户同步Outlook日历|
|<el-row justify="space-between"><el-col :span="20">module_microsoft_outlook</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|支持Outlook身份验证|
|<el-row justify="space-between"><el-col :span="20">module_mrp_mps</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|主生产计划|
|<el-row justify="space-between"><el-col :span="20">module_mrp_plm</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|产品生命周期管理（PLM）|
|<el-row justify="space-between"><el-col :span="20">module_mrp_subcontracting</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|外包|
|<el-row justify="space-between"><el-col :span="20">module_partner_autocomplete</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|合作伙伴自动完成|
|<el-row justify="space-between"><el-col :span="20">module_product_email_template</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|特定的电子邮件|
|<el-row justify="space-between"><el-col :span="20">module_product_expiry</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|到期日期|
|<el-row justify="space-between"><el-col :span="20">module_product_images</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|使用条形码获取产品图片|
|<el-row justify="space-between"><el-col :span="20">module_product_margin</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|允许产品毛利|
|<el-row justify="space-between"><el-col :span="20">module_purchase_product_matrix</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|采购表格入口|
|<el-row justify="space-between"><el-col :span="20">module_purchase_requisition</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|采购协议|
|<el-row justify="space-between"><el-col :span="20">module_quality_control</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|质量|
|<el-row justify="space-between"><el-col :span="20">module_quality_control_worksheet</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|质量工作表|
|<el-row justify="space-between"><el-col :span="20">module_sale_amazon</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|亚马逊同步|
|<el-row justify="space-between"><el-col :span="20">module_sale_commission</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|佣金|
|<el-row justify="space-between"><el-col :span="20">module_sale_loyalty</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|优惠券和会员|
|<el-row justify="space-between"><el-col :span="20">module_sale_margin</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|毛利|
|<el-row justify="space-between"><el-col :span="20">module_sale_pdf_quote_builder</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|PDF 报价生成器|
|<el-row justify="space-between"><el-col :span="20">module_sale_product_matrix</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|销售表格录入|
|<el-row justify="space-between"><el-col :span="20">module_sms</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|短信息|
|<el-row justify="space-between"><el-col :span="20">module_snailmail_account</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|传统信件|
|<el-row justify="space-between"><el-col :span="20">module_stock_barcode</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|条码扫描器|
|<el-row justify="space-between"><el-col :span="20">module_stock_barcode_barcodelookup</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|库存条形码数据库|
|<el-row justify="space-between"><el-col :span="20">module_stock_dropshipping</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|代发货|
|<el-row justify="space-between"><el-col :span="20">module_stock_fleet</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|配送管理系统|
|<el-row justify="space-between"><el-col :span="20">module_stock_landed_costs</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|到岸成本|
|<el-row justify="space-between"><el-col :span="20">module_stock_picking_batch</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|批量、波次和集群调拨|
|<el-row justify="space-between"><el-col :span="20">module_stock_sms</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|短信息确认|
|<el-row justify="space-between"><el-col :span="20">module_voip</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|网络电话|
|<el-row justify="space-between"><el-col :span="20">module_web_unsplash</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Unsplash图像库|
|<el-row justify="space-between"><el-col :span="20">module_website_cf_turnstile</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Cloudflare Turnstile|
|<el-row justify="space-between"><el-col :span="20">module_website_crm_iap_reveal</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|从网站流量创建线索/商机|
|<el-row justify="space-between"><el-col :span="20">module_website_hr_recruitment</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|线上发布|
|<el-row justify="space-between"><el-col :span="20">overtime_company_threshold</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|对公司有利的宽容时间|
|<el-row justify="space-between"><el-col :span="20">overtime_employee_threshold</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|对员工有利的宽容时间|
|<el-row justify="space-between"><el-col :span="20">partner_autocomplete_insufficient_credit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|信用不足|
|<el-row justify="space-between"><el-col :span="20">pay_invoices_online</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|在线支付发票|
|<el-row justify="space-between"><el-col :span="20">po_order_approval</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|订单审批|
|<el-row justify="space-between"><el-col :span="20">portal_allow_api_keys</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|客户 API 密钥|
|<el-row justify="space-between"><el-col :span="20">predictive_lead_scoring_field_labels</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|预测线索评分字段标签|
|<el-row justify="space-between"><el-col :span="20">predictive_lead_scoring_fields_str</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|字符串中的线索评分频率字段|
|<el-row justify="space-between"><el-col :span="20">predictive_lead_scoring_start_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|线索评分开始日期|
|<el-row justify="space-between"><el-col :span="20">predictive_lead_scoring_start_date_str</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|字符串中的线索评分开始日期|
|<el-row justify="space-between"><el-col :span="20">preview_ready</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Display preview button|
|<el-row justify="space-between"><el-col :span="20">product_volume_volume_in_cubic_feet</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|体积单位|
|<el-row justify="space-between"><el-col :span="20">product_weight_in_lbs</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|重量单位|
|<el-row justify="space-between"><el-col :span="20">profiling_enabled_until</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|启用分析直到|
|<el-row justify="space-between"><el-col :span="20">restrict_template_rendering</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|限制模板渲染|
|<el-row justify="space-between"><el-col :span="20">sfu_server_key</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|SFU 服务器密钥|
|<el-row justify="space-between"><el-col :span="20">sfu_server_url</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|SFU 服务器 URL|
|<el-row justify="space-between"><el-col :span="20">show_blacklist_buttons</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|退订时黑名单选项|
|<el-row justify="space-between"><el-col :span="20">show_effect</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|显示效果|
|<el-row justify="space-between"><el-col :span="20">snailmail_cover_readonly</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|蜗牛邮件封面只读|
|<el-row justify="space-between"><el-col :span="20">tenor_api_key</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Tenor API 密钥|
|<el-row justify="space-between"><el-col :span="20">tenor_content_filter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Tenor 内容过滤器|
|<el-row justify="space-between"><el-col :span="20">tenor_gif_limit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Tenor Gif 限额|
|<el-row justify="space-between"><el-col :span="20">twilio_account_sid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Twilio 帐户 SID|
|<el-row justify="space-between"><el-col :span="20">twilio_account_token</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Twilio 帐户身份验证令牌|
|<el-row justify="space-between"><el-col :span="20">unsplash_access_key</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|访问秘钥|
|<el-row justify="space-between"><el-col :span="20">unsplash_app_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|应用程序ID|
|<el-row justify="space-between"><el-col :span="20">use_invoice_terms</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|默认条款和条件|
|<el-row justify="space-between"><el-col :span="20">use_manufacturing_lead</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|默认制造提前期|
|<el-row justify="space-between"><el-col :span="20">use_po_lead</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|安全交货时间|
|<el-row justify="space-between"><el-col :span="20">use_security_lead</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|销售的安全提前期|
|<el-row justify="space-between"><el-col :span="20">use_twilio_rtc_servers</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|使用 Twilio ICE 服务器|
|<el-row justify="space-between"><el-col :span="20">user_default_rights</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|默认访问权限|
|<el-row justify="space-between"><el-col :span="20">web_app_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|网络应用程序名称|



##### 请求示例： {docsify-ignore}
```json
{
  "account_default_credit_limit" : null,
  "active_user_count" : null,
  "auth_signup_reset_password" : null,
  "auth_signup_template_user_id" : null,
  "auth_signup_uninvited" : null,
  "automatic_invoice" : null,
  "barcode_separator" : null,
  "company_count" : null,
  "company_id" : null,
  "company_informations" : null,
  "company_name" : null,
  "create_date" : null,
  "create_uid" : null,
  "crm_auto_assignment_action" : null,
  "crm_auto_assignment_interval_number" : null,
  "crm_auto_assignment_interval_type" : null,
  "crm_auto_assignment_run_datetime" : null,
  "crm_use_auto_assignment" : null,
  "default_invoice_policy" : null,
  "default_picking_policy" : null,
  "default_purchase_method" : null,
  "delay_alert_contract" : null,
  "digest_emails" : null,
  "display_name" : null,
  "external_email_server_default" : null,
  "fail_counter" : null,
  "google_gmail_client_identifier" : null,
  "google_gmail_client_secret" : null,
  "google_translate_api_key" : null,
  "group_analytic_accounting" : null,
  "group_applicant_cv_display" : null,
  "group_auto_done_setting" : null,
  "group_cash_rounding" : null,
  "group_discount_per_so_line" : null,
  "group_lot_on_delivery_slip" : null,
  "group_lot_on_invoice" : null,
  "group_mass_mailing_campaign" : null,
  "group_mrp_byproducts" : null,
  "group_mrp_reception_report" : null,
  "group_mrp_routings" : null,
  "group_mrp_workorder_dependencies" : null,
  "group_multi_currency" : null,
  "group_product_pricelist" : null,
  "group_product_variant" : null,
  "group_proforma_sales" : null,
  "group_project_milestone" : null,
  "group_project_rating" : null,
  "group_project_recurring_tasks" : null,
  "group_project_stages" : null,
  "group_project_task_dependencies" : null,
  "group_sale_delivery_address" : null,
  "group_sale_order_template" : null,
  "group_send_reminder" : null,
  "group_show_purchase_receipts" : null,
  "group_show_sale_receipts" : null,
  "group_stock_accounting_automatic" : null,
  "group_stock_adv_location" : null,
  "group_stock_lot_print_gs1" : null,
  "group_stock_multi_locations" : null,
  "group_stock_packaging" : null,
  "group_stock_production_lot" : null,
  "group_stock_reception_report" : null,
  "group_stock_sign_delivery" : null,
  "group_stock_tracking_lot" : null,
  "group_stock_tracking_owner" : null,
  "group_unlocked_by_default" : null,
  "group_uom" : null,
  "group_use_lead" : null,
  "group_use_recurring_revenues" : null,
  "group_warning_account" : null,
  "group_warning_purchase" : null,
  "group_warning_sale" : null,
  "group_warning_stock" : null,
  "has_accounting_entries" : null,
  "has_chart_of_accounts" : null,
  "hr_employee_self_edit" : null,
  "hr_expense_alias_prefix" : null,
  "hr_expense_use_mailgateway" : null,
  "id" : null,
  "invoice_mail_template_id" : null,
  "is_account_peppol_eligible" : null,
  "is_installed_sale" : null,
  "is_membership_multi" : null,
  "is_root_company" : null,
  "language_count" : null,
  "lead_enrich_auto" : null,
  "lead_mining_in_pipeline" : null,
  "lock_confirmed_po" : null,
  "mass_mailing_outgoing_mail_server" : null,
  "mass_mailing_reports" : null,
  "mass_mailing_split_contact_name" : null,
  "module_account3way_match" : null,
  "module_account_accountant" : null,
  "module_account_bank_statement_extract" : null,
  "module_account_bank_statement_import_camt" : null,
  "module_account_bank_statement_import_csv" : null,
  "module_account_bank_statement_import_ofx" : null,
  "module_account_bank_statement_import_qif" : null,
  "module_account_batch_payment" : null,
  "module_account_budget" : null,
  "module_account_check_printing" : null,
  "module_account_extract" : null,
  "module_account_inter_company_rules" : null,
  "module_account_intrastat" : null,
  "module_account_invoice_extract" : null,
  "module_account_iso20022" : null,
  "module_account_payment" : null,
  "module_account_peppol" : null,
  "module_account_reports" : null,
  "module_account_sepa_direct_debit" : null,
  "module_auth_ldap" : null,
  "module_auth_oauth" : null,
  "module_base_geolocalize" : null,
  "module_base_import" : null,
  "module_crm_iap_enrich" : null,
  "module_crm_iap_mine" : null,
  "module_currency_rate_live" : null,
  "module_delivery" : null,
  "module_delivery_bpost" : null,
  "module_delivery_dhl" : null,
  "module_delivery_easypost" : null,
  "module_delivery_fedex" : null,
  "module_delivery_sendcloud" : null,
  "module_delivery_shiprocket" : null,
  "module_delivery_starshipit" : null,
  "module_delivery_ups" : null,
  "module_delivery_usps" : null,
  "module_google_calendar" : null,
  "module_google_gmail" : null,
  "module_google_recaptcha" : null,
  "module_hr_expense_extract" : null,
  "module_hr_homeworking" : null,
  "module_hr_payroll_expense" : null,
  "module_hr_presence" : null,
  "module_hr_recruitment_extract" : null,
  "module_hr_recruitment_survey" : null,
  "module_hr_skills" : null,
  "module_hr_timesheet" : null,
  "module_l10n_eu_oss" : null,
  "module_loyalty" : null,
  "module_mail_plugin" : null,
  "module_maintenance_worksheet" : null,
  "module_microsoft_calendar" : null,
  "module_microsoft_outlook" : null,
  "module_mrp_mps" : null,
  "module_mrp_plm" : null,
  "module_mrp_subcontracting" : null,
  "module_partner_autocomplete" : null,
  "module_product_email_template" : null,
  "module_product_expiry" : null,
  "module_product_images" : null,
  "module_product_margin" : null,
  "module_purchase_product_matrix" : null,
  "module_purchase_requisition" : null,
  "module_quality_control" : null,
  "module_quality_control_worksheet" : null,
  "module_sale_amazon" : null,
  "module_sale_commission" : null,
  "module_sale_loyalty" : null,
  "module_sale_margin" : null,
  "module_sale_pdf_quote_builder" : null,
  "module_sale_product_matrix" : null,
  "module_sms" : null,
  "module_snailmail_account" : null,
  "module_stock_barcode" : null,
  "module_stock_barcode_barcodelookup" : null,
  "module_stock_dropshipping" : null,
  "module_stock_fleet" : null,
  "module_stock_landed_costs" : null,
  "module_stock_picking_batch" : null,
  "module_stock_sms" : null,
  "module_voip" : null,
  "module_web_unsplash" : null,
  "module_website_cf_turnstile" : null,
  "module_website_crm_iap_reveal" : null,
  "module_website_hr_recruitment" : null,
  "overtime_company_threshold" : null,
  "overtime_employee_threshold" : null,
  "partner_autocomplete_insufficient_credit" : null,
  "pay_invoices_online" : null,
  "po_order_approval" : null,
  "portal_allow_api_keys" : null,
  "predictive_lead_scoring_field_labels" : null,
  "predictive_lead_scoring_fields_str" : null,
  "predictive_lead_scoring_start_date" : null,
  "predictive_lead_scoring_start_date_str" : null,
  "preview_ready" : null,
  "product_volume_volume_in_cubic_feet" : null,
  "product_weight_in_lbs" : null,
  "profiling_enabled_until" : null,
  "restrict_template_rendering" : null,
  "sfu_server_key" : null,
  "sfu_server_url" : null,
  "show_blacklist_buttons" : null,
  "show_effect" : null,
  "snailmail_cover_readonly" : null,
  "tenor_api_key" : null,
  "tenor_content_filter" : null,
  "tenor_gif_limit" : null,
  "twilio_account_sid" : null,
  "twilio_account_token" : null,
  "unsplash_access_key" : null,
  "unsplash_app_id" : null,
  "use_invoice_terms" : null,
  "use_manufacturing_lead" : null,
  "use_po_lead" : null,
  "use_security_lead" : null,
  "use_twilio_rtc_servers" : null,
  "user_default_rights" : null,
  "web_app_name" : null,
  "write_date" : null,
  "write_uid" : null,
}
```



## DEFAULT

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/res_config_settings/fetch_default" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_auth_signup_template_user_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用作通过注册创建的新用户的模版|
|<el-row justify="space-between"><el-col :span="20">n_auth_signup_uninvited_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|客户帐号|
|<el-row justify="space-between"><el-col :span="20">n_company_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">n_company_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">n_company_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">n_crm_auto_assignment_action_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|自动分配操作|
|<el-row justify="space-between"><el-col :span="20">n_crm_auto_assignment_interval_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|自动分配间隔单位|
|<el-row justify="space-between"><el-col :span="20">n_default_invoice_policy_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|开票原则|
|<el-row justify="space-between"><el-col :span="20">n_default_picking_policy_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|拣货策略|
|<el-row justify="space-between"><el-col :span="20">n_default_purchase_method_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|账单管理|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_invoice_mail_template_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|发票电子邮件模板|
|<el-row justify="space-between"><el-col :span="20">n_lead_enrich_auto_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|自动丰富线索|
|<el-row justify="space-between"><el-col :span="20">n_product_volume_volume_in_cubic_feet_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|体积单位|
|<el-row justify="space-between"><el-col :span="20">n_product_weight_in_lbs_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|重量单位|
|<el-row justify="space-between"><el-col :span="20">n_tenor_content_filter_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Tenor 内容过滤器|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_auth_signup_template_user_id_eq" : null,
  "n_auth_signup_uninvited_eq" : null,
  "n_company_id_eq" : null,
  "n_company_name_eq" : null,
  "n_company_name_like" : null,
  "n_crm_auto_assignment_action_eq" : null,
  "n_crm_auto_assignment_interval_type_eq" : null,
  "n_default_invoice_policy_eq" : null,
  "n_default_picking_policy_eq" : null,
  "n_default_purchase_method_eq" : null,
  "n_id_eq" : null,
  "n_invoice_mail_template_id_eq" : null,
  "n_lead_enrich_auto_eq" : null,
  "n_product_volume_volume_in_cubic_feet_eq" : null,
  "n_product_weight_in_lbs_eq" : null,
  "n_tenor_content_filter_eq" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "account_default_credit_limit" : null,
    "active_user_count" : null,
    "auth_signup_reset_password" : null,
    "auth_signup_template_user_id" : null,
    "auth_signup_uninvited" : null,
    "automatic_invoice" : null,
    "barcode_separator" : null,
    "company_count" : null,
    "company_id" : null,
    "company_informations" : null,
    "company_name" : null,
    "create_date" : null,
    "create_uid" : null,
    "crm_auto_assignment_action" : null,
    "crm_auto_assignment_interval_number" : null,
    "crm_auto_assignment_interval_type" : null,
    "crm_auto_assignment_run_datetime" : null,
    "crm_use_auto_assignment" : null,
    "default_invoice_policy" : null,
    "default_picking_policy" : null,
    "default_purchase_method" : null,
    "delay_alert_contract" : null,
    "digest_emails" : null,
    "display_name" : null,
    "external_email_server_default" : null,
    "fail_counter" : null,
    "google_gmail_client_identifier" : null,
    "google_gmail_client_secret" : null,
    "google_translate_api_key" : null,
    "group_analytic_accounting" : null,
    "group_applicant_cv_display" : null,
    "group_auto_done_setting" : null,
    "group_cash_rounding" : null,
    "group_discount_per_so_line" : null,
    "group_lot_on_delivery_slip" : null,
    "group_lot_on_invoice" : null,
    "group_mass_mailing_campaign" : null,
    "group_mrp_byproducts" : null,
    "group_mrp_reception_report" : null,
    "group_mrp_routings" : null,
    "group_mrp_workorder_dependencies" : null,
    "group_multi_currency" : null,
    "group_product_pricelist" : null,
    "group_product_variant" : null,
    "group_proforma_sales" : null,
    "group_project_milestone" : null,
    "group_project_rating" : null,
    "group_project_recurring_tasks" : null,
    "group_project_stages" : null,
    "group_project_task_dependencies" : null,
    "group_sale_delivery_address" : null,
    "group_sale_order_template" : null,
    "group_send_reminder" : null,
    "group_show_purchase_receipts" : null,
    "group_show_sale_receipts" : null,
    "group_stock_accounting_automatic" : null,
    "group_stock_adv_location" : null,
    "group_stock_lot_print_gs1" : null,
    "group_stock_multi_locations" : null,
    "group_stock_packaging" : null,
    "group_stock_production_lot" : null,
    "group_stock_reception_report" : null,
    "group_stock_sign_delivery" : null,
    "group_stock_tracking_lot" : null,
    "group_stock_tracking_owner" : null,
    "group_unlocked_by_default" : null,
    "group_uom" : null,
    "group_use_lead" : null,
    "group_use_recurring_revenues" : null,
    "group_warning_account" : null,
    "group_warning_purchase" : null,
    "group_warning_sale" : null,
    "group_warning_stock" : null,
    "has_accounting_entries" : null,
    "has_chart_of_accounts" : null,
    "hr_employee_self_edit" : null,
    "hr_expense_alias_prefix" : null,
    "hr_expense_use_mailgateway" : null,
    "id" : null,
    "invoice_mail_template_id" : null,
    "is_account_peppol_eligible" : null,
    "is_installed_sale" : null,
    "is_membership_multi" : null,
    "is_root_company" : null,
    "language_count" : null,
    "lead_enrich_auto" : null,
    "lead_mining_in_pipeline" : null,
    "lock_confirmed_po" : null,
    "mass_mailing_outgoing_mail_server" : null,
    "mass_mailing_reports" : null,
    "mass_mailing_split_contact_name" : null,
    "module_account3way_match" : null,
    "module_account_accountant" : null,
    "module_account_bank_statement_extract" : null,
    "module_account_bank_statement_import_camt" : null,
    "module_account_bank_statement_import_csv" : null,
    "module_account_bank_statement_import_ofx" : null,
    "module_account_bank_statement_import_qif" : null,
    "module_account_batch_payment" : null,
    "module_account_budget" : null,
    "module_account_check_printing" : null,
    "module_account_extract" : null,
    "module_account_inter_company_rules" : null,
    "module_account_intrastat" : null,
    "module_account_invoice_extract" : null,
    "module_account_iso20022" : null,
    "module_account_payment" : null,
    "module_account_peppol" : null,
    "module_account_reports" : null,
    "module_account_sepa_direct_debit" : null,
    "module_auth_ldap" : null,
    "module_auth_oauth" : null,
    "module_base_geolocalize" : null,
    "module_base_import" : null,
    "module_crm_iap_enrich" : null,
    "module_crm_iap_mine" : null,
    "module_currency_rate_live" : null,
    "module_delivery" : null,
    "module_delivery_bpost" : null,
    "module_delivery_dhl" : null,
    "module_delivery_easypost" : null,
    "module_delivery_fedex" : null,
    "module_delivery_sendcloud" : null,
    "module_delivery_shiprocket" : null,
    "module_delivery_starshipit" : null,
    "module_delivery_ups" : null,
    "module_delivery_usps" : null,
    "module_google_calendar" : null,
    "module_google_gmail" : null,
    "module_google_recaptcha" : null,
    "module_hr_expense_extract" : null,
    "module_hr_homeworking" : null,
    "module_hr_payroll_expense" : null,
    "module_hr_presence" : null,
    "module_hr_recruitment_extract" : null,
    "module_hr_recruitment_survey" : null,
    "module_hr_skills" : null,
    "module_hr_timesheet" : null,
    "module_l10n_eu_oss" : null,
    "module_loyalty" : null,
    "module_mail_plugin" : null,
    "module_maintenance_worksheet" : null,
    "module_microsoft_calendar" : null,
    "module_microsoft_outlook" : null,
    "module_mrp_mps" : null,
    "module_mrp_plm" : null,
    "module_mrp_subcontracting" : null,
    "module_partner_autocomplete" : null,
    "module_product_email_template" : null,
    "module_product_expiry" : null,
    "module_product_images" : null,
    "module_product_margin" : null,
    "module_purchase_product_matrix" : null,
    "module_purchase_requisition" : null,
    "module_quality_control" : null,
    "module_quality_control_worksheet" : null,
    "module_sale_amazon" : null,
    "module_sale_commission" : null,
    "module_sale_loyalty" : null,
    "module_sale_margin" : null,
    "module_sale_pdf_quote_builder" : null,
    "module_sale_product_matrix" : null,
    "module_sms" : null,
    "module_snailmail_account" : null,
    "module_stock_barcode" : null,
    "module_stock_barcode_barcodelookup" : null,
    "module_stock_dropshipping" : null,
    "module_stock_fleet" : null,
    "module_stock_landed_costs" : null,
    "module_stock_picking_batch" : null,
    "module_stock_sms" : null,
    "module_voip" : null,
    "module_web_unsplash" : null,
    "module_website_cf_turnstile" : null,
    "module_website_crm_iap_reveal" : null,
    "module_website_hr_recruitment" : null,
    "overtime_company_threshold" : null,
    "overtime_employee_threshold" : null,
    "partner_autocomplete_insufficient_credit" : null,
    "pay_invoices_online" : null,
    "po_order_approval" : null,
    "portal_allow_api_keys" : null,
    "predictive_lead_scoring_field_labels" : null,
    "predictive_lead_scoring_fields_str" : null,
    "predictive_lead_scoring_start_date" : null,
    "predictive_lead_scoring_start_date_str" : null,
    "preview_ready" : null,
    "product_volume_volume_in_cubic_feet" : null,
    "product_weight_in_lbs" : null,
    "profiling_enabled_until" : null,
    "restrict_template_rendering" : null,
    "sfu_server_key" : null,
    "sfu_server_url" : null,
    "show_blacklist_buttons" : null,
    "show_effect" : null,
    "snailmail_cover_readonly" : null,
    "tenor_api_key" : null,
    "tenor_content_filter" : null,
    "tenor_gif_limit" : null,
    "twilio_account_sid" : null,
    "twilio_account_token" : null,
    "unsplash_access_key" : null,
    "unsplash_app_id" : null,
    "use_invoice_terms" : null,
    "use_manufacturing_lead" : null,
    "use_po_lead" : null,
    "use_security_lead" : null,
    "use_twilio_rtc_servers" : null,
    "user_default_rights" : null,
    "web_app_name" : null,
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
<el-alert title="/res_config_settings/importtemplate" type="info" :closable="false" ></el-alert>
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
<el-alert title="/res_config_settings/exportdata/{param},/res_config_settings/exportdata/{param}/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/res_config_settings/importdata" type="info" :closable="false" ></el-alert>
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
<el-alert title="/res_config_settings/importdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/res_config_settings/asyncimportdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/res_config_settings/printdata/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/res_config_settings/report" type="info" :closable="false" ></el-alert>
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