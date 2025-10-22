package cn.ibizlab.ibizodoo.crm.crmlostreason

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.crm.crmlostreason.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[CRM_LOST_REASON]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class CrmLostReason extends GroovyDataEntityRuntime<CrmLostReason,CrmLostReasonDTO,CrmLostReasonFilterDTO> {

    private static CrmLostReason _instance
    void setInstance(CrmLostReason instance) {
        _instance = instance
    }
    static CrmLostReason getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    CrmLostReasonDTO create(CrmLostReasonDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, CrmLostReasonDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    CrmLostReasonDTO update(CrmLostReasonDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, CrmLostReasonDTO.class)
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
    CrmLostReasonDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, CrmLostReasonDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    CrmLostReasonDTO getDraft(CrmLostReasonDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, CrmLostReasonDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(CrmLostReasonDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    CrmLostReasonDTO save(CrmLostReasonDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, CrmLostReasonDTO.class)
    }

}