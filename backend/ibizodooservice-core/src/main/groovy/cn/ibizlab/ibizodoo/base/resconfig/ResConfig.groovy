package cn.ibizlab.ibizodoo.base.resconfig

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.base.resconfig.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[RES_CONFIG]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class ResConfig extends GroovyDataEntityRuntime<ResConfig,ResConfigDTO,ResConfigFilterDTO> {

    private static ResConfig _instance
    void setInstance(ResConfig instance) {
        _instance = instance
    }
    static ResConfig getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    ResConfigDTO create(ResConfigDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, ResConfigDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    ResConfigDTO update(ResConfigDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, ResConfigDTO.class)
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
    ResConfigDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, ResConfigDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    ResConfigDTO getDraft(ResConfigDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, ResConfigDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(ResConfigDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    ResConfigDTO save(ResConfigDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, ResConfigDTO.class)
    }

}