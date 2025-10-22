package cn.ibizlab.ibizodoo.hr.hrholidayssummaryemployee

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.hr.hrholidayssummaryemployee.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[HR_HOLIDAYS_SUMMARY_EMPLOYEE]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class HrHolidaysSummaryEmployee extends GroovyDataEntityRuntime<HrHolidaysSummaryEmployee,HrHolidaysSummaryEmployeeDTO,HrHolidaysSummaryEmployeeFilterDTO> {

    private static HrHolidaysSummaryEmployee _instance
    void setInstance(HrHolidaysSummaryEmployee instance) {
        _instance = instance
    }
    static HrHolidaysSummaryEmployee getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    HrHolidaysSummaryEmployeeDTO create(HrHolidaysSummaryEmployeeDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, HrHolidaysSummaryEmployeeDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    HrHolidaysSummaryEmployeeDTO update(HrHolidaysSummaryEmployeeDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, HrHolidaysSummaryEmployeeDTO.class)
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
    HrHolidaysSummaryEmployeeDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, HrHolidaysSummaryEmployeeDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    HrHolidaysSummaryEmployeeDTO getDraft(HrHolidaysSummaryEmployeeDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, HrHolidaysSummaryEmployeeDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(HrHolidaysSummaryEmployeeDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    HrHolidaysSummaryEmployeeDTO save(HrHolidaysSummaryEmployeeDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, HrHolidaysSummaryEmployeeDTO.class)
    }

}