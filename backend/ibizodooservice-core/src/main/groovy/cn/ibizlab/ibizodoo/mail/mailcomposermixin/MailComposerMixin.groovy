package cn.ibizlab.ibizodoo.mail.mailcomposermixin

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.mail.mailcomposermixin.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[MAIL_COMPOSER_MIXIN]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class MailComposerMixin extends GroovyDataEntityRuntime<MailComposerMixin,MailComposerMixinDTO,MailComposerMixinFilterDTO> {

    private static MailComposerMixin _instance
    void setInstance(MailComposerMixin instance) {
        _instance = instance
    }
    static MailComposerMixin getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    MailComposerMixinDTO create(MailComposerMixinDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, MailComposerMixinDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    MailComposerMixinDTO update(MailComposerMixinDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, MailComposerMixinDTO.class)
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
    MailComposerMixinDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, MailComposerMixinDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    MailComposerMixinDTO getDraft(MailComposerMixinDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, MailComposerMixinDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(MailComposerMixinDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    MailComposerMixinDTO save(MailComposerMixinDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, MailComposerMixinDTO.class)
    }

}