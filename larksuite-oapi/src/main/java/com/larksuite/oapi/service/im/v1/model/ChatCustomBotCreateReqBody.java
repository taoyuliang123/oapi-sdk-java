// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.im.v1.model;
import com.google.gson.annotations.SerializedName;

public class ChatCustomBotCreateReqBody {
    @SerializedName("chat_id")
    private String chatId;
    @SerializedName("avatar_key")
    private String avatarKey;
    @SerializedName("name")
    private String name;
    @SerializedName("description")
    private String description;
    @SerializedName("allow_ips")
    private String[] allowIps;
    @SerializedName("key_words")
    private String[] keyWords;
    @SerializedName("signature_status")
    private Boolean signatureStatus;
    @SerializedName("uuid")
    private Long uuid;

    public String getChatId() {
        return this.chatId;
    }

    public void setChatId(String chatId) {
        this.chatId = chatId;
    }

    public String getAvatarKey() {
        return this.avatarKey;
    }

    public void setAvatarKey(String avatarKey) {
        this.avatarKey = avatarKey;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String[] getAllowIps() {
        return this.allowIps;
    }

    public void setAllowIps(String[] allowIps) {
        this.allowIps = allowIps;
    }

    public String[] getKeyWords() {
        return this.keyWords;
    }

    public void setKeyWords(String[] keyWords) {
        this.keyWords = keyWords;
    }

    public Boolean getSignatureStatus() {
        return this.signatureStatus;
    }

    public void setSignatureStatus(Boolean signatureStatus) {
        this.signatureStatus = signatureStatus;
    }

    public Long getUuid() {
        return this.uuid;
    }

    public void setUuid(Long uuid) {
        this.uuid = uuid;
    }

}
