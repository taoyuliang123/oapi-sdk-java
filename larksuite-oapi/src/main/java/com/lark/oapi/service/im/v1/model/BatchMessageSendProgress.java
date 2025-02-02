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

package com.lark.oapi.service.im.v1.model;

import com.google.gson.annotations.SerializedName;

public class BatchMessageSendProgress {
    /**
     * 批量请求中有效的userid数量(包含机器人不可见用户);;;;**注意**： ;当valid_user_ids_count为0有两种情况：;* 批量任务还没有开始被调度（请等待一会再调用该接口）;* 批量发送消息时传入的所有openIDs、employeID、departmentiIDs都不包含有效的用户
     * <p> 示例值：204
     */
    @SerializedName("valid_user_ids_count")
    private Integer validUserIdsCount;
    /**
     * 已经成功给用户发送成功的消息数量;;;;**注意**：最终success_user_ids_count不一定等于valid_user_ids_count, 因为valid_user_ids_count包含了对机器人不可见的用户
     * <p> 示例值：200
     */
    @SerializedName("success_user_ids_count")
    private Integer successUserIdsCount;
    /**
     * 已读信息用户数量
     * <p> 示例值：150
     */
    @SerializedName("read_user_ids_count")
    private Integer readUserIdsCount;

    // builder 开始
    public BatchMessageSendProgress() {
    }

    public BatchMessageSendProgress(Builder builder) {
        /**
         * 批量请求中有效的userid数量(包含机器人不可见用户);;;;**注意**： ;当valid_user_ids_count为0有两种情况：;* 批量任务还没有开始被调度（请等待一会再调用该接口）;* 批量发送消息时传入的所有openIDs、employeID、departmentiIDs都不包含有效的用户
         * <p> 示例值：204
         */
        this.validUserIdsCount = builder.validUserIdsCount;
        /**
         * 已经成功给用户发送成功的消息数量;;;;**注意**：最终success_user_ids_count不一定等于valid_user_ids_count, 因为valid_user_ids_count包含了对机器人不可见的用户
         * <p> 示例值：200
         */
        this.successUserIdsCount = builder.successUserIdsCount;
        /**
         * 已读信息用户数量
         * <p> 示例值：150
         */
        this.readUserIdsCount = builder.readUserIdsCount;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Integer getValidUserIdsCount() {
        return this.validUserIdsCount;
    }

    public void setValidUserIdsCount(Integer validUserIdsCount) {
        this.validUserIdsCount = validUserIdsCount;
    }

    public Integer getSuccessUserIdsCount() {
        return this.successUserIdsCount;
    }

    public void setSuccessUserIdsCount(Integer successUserIdsCount) {
        this.successUserIdsCount = successUserIdsCount;
    }

    public Integer getReadUserIdsCount() {
        return this.readUserIdsCount;
    }

    public void setReadUserIdsCount(Integer readUserIdsCount) {
        this.readUserIdsCount = readUserIdsCount;
    }

    public static class Builder {
        /**
         * 批量请求中有效的userid数量(包含机器人不可见用户);;;;**注意**： ;当valid_user_ids_count为0有两种情况：;* 批量任务还没有开始被调度（请等待一会再调用该接口）;* 批量发送消息时传入的所有openIDs、employeID、departmentiIDs都不包含有效的用户
         * <p> 示例值：204
         */
        private Integer validUserIdsCount;
        /**
         * 已经成功给用户发送成功的消息数量;;;;**注意**：最终success_user_ids_count不一定等于valid_user_ids_count, 因为valid_user_ids_count包含了对机器人不可见的用户
         * <p> 示例值：200
         */
        private Integer successUserIdsCount;
        /**
         * 已读信息用户数量
         * <p> 示例值：150
         */
        private Integer readUserIdsCount;

        /**
         * 批量请求中有效的userid数量(包含机器人不可见用户);;;;**注意**： ;当valid_user_ids_count为0有两种情况：;* 批量任务还没有开始被调度（请等待一会再调用该接口）;* 批量发送消息时传入的所有openIDs、employeID、departmentiIDs都不包含有效的用户
         * <p> 示例值：204
         *
         * @param validUserIdsCount
         * @return
         */
        public Builder validUserIdsCount(Integer validUserIdsCount) {
            this.validUserIdsCount = validUserIdsCount;
            return this;
        }


        /**
         * 已经成功给用户发送成功的消息数量;;;;**注意**：最终success_user_ids_count不一定等于valid_user_ids_count, 因为valid_user_ids_count包含了对机器人不可见的用户
         * <p> 示例值：200
         *
         * @param successUserIdsCount
         * @return
         */
        public Builder successUserIdsCount(Integer successUserIdsCount) {
            this.successUserIdsCount = successUserIdsCount;
            return this;
        }


        /**
         * 已读信息用户数量
         * <p> 示例值：150
         *
         * @param readUserIdsCount
         * @return
         */
        public Builder readUserIdsCount(Integer readUserIdsCount) {
            this.readUserIdsCount = readUserIdsCount;
            return this;
        }


        public BatchMessageSendProgress build() {
            return new BatchMessageSendProgress(this);
        }
    }
}
