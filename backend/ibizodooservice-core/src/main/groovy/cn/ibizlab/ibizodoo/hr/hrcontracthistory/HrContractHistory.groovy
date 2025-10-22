package cn.ibizlab.ibizodoo.hr.hrcontracthistory

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.hr.hrcontracthistory.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[HR_CONTRACT_HISTORY]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class HrContractHistory extends GroovyDataEntityRuntime<HrContractHistory,HrContractHistoryDTO,HrContractHistoryFilterDTO> {

    private static HrContractHistory _instance
    void setInstance(HrContractHistory instance) {
        _instance = instance
    }
    static HrContractHistory getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    HrContractHistoryDTO create(HrContractHistoryDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, HrContractHistoryDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    HrContractHistoryDTO update(HrContractHistoryDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, HrContractHistoryDTO.class)
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
    HrContractHistoryDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, HrContractHistoryDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    HrContractHistoryDTO getDraft(HrContractHistoryDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, HrContractHistoryDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(HrContractHistoryDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    HrContractHistoryDTO save(HrContractHistoryDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, HrContractHistoryDTO.class)
    }

}