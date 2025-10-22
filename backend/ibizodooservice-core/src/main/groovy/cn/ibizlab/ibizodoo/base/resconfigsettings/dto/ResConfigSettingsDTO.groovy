package cn.ibizlab.ibizodoo.base.resconfigsettings.dto

import java.util.*
import java.math.*
import java.sql.Timestamp
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonInclude
import net.ibizsys.central.util.*
import cn.ibizlab.central.plugin.groovy.annotation.DEDataModel
import cn.ibizlab.central.plugin.groovy.dataentity.dto.*

@DEDataModel
@JsonInclude(JsonInclude.Include.NON_NULL)
class ResConfigSettingsDTO extends GroovyDTO<ResConfigSettingsDTO> {

    /**
     * 「默认信用额度」
     */
    @JsonProperty("account_default_credit_limit")
    BigDecimal accountDefaultCreditLimit
    /**
     * 「有效用户数量」
     */
    @JsonProperty("active_user_count")
    Integer activeUserCount
    /**
     * 「允许在登录页开启密码重置功能」
     * 字典[是否]
     */
    @JsonProperty("auth_signup_reset_password")
    Integer authSignupResetPassword
    /**
     * 「用作通过注册创建的新用户的模版」
     */
    @JsonProperty("auth_signup_template_user_id")
    String authSignupTemplateUserId
    /**
     * 「客户帐号」
     * 字典[客户帐号]
     */
    @JsonProperty("auth_signup_uninvited")
    String authSignupUninvited
    /**
     * 「自动发票」
     * 字典[是否]
     */
    @JsonProperty("automatic_invoice")
    Integer automaticInvoice
    /**
     * 「分隔符」
     */
    @JsonProperty("barcode_separator")
    String barcodeSeparator
    /**
     * 「公司数量」
     */
    @JsonProperty("company_count")
    Integer companyCount
    /**
     * 「公司」
     */
    @JsonProperty("company_id")
    String companyId
    /**
     * 「公司信息」
     */
    @JsonProperty("company_informations")
    String companyInformations
    /**
     * 「公司」
     */
    @JsonProperty("company_name")
    String companyName
    /**
     * 「建立时间」
     */
    @JsonProperty("create_date")
    Timestamp createDate
    /**
     * 「建立人」
     * 字典[云系统操作者]
     */
    @JsonProperty("create_uid")
    String createUid
    /**
     * 「自动分配操作」
     * 字典[自动分配操作]
     */
    @JsonProperty("crm_auto_assignment_action")
    String crmAutoAssignmentAction
    /**
     * 「重复间隔为每」
     */
    @JsonProperty("crm_auto_assignment_interval_number")
    Integer crmAutoAssignmentIntervalNumber
    /**
     * 「自动分配间隔单位」
     * 字典[自动分配间隔单位]
     */
    @JsonProperty("crm_auto_assignment_interval_type")
    String crmAutoAssignmentIntervalType
    /**
     * 「自动指派下次执行日期」
     */
    @JsonProperty("crm_auto_assignment_run_datetime")
    Timestamp crmAutoAssignmentRunDatetime
    /**
     * 「基于规则的分配」
     * 字典[是否]
     */
    @JsonProperty("crm_use_auto_assignment")
    Integer crmUseAutoAssignment
    /**
     * 「开票原则」
     * 字典[开票原则]
     */
    @JsonProperty("default_invoice_policy")
    String defaultInvoicePolicy
    /**
     * 「拣货策略」
     * 字典[拣货策略]
     */
    @JsonProperty("default_picking_policy")
    String defaultPickingPolicy
    /**
     * 「账单管理」
     * 字典[账单管理]
     */
    @JsonProperty("default_purchase_method")
    String defaultPurchaseMethod
    /**
     * 「合同逾期延时预警」
     */
    @JsonProperty("delay_alert_contract")
    Integer delayAlertContract
    /**
     * 「摘要邮件」
     * 字典[是否]
     */
    @JsonProperty("digest_emails")
    Integer digestEmails
    /**
     * 「显示名称」
     */
    @JsonProperty("display_name")
    String displayName
    /**
     * 「使用自定义电子邮件服务器」
     * 字典[是否]
     */
    @JsonProperty("external_email_server_default")
    Integer externalEmailServerDefault
    /**
     * 「失败的邮件」
     */
    @JsonProperty("fail_counter")
    Integer failCounter
    /**
     * 「Gmail 客户端 ID」
     */
    @JsonProperty("google_gmail_client_identifier")
    String googleGmailClientIdentifier
    /**
     * 「Gmail客户端Secret」
     */
    @JsonProperty("google_gmail_client_secret")
    String googleGmailClientSecret
    /**
     * 「消息翻译 API 密钥」
     */
    @JsonProperty("google_translate_api_key")
    String googleTranslateApiKey
    /**
     * 「分析会计」
     * 字典[是否]
     */
    @JsonProperty("group_analytic_accounting")
    Integer groupAnalyticAccounting
    /**
     * 「团体申请人简历展示」
     * 字典[是否]
     */
    @JsonProperty("group_applicant_cv_display")
    Integer groupApplicantCvDisplay
    /**
     * 「锁定已确认的销售订单」
     * 字典[是否]
     */
    @JsonProperty("group_auto_done_setting")
    Integer groupAutoDoneSetting
    /**
     * 「现金舍入」
     * 字典[是否]
     */
    @JsonProperty("group_cash_rounding")
    Integer groupCashRounding
    /**
     * 「折扣」
     * 字典[是否]
     */
    @JsonProperty("group_discount_per_so_line")
    Integer groupDiscountPerSoLine
    /**
     * 「在送货单上显示批次 / 序列号」
     * 字典[是否]
     */
    @JsonProperty("group_lot_on_delivery_slip")
    Integer groupLotOnDeliverySlip
    /**
     * 「在结算单上显示批次 / 序列号」
     * 字典[是否]
     */
    @JsonProperty("group_lot_on_invoice")
    Integer groupLotOnInvoice
    /**
     * 「邮件营销」
     * 字典[是否]
     */
    @JsonProperty("group_mass_mailing_campaign")
    Integer groupMassMailingCampaign
    /**
     * 「副产品」
     * 字典[是否]
     */
    @JsonProperty("group_mrp_byproducts")
    Integer groupMrpByproducts
    /**
     * 「制造订单分配报表」
     * 字典[是否]
     */
    @JsonProperty("group_mrp_reception_report")
    Integer groupMrpReceptionReport
    /**
     * 「物料需求计划（MRP）工单」
     * 字典[是否]
     */
    @JsonProperty("group_mrp_routings")
    Integer groupMrpRoutings
    /**
     * 「工单依赖性」
     * 字典[是否]
     */
    @JsonProperty("group_mrp_workorder_dependencies")
    Integer groupMrpWorkorderDependencies
    /**
     * 「多币别」
     * 字典[是否]
     */
    @JsonProperty("group_multi_currency")
    Integer groupMultiCurrency
    /**
     * 「价格表」
     * 字典[是否]
     */
    @JsonProperty("group_product_pricelist")
    Integer groupProductPricelist
    /**
     * 「变体」
     * 字典[是否]
     */
    @JsonProperty("group_product_variant")
    Integer groupProductVariant
    /**
     * 「形式发票」
     * 字典[是否]
     */
    @JsonProperty("group_proforma_sales")
    Integer groupProformaSales
    /**
     * 「里程碑」
     * 字典[是否]
     */
    @JsonProperty("group_project_milestone")
    Integer groupProjectMilestone
    /**
     * 「客户点评」
     * 字典[是否]
     */
    @JsonProperty("group_project_rating")
    Integer groupProjectRating
    /**
     * 「周期任务」
     * 字典[是否]
     */
    @JsonProperty("group_project_recurring_tasks")
    Integer groupProjectRecurringTasks
    /**
     * 「项目阶段」
     * 字典[是否]
     */
    @JsonProperty("group_project_stages")
    Integer groupProjectStages
    /**
     * 「任务依赖」
     * 字典[是否]
     */
    @JsonProperty("group_project_task_dependencies")
    Integer groupProjectTaskDependencies
    /**
     * 「客户地址」
     * 字典[是否]
     */
    @JsonProperty("group_sale_delivery_address")
    Integer groupSaleDeliveryAddress
    /**
     * 「报价模板」
     * 字典[是否]
     */
    @JsonProperty("group_sale_order_template")
    Integer groupSaleOrderTemplate
    /**
     * 「收货提醒」
     * 字典[是否]
     */
    @JsonProperty("group_send_reminder")
    Integer groupSendReminder
    /**
     * 「采购收据」
     * 字典[是否]
     */
    @JsonProperty("group_show_purchase_receipts")
    Integer groupShowPurchaseReceipts
    /**
     * 「销售收据」
     * 字典[是否]
     */
    @JsonProperty("group_show_sale_receipts")
    Integer groupShowSaleReceipts
    /**
     * 「自动库存会计」
     * 字典[是否]
     */
    @JsonProperty("group_stock_accounting_automatic")
    Integer groupStockAccountingAutomatic
    /**
     * 「多步路线」
     * 字典[是否]
     */
    @JsonProperty("group_stock_adv_location")
    Integer groupStockAdvLocation
    /**
     * 「使用GS1编码格式打印批号和序列号」
     * 字典[是否]
     */
    @JsonProperty("group_stock_lot_print_gs1")
    Integer groupStockLotPrintGs1
    /**
     * 「储存位置」
     * 字典[是否]
     */
    @JsonProperty("group_stock_multi_locations")
    Integer groupStockMultiLocations
    /**
     * 「产品包装」
     * 字典[是否]
     */
    @JsonProperty("group_stock_packaging")
    Integer groupStockPackaging
    /**
     * 「批次 / 序列号」
     * 字典[是否]
     */
    @JsonProperty("group_stock_production_lot")
    Integer groupStockProductionLot
    /**
     * 「库存接收报表」
     * 字典[是否]
     */
    @JsonProperty("group_stock_reception_report")
    Integer groupStockReceptionReport
    /**
     * 「签名」
     * 字典[是否]
     */
    @JsonProperty("group_stock_sign_delivery")
    Integer groupStockSignDelivery
    /**
     * 「包裹」
     * 字典[是否]
     */
    @JsonProperty("group_stock_tracking_lot")
    Integer groupStockTrackingLot
    /**
     * 「寄售」
     * 字典[是否]
     */
    @JsonProperty("group_stock_tracking_owner")
    Integer groupStockTrackingOwner
    /**
     * 「解锁制造订单」
     * 字典[是否]
     */
    @JsonProperty("group_unlocked_by_default")
    Integer groupUnlockedByDefault
    /**
     * 「计量单位」
     * 字典[是否]
     */
    @JsonProperty("group_uom")
    Integer groupUom
    /**
     * 「线索」
     * 字典[是否]
     */
    @JsonProperty("group_use_lead")
    Integer groupUseLead
    /**
     * 「经常性收入」
     * 字典[是否]
     */
    @JsonProperty("group_use_recurring_revenues")
    Integer groupUseRecurringRevenues
    /**
     * 「发票中的警告」
     * 字典[是否]
     */
    @JsonProperty("group_warning_account")
    Integer groupWarningAccount
    /**
     * 「采购警告」
     * 字典[是否]
     */
    @JsonProperty("group_warning_purchase")
    Integer groupWarningPurchase
    /**
     * 「销售订单警告信息」
     * 字典[是否]
     */
    @JsonProperty("group_warning_sale")
    Integer groupWarningSale
    /**
     * 「库存警报」
     * 字典[是否]
     */
    @JsonProperty("group_warning_stock")
    Integer groupWarningStock
    /**
     * 「Has Accounting Entries」
     * 字典[是否]
     */
    @JsonProperty("has_accounting_entries")
    Integer hasAccountingEntries
    /**
     * 「Company has a chart of accounts」
     * 字典[是否]
     */
    @JsonProperty("has_chart_of_accounts")
    Integer hasChartOfAccounts
    /**
     * 「员工编辑」
     * 字典[是否]
     */
    @JsonProperty("hr_employee_self_edit")
    Integer hrEmployeeSelfEdit
    /**
     * 「默认的费用别名」
     */
    @JsonProperty("hr_expense_alias_prefix")
    String hrExpenseAliasPrefix
    /**
     * 「允许员工通过电子邮件记录费用」
     * 字典[是否]
     */
    @JsonProperty("hr_expense_use_mailgateway")
    Integer hrExpenseUseMailgateway
    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「发票电子邮件模板」
     */
    @JsonProperty("invoice_mail_template_id")
    String invoiceMailTemplateId
    /**
     * 「PEPPOL 符合条件」
     * 字典[是否]
     */
    @JsonProperty("is_account_peppol_eligible")
    Integer isAccountPeppolEligible
    /**
     * 「销售模块是否已安装」
     * 字典[是否]
     */
    @JsonProperty("is_installed_sale")
    Integer isInstalledSale
    /**
     * 「多团队」
     * 字典[是否]
     */
    @JsonProperty("is_membership_multi")
    Integer isMembershipMulti
    /**
     * 「是母公司」
     * 字典[是否]
     */
    @JsonProperty("is_root_company")
    Integer isRootCompany
    /**
     * 「语言数量」
     */
    @JsonProperty("language_count")
    Integer languageCount
    /**
     * 「自动丰富线索」
     * 字典[自动丰富线索]
     */
    @JsonProperty("lead_enrich_auto")
    String leadEnrichAuto
    /**
     * 「直接从商机商机创建线索挖掘申请。」
     * 字典[是否]
     */
    @JsonProperty("lead_mining_in_pipeline")
    Integer leadMiningInPipeline
    /**
     * 「锁定已确认的订单」
     * 字典[是否]
     */
    @JsonProperty("lock_confirmed_po")
    Integer lockConfirmedPo
    /**
     * 「专门服务器」
     * 字典[是否]
     */
    @JsonProperty("mass_mailing_outgoing_mail_server")
    Integer massMailingOutgoingMailServer
    /**
     * 「24小时统计邮寄报告」
     * 字典[是否]
     */
    @JsonProperty("mass_mailing_reports")
    Integer massMailingReports
    /**
     * 「拆分名字和姓氏」
     * 字典[是否]
     */
    @JsonProperty("mass_mailing_split_contact_name")
    Integer massMailingSplitContactName
    /**
     * 「3单匹配:采购订单，收货单与发票」
     * 字典[是否]
     */
    @JsonProperty("module_account3way_match")
    Integer moduleAccount3wayMatch
    /**
     * 「会计」
     * 字典[是否]
     */
    @JsonProperty("module_account_accountant")
    Integer moduleAccountAccountant
    /**
     * 「Bank Statement Digitization」
     * 字典[是否]
     */
    @JsonProperty("module_account_bank_statement_extract")
    Integer moduleAccountBankStatementExtract
    /**
     * 「以CAMT.053 格式导入」
     * 字典[是否]
     */
    @JsonProperty("module_account_bank_statement_import_camt")
    Integer moduleAccountBankStatementImportCamt
    /**
     * 「以.csv、.xls和.xlsx格式导入」
     * 字典[是否]
     */
    @JsonProperty("module_account_bank_statement_import_csv")
    Integer moduleAccountBankStatementImportCsv
    /**
     * 「以.ofx格式导入」
     * 字典[是否]
     */
    @JsonProperty("module_account_bank_statement_import_ofx")
    Integer moduleAccountBankStatementImportOfx
    /**
     * 「导入.qif单据」
     * 字典[是否]
     */
    @JsonProperty("module_account_bank_statement_import_qif")
    Integer moduleAccountBankStatementImportQif
    /**
     * 「使用批量付款」
     * 字典[是否]
     */
    @JsonProperty("module_account_batch_payment")
    Integer moduleAccountBatchPayment
    /**
     * 「预算管理」
     * 字典[是否]
     */
    @JsonProperty("module_account_budget")
    Integer moduleAccountBudget
    /**
     * 「Allow check printing and deposits」
     * 字典[是否]
     */
    @JsonProperty("module_account_check_printing")
    Integer moduleAccountCheckPrinting
    /**
     * 「Document Digitization」
     * 字典[是否]
     */
    @JsonProperty("module_account_extract")
    Integer moduleAccountExtract
    /**
     * 「管理公司间交易」
     * 字典[是否]
     */
    @JsonProperty("module_account_inter_company_rules")
    Integer moduleAccountInterCompanyRules
    /**
     * 「国际联盟」
     * 字典[是否]
     */
    @JsonProperty("module_account_intrastat")
    Integer moduleAccountIntrastat
    /**
     * 「Invoice Digitization」
     * 字典[是否]
     */
    @JsonProperty("module_account_invoice_extract")
    Integer moduleAccountInvoiceExtract
    /**
     * 「SEPA Credit Transfer / ISO20022」
     * 字典[是否]
     */
    @JsonProperty("module_account_iso20022")
    Integer moduleAccountIso20022
    /**
     * 「Invoice Online Payment」
     * 字典[是否]
     */
    @JsonProperty("module_account_payment")
    Integer moduleAccountPayment
    /**
     * 「PEPPOL 开具发票」
     * 字典[是否]
     */
    @JsonProperty("module_account_peppol")
    Integer moduleAccountPeppol
    /**
     * 「Dynamic Reports」
     * 字典[是否]
     */
    @JsonProperty("module_account_reports")
    Integer moduleAccountReports
    /**
     * 「Use SEPA Direct Debit」
     * 字典[是否]
     */
    @JsonProperty("module_account_sepa_direct_debit")
    Integer moduleAccountSepaDirectDebit
    /**
     * 「LDAP认证」
     * 字典[是否]
     */
    @JsonProperty("module_auth_ldap")
    Integer moduleAuthLdap
    /**
     * 「使用外部验证提供者 (OAuth)」
     * 字典[是否]
     */
    @JsonProperty("module_auth_oauth")
    Integer moduleAuthOauth
    /**
     * 「地理定位」
     * 字典[是否]
     */
    @JsonProperty("module_base_geolocalize")
    Integer moduleBaseGeolocalize
    /**
     * 「允许用户导入 CSV/XLS/XLSX/ODS格式的文档数据」
     * 字典[是否]
     */
    @JsonProperty("module_base_import")
    Integer moduleBaseImport
    /**
     * 「根据线索的电子邮箱地址、使用公司数据自动丰富线索。」
     * 字典[是否]
     */
    @JsonProperty("module_crm_iap_enrich")
    Integer moduleCrmIapEnrich
    /**
     * 「基于国家/地区、行业、规模等信息生成新的线索。」
     * 字典[是否]
     */
    @JsonProperty("module_crm_iap_mine")
    Integer moduleCrmIapMine
    /**
     * 「自动汇率」
     * 字典[是否]
     */
    @JsonProperty("module_currency_rate_live")
    Integer moduleCurrencyRateLive
    /**
     * 「交付方式」
     * 字典[是否]
     */
    @JsonProperty("module_delivery")
    Integer moduleDelivery
    /**
     * 「bpost连接器」
     * 字典[是否]
     */
    @JsonProperty("module_delivery_bpost")
    Integer moduleDeliveryBpost
    /**
     * 「DHL快递连接器」
     * 字典[是否]
     */
    @JsonProperty("module_delivery_dhl")
    Integer moduleDeliveryDhl
    /**
     * 「Easypost连接器」
     * 字典[是否]
     */
    @JsonProperty("module_delivery_easypost")
    Integer moduleDeliveryEasypost
    /**
     * 「FedEx连接器」
     * 字典[是否]
     */
    @JsonProperty("module_delivery_fedex")
    Integer moduleDeliveryFedex
    /**
     * 「Sendcloud连接器」
     * 字典[是否]
     */
    @JsonProperty("module_delivery_sendcloud")
    Integer moduleDeliverySendcloud
    /**
     * 「Shiprocket 连接器」
     * 字典[是否]
     */
    @JsonProperty("module_delivery_shiprocket")
    Integer moduleDeliveryShiprocket
    /**
     * 「Starshipit 连接器」
     * 字典[是否]
     */
    @JsonProperty("module_delivery_starshipit")
    Integer moduleDeliveryStarshipit
    /**
     * 「UPS连接器」
     * 字典[是否]
     */
    @JsonProperty("module_delivery_ups")
    Integer moduleDeliveryUps
    /**
     * 「USPS连接器」
     * 字典[是否]
     */
    @JsonProperty("module_delivery_usps")
    Integer moduleDeliveryUsps
    /**
     * 「允许用户同步谷歌日历」
     * 字典[是否]
     */
    @JsonProperty("module_google_calendar")
    Integer moduleGoogleCalendar
    /**
     * 「支持Gmail身份验证」
     * 字典[是否]
     */
    @JsonProperty("module_google_gmail")
    Integer moduleGoogleGmail
    /**
     * 「验证码」
     * 字典[是否]
     */
    @JsonProperty("module_google_recaptcha")
    Integer moduleGoogleRecaptcha
    /**
     * 「向OCR发送账单以产生费用」
     * 字典[是否]
     */
    @JsonProperty("module_hr_expense_extract")
    Integer moduleHrExpenseExtract
    /**
     * 「远程工作」
     * 字典[是否]
     */
    @JsonProperty("module_hr_homeworking")
    Integer moduleHrHomeworking
    /**
     * 「工资单上的报销费用」
     * 字典[是否]
     */
    @JsonProperty("module_hr_payroll_expense")
    Integer moduleHrPayrollExpense
    /**
     * 「高级出席控制」
     * 字典[是否]
     */
    @JsonProperty("module_hr_presence")
    Integer moduleHrPresence
    /**
     * 「将简历发送到 OCR 以填写申请」
     * 字典[是否]
     */
    @JsonProperty("module_hr_recruitment_extract")
    Integer moduleHrRecruitmentExtract
    /**
     * 「面试表单」
     * 字典[是否]
     */
    @JsonProperty("module_hr_recruitment_survey")
    Integer moduleHrRecruitmentSurvey
    /**
     * 「技能管理」
     * 字典[是否]
     */
    @JsonProperty("module_hr_skills")
    Integer moduleHrSkills
    /**
     * 「任务日志」
     * 字典[是否]
     */
    @JsonProperty("module_hr_timesheet")
    Integer moduleHrTimesheet
    /**
     * 「欧盟共同体内部远程销售」
     * 字典[是否]
     */
    @JsonProperty("module_l10n_eu_oss")
    Integer moduleL10nEuOss
    /**
     * 「促销、优惠券、礼品卡和会员方案」
     * 字典[是否]
     */
    @JsonProperty("module_loyalty")
    Integer moduleLoyalty
    /**
     * 「允许与邮件插件集成」
     * 字典[是否]
     */
    @JsonProperty("module_mail_plugin")
    Integer moduleMailPlugin
    /**
     * 「定制维护工作表」
     * 字典[是否]
     */
    @JsonProperty("module_maintenance_worksheet")
    Integer moduleMaintenanceWorksheet
    /**
     * 「允许用户同步Outlook日历」
     * 字典[是否]
     */
    @JsonProperty("module_microsoft_calendar")
    Integer moduleMicrosoftCalendar
    /**
     * 「支持Outlook身份验证」
     * 字典[是否]
     */
    @JsonProperty("module_microsoft_outlook")
    Integer moduleMicrosoftOutlook
    /**
     * 「主生产计划」
     * 字典[是否]
     */
    @JsonProperty("module_mrp_mps")
    Integer moduleMrpMps
    /**
     * 「产品生命周期管理（PLM）」
     * 字典[是否]
     */
    @JsonProperty("module_mrp_plm")
    Integer moduleMrpPlm
    /**
     * 「外包」
     * 字典[是否]
     */
    @JsonProperty("module_mrp_subcontracting")
    Integer moduleMrpSubcontracting
    /**
     * 「合作伙伴自动完成」
     * 字典[是否]
     */
    @JsonProperty("module_partner_autocomplete")
    Integer modulePartnerAutocomplete
    /**
     * 「特定的电子邮件」
     * 字典[是否]
     */
    @JsonProperty("module_product_email_template")
    Integer moduleProductEmailTemplate
    /**
     * 「到期日期」
     * 字典[是否]
     */
    @JsonProperty("module_product_expiry")
    Integer moduleProductExpiry
    /**
     * 「使用条形码获取产品图片」
     * 字典[是否]
     */
    @JsonProperty("module_product_images")
    Integer moduleProductImages
    /**
     * 「允许产品毛利」
     * 字典[是否]
     */
    @JsonProperty("module_product_margin")
    Integer moduleProductMargin
    /**
     * 「采购表格入口」
     * 字典[是否]
     */
    @JsonProperty("module_purchase_product_matrix")
    Integer modulePurchaseProductMatrix
    /**
     * 「采购协议」
     * 字典[是否]
     */
    @JsonProperty("module_purchase_requisition")
    Integer modulePurchaseRequisition
    /**
     * 「质量」
     * 字典[是否]
     */
    @JsonProperty("module_quality_control")
    Integer moduleQualityControl
    /**
     * 「质量工作表」
     * 字典[是否]
     */
    @JsonProperty("module_quality_control_worksheet")
    Integer moduleQualityControlWorksheet
    /**
     * 「亚马逊同步」
     * 字典[是否]
     */
    @JsonProperty("module_sale_amazon")
    Integer moduleSaleAmazon
    /**
     * 「佣金」
     * 字典[是否]
     */
    @JsonProperty("module_sale_commission")
    Integer moduleSaleCommission
    /**
     * 「优惠券和会员」
     * 字典[是否]
     */
    @JsonProperty("module_sale_loyalty")
    Integer moduleSaleLoyalty
    /**
     * 「毛利」
     * 字典[是否]
     */
    @JsonProperty("module_sale_margin")
    Integer moduleSaleMargin
    /**
     * 「PDF 报价生成器」
     * 字典[是否]
     */
    @JsonProperty("module_sale_pdf_quote_builder")
    Integer moduleSalePdfQuoteBuilder
    /**
     * 「销售表格录入」
     * 字典[是否]
     */
    @JsonProperty("module_sale_product_matrix")
    Integer moduleSaleProductMatrix
    /**
     * 「短信息」
     * 字典[是否]
     */
    @JsonProperty("module_sms")
    Integer moduleSms
    /**
     * 「传统信件」
     * 字典[是否]
     */
    @JsonProperty("module_snailmail_account")
    Integer moduleSnailmailAccount
    /**
     * 「条码扫描器」
     * 字典[是否]
     */
    @JsonProperty("module_stock_barcode")
    Integer moduleStockBarcode
    /**
     * 「库存条形码数据库」
     * 字典[是否]
     */
    @JsonProperty("module_stock_barcode_barcodelookup")
    Integer moduleStockBarcodeBarcodelookup
    /**
     * 「代发货」
     * 字典[是否]
     */
    @JsonProperty("module_stock_dropshipping")
    Integer moduleStockDropshipping
    /**
     * 「配送管理系统」
     * 字典[是否]
     */
    @JsonProperty("module_stock_fleet")
    Integer moduleStockFleet
    /**
     * 「到岸成本」
     * 字典[是否]
     */
    @JsonProperty("module_stock_landed_costs")
    Integer moduleStockLandedCosts
    /**
     * 「批量、波次和集群调拨」
     * 字典[是否]
     */
    @JsonProperty("module_stock_picking_batch")
    Integer moduleStockPickingBatch
    /**
     * 「短信息确认」
     * 字典[是否]
     */
    @JsonProperty("module_stock_sms")
    Integer moduleStockSms
    /**
     * 「网络电话」
     * 字典[是否]
     */
    @JsonProperty("module_voip")
    Integer moduleVoip
    /**
     * 「Unsplash图像库」
     * 字典[是否]
     */
    @JsonProperty("module_web_unsplash")
    Integer moduleWebUnsplash
    /**
     * 「Cloudflare Turnstile」
     * 字典[是否]
     */
    @JsonProperty("module_website_cf_turnstile")
    Integer moduleWebsiteCfTurnstile
    /**
     * 「从网站流量创建线索/商机」
     * 字典[是否]
     */
    @JsonProperty("module_website_crm_iap_reveal")
    Integer moduleWebsiteCrmIapReveal
    /**
     * 「线上发布」
     * 字典[是否]
     */
    @JsonProperty("module_website_hr_recruitment")
    Integer moduleWebsiteHrRecruitment
    /**
     * 「对公司有利的宽容时间」
     */
    @JsonProperty("overtime_company_threshold")
    Integer overtimeCompanyThreshold
    /**
     * 「对员工有利的宽容时间」
     */
    @JsonProperty("overtime_employee_threshold")
    Integer overtimeEmployeeThreshold
    /**
     * 「信用不足」
     * 字典[是否]
     */
    @JsonProperty("partner_autocomplete_insufficient_credit")
    Integer partnerAutocompleteInsufficientCredit
    /**
     * 「在线支付发票」
     * 字典[是否]
     */
    @JsonProperty("pay_invoices_online")
    Integer payInvoicesOnline
    /**
     * 「订单审批」
     * 字典[是否]
     */
    @JsonProperty("po_order_approval")
    Integer poOrderApproval
    /**
     * 「客户 API 密钥」
     * 字典[是否]
     */
    @JsonProperty("portal_allow_api_keys")
    Integer portalAllowApiKeys
    /**
     * 「预测线索评分字段标签」
     */
    @JsonProperty("predictive_lead_scoring_field_labels")
    String predictiveLeadScoringFieldLabels
    /**
     * 「字符串中的线索评分频率字段」
     */
    @JsonProperty("predictive_lead_scoring_fields_str")
    String predictiveLeadScoringFieldsStr
    /**
     * 「线索评分开始日期」
     */
    @JsonProperty("predictive_lead_scoring_start_date")
    Timestamp predictiveLeadScoringStartDate
    /**
     * 「字符串中的线索评分开始日期」
     */
    @JsonProperty("predictive_lead_scoring_start_date_str")
    String predictiveLeadScoringStartDateStr
    /**
     * 「Display preview button」
     * 字典[是否]
     */
    @JsonProperty("preview_ready")
    Integer previewReady
    /**
     * 「体积单位」
     * 字典[体积单位]
     */
    @JsonProperty("product_volume_volume_in_cubic_feet")
    String productVolumeVolumeInCubicFeet
    /**
     * 「重量单位」
     * 字典[重量单位]
     */
    @JsonProperty("product_weight_in_lbs")
    String productWeightInLbs
    /**
     * 「启用分析直到」
     */
    @JsonProperty("profiling_enabled_until")
    Timestamp profilingEnabledUntil
    /**
     * 「限制模板渲染」
     * 字典[是否]
     */
    @JsonProperty("restrict_template_rendering")
    Integer restrictTemplateRendering
    /**
     * 「SFU 服务器密钥」
     */
    @JsonProperty("sfu_server_key")
    String sfuServerKey
    /**
     * 「SFU 服务器 URL」
     */
    @JsonProperty("sfu_server_url")
    String sfuServerUrl
    /**
     * 「退订时黑名单选项」
     * 字典[是否]
     */
    @JsonProperty("show_blacklist_buttons")
    Integer showBlacklistButtons
    /**
     * 「显示效果」
     * 字典[是否]
     */
    @JsonProperty("show_effect")
    Integer showEffect
    /**
     * 「蜗牛邮件封面只读」
     * 字典[是否]
     */
    @JsonProperty("snailmail_cover_readonly")
    Integer snailmailCoverReadonly
    /**
     * 「Tenor API 密钥」
     */
    @JsonProperty("tenor_api_key")
    String tenorApiKey
    /**
     * 「Tenor 内容过滤器」
     * 字典[Tenor 内容过滤器]
     */
    @JsonProperty("tenor_content_filter")
    String tenorContentFilter
    /**
     * 「Tenor Gif 限额」
     */
    @JsonProperty("tenor_gif_limit")
    Integer tenorGifLimit
    /**
     * 「Twilio 帐户 SID」
     */
    @JsonProperty("twilio_account_sid")
    String twilioAccountSid
    /**
     * 「Twilio 帐户身份验证令牌」
     */
    @JsonProperty("twilio_account_token")
    String twilioAccountToken
    /**
     * 「访问秘钥」
     */
    @JsonProperty("unsplash_access_key")
    String unsplashAccessKey
    /**
     * 「应用程序ID」
     */
    @JsonProperty("unsplash_app_id")
    String unsplashAppId
    /**
     * 「默认条款和条件」
     * 字典[是否]
     */
    @JsonProperty("use_invoice_terms")
    Integer useInvoiceTerms
    /**
     * 「默认制造提前期」
     * 字典[是否]
     */
    @JsonProperty("use_manufacturing_lead")
    Integer useManufacturingLead
    /**
     * 「安全交货时间」
     * 字典[是否]
     */
    @JsonProperty("use_po_lead")
    Integer usePoLead
    /**
     * 「销售的安全提前期」
     * 字典[是否]
     */
    @JsonProperty("use_security_lead")
    Integer useSecurityLead
    /**
     * 「使用 Twilio ICE 服务器」
     * 字典[是否]
     */
    @JsonProperty("use_twilio_rtc_servers")
    Integer useTwilioRtcServers
    /**
     * 「默认访问权限」
     * 字典[是否]
     */
    @JsonProperty("user_default_rights")
    Integer userDefaultRights
    /**
     * 「网络应用程序名称」
     */
    @JsonProperty("web_app_name")
    String webAppName
    /**
     * 「更新时间」
     */
    @JsonProperty("write_date")
    Timestamp writeDate
    /**
     * 「更新人」
     * 字典[云系统操作者]
     */
    @JsonProperty("write_uid")
    String writeUid

