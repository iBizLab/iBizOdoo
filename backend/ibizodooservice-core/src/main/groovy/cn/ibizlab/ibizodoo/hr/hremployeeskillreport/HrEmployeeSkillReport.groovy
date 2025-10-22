package cn.ibizlab.ibizodoo.hr.hremployeeskillreport

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.hr.hremployeeskillreport.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[HR_EMPLOYEE_SKILL_REPORT]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class HrEmployeeSkillReport extends GroovyDataEntityRuntime<HrEmployeeSkillReport,HrEmployeeSkillReportDTO,HrEmployeeSkillReportFilterDTO> {

    private static HrEmployeeSkillReport _instance
    void setInstance(HrEmployeeSkillReport instance) {
        _instance = instance
    }
    static HrEmployeeSkillReport getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    HrEmployeeSkillReportDTO create(HrEmployeeSkillReportDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, HrEmployeeSkillReportDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    HrEmployeeSkillReportDTO update(HrEmployeeSkillReportDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, HrEmployeeSkillReportDTO.class)
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
    HrEmployeeSkillReportDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, HrEmployeeSkillReportDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    HrEmployeeSkillReportDTO getDraft(HrEmployeeSkillReportDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, HrEmployeeSkillReportDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(HrEmployeeSkillReportDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    HrEmployeeSkillReportDTO save(HrEmployeeSkillReportDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, HrEmployeeSkillReportDTO.class)
    }

}