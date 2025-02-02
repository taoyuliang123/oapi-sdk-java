// Code generated by lark suite oapi sdk gen
/*
 * MIT License
 *
 * Copyright (c) 2022 Lark Technologies Pte. Ltd.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice, shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.lark.oapi.service.admin.v1.model;

import com.google.gson.annotations.SerializedName;

public class UserReport2022 {
    /**
     * 用户id
     * <p> 示例值：ou_7dab8a3d3cdcc9da365777c7ad535d62
     */
    @SerializedName("user_id")
    private String userId;
    /**
     * 用户的飞书激活日期，yyyyMMdd格式（201909之前的用户可能是空
     * <p> 示例值：20220726
     */
    @SerializedName("user_register_date")
    private String userRegisterDate;
    /**
     * 用户2022年内在飞书有活跃的天数
     * <p> 示例值：120
     */
    @SerializedName("active_day_count")
    private Integer activeDayCount;
    /**
     * 2022全年用户发出消息条数最多的一天，yyyyMMdd格式
     * <p> 示例值：20220817
     */
    @SerializedName("msg_busy_date")
    private String msgBusyDate;
    /**
     * 全年发消息最多一天，发出的消息数
     * <p> 示例值：588
     */
    @SerializedName("msg_busy_date_send_msg_count")
    private String msgBusyDateSendMsgCount;
    /**
     * 2022全年与此用户有过单聊的人数（双方任意一人发出过消息即计入）
     * <p> 示例值：22
     */
    @SerializedName("p2p_chat_count")
    private String p2pChatCount;
    /**
     * 2022全年用户有过发言的飞书群的数量
     * <p> 示例值：18
     */
    @SerializedName("talked_chat_count")
    private String talkedChatCount;
    /**
     * 2022全年用户所发消息，收到点赞、送心、碰拳等正面表情回复的总次数
     * <p> 示例值：100
     */
    @SerializedName("positive_reaction_count")
    private String positiveReactionCount;
    /**
     * 用户所收到的正向表情回复，排第1的表情
     * <p> 示例值：thumbsup
     */
    @SerializedName("first_positive_reaction")
    private String firstPositiveReaction;
    /**
     * 用户所收到的正向表情回复，排第2的表情
     * <p> 示例值：muscle
     */
    @SerializedName("second_positive_reaction")
    private String secondPositiveReaction;
    /**
     * 用户所收到的正向表情回复，排第3的表情
     * <p> 示例值：fingerheart
     */
    @SerializedName("third_positive_reaction")
    private String thirdPositiveReaction;
    /**
     * 用户所收到的正向表情回复，排第4的表情
     * <p> 示例值：applaud
     */
    @SerializedName("fourth_positive_reaction")
    private String fourthPositiveReaction;
    /**
     * 用户所收到的正向表情回复，排第5的表情
     * <p> 示例值：fistbump
     */
    @SerializedName("fifth_positive_reaction")
    private String fifthPositiveReaction;
    /**
     * 2022全年用户本人创建过的飞书文档数量
     * <p> 示例值：12
     */
    @SerializedName("create_file_count")
    private String createFileCount;
    /**
     * 此用户2022年创建的飞书文档的总阅读人数（含自己）
     * <p> 示例值：11
     */
    @SerializedName("created_file_view_count")
    private String createdFileViewCount;
    /**
     * 2022全年用户发表过评论的飞书文档数量
     * <p> 示例值：11
     */
    @SerializedName("comment_file_count")
    private String commentFileCount;
    /**
     * 2022全年用户的日程总数（主日历日程，排除被删除的日程及用户拒绝、移除的日程，包括全天日程和重复日程，重复日程在周期内计算为多次）
     * <p> 示例值：123
     */
    @SerializedName("attend_event_count")
    private String attendEventCount;
    /**
     * 2022全年用户日程数量最多的一天，yyyyMMdd格式
     * <p> 示例值：20220801
     */
    @SerializedName("event_busy_date")
    private String eventBusyDate;
    /**
     * 日程最多一天的日程数量
     * <p> 示例值：123
     */
    @SerializedName("event_busy_date_event_count")
    private String eventBusyDateEventCount;
    /**
     * 2022全年，此用户最经常的日程开始时间，精确到分钟，HH:mm格式
     * <p> 示例值：10:00
     */
    @SerializedName("event_start_time_range1")
    private String eventStartTimeRange1;
    /**
     * 2022全年，基于此用户所创建的日程，发起了视频会议的次数
     * <p> 示例值：123
     */
    @SerializedName("conference_create_count")
    private String conferenceCreateCount;
    /**
     * 2022全年，基于此用户所创建的日程发起的视频会议，涉及的参会总人次
     * <p> 示例值：123
     */
    @SerializedName("total_parti_count")
    private String totalPartiCount;
    /**
     * 2022全年此用户写过的O的数量（未删除）
     * <p> 示例值：123
     */
    @SerializedName("okr_cum_o_count")
    private String okrCumOCount;
    /**
     * 2022全年此用户写过的KR的数量（未删除）
     * <p> 示例值：123
     */
    @SerializedName("okr_cum_kr_count")
    private String okrCumKrCount;
    /**
     * 2022全年用户所写的OKR对齐过的去重人数（未删除）
     * <p> 示例值：123
     */
    @SerializedName("okr_aligned_user_count")
    private String okrAlignedUserCount;
    /**
     * 2022全年用户在飞书招聘上进行的面试总场次（候选人是海外账号的未参与计算）
     * <p> 示例值：123
     */
    @SerializedName("people_interview_num")
    private String peopleInterviewNum;
    /**
     * 2022全年此用户发出邮件数量
     * <p> 示例值：123
     */
    @SerializedName("send_email_count")
    private String sendEmailCount;
    /**
     * 2022全年此用户收到邮件数量
     * <p> 示例值：123
     */
    @SerializedName("receive_email_count")
    private String receiveEmailCount;

    // builder 开始
    public UserReport2022() {
    }

    public UserReport2022(Builder builder) {
        /**
         * 用户id
         * <p> 示例值：ou_7dab8a3d3cdcc9da365777c7ad535d62
         */
        this.userId = builder.userId;
        /**
         * 用户的飞书激活日期，yyyyMMdd格式（201909之前的用户可能是空
         * <p> 示例值：20220726
         */
        this.userRegisterDate = builder.userRegisterDate;
        /**
         * 用户2022年内在飞书有活跃的天数
         * <p> 示例值：120
         */
        this.activeDayCount = builder.activeDayCount;
        /**
         * 2022全年用户发出消息条数最多的一天，yyyyMMdd格式
         * <p> 示例值：20220817
         */
        this.msgBusyDate = builder.msgBusyDate;
        /**
         * 全年发消息最多一天，发出的消息数
         * <p> 示例值：588
         */
        this.msgBusyDateSendMsgCount = builder.msgBusyDateSendMsgCount;
        /**
         * 2022全年与此用户有过单聊的人数（双方任意一人发出过消息即计入）
         * <p> 示例值：22
         */
        this.p2pChatCount = builder.p2pChatCount;
        /**
         * 2022全年用户有过发言的飞书群的数量
         * <p> 示例值：18
         */
        this.talkedChatCount = builder.talkedChatCount;
        /**
         * 2022全年用户所发消息，收到点赞、送心、碰拳等正面表情回复的总次数
         * <p> 示例值：100
         */
        this.positiveReactionCount = builder.positiveReactionCount;
        /**
         * 用户所收到的正向表情回复，排第1的表情
         * <p> 示例值：thumbsup
         */
        this.firstPositiveReaction = builder.firstPositiveReaction;
        /**
         * 用户所收到的正向表情回复，排第2的表情
         * <p> 示例值：muscle
         */
        this.secondPositiveReaction = builder.secondPositiveReaction;
        /**
         * 用户所收到的正向表情回复，排第3的表情
         * <p> 示例值：fingerheart
         */
        this.thirdPositiveReaction = builder.thirdPositiveReaction;
        /**
         * 用户所收到的正向表情回复，排第4的表情
         * <p> 示例值：applaud
         */
        this.fourthPositiveReaction = builder.fourthPositiveReaction;
        /**
         * 用户所收到的正向表情回复，排第5的表情
         * <p> 示例值：fistbump
         */
        this.fifthPositiveReaction = builder.fifthPositiveReaction;
        /**
         * 2022全年用户本人创建过的飞书文档数量
         * <p> 示例值：12
         */
        this.createFileCount = builder.createFileCount;
        /**
         * 此用户2022年创建的飞书文档的总阅读人数（含自己）
         * <p> 示例值：11
         */
        this.createdFileViewCount = builder.createdFileViewCount;
        /**
         * 2022全年用户发表过评论的飞书文档数量
         * <p> 示例值：11
         */
        this.commentFileCount = builder.commentFileCount;
        /**
         * 2022全年用户的日程总数（主日历日程，排除被删除的日程及用户拒绝、移除的日程，包括全天日程和重复日程，重复日程在周期内计算为多次）
         * <p> 示例值：123
         */
        this.attendEventCount = builder.attendEventCount;
        /**
         * 2022全年用户日程数量最多的一天，yyyyMMdd格式
         * <p> 示例值：20220801
         */
        this.eventBusyDate = builder.eventBusyDate;
        /**
         * 日程最多一天的日程数量
         * <p> 示例值：123
         */
        this.eventBusyDateEventCount = builder.eventBusyDateEventCount;
        /**
         * 2022全年，此用户最经常的日程开始时间，精确到分钟，HH:mm格式
         * <p> 示例值：10:00
         */
        this.eventStartTimeRange1 = builder.eventStartTimeRange1;
        /**
         * 2022全年，基于此用户所创建的日程，发起了视频会议的次数
         * <p> 示例值：123
         */
        this.conferenceCreateCount = builder.conferenceCreateCount;
        /**
         * 2022全年，基于此用户所创建的日程发起的视频会议，涉及的参会总人次
         * <p> 示例值：123
         */
        this.totalPartiCount = builder.totalPartiCount;
        /**
         * 2022全年此用户写过的O的数量（未删除）
         * <p> 示例值：123
         */
        this.okrCumOCount = builder.okrCumOCount;
        /**
         * 2022全年此用户写过的KR的数量（未删除）
         * <p> 示例值：123
         */
        this.okrCumKrCount = builder.okrCumKrCount;
        /**
         * 2022全年用户所写的OKR对齐过的去重人数（未删除）
         * <p> 示例值：123
         */
        this.okrAlignedUserCount = builder.okrAlignedUserCount;
        /**
         * 2022全年用户在飞书招聘上进行的面试总场次（候选人是海外账号的未参与计算）
         * <p> 示例值：123
         */
        this.peopleInterviewNum = builder.peopleInterviewNum;
        /**
         * 2022全年此用户发出邮件数量
         * <p> 示例值：123
         */
        this.sendEmailCount = builder.sendEmailCount;
        /**
         * 2022全年此用户收到邮件数量
         * <p> 示例值：123
         */
        this.receiveEmailCount = builder.receiveEmailCount;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserRegisterDate() {
        return this.userRegisterDate;
    }

    public void setUserRegisterDate(String userRegisterDate) {
        this.userRegisterDate = userRegisterDate;
    }

    public Integer getActiveDayCount() {
        return this.activeDayCount;
    }

    public void setActiveDayCount(Integer activeDayCount) {
        this.activeDayCount = activeDayCount;
    }

    public String getMsgBusyDate() {
        return this.msgBusyDate;
    }

    public void setMsgBusyDate(String msgBusyDate) {
        this.msgBusyDate = msgBusyDate;
    }

    public String getMsgBusyDateSendMsgCount() {
        return this.msgBusyDateSendMsgCount;
    }

    public void setMsgBusyDateSendMsgCount(String msgBusyDateSendMsgCount) {
        this.msgBusyDateSendMsgCount = msgBusyDateSendMsgCount;
    }

    public String getP2pChatCount() {
        return this.p2pChatCount;
    }

    public void setP2pChatCount(String p2pChatCount) {
        this.p2pChatCount = p2pChatCount;
    }

    public String getTalkedChatCount() {
        return this.talkedChatCount;
    }

    public void setTalkedChatCount(String talkedChatCount) {
        this.talkedChatCount = talkedChatCount;
    }

    public String getPositiveReactionCount() {
        return this.positiveReactionCount;
    }

    public void setPositiveReactionCount(String positiveReactionCount) {
        this.positiveReactionCount = positiveReactionCount;
    }

    public String getFirstPositiveReaction() {
        return this.firstPositiveReaction;
    }

    public void setFirstPositiveReaction(String firstPositiveReaction) {
        this.firstPositiveReaction = firstPositiveReaction;
    }

    public String getSecondPositiveReaction() {
        return this.secondPositiveReaction;
    }

    public void setSecondPositiveReaction(String secondPositiveReaction) {
        this.secondPositiveReaction = secondPositiveReaction;
    }

    public String getThirdPositiveReaction() {
        return this.thirdPositiveReaction;
    }

    public void setThirdPositiveReaction(String thirdPositiveReaction) {
        this.thirdPositiveReaction = thirdPositiveReaction;
    }

    public String getFourthPositiveReaction() {
        return this.fourthPositiveReaction;
    }

    public void setFourthPositiveReaction(String fourthPositiveReaction) {
        this.fourthPositiveReaction = fourthPositiveReaction;
    }

    public String getFifthPositiveReaction() {
        return this.fifthPositiveReaction;
    }

    public void setFifthPositiveReaction(String fifthPositiveReaction) {
        this.fifthPositiveReaction = fifthPositiveReaction;
    }

    public String getCreateFileCount() {
        return this.createFileCount;
    }

    public void setCreateFileCount(String createFileCount) {
        this.createFileCount = createFileCount;
    }

    public String getCreatedFileViewCount() {
        return this.createdFileViewCount;
    }

    public void setCreatedFileViewCount(String createdFileViewCount) {
        this.createdFileViewCount = createdFileViewCount;
    }

    public String getCommentFileCount() {
        return this.commentFileCount;
    }

    public void setCommentFileCount(String commentFileCount) {
        this.commentFileCount = commentFileCount;
    }

    public String getAttendEventCount() {
        return this.attendEventCount;
    }

    public void setAttendEventCount(String attendEventCount) {
        this.attendEventCount = attendEventCount;
    }

    public String getEventBusyDate() {
        return this.eventBusyDate;
    }

    public void setEventBusyDate(String eventBusyDate) {
        this.eventBusyDate = eventBusyDate;
    }

    public String getEventBusyDateEventCount() {
        return this.eventBusyDateEventCount;
    }

    public void setEventBusyDateEventCount(String eventBusyDateEventCount) {
        this.eventBusyDateEventCount = eventBusyDateEventCount;
    }

    public String getEventStartTimeRange1() {
        return this.eventStartTimeRange1;
    }

    public void setEventStartTimeRange1(String eventStartTimeRange1) {
        this.eventStartTimeRange1 = eventStartTimeRange1;
    }

    public String getConferenceCreateCount() {
        return this.conferenceCreateCount;
    }

    public void setConferenceCreateCount(String conferenceCreateCount) {
        this.conferenceCreateCount = conferenceCreateCount;
    }

    public String getTotalPartiCount() {
        return this.totalPartiCount;
    }

    public void setTotalPartiCount(String totalPartiCount) {
        this.totalPartiCount = totalPartiCount;
    }

    public String getOkrCumOCount() {
        return this.okrCumOCount;
    }

    public void setOkrCumOCount(String okrCumOCount) {
        this.okrCumOCount = okrCumOCount;
    }

    public String getOkrCumKrCount() {
        return this.okrCumKrCount;
    }

    public void setOkrCumKrCount(String okrCumKrCount) {
        this.okrCumKrCount = okrCumKrCount;
    }

    public String getOkrAlignedUserCount() {
        return this.okrAlignedUserCount;
    }

    public void setOkrAlignedUserCount(String okrAlignedUserCount) {
        this.okrAlignedUserCount = okrAlignedUserCount;
    }

    public String getPeopleInterviewNum() {
        return this.peopleInterviewNum;
    }

    public void setPeopleInterviewNum(String peopleInterviewNum) {
        this.peopleInterviewNum = peopleInterviewNum;
    }

    public String getSendEmailCount() {
        return this.sendEmailCount;
    }

    public void setSendEmailCount(String sendEmailCount) {
        this.sendEmailCount = sendEmailCount;
    }

    public String getReceiveEmailCount() {
        return this.receiveEmailCount;
    }

    public void setReceiveEmailCount(String receiveEmailCount) {
        this.receiveEmailCount = receiveEmailCount;
    }

    public static class Builder {
        /**
         * 用户id
         * <p> 示例值：ou_7dab8a3d3cdcc9da365777c7ad535d62
         */
        private String userId;
        /**
         * 用户的飞书激活日期，yyyyMMdd格式（201909之前的用户可能是空
         * <p> 示例值：20220726
         */
        private String userRegisterDate;
        /**
         * 用户2022年内在飞书有活跃的天数
         * <p> 示例值：120
         */
        private Integer activeDayCount;
        /**
         * 2022全年用户发出消息条数最多的一天，yyyyMMdd格式
         * <p> 示例值：20220817
         */
        private String msgBusyDate;
        /**
         * 全年发消息最多一天，发出的消息数
         * <p> 示例值：588
         */
        private String msgBusyDateSendMsgCount;
        /**
         * 2022全年与此用户有过单聊的人数（双方任意一人发出过消息即计入）
         * <p> 示例值：22
         */
        private String p2pChatCount;
        /**
         * 2022全年用户有过发言的飞书群的数量
         * <p> 示例值：18
         */
        private String talkedChatCount;
        /**
         * 2022全年用户所发消息，收到点赞、送心、碰拳等正面表情回复的总次数
         * <p> 示例值：100
         */
        private String positiveReactionCount;
        /**
         * 用户所收到的正向表情回复，排第1的表情
         * <p> 示例值：thumbsup
         */
        private String firstPositiveReaction;
        /**
         * 用户所收到的正向表情回复，排第2的表情
         * <p> 示例值：muscle
         */
        private String secondPositiveReaction;
        /**
         * 用户所收到的正向表情回复，排第3的表情
         * <p> 示例值：fingerheart
         */
        private String thirdPositiveReaction;
        /**
         * 用户所收到的正向表情回复，排第4的表情
         * <p> 示例值：applaud
         */
        private String fourthPositiveReaction;
        /**
         * 用户所收到的正向表情回复，排第5的表情
         * <p> 示例值：fistbump
         */
        private String fifthPositiveReaction;
        /**
         * 2022全年用户本人创建过的飞书文档数量
         * <p> 示例值：12
         */
        private String createFileCount;
        /**
         * 此用户2022年创建的飞书文档的总阅读人数（含自己）
         * <p> 示例值：11
         */
        private String createdFileViewCount;
        /**
         * 2022全年用户发表过评论的飞书文档数量
         * <p> 示例值：11
         */
        private String commentFileCount;
        /**
         * 2022全年用户的日程总数（主日历日程，排除被删除的日程及用户拒绝、移除的日程，包括全天日程和重复日程，重复日程在周期内计算为多次）
         * <p> 示例值：123
         */
        private String attendEventCount;
        /**
         * 2022全年用户日程数量最多的一天，yyyyMMdd格式
         * <p> 示例值：20220801
         */
        private String eventBusyDate;
        /**
         * 日程最多一天的日程数量
         * <p> 示例值：123
         */
        private String eventBusyDateEventCount;
        /**
         * 2022全年，此用户最经常的日程开始时间，精确到分钟，HH:mm格式
         * <p> 示例值：10:00
         */
        private String eventStartTimeRange1;
        /**
         * 2022全年，基于此用户所创建的日程，发起了视频会议的次数
         * <p> 示例值：123
         */
        private String conferenceCreateCount;
        /**
         * 2022全年，基于此用户所创建的日程发起的视频会议，涉及的参会总人次
         * <p> 示例值：123
         */
        private String totalPartiCount;
        /**
         * 2022全年此用户写过的O的数量（未删除）
         * <p> 示例值：123
         */
        private String okrCumOCount;
        /**
         * 2022全年此用户写过的KR的数量（未删除）
         * <p> 示例值：123
         */
        private String okrCumKrCount;
        /**
         * 2022全年用户所写的OKR对齐过的去重人数（未删除）
         * <p> 示例值：123
         */
        private String okrAlignedUserCount;
        /**
         * 2022全年用户在飞书招聘上进行的面试总场次（候选人是海外账号的未参与计算）
         * <p> 示例值：123
         */
        private String peopleInterviewNum;
        /**
         * 2022全年此用户发出邮件数量
         * <p> 示例值：123
         */
        private String sendEmailCount;
        /**
         * 2022全年此用户收到邮件数量
         * <p> 示例值：123
         */
        private String receiveEmailCount;

        /**
         * 用户id
         * <p> 示例值：ou_7dab8a3d3cdcc9da365777c7ad535d62
         *
         * @param userId
         * @return
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }


        /**
         * 用户的飞书激活日期，yyyyMMdd格式（201909之前的用户可能是空
         * <p> 示例值：20220726
         *
         * @param userRegisterDate
         * @return
         */
        public Builder userRegisterDate(String userRegisterDate) {
            this.userRegisterDate = userRegisterDate;
            return this;
        }


        /**
         * 用户2022年内在飞书有活跃的天数
         * <p> 示例值：120
         *
         * @param activeDayCount
         * @return
         */
        public Builder activeDayCount(Integer activeDayCount) {
            this.activeDayCount = activeDayCount;
            return this;
        }


        /**
         * 2022全年用户发出消息条数最多的一天，yyyyMMdd格式
         * <p> 示例值：20220817
         *
         * @param msgBusyDate
         * @return
         */
        public Builder msgBusyDate(String msgBusyDate) {
            this.msgBusyDate = msgBusyDate;
            return this;
        }


        /**
         * 全年发消息最多一天，发出的消息数
         * <p> 示例值：588
         *
         * @param msgBusyDateSendMsgCount
         * @return
         */
        public Builder msgBusyDateSendMsgCount(String msgBusyDateSendMsgCount) {
            this.msgBusyDateSendMsgCount = msgBusyDateSendMsgCount;
            return this;
        }


        /**
         * 2022全年与此用户有过单聊的人数（双方任意一人发出过消息即计入）
         * <p> 示例值：22
         *
         * @param p2pChatCount
         * @return
         */
        public Builder p2pChatCount(String p2pChatCount) {
            this.p2pChatCount = p2pChatCount;
            return this;
        }


        /**
         * 2022全年用户有过发言的飞书群的数量
         * <p> 示例值：18
         *
         * @param talkedChatCount
         * @return
         */
        public Builder talkedChatCount(String talkedChatCount) {
            this.talkedChatCount = talkedChatCount;
            return this;
        }


        /**
         * 2022全年用户所发消息，收到点赞、送心、碰拳等正面表情回复的总次数
         * <p> 示例值：100
         *
         * @param positiveReactionCount
         * @return
         */
        public Builder positiveReactionCount(String positiveReactionCount) {
            this.positiveReactionCount = positiveReactionCount;
            return this;
        }


        /**
         * 用户所收到的正向表情回复，排第1的表情
         * <p> 示例值：thumbsup
         *
         * @param firstPositiveReaction
         * @return
         */
        public Builder firstPositiveReaction(String firstPositiveReaction) {
            this.firstPositiveReaction = firstPositiveReaction;
            return this;
        }


        /**
         * 用户所收到的正向表情回复，排第2的表情
         * <p> 示例值：muscle
         *
         * @param secondPositiveReaction
         * @return
         */
        public Builder secondPositiveReaction(String secondPositiveReaction) {
            this.secondPositiveReaction = secondPositiveReaction;
            return this;
        }


        /**
         * 用户所收到的正向表情回复，排第3的表情
         * <p> 示例值：fingerheart
         *
         * @param thirdPositiveReaction
         * @return
         */
        public Builder thirdPositiveReaction(String thirdPositiveReaction) {
            this.thirdPositiveReaction = thirdPositiveReaction;
            return this;
        }


        /**
         * 用户所收到的正向表情回复，排第4的表情
         * <p> 示例值：applaud
         *
         * @param fourthPositiveReaction
         * @return
         */
        public Builder fourthPositiveReaction(String fourthPositiveReaction) {
            this.fourthPositiveReaction = fourthPositiveReaction;
            return this;
        }


        /**
         * 用户所收到的正向表情回复，排第5的表情
         * <p> 示例值：fistbump
         *
         * @param fifthPositiveReaction
         * @return
         */
        public Builder fifthPositiveReaction(String fifthPositiveReaction) {
            this.fifthPositiveReaction = fifthPositiveReaction;
            return this;
        }


        /**
         * 2022全年用户本人创建过的飞书文档数量
         * <p> 示例值：12
         *
         * @param createFileCount
         * @return
         */
        public Builder createFileCount(String createFileCount) {
            this.createFileCount = createFileCount;
            return this;
        }


        /**
         * 此用户2022年创建的飞书文档的总阅读人数（含自己）
         * <p> 示例值：11
         *
         * @param createdFileViewCount
         * @return
         */
        public Builder createdFileViewCount(String createdFileViewCount) {
            this.createdFileViewCount = createdFileViewCount;
            return this;
        }


        /**
         * 2022全年用户发表过评论的飞书文档数量
         * <p> 示例值：11
         *
         * @param commentFileCount
         * @return
         */
        public Builder commentFileCount(String commentFileCount) {
            this.commentFileCount = commentFileCount;
            return this;
        }


        /**
         * 2022全年用户的日程总数（主日历日程，排除被删除的日程及用户拒绝、移除的日程，包括全天日程和重复日程，重复日程在周期内计算为多次）
         * <p> 示例值：123
         *
         * @param attendEventCount
         * @return
         */
        public Builder attendEventCount(String attendEventCount) {
            this.attendEventCount = attendEventCount;
            return this;
        }


        /**
         * 2022全年用户日程数量最多的一天，yyyyMMdd格式
         * <p> 示例值：20220801
         *
         * @param eventBusyDate
         * @return
         */
        public Builder eventBusyDate(String eventBusyDate) {
            this.eventBusyDate = eventBusyDate;
            return this;
        }


        /**
         * 日程最多一天的日程数量
         * <p> 示例值：123
         *
         * @param eventBusyDateEventCount
         * @return
         */
        public Builder eventBusyDateEventCount(String eventBusyDateEventCount) {
            this.eventBusyDateEventCount = eventBusyDateEventCount;
            return this;
        }


        /**
         * 2022全年，此用户最经常的日程开始时间，精确到分钟，HH:mm格式
         * <p> 示例值：10:00
         *
         * @param eventStartTimeRange1
         * @return
         */
        public Builder eventStartTimeRange1(String eventStartTimeRange1) {
            this.eventStartTimeRange1 = eventStartTimeRange1;
            return this;
        }


        /**
         * 2022全年，基于此用户所创建的日程，发起了视频会议的次数
         * <p> 示例值：123
         *
         * @param conferenceCreateCount
         * @return
         */
        public Builder conferenceCreateCount(String conferenceCreateCount) {
            this.conferenceCreateCount = conferenceCreateCount;
            return this;
        }


        /**
         * 2022全年，基于此用户所创建的日程发起的视频会议，涉及的参会总人次
         * <p> 示例值：123
         *
         * @param totalPartiCount
         * @return
         */
        public Builder totalPartiCount(String totalPartiCount) {
            this.totalPartiCount = totalPartiCount;
            return this;
        }


        /**
         * 2022全年此用户写过的O的数量（未删除）
         * <p> 示例值：123
         *
         * @param okrCumOCount
         * @return
         */
        public Builder okrCumOCount(String okrCumOCount) {
            this.okrCumOCount = okrCumOCount;
            return this;
        }


        /**
         * 2022全年此用户写过的KR的数量（未删除）
         * <p> 示例值：123
         *
         * @param okrCumKrCount
         * @return
         */
        public Builder okrCumKrCount(String okrCumKrCount) {
            this.okrCumKrCount = okrCumKrCount;
            return this;
        }


        /**
         * 2022全年用户所写的OKR对齐过的去重人数（未删除）
         * <p> 示例值：123
         *
         * @param okrAlignedUserCount
         * @return
         */
        public Builder okrAlignedUserCount(String okrAlignedUserCount) {
            this.okrAlignedUserCount = okrAlignedUserCount;
            return this;
        }


        /**
         * 2022全年用户在飞书招聘上进行的面试总场次（候选人是海外账号的未参与计算）
         * <p> 示例值：123
         *
         * @param peopleInterviewNum
         * @return
         */
        public Builder peopleInterviewNum(String peopleInterviewNum) {
            this.peopleInterviewNum = peopleInterviewNum;
            return this;
        }


        /**
         * 2022全年此用户发出邮件数量
         * <p> 示例值：123
         *
         * @param sendEmailCount
         * @return
         */
        public Builder sendEmailCount(String sendEmailCount) {
            this.sendEmailCount = sendEmailCount;
            return this;
        }


        /**
         * 2022全年此用户收到邮件数量
         * <p> 示例值：123
         *
         * @param receiveEmailCount
         * @return
         */
        public Builder receiveEmailCount(String receiveEmailCount) {
            this.receiveEmailCount = receiveEmailCount;
            return this;
        }


        public UserReport2022 build() {
            return new UserReport2022(this);
        }
    }
}
