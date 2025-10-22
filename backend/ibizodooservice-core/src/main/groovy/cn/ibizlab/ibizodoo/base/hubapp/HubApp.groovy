package cn.ibizlab.ibizodoo.base.hubapp

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.base.hubapp.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[HUB_APP]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class HubApp extends GroovyDataEntityRuntime<HubApp,HubAppDTO,HubAppFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static HubApp _instance
    void setInstance(HubApp instance) {
        _instance = instance
    }
    static HubApp getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    HubAppDTO create(HubAppDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, HubAppDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    HubAppDTO update(HubAppDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, HubAppDTO.class)
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
    HubAppDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, HubAppDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    HubAppDTO getDraft(HubAppDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, HubAppDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(HubAppDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    HubAppDTO save(HubAppDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, HubAppDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<HubAppDTO> fetchDefault(HubAppFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, HubAppDTO.class)
    }

}