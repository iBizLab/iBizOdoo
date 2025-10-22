package cn.ibizlab.ibizodoo.mail.maillinkpreview

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.mail.maillinkpreview.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[MAIL_LINK_PREVIEW]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class MailLinkPreview extends GroovyDataEntityRuntime<MailLinkPreview,MailLinkPreviewDTO,MailLinkPreviewFilterDTO> {

    private static MailLinkPreview _instance
    void setInstance(MailLinkPreview instance) {
        _instance = instance
    }
    static MailLinkPreview getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    MailLinkPreviewDTO create(MailLinkPreviewDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, MailLinkPreviewDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    MailLinkPreviewDTO update(MailLinkPreviewDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, MailLinkPreviewDTO.class)
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
    MailLinkPreviewDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, MailLinkPreviewDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    MailLinkPreviewDTO getDraft(MailLinkPreviewDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, MailLinkPreviewDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(MailLinkPreviewDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    MailLinkPreviewDTO save(MailLinkPreviewDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, MailLinkPreviewDTO.class)
    }

}