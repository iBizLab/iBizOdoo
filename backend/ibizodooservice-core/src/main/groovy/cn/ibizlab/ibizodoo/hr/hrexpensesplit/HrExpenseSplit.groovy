package cn.ibizlab.ibizodoo.hr.hrexpensesplit

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.hr.hrexpensesplit.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[HR_EXPENSE_SPLIT]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class HrExpenseSplit extends GroovyDataEntityRuntime<HrExpenseSplit,HrExpenseSplitDTO,HrExpenseSplitFilterDTO> {

    private static HrExpenseSplit _instance
    void setInstance(HrExpenseSplit instance) {
        _instance = instance
    }
    static HrExpenseSplit getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    HrExpenseSplitDTO create(HrExpenseSplitDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, HrExpenseSplitDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    HrExpenseSplitDTO update(HrExpenseSplitDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, HrExpenseSplitDTO.class)
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
    HrExpenseSplitDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, HrExpenseSplitDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    HrExpenseSplitDTO getDraft(HrExpenseSplitDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, HrExpenseSplitDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(HrExpenseSplitDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    HrExpenseSplitDTO save(HrExpenseSplitDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, HrExpenseSplitDTO.class)
    }

}