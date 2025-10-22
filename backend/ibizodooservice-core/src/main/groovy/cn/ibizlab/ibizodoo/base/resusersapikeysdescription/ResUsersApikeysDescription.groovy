package cn.ibizlab.ibizodoo.base.resusersapikeysdescription

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.base.resusersapikeysdescription.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[RES_USERS_APIKEYS_DESCRIPTION]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class ResUsersApikeysDescription extends GroovyDataEntityRuntime<ResUsersApikeysDescription,ResUsersApikeysDescriptionDTO,ResUsersApikeysDescriptionFilterDTO> {

    private static ResUsersApikeysDescription _instance
    void setInstance(ResUsersApikeysDescription instance) {
        _instance = instance
    }
    static ResUsersApikeysDescription getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    ResUsersApikeysDescriptionDTO create(ResUsersApikeysDescriptionDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, ResUsersApikeysDescriptionDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    ResUsersApikeysDescriptionDTO update(ResUsersApikeysDescriptionDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, ResUsersApikeysDescriptionDTO.class)
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
    ResUsersApikeysDescriptionDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, ResUsersApikeysDescriptionDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    ResUsersApikeysDescriptionDTO getDraft(ResUsersApikeysDescriptionDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, ResUsersApikeysDescriptionDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(ResUsersApikeysDescriptionDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    ResUsersApikeysDescriptionDTO save(ResUsersApikeysDescriptionDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, ResUsersApikeysDescriptionDTO.class)
    }

}