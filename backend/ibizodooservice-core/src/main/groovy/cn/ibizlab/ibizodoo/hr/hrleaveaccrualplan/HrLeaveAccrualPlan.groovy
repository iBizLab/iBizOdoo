package cn.ibizlab.ibizodoo.hr.hrleaveaccrualplan

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.hr.hrleaveaccrualplan.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[HR_LEAVE_ACCRUAL_PLAN]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class HrLeaveAccrualPlan extends GroovyDataEntityRuntime<HrLeaveAccrualPlan,HrLeaveAccrualPlanDTO,HrLeaveAccrualPlanFilterDTO> {

    private static HrLeaveAccrualPlan _instance
    void setInstance(HrLeaveAccrualPlan instance) {
        _instance = instance
    }
    static HrLeaveAccrualPlan getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    HrLeaveAccrualPlanDTO create(HrLeaveAccrualPlanDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, HrLeaveAccrualPlanDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    HrLeaveAccrualPlanDTO update(HrLeaveAccrualPlanDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, HrLeaveAccrualPlanDTO.class)
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
    HrLeaveAccrualPlanDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, HrLeaveAccrualPlanDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    HrLeaveAccrualPlanDTO getDraft(HrLeaveAccrualPlanDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, HrLeaveAccrualPlanDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(HrLeaveAccrualPlanDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    HrLeaveAccrualPlanDTO save(HrLeaveAccrualPlanDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, HrLeaveAccrualPlanDTO.class)
    }

}