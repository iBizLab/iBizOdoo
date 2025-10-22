package cn.ibizlab.ibizodoo.resource.resourceresource

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.resource.resourceresource.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[RESOURCE_RESOURCE]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class ResourceResource extends GroovyDataEntityRuntime<ResourceResource,ResourceResourceDTO,ResourceResourceFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static ResourceResource _instance
    void setInstance(ResourceResource instance) {
        _instance = instance
    }
    static ResourceResource getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    ResourceResourceDTO create(ResourceResourceDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, ResourceResourceDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    ResourceResourceDTO update(ResourceResourceDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, ResourceResourceDTO.class)
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
    ResourceResourceDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, ResourceResourceDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    ResourceResourceDTO getDraft(ResourceResourceDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, ResourceResourceDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(ResourceResourceDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    ResourceResourceDTO save(ResourceResourceDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, ResourceResourceDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<ResourceResourceDTO> fetchDefault(ResourceResourceFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, ResourceResourceDTO.class)
    }

}