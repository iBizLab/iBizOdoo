package cn.ibizlab.ibizodoo.crm.crmlead

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.crm.crmlead.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[CRM_LEAD]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class CrmLead extends GroovyDataEntityRuntime<CrmLead,CrmLeadDTO,CrmLeadFilterDTO> {

    public static final String ACTION_MESSAGE_POST_WITH_SOURCE = "message_post_with_source"
    public static final String DATASET_DEFAULT = "DEFAULT"
    private static CrmLead _instance
    void setInstance(CrmLead instance) {
        _instance = instance
    }
    static CrmLead getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    CrmLeadDTO create(CrmLeadDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, CrmLeadDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    CrmLeadDTO update(CrmLeadDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, CrmLeadDTO.class)
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
    CrmLeadDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, CrmLeadDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    CrmLeadDTO getDraft(CrmLeadDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, CrmLeadDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(CrmLeadDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    CrmLeadDTO save(CrmLeadDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, CrmLeadDTO.class)
    }

    /**
     * 行为：带模板的消息发送 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_MESSAGE_POST_WITH_SOURCE)
    def messagePostWithSource(CrmLeadDTO dto) throws Throwable {
        this.execute(ACTION_MESSAGE_POST_WITH_SOURCE, dto, CrmLeadDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<CrmLeadDTO> fetchDefault(CrmLeadFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, CrmLeadDTO.class)
    }

}