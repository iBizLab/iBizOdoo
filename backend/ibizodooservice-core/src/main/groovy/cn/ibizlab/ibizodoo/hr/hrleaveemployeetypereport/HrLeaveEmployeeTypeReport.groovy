package cn.ibizlab.ibizodoo.hr.hrleaveemployeetypereport

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.hr.hrleaveemployeetypereport.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[HR_LEAVE_EMPLOYEE_TYPE_REPORT]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class HrLeaveEmployeeTypeReport extends GroovyDataEntityRuntime<HrLeaveEmployeeTypeReport,HrLeaveEmployeeTypeReportDTO,HrLeaveEmployeeTypeReportFilterDTO> {

    private static HrLeaveEmployeeTypeReport _instance
    void setInstance(HrLeaveEmployeeTypeReport instance) {
        _instance = instance
    }
    static HrLeaveEmployeeTypeReport getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    HrLeaveEmployeeTypeReportDTO create(HrLeaveEmployeeTypeReportDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, HrLeaveEmployeeTypeReportDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    HrLeaveEmployeeTypeReportDTO update(HrLeaveEmployeeTypeReportDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, HrLeaveEmployeeTypeReportDTO.class)
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
    HrLeaveEmployeeTypeReportDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, HrLeaveEmployeeTypeReportDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    HrLeaveEmployeeTypeReportDTO getDraft(HrLeaveEmployeeTypeReportDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, HrLeaveEmployeeTypeReportDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(HrLeaveEmployeeTypeReportDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    HrLeaveEmployeeTypeReportDTO save(HrLeaveEmployeeTypeReportDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, HrLeaveEmployeeTypeReportDTO.class)
    }

}