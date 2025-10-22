package cn.ibizlab.ibizodoo.hr.hrmanagerdepartmentreport

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.hr.hrmanagerdepartmentreport.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[HR_MANAGER_DEPARTMENT_REPORT]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class HrManagerDepartmentReport extends GroovyDataEntityRuntime<HrManagerDepartmentReport,HrManagerDepartmentReportDTO,HrManagerDepartmentReportFilterDTO> {

    private static HrManagerDepartmentReport _instance
    void setInstance(HrManagerDepartmentReport instance) {
        _instance = instance
    }
    static HrManagerDepartmentReport getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    HrManagerDepartmentReportDTO create(HrManagerDepartmentReportDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, HrManagerDepartmentReportDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    HrManagerDepartmentReportDTO update(HrManagerDepartmentReportDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, HrManagerDepartmentReportDTO.class)
    }

    /**
     * 行为：Remove 实际功能
     * @param keys
     * @throws Throwable
     */
    @DEAction(ACTION_REMOVE)
    void remove(String key) throws Throwable {
        this.execute(ACTION_REMOVE, key, Void.class)
    }

    /**
     * 行为：Get 实际功能
     * @param key
     * @throws Throwable
     */
    @DEAction(ACTION_GET)
    HrManagerDepartmentReportDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, HrManagerDepartmentReportDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    HrManagerDepartmentReportDTO getDraft(HrManagerDepartmentReportDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, HrManagerDepartmentReportDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(HrManagerDepartmentReportDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    HrManagerDepartmentReportDTO save(HrManagerDepartmentReportDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, HrManagerDepartmentReportDTO.class)
    }

}