package cn.ibizlab.ibizodoo.mail.mailaliasmixin

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.mail.mailaliasmixin.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[MAIL_ALIAS_MIXIN]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class MailAliasMixin extends GroovyDataEntityRuntime<MailAliasMixin,MailAliasMixinDTO,MailAliasMixinFilterDTO> {

    private static MailAliasMixin _instance
    void setInstance(MailAliasMixin instance) {
        _instance = instance
    }
    static MailAliasMixin getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    MailAliasMixinDTO create(MailAliasMixinDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, MailAliasMixinDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    MailAliasMixinDTO update(MailAliasMixinDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, MailAliasMixinDTO.class)
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
    MailAliasMixinDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, MailAliasMixinDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    MailAliasMixinDTO getDraft(MailAliasMixinDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, MailAliasMixinDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(MailAliasMixinDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    MailAliasMixinDTO save(MailAliasMixinDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, MailAliasMixinDTO.class)
    }

}