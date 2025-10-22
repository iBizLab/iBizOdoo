package cn.ibizlab.ibizodoo.discuss.discussvoicemetadata

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.discuss.discussvoicemetadata.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[DISCUSS_VOICE_METADATA]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class DiscussVoiceMetadata extends GroovyDataEntityRuntime<DiscussVoiceMetadata,DiscussVoiceMetadataDTO,DiscussVoiceMetadataFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static DiscussVoiceMetadata _instance
    void setInstance(DiscussVoiceMetadata instance) {
        _instance = instance
    }
    static DiscussVoiceMetadata getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    DiscussVoiceMetadataDTO create(DiscussVoiceMetadataDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, DiscussVoiceMetadataDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    DiscussVoiceMetadataDTO update(DiscussVoiceMetadataDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, DiscussVoiceMetadataDTO.class)
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
    DiscussVoiceMetadataDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, DiscussVoiceMetadataDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    DiscussVoiceMetadataDTO getDraft(DiscussVoiceMetadataDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, DiscussVoiceMetadataDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(DiscussVoiceMetadataDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    DiscussVoiceMetadataDTO save(DiscussVoiceMetadataDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, DiscussVoiceMetadataDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<DiscussVoiceMetadataDTO> fetchDefault(DiscussVoiceMetadataFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, DiscussVoiceMetadataDTO.class)
    }

}