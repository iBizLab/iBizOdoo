package cn.ibizlab.ibizodoo.base.changepasswordown

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.base.changepasswordown.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[CHANGE_PASSWORD_OWN]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class ChangePasswordOwn extends GroovyDataEntityRuntime<ChangePasswordOwn,ChangePasswordOwnDTO,ChangePasswordOwnFilterDTO> {

    private static ChangePasswordOwn _instance
    void setInstance(ChangePasswordOwn instance) {
        _instance = instance
    }
    static ChangePasswordOwn getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    ChangePasswordOwnDTO create(ChangePasswordOwnDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, ChangePasswordOwnDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    ChangePasswordOwnDTO update(ChangePasswordOwnDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, ChangePasswordOwnDTO.class)
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
    ChangePasswordOwnDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, ChangePasswordOwnDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    ChangePasswordOwnDTO getDraft(ChangePasswordOwnDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, ChangePasswordOwnDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(ChangePasswordOwnDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    ChangePasswordOwnDTO save(ChangePasswordOwnDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, ChangePasswordOwnDTO.class)
    }

}