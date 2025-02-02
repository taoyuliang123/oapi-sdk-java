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

package com.lark.oapi.service.hire.v1.model;

import com.google.gson.annotations.SerializedName;

public class Referral {
    /**
     * 内推的 ID
     * <p> 示例值：6643786345878
     */
    @SerializedName("id")
    private String id;
    /**
     * 投递 ID
     * <p> 示例值：643452344576878
     */
    @SerializedName("application_id")
    private String applicationId;
    /**
     * 创建时间（ms）
     * <p> 示例值：1618899376474
     */
    @SerializedName("create_time")
    private Integer createTime;
    /**
     * 内推人的 ID
     * <p> 示例值：ou_xxxx
     */
    @SerializedName("referral_user_id")
    private String referralUserId;
    /**
     * 内推人信息
     * <p> 示例值：
     */
    @SerializedName("referral_user")
    private IdNameObject referralUser;

    // builder 开始
    public Referral() {
    }

    public Referral(Builder builder) {
        /**
         * 内推的 ID
         * <p> 示例值：6643786345878
         */
        this.id = builder.id;
        /**
         * 投递 ID
         * <p> 示例值：643452344576878
         */
        this.applicationId = builder.applicationId;
        /**
         * 创建时间（ms）
         * <p> 示例值：1618899376474
         */
        this.createTime = builder.createTime;
        /**
         * 内推人的 ID
         * <p> 示例值：ou_xxxx
         */
        this.referralUserId = builder.referralUserId;
        /**
         * 内推人信息
         * <p> 示例值：
         */
        this.referralUser = builder.referralUser;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getApplicationId() {
        return this.applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public Integer getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public String getReferralUserId() {
        return this.referralUserId;
    }

    public void setReferralUserId(String referralUserId) {
        this.referralUserId = referralUserId;
    }

    public IdNameObject getReferralUser() {
        return this.referralUser;
    }

    public void setReferralUser(IdNameObject referralUser) {
        this.referralUser = referralUser;
    }

    public static class Builder {
        /**
         * 内推的 ID
         * <p> 示例值：6643786345878
         */
        private String id;
        /**
         * 投递 ID
         * <p> 示例值：643452344576878
         */
        private String applicationId;
        /**
         * 创建时间（ms）
         * <p> 示例值：1618899376474
         */
        private Integer createTime;
        /**
         * 内推人的 ID
         * <p> 示例值：ou_xxxx
         */
        private String referralUserId;
        /**
         * 内推人信息
         * <p> 示例值：
         */
        private IdNameObject referralUser;

        /**
         * 内推的 ID
         * <p> 示例值：6643786345878
         *
         * @param id
         * @return
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }


        /**
         * 投递 ID
         * <p> 示例值：643452344576878
         *
         * @param applicationId
         * @return
         */
        public Builder applicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }


        /**
         * 创建时间（ms）
         * <p> 示例值：1618899376474
         *
         * @param createTime
         * @return
         */
        public Builder createTime(Integer createTime) {
            this.createTime = createTime;
            return this;
        }


        /**
         * 内推人的 ID
         * <p> 示例值：ou_xxxx
         *
         * @param referralUserId
         * @return
         */
        public Builder referralUserId(String referralUserId) {
            this.referralUserId = referralUserId;
            return this;
        }


        /**
         * 内推人信息
         * <p> 示例值：
         *
         * @param referralUser
         * @return
         */
        public Builder referralUser(IdNameObject referralUser) {
            this.referralUser = referralUser;
            return this;
        }


        public Referral build() {
            return new Referral(this);
        }
    }
}
