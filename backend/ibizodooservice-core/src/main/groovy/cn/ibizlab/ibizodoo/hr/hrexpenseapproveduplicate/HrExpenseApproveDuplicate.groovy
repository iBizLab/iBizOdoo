package cn.ibizlab.ibizodoo.hr.hrexpenseapproveduplicate

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.hr.hrexpenseapproveduplicate.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[HR_EXPENSE_APPROVE_DUPLICATE]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class HrExpenseApproveDuplicate extends GroovyDataEntityRuntime<HrExpenseApproveDuplicate,HrExpenseApproveDuplicateDTO,HrExpenseApproveDuplicateFilterDTO> {

    private static HrExpenseApproveDuplicate _instance
    void setInstance(HrExpenseApproveDuplicate instance) {
        _instance = instance
    }
    static HrExpenseApproveDuplicate getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    HrExpenseApproveDuplicateDTO create(HrExpenseApproveDuplicateDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, HrExpenseApproveDuplicateDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    HrExpenseApproveDuplicateDTO update(HrExpenseApproveDuplicateDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, HrExpenseApproveDuplicateDTO.class)
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
    HrExpenseApproveDuplicateDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, HrExpenseApproveDuplicateDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    HrExpenseApproveDuplicateDTO getDraft(HrExpenseApproveDuplicateDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, HrExpenseApproveDuplicateDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(HrExpenseApproveDuplicateDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    HrExpenseApproveDuplicateDTO save(HrExpenseApproveDuplicateDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, HrExpenseApproveDuplicateDTO.class)
    }

}