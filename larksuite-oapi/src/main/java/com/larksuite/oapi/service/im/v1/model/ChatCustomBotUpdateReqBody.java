// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.im.v1.model;
import com.google.gson.annotations.SerializedName;

public class ChatCustomBotUpdateReqBody {
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
    @SerializedName("change_signature")
    private Boolean changeSignature;
    @SerializedName("enable")
    private Boolean enable;

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

    public Boolean getChangeSignature() {
        return this.changeSignature;
    }

    public void setChangeSignature(Boolean changeSignature) {
        this.changeSignature = changeSignature;
    }

    public Boolean getEnable() {
        return this.enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

}
