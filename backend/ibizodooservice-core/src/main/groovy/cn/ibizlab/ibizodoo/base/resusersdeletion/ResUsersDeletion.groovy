package cn.ibizlab.ibizodoo.base.resusersdeletion

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.base.resusersdeletion.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[RES_USERS_DELETION]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class ResUsersDeletion extends GroovyDataEntityRuntime<ResUsersDeletion,ResUsersDeletionDTO,ResUsersDeletionFilterDTO> {

    private static ResUsersDeletion _instance
    void setInstance(ResUsersDeletion instance) {
        _instance = instance
    }
    static ResUsersDeletion getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    ResUsersDeletionDTO create(ResUsersDeletionDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, ResUsersDeletionDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    ResUsersDeletionDTO update(ResUsersDeletionDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, ResUsersDeletionDTO.class)
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
    ResUsersDeletionDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, ResUsersDeletionDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    ResUsersDeletionDTO getDraft(ResUsersDeletionDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, ResUsersDeletionDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(ResUsersDeletionDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    ResUsersDeletionDTO save(ResUsersDeletionDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, ResUsersDeletionDTO.class)
    }

}