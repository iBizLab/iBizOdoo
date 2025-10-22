package cn.ibizlab.ibizodoo.mail.mailmail

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.mail.mailmail.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[MAIL_MAIL]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class MailMail extends GroovyDataEntityRuntime<MailMail,MailMailDTO,MailMailFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static MailMail _instance
    void setInstance(MailMail instance) {
        _instance = instance
    }
    static MailMail getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    MailMailDTO create(MailMailDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, MailMailDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    MailMailDTO update(MailMailDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, MailMailDTO.class)
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
    MailMailDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, MailMailDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    MailMailDTO getDraft(MailMailDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, MailMailDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(MailMailDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    MailMailDTO save(MailMailDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, MailMailDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<MailMailDTO> fetchDefault(MailMailFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, MailMailDTO.class)
    }

}