package cn.ibizlab.ibizodoo.hr.hrcontract

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.hr.hrcontract.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[HR_CONTRACT]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class HrContract extends GroovyDataEntityRuntime<HrContract,HrContractDTO,HrContractFilterDTO> {

    private static HrContract _instance
    void setInstance(HrContract instance) {
        _instance = instance
    }
    static HrContract getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    HrContractDTO create(HrContractDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, HrContractDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    HrContractDTO update(HrContractDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, HrContractDTO.class)
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
    HrContractDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, HrContractDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    HrContractDTO getDraft(HrContractDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, HrContractDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(HrContractDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    HrContractDTO save(HrContractDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, HrContractDTO.class)
    }

}