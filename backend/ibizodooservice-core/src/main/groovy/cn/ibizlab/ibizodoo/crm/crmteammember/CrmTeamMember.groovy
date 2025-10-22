package cn.ibizlab.ibizodoo.crm.crmteammember

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.crm.crmteammember.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[CRM_TEAM_MEMBER]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class CrmTeamMember extends GroovyDataEntityRuntime<CrmTeamMember,CrmTeamMemberDTO,CrmTeamMemberFilterDTO> {

    private static CrmTeamMember _instance
    void setInstance(CrmTeamMember instance) {
        _instance = instance
    }
    static CrmTeamMember getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    CrmTeamMemberDTO create(CrmTeamMemberDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, CrmTeamMemberDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    CrmTeamMemberDTO update(CrmTeamMemberDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, CrmTeamMemberDTO.class)
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
    CrmTeamMemberDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, CrmTeamMemberDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    CrmTeamMemberDTO getDraft(CrmTeamMemberDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, CrmTeamMemberDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(CrmTeamMemberDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    CrmTeamMemberDTO save(CrmTeamMemberDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, CrmTeamMemberDTO.class)
    }

}