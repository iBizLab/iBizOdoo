package cn.ibizlab.ibizodoo.base.respartnercategory

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.base.respartnercategory.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[RES_PARTNER_CATEGORY]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class ResPartnerCategory extends GroovyDataEntityRuntime<ResPartnerCategory,ResPartnerCategoryDTO,ResPartnerCategoryFilterDTO> {

    private static ResPartnerCategory _instance
    void setInstance(ResPartnerCategory instance) {
        _instance = instance
    }
    static ResPartnerCategory getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    ResPartnerCategoryDTO create(ResPartnerCategoryDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, ResPartnerCategoryDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    ResPartnerCategoryDTO update(ResPartnerCategoryDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, ResPartnerCategoryDTO.class)
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
    ResPartnerCategoryDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, ResPartnerCategoryDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    ResPartnerCategoryDTO getDraft(ResPartnerCategoryDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, ResPartnerCategoryDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(ResPartnerCategoryDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    ResPartnerCategoryDTO save(ResPartnerCategoryDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, ResPartnerCategoryDTO.class)
    }

}