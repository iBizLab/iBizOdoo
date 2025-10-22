# 人力资源(hr) <!-- {docsify-ignore-all} -->



### 实体

|    名称col200   | 代码名col150      |  实体类型col150   | 存储模式col100 | 表名称col200   |    联合主键col100   |  主状态col100   |  权限控制col150  |  启用审计col100    |  备注col500  |
| --------  |------------| -----   |  --------|  --------|  --------|    -------- | -------- | -------- |-------- |
|[申请人(HR_APPLICANT)](module/hr/hr_applicant)|hr_applicant|主实体|SQL|hr_applicant|否|否|自控制|否||
|[申请人类别(HR_APPLICANT_CATEGORY)](module/hr/hr_applicant_category)|hr_applicant_category|主实体|SQL|hr_applicant_category|否|否|自控制|否||
|[拒绝原因 申请人(HR_APPLICANT_REFUSE_REASON)](module/hr/hr_applicant_refuse_reason)|hr_applicant_refuse_reason|主实体|SQL|hr_applicant_refuse_reason|否|否|自控制|否||
|[出勤(HR_ATTENDANCE)](module/hr/hr_attendance)|hr_attendance|主实体|SQL|hr_attendance|否|否|自控制|否||
|[出勤 加班(HR_ATTENDANCE_OVERTIME)](module/hr/hr_attendance_overtime)|hr_attendance_overtime|主实体|SQL|hr_attendance_overtime|否|否|自控制|否||
|[应聘人(HR_CANDIDATE)](module/hr/hr_candidate)|hr_candidate|主实体|SQL|hr_candidate|否|否|自控制|否||
|[候选人的技能水平(HR_CANDIDATE_SKILL)](module/hr/hr_candidate_skill)|hr_candidate_skill|主实体|SQL|hr_candidate_skill|否|否|自控制|否||
|[员工合同(HR_CONTRACT)](module/hr/hr_contract)|hr_contract|主实体|SQL|hr_contract|否|否|自控制|否||
|[合同历史(HR_CONTRACT_HISTORY)](module/hr/hr_contract_history)|hr_contract_history|主实体|SQL|hr_contract_history|否|否|自控制|否||
|[合同类型(HR_CONTRACT_TYPE)](module/hr/hr_contract_type)|hr_contract_type|主实体|SQL|hr_contract_type|否|否|自控制|否||
|[部门(HR_DEPARTMENT)](module/hr/hr_department)|hr_department|主实体|SQL|hr_department|否|否|自控制|否||
|[离职原因(HR_DEPARTURE_REASON)](module/hr/hr_departure_reason)|hr_departure_reason|主实体|SQL|hr_departure_reason|否|否|自控制|否||
|[离职向导(HR_DEPARTURE_WIZARD)](module/hr/hr_departure_wizard)|hr_departure_wizard|主实体|SQL|hr_departure_wizard|否|否|自控制|否||
|[员工(HR_EMPLOYEE)](module/hr/hr_employee)|hr_employee|主实体|SQL|hr_employee|否|否|自控制|否||
|[基本员工(HR_EMPLOYEE_BASE)](module/hr/hr_employee_base)|hr_employee_base|抽象实体|无存储||否|否|自控制|否||
|[员工类别(HR_EMPLOYEE_CATEGORY)](module/hr/hr_employee_category)|hr_employee_category|主实体|SQL|hr_employee_category|否|否|自控制|否||
|[打印简历(HR_EMPLOYEE_CV_WIZARD)](module/hr/hr_employee_cv_wizard)|hr_employee_cv_wizard|主实体|SQL|hr_employee_cv_wizard|否|否|自控制|否||
|[公共员工(HR_EMPLOYEE_PUBLIC)](module/hr/hr_employee_public)|hr_employee_public|主实体|SQL|hr_employee_public|否|否|自控制|否||
|[员工的技能等级(HR_EMPLOYEE_SKILL)](module/hr/hr_employee_skill)|hr_employee_skill|主实体|SQL|hr_employee_skill|否|否|自控制|否||
|[技能历史(HR_EMPLOYEE_SKILL_LOG)](module/hr/hr_employee_skill_log)|hr_employee_skill_log|主实体|SQL|hr_employee_skill_log|否|否|自控制|否||
|[员工技能报表(HR_EMPLOYEE_SKILL_REPORT)](module/hr/hr_employee_skill_report)|hr_employee_skill_report|主实体|SQL|hr_employee_skill_report|否|否|自控制|否||
|[费用(HR_EXPENSE)](module/hr/hr_expense)|hr_expense|主实体|SQL|hr_expense|否|否|自控制|否||
|[费用批准重复(HR_EXPENSE_APPROVE_DUPLICATE)](module/hr/hr_expense_approve_duplicate)|hr_expense_approve_duplicate|主实体|SQL|hr_expense_approve_duplicate|否|否|自控制|否||
|[费用拒绝原因向导(HR_EXPENSE_REFUSE_WIZARD)](module/hr/hr_expense_refuse_wizard)|hr_expense_refuse_wizard|主实体|SQL|hr_expense_refuse_wizard|否|否|自控制|否||
|[费用报表(HR_EXPENSE_SHEET)](module/hr/hr_expense_sheet)|hr_expense_sheet|主实体|SQL|hr_expense_sheet|否|否|自控制|否||
|[费用分摊(HR_EXPENSE_SPLIT)](module/hr/hr_expense_split)|hr_expense_split|主实体|SQL|hr_expense_split|否|否|自控制|否||
|[费用拆分向导(HR_EXPENSE_SPLIT_WIZARD)](module/hr/hr_expense_split_wizard)|hr_expense_split_wizard|主实体|SQL|hr_expense_split_wizard|否|否|自控制|否||
|[取消休假向导(HR_HOLIDAYS_CANCEL_LEAVE)](module/hr/hr_holidays_cancel_leave)|hr_holidays_cancel_leave|主实体|SQL|hr_holidays_cancel_leave|否|否|自控制|否||
|[员工休假总结报表(HR_HOLIDAYS_SUMMARY_EMPLOYEE)](module/hr/hr_holidays_summary_employee)|hr_holidays_summary_employee|主实体|SQL|hr_holidays_summary_employee|否|否|自控制|否||
|[工作岗位(HR_JOB)](module/hr/hr_job)|hr_job|主实体|SQL|hr_job|否|否|自控制|否||
|[招聘平台(HR_JOB_PLATFORM)](module/hr/hr_job_platform)|hr_job_platform|主实体|SQL|hr_job_platform|否|否|自控制|否||
|[休假(HR_LEAVE)](module/hr/hr_leave)|hr_leave|主实体|SQL|hr_leave|否|否|自控制|否||
|[应计方案等级(HR_LEAVE_ACCRUAL_LEVEL)](module/hr/hr_leave_accrual_level)|hr_leave_accrual_level|主实体|SQL|hr_leave_accrual_level|否|否|自控制|否||
|[应计方案(HR_LEAVE_ACCRUAL_PLAN)](module/hr/hr_leave_accrual_plan)|hr_leave_accrual_plan|主实体|SQL|hr_leave_accrual_plan|否|否|自控制|否||
|[休息分配(HR_LEAVE_ALLOCATION)](module/hr/hr_leave_allocation)|hr_leave_allocation|主实体|SQL|hr_leave_allocation|否|否|自控制|否||
|[为多名员工生成休假时间分配(HR_LEAVE_ALLOCATION_GENERATE_MULTI_WIZARD)](module/hr/hr_leave_allocation_generate_multi_wizard)|hr_leave_allocation_generate_multi_wizard|主实体|SQL|hr_leave_allocation_generate_multi_wizard|否|否|自控制|否||
|[摘要 / 报表(HR_LEAVE_EMPLOYEE_TYPE_REPORT)](module/hr/hr_leave_employee_type_report)|hr_leave_employee_type_report|主实体|SQL|hr_leave_employee_type_report|否|否|自控制|否||
|[为多名员工生成休假时间(HR_LEAVE_GENERATE_MULTI_WIZARD)](module/hr/hr_leave_generate_multi_wizard)|hr_leave_generate_multi_wizard|主实体|SQL|hr_leave_generate_multi_wizard|否|否|自控制|否||
|[强制工作日(HR_LEAVE_MANDATORY_DAY)](module/hr/hr_leave_mandatory_day)|hr_leave_mandatory_day|主实体|SQL|hr_leave_mandatory_day|否|否|自控制|否||
|[摘要 / 报表(HR_LEAVE_REPORT)](module/hr/hr_leave_report)|hr_leave_report|主实体|SQL|hr_leave_report|否|否|自控制|否||
|[休假日历(HR_LEAVE_REPORT_CALENDAR)](module/hr/hr_leave_report_calendar)|hr_leave_report_calendar|主实体|SQL|hr_leave_report_calendar|否|否|自控制|否||
|[休假类型(HR_LEAVE_TYPE)](module/hr/hr_leave_type)|hr_leave_type|主实体|SQL|hr_leave_type|否|否|自控制|否||
|[人力资源经理部门报告(HR_MANAGER_DEPARTMENT_REPORT)](module/hr/hr_manager_department_report)|hr_manager_department_report|主实体|SQL|hr_manager_department_report|否|否|自控制|否||
|[工资结构类型(HR_PAYROLL_STRUCTURE_TYPE)](module/hr/hr_payroll_structure_type)|hr_payroll_structure_type|主实体|SQL|hr_payroll_structure_type|否|否|自控制|否||
|[申请人学历(HR_RECRUITMENT_DEGREE)](module/hr/hr_recruitment_degree)|hr_recruitment_degree|主实体|SQL|hr_recruitment_degree|否|否|自控制|否||
|[申请人来源(HR_RECRUITMENT_SOURCE)](module/hr/hr_recruitment_source)|hr_recruitment_source|主实体|SQL|hr_recruitment_source|否|否|自控制|否||
|[招聘阶段(HR_RECRUITMENT_STAGE)](module/hr/hr_recruitment_stage)|hr_recruitment_stage|主实体|SQL|hr_recruitment_stage|否|否|自控制|否||
|[员工的简历明细(HR_RESUME_LINE)](module/hr/hr_resume_line)|hr_resume_line|主实体|SQL|hr_resume_line|否|否|自控制|否||
|[简历明细的类型(HR_RESUME_LINE_TYPE)](module/hr/hr_resume_line_type)|hr_resume_line_type|主实体|SQL|hr_resume_line_type|否|否|自控制|否||
|[技能(HR_SKILL)](module/hr/hr_skill)|hr_skill|主实体|SQL|hr_skill|否|否|自控制|否||
|[技能等级(HR_SKILL_LEVEL)](module/hr/hr_skill_level)|hr_skill_level|主实体|SQL|hr_skill_level|否|否|自控制|否||
|[技能类型(HR_SKILL_TYPE)](module/hr/hr_skill_type)|hr_skill_type|主实体|SQL|hr_skill_type|否|否|自控制|否||
|[工作地点(HR_WORK_LOCATION)](module/hr/hr_work_location)|hr_work_location|主实体|SQL|hr_work_location|否|否|自控制|否||

