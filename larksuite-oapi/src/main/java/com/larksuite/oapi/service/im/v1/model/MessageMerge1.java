// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.im.v1.model;
import com.google.gson.annotations.SerializedName;

public class MessageMerge1 {
    @SerializedName("message_id")
    private String messageId;
    @SerializedName("root_id")
    private String rootId;
    @SerializedName("parent_id")
    private String parentId;
    @SerializedName("msg_type")
    private String msgType;
    @SerializedName("create_time")
    private Long createTime;
    @SerializedName("update_time")
    private Long updateTime;
    @SerializedName("deleted")
    private Boolean deleted;
    @SerializedName("updated")
    private Boolean updated;
    @SerializedName("chat_id")
    private String chatId;
    @SerializedName("sender")
    private Sender sender;
    @SerializedName("body")
    private MessageBody body;
    @SerializedName("message_list")
    private MessageMerge2[] messageList;
    @SerializedName("mentions")
    private Mention[] mentions;

    public String getMessageId() {
        return this.messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public String getRootId() {
        return this.rootId;
    }

    public void setRootId(String rootId) {
        this.rootId = rootId;
    }

    public String getParentId() {
        return this.parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getMsgType() {
        return this.msgType;
    }

    public void setMsgType(String msgType) {
        this.msgType = msgType;
    }

    public Long getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getUpdateTime() {
        return this.updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public Boolean getDeleted() {
        return this.deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public Boolean getUpdated() {
        return this.updated;
    }

    public void setUpdated(Boolean updated) {
        this.updated = updated;
    }

    public String getChatId() {
        return this.chatId;
    }

    public void setChatId(String chatId) {
        this.chatId = chatId;
    }

    public Sender getSender() {
        return this.sender;
    }

    public void setSender(Sender sender) {
        this.sender = sender;
    }

    public MessageBody getBody() {
        return this.body;
    }

    public void setBody(MessageBody body) {
        this.body = body;
    }

    public MessageMerge2[] getMessageList() {
        return this.messageList;
    }

    public void setMessageList(MessageMerge2[] messageList) {
        this.messageList = messageList;
    }

    public Mention[] getMentions() {
        return this.mentions;
    }

    public void setMentions(Mention[] mentions) {
        this.mentions = mentions;
    }

}
