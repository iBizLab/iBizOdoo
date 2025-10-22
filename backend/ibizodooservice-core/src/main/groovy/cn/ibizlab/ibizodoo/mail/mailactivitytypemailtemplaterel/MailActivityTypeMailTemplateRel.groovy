package cn.ibizlab.ibizodoo.mail.mailactivitytypemailtemplaterel

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.mail.mailactivitytypemailtemplaterel.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[MAIL_ACTIVITY_TYPE_MAIL_TEMPLATE_REL]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class MailActivityTypeMailTemplateRel extends GroovyDataEntityRuntime<MailActivityTypeMailTemplateRel,MailActivityTypeMailTemplateRelDTO,MailActivityTypeMailTemplateRelFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static MailActivityTypeMailTemplateRel _instance
    void setInstance(MailActivityTypeMailTemplateRel instance) {
        _instance = instance
    }
    static MailActivityTypeMailTemplateRel getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    MailActivityTypeMailTemplateRelDTO create(MailActivityTypeMailTemplateRelDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, MailActivityTypeMailTemplateRelDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    MailActivityTypeMailTemplateRelDTO update(MailActivityTypeMailTemplateRelDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, MailActivityTypeMailTemplateRelDTO.class)
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
    MailActivityTypeMailTemplateRelDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, MailActivityTypeMailTemplateRelDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    MailActivityTypeMailTemplateRelDTO getDraft(MailActivityTypeMailTemplateRelDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, MailActivityTypeMailTemplateRelDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(MailActivityTypeMailTemplateRelDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    MailActivityTypeMailTemplateRelDTO save(MailActivityTypeMailTemplateRelDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, MailActivityTypeMailTemplateRelDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<MailActivityTypeMailTemplateRelDTO> fetchDefault(MailActivityTypeMailTemplateRelFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, MailActivityTypeMailTemplateRelDTO.class)
    }

}