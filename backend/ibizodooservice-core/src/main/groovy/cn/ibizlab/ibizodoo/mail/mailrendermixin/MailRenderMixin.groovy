package cn.ibizlab.ibizodoo.mail.mailrendermixin

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.mail.mailrendermixin.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[MAIL_RENDER_MIXIN]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class MailRenderMixin extends GroovyDataEntityRuntime<MailRenderMixin,MailRenderMixinDTO,MailRenderMixinFilterDTO> {

    private static MailRenderMixin _instance
    void setInstance(MailRenderMixin instance) {
        _instance = instance
    }
    static MailRenderMixin getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    MailRenderMixinDTO create(MailRenderMixinDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, MailRenderMixinDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    MailRenderMixinDTO update(MailRenderMixinDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, MailRenderMixinDTO.class)
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
    MailRenderMixinDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, MailRenderMixinDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    MailRenderMixinDTO getDraft(MailRenderMixinDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, MailRenderMixinDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(MailRenderMixinDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    MailRenderMixinDTO save(MailRenderMixinDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, MailRenderMixinDTO.class)
    }

}