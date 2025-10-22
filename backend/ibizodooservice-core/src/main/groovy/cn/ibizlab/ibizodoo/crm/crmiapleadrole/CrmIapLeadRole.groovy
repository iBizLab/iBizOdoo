package cn.ibizlab.ibizodoo.crm.crmiapleadrole

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.crm.crmiapleadrole.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[CRM_IAP_LEAD_ROLE]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class CrmIapLeadRole extends GroovyDataEntityRuntime<CrmIapLeadRole,CrmIapLeadRoleDTO,CrmIapLeadRoleFilterDTO> {

    private static CrmIapLeadRole _instance
    void setInstance(CrmIapLeadRole instance) {
        _instance = instance
    }
    static CrmIapLeadRole getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    CrmIapLeadRoleDTO create(CrmIapLeadRoleDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, CrmIapLeadRoleDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    CrmIapLeadRoleDTO update(CrmIapLeadRoleDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, CrmIapLeadRoleDTO.class)
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
    CrmIapLeadRoleDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, CrmIapLeadRoleDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    CrmIapLeadRoleDTO getDraft(CrmIapLeadRoleDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, CrmIapLeadRoleDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(CrmIapLeadRoleDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    CrmIapLeadRoleDTO save(CrmIapLeadRoleDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, CrmIapLeadRoleDTO.class)
    }

}