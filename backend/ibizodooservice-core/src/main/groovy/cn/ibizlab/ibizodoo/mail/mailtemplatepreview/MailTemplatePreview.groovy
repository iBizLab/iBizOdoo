package cn.ibizlab.ibizodoo.mail.mailtemplatepreview

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.mail.mailtemplatepreview.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[MAIL_TEMPLATE_PREVIEW]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class MailTemplatePreview extends GroovyDataEntityRuntime<MailTemplatePreview,MailTemplatePreviewDTO,MailTemplatePreviewFilterDTO> {

    private static MailTemplatePreview _instance
    void setInstance(MailTemplatePreview instance) {
        _instance = instance
    }
    static MailTemplatePreview getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    MailTemplatePreviewDTO create(MailTemplatePreviewDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, MailTemplatePreviewDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    MailTemplatePreviewDTO update(MailTemplatePreviewDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, MailTemplatePreviewDTO.class)
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
    MailTemplatePreviewDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, MailTemplatePreviewDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    MailTemplatePreviewDTO getDraft(MailTemplatePreviewDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, MailTemplatePreviewDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(MailTemplatePreviewDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    MailTemplatePreviewDTO save(MailTemplatePreviewDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, MailTemplatePreviewDTO.class)
    }

}