package cn.ibizlab.ibizodoo.hr.hrleavemandatoryday

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.hr.hrleavemandatoryday.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[HR_LEAVE_MANDATORY_DAY]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class HrLeaveMandatoryDay extends GroovyDataEntityRuntime<HrLeaveMandatoryDay,HrLeaveMandatoryDayDTO,HrLeaveMandatoryDayFilterDTO> {

    private static HrLeaveMandatoryDay _instance
    void setInstance(HrLeaveMandatoryDay instance) {
        _instance = instance
    }
    static HrLeaveMandatoryDay getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    HrLeaveMandatoryDayDTO create(HrLeaveMandatoryDayDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, HrLeaveMandatoryDayDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    HrLeaveMandatoryDayDTO update(HrLeaveMandatoryDayDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, HrLeaveMandatoryDayDTO.class)
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
    HrLeaveMandatoryDayDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, HrLeaveMandatoryDayDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    HrLeaveMandatoryDayDTO getDraft(HrLeaveMandatoryDayDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, HrLeaveMandatoryDayDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(HrLeaveMandatoryDayDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    HrLeaveMandatoryDayDTO save(HrLeaveMandatoryDayDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, HrLeaveMandatoryDayDTO.class)
    }

}