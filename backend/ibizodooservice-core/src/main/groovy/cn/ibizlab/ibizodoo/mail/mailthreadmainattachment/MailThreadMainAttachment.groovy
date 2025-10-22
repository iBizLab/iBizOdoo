package cn.ibizlab.ibizodoo.mail.mailthreadmainattachment

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.mail.mailthreadmainattachment.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[MAIL_THREAD_MAIN_ATTACHMENT]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class MailThreadMainAttachment extends GroovyDataEntityRuntime<MailThreadMainAttachment,MailThreadMainAttachmentDTO,MailThreadMainAttachmentFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static MailThreadMainAttachment _instance
    void setInstance(MailThreadMainAttachment instance) {
        _instance = instance
    }
    static MailThreadMainAttachment getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    MailThreadMainAttachmentDTO create(MailThreadMainAttachmentDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, MailThreadMainAttachmentDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    MailThreadMainAttachmentDTO update(MailThreadMainAttachmentDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, MailThreadMainAttachmentDTO.class)
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
    MailThreadMainAttachmentDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, MailThreadMainAttachmentDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    MailThreadMainAttachmentDTO getDraft(MailThreadMainAttachmentDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, MailThreadMainAttachmentDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(MailThreadMainAttachmentDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    MailThreadMainAttachmentDTO save(MailThreadMainAttachmentDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, MailThreadMainAttachmentDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<MailThreadMainAttachmentDTO> fetchDefault(MailThreadMainAttachmentFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, MailThreadMainAttachmentDTO.class)
    }

}