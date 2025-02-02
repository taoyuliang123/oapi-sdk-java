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

package com.lark.oapi.service.sheets.v3.model;

import com.google.gson.annotations.SerializedName;

public class Text {
    /**
     * 文本值
     * <p> 示例值：abc
     */
    @SerializedName("text")
    private String text;
    /**
     * <p> 示例值：
     */
    @SerializedName("segment_style")
    private SegmentStyle segmentStyle;

    // builder 开始
    public Text() {
    }

    public Text(Builder builder) {
        /**
         * 文本值
         * <p> 示例值：abc
         */
        this.text = builder.text;
        /**
         *
         * <p> 示例值：
         */
        this.segmentStyle = builder.segmentStyle;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public SegmentStyle getSegmentStyle() {
        return this.segmentStyle;
    }

    public void setSegmentStyle(SegmentStyle segmentStyle) {
        this.segmentStyle = segmentStyle;
    }

    public static class Builder {
        /**
         * 文本值
         * <p> 示例值：abc
         */
        private String text;
        /**
         * <p> 示例值：
         */
        private SegmentStyle segmentStyle;

        /**
         * 文本值
         * <p> 示例值：abc
         *
         * @param text
         * @return
         */
        public Builder text(String text) {
            this.text = text;
            return this;
        }


        /**
         * <p> 示例值：
         *
         * @param segmentStyle
         * @return
         */
        public Builder segmentStyle(SegmentStyle segmentStyle) {
            this.segmentStyle = segmentStyle;
            return this;
        }


        public Text build() {
            return new Text(this);
        }
    }
}
