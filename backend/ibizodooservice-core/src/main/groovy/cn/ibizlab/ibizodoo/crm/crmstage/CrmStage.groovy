package cn.ibizlab.ibizodoo.crm.crmstage

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.crm.crmstage.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[CRM_STAGE]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class CrmStage extends GroovyDataEntityRuntime<CrmStage,CrmStageDTO,CrmStageFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static CrmStage _instance
    void setInstance(CrmStage instance) {
        _instance = instance
    }
    static CrmStage getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    CrmStageDTO create(CrmStageDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, CrmStageDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    CrmStageDTO update(CrmStageDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, CrmStageDTO.class)
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
    CrmStageDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, CrmStageDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    CrmStageDTO getDraft(CrmStageDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, CrmStageDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(CrmStageDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    CrmStageDTO save(CrmStageDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, CrmStageDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<CrmStageDTO> fetchDefault(CrmStageFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, CrmStageDTO.class)
    }

}