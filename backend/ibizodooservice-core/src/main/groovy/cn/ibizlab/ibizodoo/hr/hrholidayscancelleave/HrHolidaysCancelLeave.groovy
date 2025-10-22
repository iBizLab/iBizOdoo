package cn.ibizlab.ibizodoo.hr.hrholidayscancelleave

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.hr.hrholidayscancelleave.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[HR_HOLIDAYS_CANCEL_LEAVE]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class HrHolidaysCancelLeave extends GroovyDataEntityRuntime<HrHolidaysCancelLeave,HrHolidaysCancelLeaveDTO,HrHolidaysCancelLeaveFilterDTO> {

    private static HrHolidaysCancelLeave _instance
    void setInstance(HrHolidaysCancelLeave instance) {
        _instance = instance
    }
    static HrHolidaysCancelLeave getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    HrHolidaysCancelLeaveDTO create(HrHolidaysCancelLeaveDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, HrHolidaysCancelLeaveDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    HrHolidaysCancelLeaveDTO update(HrHolidaysCancelLeaveDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, HrHolidaysCancelLeaveDTO.class)
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
    HrHolidaysCancelLeaveDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, HrHolidaysCancelLeaveDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    HrHolidaysCancelLeaveDTO getDraft(HrHolidaysCancelLeaveDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, HrHolidaysCancelLeaveDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(HrHolidaysCancelLeaveDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    HrHolidaysCancelLeaveDTO save(HrHolidaysCancelLeaveDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, HrHolidaysCancelLeaveDTO.class)
    }

}