    /**
     * 设置「默认信用额度」值
     * @param val
     */
    ResConfigSettingsDTO setAccountDefaultCreditLimit(BigDecimal accountDefaultCreditLimit) {
        this.accountDefaultCreditLimit = accountDefaultCreditLimit
        return this
    }


    /**
     * 设置「有效用户数量」值
     * @param val
     */
    ResConfigSettingsDTO setActiveUserCount(Integer activeUserCount) {
        this.activeUserCount = activeUserCount
        return this
    }


    /**
     * 设置「允许在登录页开启密码重置功能」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setAuthSignupResetPassword(Integer authSignupResetPassword) {
        this.authSignupResetPassword = authSignupResetPassword
        return this
    }


    /**
     * 设置「用作通过注册创建的新用户的模版」值
     * @param val
     */
    ResConfigSettingsDTO setAuthSignupTemplateUserId(String authSignupTemplateUserId) {
        this.authSignupTemplateUserId = authSignupTemplateUserId
        return this
    }


    /**
     * 设置「客户帐号」值
     * 字典[客户帐号]
     * @param val
     */
    ResConfigSettingsDTO setAuthSignupUninvited(String authSignupUninvited) {
        this.authSignupUninvited = authSignupUninvited
        return this
    }


    /**
     * 设置「自动发票」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setAutomaticInvoice(Integer automaticInvoice) {
        this.automaticInvoice = automaticInvoice
        return this
    }


    /**
     * 设置「分隔符」值
     * @param val
     */
    ResConfigSettingsDTO setBarcodeSeparator(String barcodeSeparator) {
        this.barcodeSeparator = barcodeSeparator
        return this
    }


