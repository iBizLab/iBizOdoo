package cn.ibizlab.ibizodoo.hr.hrleavereportcalendar

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.hr.hrleavereportcalendar.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[HR_LEAVE_REPORT_CALENDAR]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class HrLeaveReportCalendar extends GroovyDataEntityRuntime<HrLeaveReportCalendar,HrLeaveReportCalendarDTO,HrLeaveReportCalendarFilterDTO> {

    private static HrLeaveReportCalendar _instance
    void setInstance(HrLeaveReportCalendar instance) {
        _instance = instance
    }
    static HrLeaveReportCalendar getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    HrLeaveReportCalendarDTO create(HrLeaveReportCalendarDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, HrLeaveReportCalendarDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    HrLeaveReportCalendarDTO update(HrLeaveReportCalendarDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, HrLeaveReportCalendarDTO.class)
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
    HrLeaveReportCalendarDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, HrLeaveReportCalendarDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    HrLeaveReportCalendarDTO getDraft(HrLeaveReportCalendarDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, HrLeaveReportCalendarDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(HrLeaveReportCalendarDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    HrLeaveReportCalendarDTO save(HrLeaveReportCalendarDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, HrLeaveReportCalendarDTO.class)
    }

}