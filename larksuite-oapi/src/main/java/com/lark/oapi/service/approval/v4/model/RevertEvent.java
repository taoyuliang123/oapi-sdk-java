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

package com.lark.oapi.service.approval.v4.model;

import com.google.gson.annotations.SerializedName;

public class RevertEvent {
    /**
     * 类型
     * <p> 示例值：normal_approval_revert
     */
    @SerializedName("type")
    private String type;
    /**
     * 实例code
     * <p> 示例值：C04A783E-D0BB-4036-BADC-31BECC6DDA29
     */
    @SerializedName("instance_code")
    private String instanceCode;
    /**
     * 操作时间
     * <p> 示例值：1675758455
     */
    @SerializedName("operate_time")
    private String operateTime;
    /**
     * 状态
     * <p> 示例值：REVERTED
     */
    @SerializedName("status")
    private String status;

    // builder 开始
    public RevertEvent() {
    }

    public RevertEvent(Builder builder) {
        /**
         * 类型
         * <p> 示例值：normal_approval_revert
         */
        this.type = builder.type;
        /**
         * 实例code
         * <p> 示例值：C04A783E-D0BB-4036-BADC-31BECC6DDA29
         */
        this.instanceCode = builder.instanceCode;
        /**
         * 操作时间
         * <p> 示例值：1675758455
         */
        this.operateTime = builder.operateTime;
        /**
         * 状态
         * <p> 示例值：REVERTED
         */
        this.status = builder.status;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getInstanceCode() {
        return this.instanceCode;
    }

    public void setInstanceCode(String instanceCode) {
        this.instanceCode = instanceCode;
    }

    public String getOperateTime() {
        return this.operateTime;
    }

    public void setOperateTime(String operateTime) {
        this.operateTime = operateTime;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public static class Builder {
        /**
         * 类型
         * <p> 示例值：normal_approval_revert
         */
        private String type;
        /**
         * 实例code
         * <p> 示例值：C04A783E-D0BB-4036-BADC-31BECC6DDA29
         */
        private String instanceCode;
        /**
         * 操作时间
         * <p> 示例值：1675758455
         */
        private String operateTime;
        /**
         * 状态
         * <p> 示例值：REVERTED
         */
        private String status;

        /**
         * 类型
         * <p> 示例值：normal_approval_revert
         *
         * @param type
         * @return
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }


        /**
         * 实例code
         * <p> 示例值：C04A783E-D0BB-4036-BADC-31BECC6DDA29
         *
         * @param instanceCode
         * @return
         */
        public Builder instanceCode(String instanceCode) {
            this.instanceCode = instanceCode;
            return this;
        }


        /**
         * 操作时间
         * <p> 示例值：1675758455
         *
         * @param operateTime
         * @return
         */
        public Builder operateTime(String operateTime) {
            this.operateTime = operateTime;
            return this;
        }


        /**
         * 状态
         * <p> 示例值：REVERTED
         *
         * @param status
         * @return
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }


        public RevertEvent build() {
            return new RevertEvent(this);
        }
    }
}
