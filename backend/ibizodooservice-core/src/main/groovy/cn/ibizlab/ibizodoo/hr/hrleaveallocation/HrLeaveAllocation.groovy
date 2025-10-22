package cn.ibizlab.ibizodoo.hr.hrleaveallocation

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.hr.hrleaveallocation.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[HR_LEAVE_ALLOCATION]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class HrLeaveAllocation extends GroovyDataEntityRuntime<HrLeaveAllocation,HrLeaveAllocationDTO,HrLeaveAllocationFilterDTO> {

    private static HrLeaveAllocation _instance
    void setInstance(HrLeaveAllocation instance) {
        _instance = instance
    }
    static HrLeaveAllocation getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    HrLeaveAllocationDTO create(HrLeaveAllocationDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, HrLeaveAllocationDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    HrLeaveAllocationDTO update(HrLeaveAllocationDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, HrLeaveAllocationDTO.class)
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
    HrLeaveAllocationDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, HrLeaveAllocationDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    HrLeaveAllocationDTO getDraft(HrLeaveAllocationDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, HrLeaveAllocationDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(HrLeaveAllocationDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    HrLeaveAllocationDTO save(HrLeaveAllocationDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, HrLeaveAllocationDTO.class)
    }

}