package cn.ibizlab.ibizodoo.hr.hrleavereport

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.hr.hrleavereport.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[HR_LEAVE_REPORT]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class HrLeaveReport extends GroovyDataEntityRuntime<HrLeaveReport,HrLeaveReportDTO,HrLeaveReportFilterDTO> {

    private static HrLeaveReport _instance
    void setInstance(HrLeaveReport instance) {
        _instance = instance
    }
    static HrLeaveReport getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    HrLeaveReportDTO create(HrLeaveReportDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, HrLeaveReportDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    HrLeaveReportDTO update(HrLeaveReportDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, HrLeaveReportDTO.class)
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
    HrLeaveReportDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, HrLeaveReportDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    HrLeaveReportDTO getDraft(HrLeaveReportDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, HrLeaveReportDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(HrLeaveReportDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    HrLeaveReportDTO save(HrLeaveReportDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, HrLeaveReportDTO.class)
    }

}