    /**
     * 设置「公司数量」值
     * @param val
     */
    ResConfigSettingsDTO setCompanyCount(Integer companyCount) {
        this.companyCount = companyCount
        return this
    }


    /**
     * 设置「公司」值
     * @param val
     */
    ResConfigSettingsDTO setCompanyId(String companyId) {
        this.companyId = companyId
        return this
    }


    /**
     * 设置「公司信息」值
     * @param val
     */
    ResConfigSettingsDTO setCompanyInformations(String companyInformations) {
        this.companyInformations = companyInformations
        return this
    }


    /**
     * 设置「公司」值
     * @param val
     */
    ResConfigSettingsDTO setCompanyName(String companyName) {
        this.companyName = companyName
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    ResConfigSettingsDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    ResConfigSettingsDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「自动分配操作」值
     * 字典[自动分配操作]
     * @param val
     */
    ResConfigSettingsDTO setCrmAutoAssignmentAction(String crmAutoAssignmentAction) {
        this.crmAutoAssignmentAction = crmAutoAssignmentAction
        return this
    }


    /**
     * 设置「重复间隔为每」值
     * @param val
     */
    ResConfigSettingsDTO setCrmAutoAssignmentIntervalNumber(Integer crmAutoAssignmentIntervalNumber) {
        this.crmAutoAssignmentIntervalNumber = crmAutoAssignmentIntervalNumber
        return this
    }


    /**
     * 设置「自动分配间隔单位」值
     * 字典[自动分配间隔单位]
     * @param val
     */
    ResConfigSettingsDTO setCrmAutoAssignmentIntervalType(String crmAutoAssignmentIntervalType) {
        this.crmAutoAssignmentIntervalType = crmAutoAssignmentIntervalType
        return this
    }


    /**
     * 设置「自动指派下次执行日期」值
     * @param val
     */
    ResConfigSettingsDTO setCrmAutoAssignmentRunDatetime(Timestamp crmAutoAssignmentRunDatetime) {
        this.crmAutoAssignmentRunDatetime = crmAutoAssignmentRunDatetime
        return this
    }


    /**
     * 设置「基于规则的分配」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setCrmUseAutoAssignment(Integer crmUseAutoAssignment) {
        this.crmUseAutoAssignment = crmUseAutoAssignment
        return this
    }


    /**
     * 设置「开票原则」值
     * 字典[开票原则]
     * @param val
     */
    ResConfigSettingsDTO setDefaultInvoicePolicy(String defaultInvoicePolicy) {
        this.defaultInvoicePolicy = defaultInvoicePolicy
        return this
    }


    /**
     * 设置「拣货策略」值
     * 字典[拣货策略]
     * @param val
     */
    ResConfigSettingsDTO setDefaultPickingPolicy(String defaultPickingPolicy) {
        this.defaultPickingPolicy = defaultPickingPolicy
        return this
    }


    /**
     * 设置「账单管理」值
     * 字典[账单管理]
     * @param val
     */
    ResConfigSettingsDTO setDefaultPurchaseMethod(String defaultPurchaseMethod) {
        this.defaultPurchaseMethod = defaultPurchaseMethod
        return this
    }


    /**
     * 设置「合同逾期延时预警」值
     * @param val
     */
    ResConfigSettingsDTO setDelayAlertContract(Integer delayAlertContract) {
        this.delayAlertContract = delayAlertContract
        return this
    }


    /**
     * 设置「摘要邮件」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setDigestEmails(Integer digestEmails) {
        this.digestEmails = digestEmails
        return this
    }


    /**
     * 设置「显示名称」值
     * @param val
     */
    ResConfigSettingsDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「使用自定义电子邮件服务器」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setExternalEmailServerDefault(Integer externalEmailServerDefault) {
        this.externalEmailServerDefault = externalEmailServerDefault
        return this
    }


    /**
     * 设置「失败的邮件」值
     * @param val
     */
    ResConfigSettingsDTO setFailCounter(Integer failCounter) {
        this.failCounter = failCounter
        return this
    }


    /**
     * 设置「Gmail 客户端 ID」值
     * @param val
     */
    ResConfigSettingsDTO setGoogleGmailClientIdentifier(String googleGmailClientIdentifier) {
        this.googleGmailClientIdentifier = googleGmailClientIdentifier
        return this
    }


    /**
     * 设置「Gmail客户端Secret」值
     * @param val
     */
    ResConfigSettingsDTO setGoogleGmailClientSecret(String googleGmailClientSecret) {
        this.googleGmailClientSecret = googleGmailClientSecret
        return this
    }


    /**
     * 设置「消息翻译 API 密钥」值
     * @param val
     */
    ResConfigSettingsDTO setGoogleTranslateApiKey(String googleTranslateApiKey) {
        this.googleTranslateApiKey = googleTranslateApiKey
        return this
    }


    /**
     * 设置「分析会计」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setGroupAnalyticAccounting(Integer groupAnalyticAccounting) {
        this.groupAnalyticAccounting = groupAnalyticAccounting
        return this
    }


    /**
     * 设置「团体申请人简历展示」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setGroupApplicantCvDisplay(Integer groupApplicantCvDisplay) {
        this.groupApplicantCvDisplay = groupApplicantCvDisplay
        return this
    }


    /**
     * 设置「锁定已确认的销售订单」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setGroupAutoDoneSetting(Integer groupAutoDoneSetting) {
        this.groupAutoDoneSetting = groupAutoDoneSetting
        return this
    }


    /**
     * 设置「现金舍入」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setGroupCashRounding(Integer groupCashRounding) {
        this.groupCashRounding = groupCashRounding
        return this
    }


    /**
     * 设置「折扣」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setGroupDiscountPerSoLine(Integer groupDiscountPerSoLine) {
        this.groupDiscountPerSoLine = groupDiscountPerSoLine
        return this
    }


    /**
     * 设置「在送货单上显示批次 / 序列号」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setGroupLotOnDeliverySlip(Integer groupLotOnDeliverySlip) {
        this.groupLotOnDeliverySlip = groupLotOnDeliverySlip
        return this
    }


    /**
     * 设置「在结算单上显示批次 / 序列号」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setGroupLotOnInvoice(Integer groupLotOnInvoice) {
        this.groupLotOnInvoice = groupLotOnInvoice
        return this
    }


    /**
     * 设置「邮件营销」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setGroupMassMailingCampaign(Integer groupMassMailingCampaign) {
        this.groupMassMailingCampaign = groupMassMailingCampaign
        return this
    }


    /**
     * 设置「副产品」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setGroupMrpByproducts(Integer groupMrpByproducts) {
        this.groupMrpByproducts = groupMrpByproducts
        return this
    }


    /**
     * 设置「制造订单分配报表」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setGroupMrpReceptionReport(Integer groupMrpReceptionReport) {
        this.groupMrpReceptionReport = groupMrpReceptionReport
        return this
    }


    /**
     * 设置「物料需求计划（MRP）工单」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setGroupMrpRoutings(Integer groupMrpRoutings) {
        this.groupMrpRoutings = groupMrpRoutings
        return this
    }


    /**
     * 设置「工单依赖性」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setGroupMrpWorkorderDependencies(Integer groupMrpWorkorderDependencies) {
        this.groupMrpWorkorderDependencies = groupMrpWorkorderDependencies
        return this
    }


    /**
     * 设置「多币别」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setGroupMultiCurrency(Integer groupMultiCurrency) {
        this.groupMultiCurrency = groupMultiCurrency
        return this
    }


    /**
     * 设置「价格表」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setGroupProductPricelist(Integer groupProductPricelist) {
        this.groupProductPricelist = groupProductPricelist
        return this
    }


    /**
     * 设置「变体」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setGroupProductVariant(Integer groupProductVariant) {
        this.groupProductVariant = groupProductVariant
        return this
    }


    /**
     * 设置「形式发票」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setGroupProformaSales(Integer groupProformaSales) {
        this.groupProformaSales = groupProformaSales
        return this
    }


    /**
     * 设置「里程碑」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setGroupProjectMilestone(Integer groupProjectMilestone) {
        this.groupProjectMilestone = groupProjectMilestone
        return this
    }


    /**
     * 设置「客户点评」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setGroupProjectRating(Integer groupProjectRating) {
        this.groupProjectRating = groupProjectRating
        return this
    }


    /**
     * 设置「周期任务」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setGroupProjectRecurringTasks(Integer groupProjectRecurringTasks) {
        this.groupProjectRecurringTasks = groupProjectRecurringTasks
        return this
    }


    /**
     * 设置「项目阶段」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setGroupProjectStages(Integer groupProjectStages) {
        this.groupProjectStages = groupProjectStages
        return this
    }


    /**
     * 设置「任务依赖」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setGroupProjectTaskDependencies(Integer groupProjectTaskDependencies) {
        this.groupProjectTaskDependencies = groupProjectTaskDependencies
        return this
    }


    /**
     * 设置「客户地址」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setGroupSaleDeliveryAddress(Integer groupSaleDeliveryAddress) {
        this.groupSaleDeliveryAddress = groupSaleDeliveryAddress
        return this
    }


    /**
     * 设置「报价模板」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setGroupSaleOrderTemplate(Integer groupSaleOrderTemplate) {
        this.groupSaleOrderTemplate = groupSaleOrderTemplate
        return this
    }


    /**
     * 设置「收货提醒」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setGroupSendReminder(Integer groupSendReminder) {
        this.groupSendReminder = groupSendReminder
        return this
    }


    /**
     * 设置「采购收据」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setGroupShowPurchaseReceipts(Integer groupShowPurchaseReceipts) {
        this.groupShowPurchaseReceipts = groupShowPurchaseReceipts
        return this
    }


    /**
     * 设置「销售收据」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setGroupShowSaleReceipts(Integer groupShowSaleReceipts) {
        this.groupShowSaleReceipts = groupShowSaleReceipts
        return this
    }


    /**
     * 设置「自动库存会计」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setGroupStockAccountingAutomatic(Integer groupStockAccountingAutomatic) {
        this.groupStockAccountingAutomatic = groupStockAccountingAutomatic
        return this
    }


    /**
     * 设置「多步路线」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setGroupStockAdvLocation(Integer groupStockAdvLocation) {
        this.groupStockAdvLocation = groupStockAdvLocation
        return this
    }


    /**
     * 设置「使用GS1编码格式打印批号和序列号」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setGroupStockLotPrintGs1(Integer groupStockLotPrintGs1) {
        this.groupStockLotPrintGs1 = groupStockLotPrintGs1
        return this
    }


    /**
     * 设置「储存位置」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setGroupStockMultiLocations(Integer groupStockMultiLocations) {
        this.groupStockMultiLocations = groupStockMultiLocations
        return this
    }


    /**
     * 设置「产品包装」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setGroupStockPackaging(Integer groupStockPackaging) {
        this.groupStockPackaging = groupStockPackaging
        return this
    }


    /**
     * 设置「批次 / 序列号」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setGroupStockProductionLot(Integer groupStockProductionLot) {
        this.groupStockProductionLot = groupStockProductionLot
        return this
    }


    /**
     * 设置「库存接收报表」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setGroupStockReceptionReport(Integer groupStockReceptionReport) {
        this.groupStockReceptionReport = groupStockReceptionReport
        return this
    }


    /**
     * 设置「签名」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setGroupStockSignDelivery(Integer groupStockSignDelivery) {
        this.groupStockSignDelivery = groupStockSignDelivery
        return this
    }


    /**
     * 设置「包裹」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setGroupStockTrackingLot(Integer groupStockTrackingLot) {
        this.groupStockTrackingLot = groupStockTrackingLot
        return this
    }


    /**
     * 设置「寄售」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setGroupStockTrackingOwner(Integer groupStockTrackingOwner) {
        this.groupStockTrackingOwner = groupStockTrackingOwner
        return this
    }


    /**
     * 设置「解锁制造订单」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setGroupUnlockedByDefault(Integer groupUnlockedByDefault) {
        this.groupUnlockedByDefault = groupUnlockedByDefault
        return this
    }


    /**
     * 设置「计量单位」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setGroupUom(Integer groupUom) {
        this.groupUom = groupUom
        return this
    }


    /**
     * 设置「线索」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setGroupUseLead(Integer groupUseLead) {
        this.groupUseLead = groupUseLead
        return this
    }


    /**
     * 设置「经常性收入」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setGroupUseRecurringRevenues(Integer groupUseRecurringRevenues) {
        this.groupUseRecurringRevenues = groupUseRecurringRevenues
        return this
    }


    /**
     * 设置「发票中的警告」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setGroupWarningAccount(Integer groupWarningAccount) {
        this.groupWarningAccount = groupWarningAccount
        return this
    }


    /**
     * 设置「采购警告」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setGroupWarningPurchase(Integer groupWarningPurchase) {
        this.groupWarningPurchase = groupWarningPurchase
        return this
    }


    /**
     * 设置「销售订单警告信息」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setGroupWarningSale(Integer groupWarningSale) {
        this.groupWarningSale = groupWarningSale
        return this
    }


    /**
     * 设置「库存警报」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setGroupWarningStock(Integer groupWarningStock) {
        this.groupWarningStock = groupWarningStock
        return this
    }


    /**
     * 设置「Has Accounting Entries」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setHasAccountingEntries(Integer hasAccountingEntries) {
        this.hasAccountingEntries = hasAccountingEntries
        return this
    }


    /**
     * 设置「Company has a chart of accounts」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setHasChartOfAccounts(Integer hasChartOfAccounts) {
        this.hasChartOfAccounts = hasChartOfAccounts
        return this
    }


    /**
     * 设置「员工编辑」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setHrEmployeeSelfEdit(Integer hrEmployeeSelfEdit) {
        this.hrEmployeeSelfEdit = hrEmployeeSelfEdit
        return this
    }


    /**
     * 设置「默认的费用别名」值
     * @param val
     */
    ResConfigSettingsDTO setHrExpenseAliasPrefix(String hrExpenseAliasPrefix) {
        this.hrExpenseAliasPrefix = hrExpenseAliasPrefix
        return this
    }


    /**
     * 设置「允许员工通过电子邮件记录费用」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setHrExpenseUseMailgateway(Integer hrExpenseUseMailgateway) {
        this.hrExpenseUseMailgateway = hrExpenseUseMailgateway
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    ResConfigSettingsDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「发票电子邮件模板」值
     * @param val
     */
    ResConfigSettingsDTO setInvoiceMailTemplateId(String invoiceMailTemplateId) {
        this.invoiceMailTemplateId = invoiceMailTemplateId
        return this
    }


    /**
     * 设置「PEPPOL 符合条件」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setIsAccountPeppolEligible(Integer isAccountPeppolEligible) {
        this.isAccountPeppolEligible = isAccountPeppolEligible
        return this
    }


    /**
     * 设置「销售模块是否已安装」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setIsInstalledSale(Integer isInstalledSale) {
        this.isInstalledSale = isInstalledSale
        return this
    }


    /**
     * 设置「多团队」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setIsMembershipMulti(Integer isMembershipMulti) {
        this.isMembershipMulti = isMembershipMulti
        return this
    }


    /**
     * 设置「是母公司」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setIsRootCompany(Integer isRootCompany) {
        this.isRootCompany = isRootCompany
        return this
    }


    /**
     * 设置「语言数量」值
     * @param val
     */
    ResConfigSettingsDTO setLanguageCount(Integer languageCount) {
        this.languageCount = languageCount
        return this
    }


    /**
     * 设置「自动丰富线索」值
     * 字典[自动丰富线索]
     * @param val
     */
    ResConfigSettingsDTO setLeadEnrichAuto(String leadEnrichAuto) {
        this.leadEnrichAuto = leadEnrichAuto
        return this
    }


    /**
     * 设置「直接从商机商机创建线索挖掘申请。」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setLeadMiningInPipeline(Integer leadMiningInPipeline) {
        this.leadMiningInPipeline = leadMiningInPipeline
        return this
    }


    /**
     * 设置「锁定已确认的订单」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setLockConfirmedPo(Integer lockConfirmedPo) {
        this.lockConfirmedPo = lockConfirmedPo
        return this
    }


    /**
     * 设置「专门服务器」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setMassMailingOutgoingMailServer(Integer massMailingOutgoingMailServer) {
        this.massMailingOutgoingMailServer = massMailingOutgoingMailServer
        return this
    }


    /**
     * 设置「24小时统计邮寄报告」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setMassMailingReports(Integer massMailingReports) {
        this.massMailingReports = massMailingReports
        return this
    }


    /**
     * 设置「拆分名字和姓氏」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setMassMailingSplitContactName(Integer massMailingSplitContactName) {
        this.massMailingSplitContactName = massMailingSplitContactName
        return this
    }


    /**
     * 设置「3单匹配:采购订单，收货单与发票」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setModuleAccount3wayMatch(Integer moduleAccount3wayMatch) {
        this.moduleAccount3wayMatch = moduleAccount3wayMatch
        return this
    }


    /**
     * 设置「会计」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setModuleAccountAccountant(Integer moduleAccountAccountant) {
        this.moduleAccountAccountant = moduleAccountAccountant
        return this
    }


    /**
     * 设置「Bank Statement Digitization」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setModuleAccountBankStatementExtract(Integer moduleAccountBankStatementExtract) {
        this.moduleAccountBankStatementExtract = moduleAccountBankStatementExtract
        return this
    }


    /**
     * 设置「以CAMT.053 格式导入」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setModuleAccountBankStatementImportCamt(Integer moduleAccountBankStatementImportCamt) {
        this.moduleAccountBankStatementImportCamt = moduleAccountBankStatementImportCamt
        return this
    }


    /**
     * 设置「以.csv、.xls和.xlsx格式导入」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setModuleAccountBankStatementImportCsv(Integer moduleAccountBankStatementImportCsv) {
        this.moduleAccountBankStatementImportCsv = moduleAccountBankStatementImportCsv
        return this
    }


    /**
     * 设置「以.ofx格式导入」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setModuleAccountBankStatementImportOfx(Integer moduleAccountBankStatementImportOfx) {
        this.moduleAccountBankStatementImportOfx = moduleAccountBankStatementImportOfx
        return this
    }


    /**
     * 设置「导入.qif单据」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setModuleAccountBankStatementImportQif(Integer moduleAccountBankStatementImportQif) {
        this.moduleAccountBankStatementImportQif = moduleAccountBankStatementImportQif
        return this
    }


    /**
     * 设置「使用批量付款」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setModuleAccountBatchPayment(Integer moduleAccountBatchPayment) {
        this.moduleAccountBatchPayment = moduleAccountBatchPayment
        return this
    }


    /**
     * 设置「预算管理」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setModuleAccountBudget(Integer moduleAccountBudget) {
        this.moduleAccountBudget = moduleAccountBudget
        return this
    }


    /**
     * 设置「Allow check printing and deposits」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setModuleAccountCheckPrinting(Integer moduleAccountCheckPrinting) {
        this.moduleAccountCheckPrinting = moduleAccountCheckPrinting
        return this
    }


    /**
     * 设置「Document Digitization」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setModuleAccountExtract(Integer moduleAccountExtract) {
        this.moduleAccountExtract = moduleAccountExtract
        return this
    }


    /**
     * 设置「管理公司间交易」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setModuleAccountInterCompanyRules(Integer moduleAccountInterCompanyRules) {
        this.moduleAccountInterCompanyRules = moduleAccountInterCompanyRules
        return this
    }


    /**
     * 设置「国际联盟」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setModuleAccountIntrastat(Integer moduleAccountIntrastat) {
        this.moduleAccountIntrastat = moduleAccountIntrastat
        return this
    }


    /**
     * 设置「Invoice Digitization」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setModuleAccountInvoiceExtract(Integer moduleAccountInvoiceExtract) {
        this.moduleAccountInvoiceExtract = moduleAccountInvoiceExtract
        return this
    }


    /**
     * 设置「SEPA Credit Transfer / ISO20022」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setModuleAccountIso20022(Integer moduleAccountIso20022) {
        this.moduleAccountIso20022 = moduleAccountIso20022
        return this
    }


    /**
     * 设置「Invoice Online Payment」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setModuleAccountPayment(Integer moduleAccountPayment) {
        this.moduleAccountPayment = moduleAccountPayment
        return this
    }


    /**
     * 设置「PEPPOL 开具发票」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setModuleAccountPeppol(Integer moduleAccountPeppol) {
        this.moduleAccountPeppol = moduleAccountPeppol
        return this
    }


    /**
     * 设置「Dynamic Reports」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setModuleAccountReports(Integer moduleAccountReports) {
        this.moduleAccountReports = moduleAccountReports
        return this
    }


    /**
     * 设置「Use SEPA Direct Debit」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setModuleAccountSepaDirectDebit(Integer moduleAccountSepaDirectDebit) {
        this.moduleAccountSepaDirectDebit = moduleAccountSepaDirectDebit
        return this
    }


    /**
     * 设置「LDAP认证」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setModuleAuthLdap(Integer moduleAuthLdap) {
        this.moduleAuthLdap = moduleAuthLdap
        return this
    }


    /**
     * 设置「使用外部验证提供者 (OAuth)」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setModuleAuthOauth(Integer moduleAuthOauth) {
        this.moduleAuthOauth = moduleAuthOauth
        return this
    }


    /**
     * 设置「地理定位」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setModuleBaseGeolocalize(Integer moduleBaseGeolocalize) {
        this.moduleBaseGeolocalize = moduleBaseGeolocalize
        return this
    }


    /**
     * 设置「允许用户导入 CSV/XLS/XLSX/ODS格式的文档数据」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setModuleBaseImport(Integer moduleBaseImport) {
        this.moduleBaseImport = moduleBaseImport
        return this
    }


    /**
     * 设置「根据线索的电子邮箱地址、使用公司数据自动丰富线索。」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setModuleCrmIapEnrich(Integer moduleCrmIapEnrich) {
        this.moduleCrmIapEnrich = moduleCrmIapEnrich
        return this
    }


    /**
     * 设置「基于国家/地区、行业、规模等信息生成新的线索。」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setModuleCrmIapMine(Integer moduleCrmIapMine) {
        this.moduleCrmIapMine = moduleCrmIapMine
        return this
    }


    /**
     * 设置「自动汇率」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setModuleCurrencyRateLive(Integer moduleCurrencyRateLive) {
        this.moduleCurrencyRateLive = moduleCurrencyRateLive
        return this
    }


    /**
     * 设置「交付方式」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setModuleDelivery(Integer moduleDelivery) {
        this.moduleDelivery = moduleDelivery
        return this
    }


    /**
     * 设置「bpost连接器」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setModuleDeliveryBpost(Integer moduleDeliveryBpost) {
        this.moduleDeliveryBpost = moduleDeliveryBpost
        return this
    }


    /**
     * 设置「DHL快递连接器」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setModuleDeliveryDhl(Integer moduleDeliveryDhl) {
        this.moduleDeliveryDhl = moduleDeliveryDhl
        return this
    }


    /**
     * 设置「Easypost连接器」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setModuleDeliveryEasypost(Integer moduleDeliveryEasypost) {
        this.moduleDeliveryEasypost = moduleDeliveryEasypost
        return this
    }


    /**
     * 设置「FedEx连接器」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setModuleDeliveryFedex(Integer moduleDeliveryFedex) {
        this.moduleDeliveryFedex = moduleDeliveryFedex
        return this
    }


    /**
     * 设置「Sendcloud连接器」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setModuleDeliverySendcloud(Integer moduleDeliverySendcloud) {
        this.moduleDeliverySendcloud = moduleDeliverySendcloud
        return this
    }


    /**
     * 设置「Shiprocket 连接器」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setModuleDeliveryShiprocket(Integer moduleDeliveryShiprocket) {
        this.moduleDeliveryShiprocket = moduleDeliveryShiprocket
        return this
    }


    /**
     * 设置「Starshipit 连接器」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setModuleDeliveryStarshipit(Integer moduleDeliveryStarshipit) {
        this.moduleDeliveryStarshipit = moduleDeliveryStarshipit
        return this
    }


    /**
     * 设置「UPS连接器」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setModuleDeliveryUps(Integer moduleDeliveryUps) {
        this.moduleDeliveryUps = moduleDeliveryUps
        return this
    }


    /**
     * 设置「USPS连接器」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setModuleDeliveryUsps(Integer moduleDeliveryUsps) {
        this.moduleDeliveryUsps = moduleDeliveryUsps
        return this
    }


    /**
     * 设置「允许用户同步谷歌日历」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setModuleGoogleCalendar(Integer moduleGoogleCalendar) {
        this.moduleGoogleCalendar = moduleGoogleCalendar
        return this
    }


    /**
     * 设置「支持Gmail身份验证」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setModuleGoogleGmail(Integer moduleGoogleGmail) {
        this.moduleGoogleGmail = moduleGoogleGmail
        return this
    }


    /**
     * 设置「验证码」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setModuleGoogleRecaptcha(Integer moduleGoogleRecaptcha) {
        this.moduleGoogleRecaptcha = moduleGoogleRecaptcha
        return this
    }


    /**
     * 设置「向OCR发送账单以产生费用」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setModuleHrExpenseExtract(Integer moduleHrExpenseExtract) {
        this.moduleHrExpenseExtract = moduleHrExpenseExtract
        return this
    }


    /**
     * 设置「远程工作」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setModuleHrHomeworking(Integer moduleHrHomeworking) {
        this.moduleHrHomeworking = moduleHrHomeworking
        return this
    }


    /**
     * 设置「工资单上的报销费用」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setModuleHrPayrollExpense(Integer moduleHrPayrollExpense) {
        this.moduleHrPayrollExpense = moduleHrPayrollExpense
        return this
    }


    /**
     * 设置「高级出席控制」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setModuleHrPresence(Integer moduleHrPresence) {
        this.moduleHrPresence = moduleHrPresence
        return this
    }


    /**
     * 设置「将简历发送到 OCR 以填写申请」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setModuleHrRecruitmentExtract(Integer moduleHrRecruitmentExtract) {
        this.moduleHrRecruitmentExtract = moduleHrRecruitmentExtract
        return this
    }


    /**
     * 设置「面试表单」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setModuleHrRecruitmentSurvey(Integer moduleHrRecruitmentSurvey) {
        this.moduleHrRecruitmentSurvey = moduleHrRecruitmentSurvey
        return this
    }


    /**
     * 设置「技能管理」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setModuleHrSkills(Integer moduleHrSkills) {
        this.moduleHrSkills = moduleHrSkills
        return this
    }


    /**
     * 设置「任务日志」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setModuleHrTimesheet(Integer moduleHrTimesheet) {
        this.moduleHrTimesheet = moduleHrTimesheet
        return this
    }


    /**
     * 设置「欧盟共同体内部远程销售」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setModuleL10nEuOss(Integer moduleL10nEuOss) {
        this.moduleL10nEuOss = moduleL10nEuOss
        return this
    }


    /**
     * 设置「促销、优惠券、礼品卡和会员方案」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setModuleLoyalty(Integer moduleLoyalty) {
        this.moduleLoyalty = moduleLoyalty
        return this
    }


    /**
     * 设置「允许与邮件插件集成」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setModuleMailPlugin(Integer moduleMailPlugin) {
        this.moduleMailPlugin = moduleMailPlugin
        return this
    }


    /**
     * 设置「定制维护工作表」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setModuleMaintenanceWorksheet(Integer moduleMaintenanceWorksheet) {
        this.moduleMaintenanceWorksheet = moduleMaintenanceWorksheet
        return this
    }


    /**
     * 设置「允许用户同步Outlook日历」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setModuleMicrosoftCalendar(Integer moduleMicrosoftCalendar) {
        this.moduleMicrosoftCalendar = moduleMicrosoftCalendar
        return this
    }


    /**
     * 设置「支持Outlook身份验证」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setModuleMicrosoftOutlook(Integer moduleMicrosoftOutlook) {
        this.moduleMicrosoftOutlook = moduleMicrosoftOutlook
        return this
    }


    /**
     * 设置「主生产计划」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setModuleMrpMps(Integer moduleMrpMps) {
        this.moduleMrpMps = moduleMrpMps
        return this
    }


    /**
     * 设置「产品生命周期管理（PLM）」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setModuleMrpPlm(Integer moduleMrpPlm) {
        this.moduleMrpPlm = moduleMrpPlm
        return this
    }


    /**
     * 设置「外包」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setModuleMrpSubcontracting(Integer moduleMrpSubcontracting) {
        this.moduleMrpSubcontracting = moduleMrpSubcontracting
        return this
    }


    /**
     * 设置「合作伙伴自动完成」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setModulePartnerAutocomplete(Integer modulePartnerAutocomplete) {
        this.modulePartnerAutocomplete = modulePartnerAutocomplete
        return this
    }


    /**
     * 设置「特定的电子邮件」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setModuleProductEmailTemplate(Integer moduleProductEmailTemplate) {
        this.moduleProductEmailTemplate = moduleProductEmailTemplate
        return this
    }


    /**
     * 设置「到期日期」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setModuleProductExpiry(Integer moduleProductExpiry) {
        this.moduleProductExpiry = moduleProductExpiry
        return this
    }


    /**
     * 设置「使用条形码获取产品图片」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setModuleProductImages(Integer moduleProductImages) {
        this.moduleProductImages = moduleProductImages
        return this
    }


    /**
     * 设置「允许产品毛利」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setModuleProductMargin(Integer moduleProductMargin) {
        this.moduleProductMargin = moduleProductMargin
        return this
    }


    /**
     * 设置「采购表格入口」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setModulePurchaseProductMatrix(Integer modulePurchaseProductMatrix) {
        this.modulePurchaseProductMatrix = modulePurchaseProductMatrix
        return this
    }


    /**
     * 设置「采购协议」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setModulePurchaseRequisition(Integer modulePurchaseRequisition) {
        this.modulePurchaseRequisition = modulePurchaseRequisition
        return this
    }


    /**
     * 设置「质量」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setModuleQualityControl(Integer moduleQualityControl) {
        this.moduleQualityControl = moduleQualityControl
        return this
    }


    /**
     * 设置「质量工作表」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setModuleQualityControlWorksheet(Integer moduleQualityControlWorksheet) {
        this.moduleQualityControlWorksheet = moduleQualityControlWorksheet
        return this
    }


    /**
     * 设置「亚马逊同步」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setModuleSaleAmazon(Integer moduleSaleAmazon) {
        this.moduleSaleAmazon = moduleSaleAmazon
        return this
    }


    /**
     * 设置「佣金」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setModuleSaleCommission(Integer moduleSaleCommission) {
        this.moduleSaleCommission = moduleSaleCommission
        return this
    }


    /**
     * 设置「优惠券和会员」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setModuleSaleLoyalty(Integer moduleSaleLoyalty) {
        this.moduleSaleLoyalty = moduleSaleLoyalty
        return this
    }


    /**
     * 设置「毛利」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setModuleSaleMargin(Integer moduleSaleMargin) {
        this.moduleSaleMargin = moduleSaleMargin
        return this
    }


    /**
     * 设置「PDF 报价生成器」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setModuleSalePdfQuoteBuilder(Integer moduleSalePdfQuoteBuilder) {
        this.moduleSalePdfQuoteBuilder = moduleSalePdfQuoteBuilder
        return this
    }


    /**
     * 设置「销售表格录入」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setModuleSaleProductMatrix(Integer moduleSaleProductMatrix) {
        this.moduleSaleProductMatrix = moduleSaleProductMatrix
        return this
    }


    /**
     * 设置「短信息」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setModuleSms(Integer moduleSms) {
        this.moduleSms = moduleSms
        return this
    }


    /**
     * 设置「传统信件」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setModuleSnailmailAccount(Integer moduleSnailmailAccount) {
        this.moduleSnailmailAccount = moduleSnailmailAccount
        return this
    }


    /**
     * 设置「条码扫描器」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setModuleStockBarcode(Integer moduleStockBarcode) {
        this.moduleStockBarcode = moduleStockBarcode
        return this
    }


    /**
     * 设置「库存条形码数据库」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setModuleStockBarcodeBarcodelookup(Integer moduleStockBarcodeBarcodelookup) {
        this.moduleStockBarcodeBarcodelookup = moduleStockBarcodeBarcodelookup
        return this
    }


    /**
     * 设置「代发货」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setModuleStockDropshipping(Integer moduleStockDropshipping) {
        this.moduleStockDropshipping = moduleStockDropshipping
        return this
    }


    /**
     * 设置「配送管理系统」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setModuleStockFleet(Integer moduleStockFleet) {
        this.moduleStockFleet = moduleStockFleet
        return this
    }


    /**
     * 设置「到岸成本」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setModuleStockLandedCosts(Integer moduleStockLandedCosts) {
        this.moduleStockLandedCosts = moduleStockLandedCosts
        return this
    }


    /**
     * 设置「批量、波次和集群调拨」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setModuleStockPickingBatch(Integer moduleStockPickingBatch) {
        this.moduleStockPickingBatch = moduleStockPickingBatch
        return this
    }


    /**
     * 设置「短信息确认」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setModuleStockSms(Integer moduleStockSms) {
        this.moduleStockSms = moduleStockSms
        return this
    }


    /**
     * 设置「网络电话」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setModuleVoip(Integer moduleVoip) {
        this.moduleVoip = moduleVoip
        return this
    }


    /**
     * 设置「Unsplash图像库」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setModuleWebUnsplash(Integer moduleWebUnsplash) {
        this.moduleWebUnsplash = moduleWebUnsplash
        return this
    }


    /**
     * 设置「Cloudflare Turnstile」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setModuleWebsiteCfTurnstile(Integer moduleWebsiteCfTurnstile) {
        this.moduleWebsiteCfTurnstile = moduleWebsiteCfTurnstile
        return this
    }


    /**
     * 设置「从网站流量创建线索/商机」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setModuleWebsiteCrmIapReveal(Integer moduleWebsiteCrmIapReveal) {
        this.moduleWebsiteCrmIapReveal = moduleWebsiteCrmIapReveal
        return this
    }


    /**
     * 设置「线上发布」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setModuleWebsiteHrRecruitment(Integer moduleWebsiteHrRecruitment) {
        this.moduleWebsiteHrRecruitment = moduleWebsiteHrRecruitment
        return this
    }


    /**
     * 设置「对公司有利的宽容时间」值
     * @param val
     */
    ResConfigSettingsDTO setOvertimeCompanyThreshold(Integer overtimeCompanyThreshold) {
        this.overtimeCompanyThreshold = overtimeCompanyThreshold
        return this
    }


    /**
     * 设置「对员工有利的宽容时间」值
     * @param val
     */
    ResConfigSettingsDTO setOvertimeEmployeeThreshold(Integer overtimeEmployeeThreshold) {
        this.overtimeEmployeeThreshold = overtimeEmployeeThreshold
        return this
    }


    /**
     * 设置「信用不足」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setPartnerAutocompleteInsufficientCredit(Integer partnerAutocompleteInsufficientCredit) {
        this.partnerAutocompleteInsufficientCredit = partnerAutocompleteInsufficientCredit
        return this
    }


    /**
     * 设置「在线支付发票」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setPayInvoicesOnline(Integer payInvoicesOnline) {
        this.payInvoicesOnline = payInvoicesOnline
        return this
    }


    /**
     * 设置「订单审批」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setPoOrderApproval(Integer poOrderApproval) {
        this.poOrderApproval = poOrderApproval
        return this
    }


    /**
     * 设置「客户 API 密钥」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setPortalAllowApiKeys(Integer portalAllowApiKeys) {
        this.portalAllowApiKeys = portalAllowApiKeys
        return this
    }


    /**
     * 设置「预测线索评分字段标签」值
     * @param val
     */
    ResConfigSettingsDTO setPredictiveLeadScoringFieldLabels(String predictiveLeadScoringFieldLabels) {
        this.predictiveLeadScoringFieldLabels = predictiveLeadScoringFieldLabels
        return this
    }


    /**
     * 设置「字符串中的线索评分频率字段」值
     * @param val
     */
    ResConfigSettingsDTO setPredictiveLeadScoringFieldsStr(String predictiveLeadScoringFieldsStr) {
        this.predictiveLeadScoringFieldsStr = predictiveLeadScoringFieldsStr
        return this
    }


    /**
     * 设置「线索评分开始日期」值
     * @param val
     */
    ResConfigSettingsDTO setPredictiveLeadScoringStartDate(Timestamp predictiveLeadScoringStartDate) {
        this.predictiveLeadScoringStartDate = predictiveLeadScoringStartDate
        return this
    }


    /**
     * 设置「字符串中的线索评分开始日期」值
     * @param val
     */
    ResConfigSettingsDTO setPredictiveLeadScoringStartDateStr(String predictiveLeadScoringStartDateStr) {
        this.predictiveLeadScoringStartDateStr = predictiveLeadScoringStartDateStr
        return this
    }


    /**
     * 设置「Display preview button」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setPreviewReady(Integer previewReady) {
        this.previewReady = previewReady
        return this
    }


    /**
     * 设置「体积单位」值
     * 字典[体积单位]
     * @param val
     */
    ResConfigSettingsDTO setProductVolumeVolumeInCubicFeet(String productVolumeVolumeInCubicFeet) {
        this.productVolumeVolumeInCubicFeet = productVolumeVolumeInCubicFeet
        return this
    }


    /**
     * 设置「重量单位」值
     * 字典[重量单位]
     * @param val
     */
    ResConfigSettingsDTO setProductWeightInLbs(String productWeightInLbs) {
        this.productWeightInLbs = productWeightInLbs
        return this
    }


    /**
     * 设置「启用分析直到」值
     * @param val
     */
    ResConfigSettingsDTO setProfilingEnabledUntil(Timestamp profilingEnabledUntil) {
        this.profilingEnabledUntil = profilingEnabledUntil
        return this
    }


    /**
     * 设置「限制模板渲染」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setRestrictTemplateRendering(Integer restrictTemplateRendering) {
        this.restrictTemplateRendering = restrictTemplateRendering
        return this
    }


    /**
     * 设置「SFU 服务器密钥」值
     * @param val
     */
    ResConfigSettingsDTO setSfuServerKey(String sfuServerKey) {
        this.sfuServerKey = sfuServerKey
        return this
    }


    /**
     * 设置「SFU 服务器 URL」值
     * @param val
     */
    ResConfigSettingsDTO setSfuServerUrl(String sfuServerUrl) {
        this.sfuServerUrl = sfuServerUrl
        return this
    }


    /**
     * 设置「退订时黑名单选项」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setShowBlacklistButtons(Integer showBlacklistButtons) {
        this.showBlacklistButtons = showBlacklistButtons
        return this
    }


    /**
     * 设置「显示效果」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setShowEffect(Integer showEffect) {
        this.showEffect = showEffect
        return this
    }


    /**
     * 设置「蜗牛邮件封面只读」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setSnailmailCoverReadonly(Integer snailmailCoverReadonly) {
        this.snailmailCoverReadonly = snailmailCoverReadonly
        return this
    }


    /**
     * 设置「Tenor API 密钥」值
     * @param val
     */
    ResConfigSettingsDTO setTenorApiKey(String tenorApiKey) {
        this.tenorApiKey = tenorApiKey
        return this
    }


    /**
     * 设置「Tenor 内容过滤器」值
     * 字典[Tenor 内容过滤器]
     * @param val
     */
    ResConfigSettingsDTO setTenorContentFilter(String tenorContentFilter) {
        this.tenorContentFilter = tenorContentFilter
        return this
    }


    /**
     * 设置「Tenor Gif 限额」值
     * @param val
     */
    ResConfigSettingsDTO setTenorGifLimit(Integer tenorGifLimit) {
        this.tenorGifLimit = tenorGifLimit
        return this
    }


    /**
     * 设置「Twilio 帐户 SID」值
     * @param val
     */
    ResConfigSettingsDTO setTwilioAccountSid(String twilioAccountSid) {
        this.twilioAccountSid = twilioAccountSid
        return this
    }


    /**
     * 设置「Twilio 帐户身份验证令牌」值
     * @param val
     */
    ResConfigSettingsDTO setTwilioAccountToken(String twilioAccountToken) {
        this.twilioAccountToken = twilioAccountToken
        return this
    }


    /**
     * 设置「访问秘钥」值
     * @param val
     */
    ResConfigSettingsDTO setUnsplashAccessKey(String unsplashAccessKey) {
        this.unsplashAccessKey = unsplashAccessKey
        return this
    }


    /**
     * 设置「应用程序ID」值
     * @param val
     */
    ResConfigSettingsDTO setUnsplashAppId(String unsplashAppId) {
        this.unsplashAppId = unsplashAppId
        return this
    }


    /**
     * 设置「默认条款和条件」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setUseInvoiceTerms(Integer useInvoiceTerms) {
        this.useInvoiceTerms = useInvoiceTerms
        return this
    }


    /**
     * 设置「默认制造提前期」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setUseManufacturingLead(Integer useManufacturingLead) {
        this.useManufacturingLead = useManufacturingLead
        return this
    }


    /**
     * 设置「安全交货时间」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setUsePoLead(Integer usePoLead) {
        this.usePoLead = usePoLead
        return this
    }


    /**
     * 设置「销售的安全提前期」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setUseSecurityLead(Integer useSecurityLead) {
        this.useSecurityLead = useSecurityLead
        return this
    }


    /**
     * 设置「使用 Twilio ICE 服务器」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setUseTwilioRtcServers(Integer useTwilioRtcServers) {
        this.useTwilioRtcServers = useTwilioRtcServers
        return this
    }


    /**
     * 设置「默认访问权限」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setUserDefaultRights(Integer userDefaultRights) {
        this.userDefaultRights = userDefaultRights
        return this
    }


    /**
     * 设置「网络应用程序名称」值
     * @param val
     */
    ResConfigSettingsDTO setWebAppName(String webAppName) {
        this.webAppName = webAppName
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    ResConfigSettingsDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    ResConfigSettingsDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
