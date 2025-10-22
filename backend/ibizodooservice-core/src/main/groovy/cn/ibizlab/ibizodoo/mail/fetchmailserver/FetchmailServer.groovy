package cn.ibizlab.ibizodoo.mail.fetchmailserver

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.mail.fetchmailserver.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[FETCHMAIL_SERVER]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class FetchmailServer extends cn.ibizlab.central.plugin.odoo.dataentity.FetchmailServerDERuntime {

    public static final String ACTION_FETCH_MAIL = "fetch_mail"
    public static final String ACTION_SET_DRAFT = "set_draft"
    public static final String DATASET_DEFAULT = "DEFAULT"
    private static FetchmailServer _instance
    void setInstance(FetchmailServer instance) {
        _instance = instance
    }
    static FetchmailServer getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_CREATE)
    FetchmailServerDTO create(FetchmailServerDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, FetchmailServerDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_UPDATE)
    FetchmailServerDTO update(FetchmailServerDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, FetchmailServerDTO.class)
    }

    /**
     * 行为：Remove 实际功能
     * @param keys
     * @throws Throwable
     */
    //@DEAction(ACTION_REMOVE)
    void remove(String key) throws Throwable {
        this.execute(ACTION_REMOVE, key, Void.class)
    }

    /**
     * 行为：Get 实际功能
     * @param key
     * @throws Throwable
     */
    //@DEAction(ACTION_GET)
    FetchmailServerDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, FetchmailServerDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_GETDRAFT)
    FetchmailServerDTO getDraft(FetchmailServerDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, FetchmailServerDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_CHECKKEY)
    int checkKey(FetchmailServerDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_SAVE)
    FetchmailServerDTO save(FetchmailServerDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, FetchmailServerDTO.class)
    }

    /**
     * 行为：fetch_mail 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_FETCH_MAIL)
    def fetchMail(FetchmailServerDTO dto) throws Throwable {
        this.execute(ACTION_FETCH_MAIL, dto, FetchmailServerDTO.class)
    }

    /**
     * 行为：重置确认 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_SET_DRAFT)
    def setDraft(FetchmailServerDTO dto) throws Throwable {
        this.execute(ACTION_SET_DRAFT, dto, FetchmailServerDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEDataSet(DATASET_DEFAULT)
    Page<FetchmailServerDTO> fetchDefault(FetchmailServerFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, FetchmailServerDTO.class)
    }

}