package cn.ibizlab.ibizodoo.mail.mailaliasmixinoptional

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.mail.mailaliasmixinoptional.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[MAIL_ALIAS_MIXIN_OPTIONAL]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class MailAliasMixinOptional extends GroovyDataEntityRuntime<MailAliasMixinOptional,MailAliasMixinOptionalDTO,MailAliasMixinOptionalFilterDTO> {

    private static MailAliasMixinOptional _instance
    void setInstance(MailAliasMixinOptional instance) {
        _instance = instance
    }
    static MailAliasMixinOptional getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    MailAliasMixinOptionalDTO create(MailAliasMixinOptionalDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, MailAliasMixinOptionalDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    MailAliasMixinOptionalDTO update(MailAliasMixinOptionalDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, MailAliasMixinOptionalDTO.class)
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
    MailAliasMixinOptionalDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, MailAliasMixinOptionalDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    MailAliasMixinOptionalDTO getDraft(MailAliasMixinOptionalDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, MailAliasMixinOptionalDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(MailAliasMixinOptionalDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    MailAliasMixinOptionalDTO save(MailAliasMixinOptionalDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, MailAliasMixinOptionalDTO.class)
    }

}