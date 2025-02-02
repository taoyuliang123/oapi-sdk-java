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

package com.lark.oapi.service.attendance.v1.model;

import com.google.gson.annotations.SerializedName;

public class Machine {
    /**
     * 考勤机序列号
     * <p> 示例值：FS0701
     */
    @SerializedName("machine_sn")
    private String machineSn;
    /**
     * 考勤机名称
     * <p> 示例值：创实 9 楼
     */
    @SerializedName("machine_name")
    private String machineName;

    // builder 开始
    public Machine() {
    }

    public Machine(Builder builder) {
        /**
         * 考勤机序列号
         * <p> 示例值：FS0701
         */
        this.machineSn = builder.machineSn;
        /**
         * 考勤机名称
         * <p> 示例值：创实 9 楼
         */
        this.machineName = builder.machineName;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getMachineSn() {
        return this.machineSn;
    }

    public void setMachineSn(String machineSn) {
        this.machineSn = machineSn;
    }

    public String getMachineName() {
        return this.machineName;
    }

    public void setMachineName(String machineName) {
        this.machineName = machineName;
    }

    public static class Builder {
        /**
         * 考勤机序列号
         * <p> 示例值：FS0701
         */
        private String machineSn;
        /**
         * 考勤机名称
         * <p> 示例值：创实 9 楼
         */
        private String machineName;

        /**
         * 考勤机序列号
         * <p> 示例值：FS0701
         *
         * @param machineSn
         * @return
         */
        public Builder machineSn(String machineSn) {
            this.machineSn = machineSn;
            return this;
        }


        /**
         * 考勤机名称
         * <p> 示例值：创实 9 楼
         *
         * @param machineName
         * @return
         */
        public Builder machineName(String machineName) {
            this.machineName = machineName;
            return this;
        }


        public Machine build() {
            return new Machine(this);
        }
    }
}
