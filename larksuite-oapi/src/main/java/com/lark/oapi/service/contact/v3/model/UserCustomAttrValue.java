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

package com.lark.oapi.service.contact.v3.model;

import com.google.gson.annotations.SerializedName;

public class UserCustomAttrValue {

  /**
   * 字段类型为`TEXT`时该参数定义字段值，必填；字段类型为`HREF`时该参数定义网页标题，必填
   * <p> 示例值：DemoText
   */
  @SerializedName("text")
  private String text;
  /**
   * 字段类型为 HREF 时，该参数定义默认 URL，例如手机端跳转小程序，PC端跳转网页
   * <p> 示例值：http://www.feishu.cn
   */
  @SerializedName("url")
  private String url;
  /**
   * 字段类型为 HREF 时，该参数定义PC端 URL
   * <p> 示例值：http://www.feishu.cn
   */
  @SerializedName("pc_url")
  private String pcUrl;
  /**
   * 字段类型为 ENUMERATION 或 PICTURE_ENUM 时，该参数定义选项值
   * <p> 示例值：edcvfrtg
   */
  @SerializedName("option_id")
  private String optionId;
  /**
   * 选项类型的值。;;表示 成员详情/自定义字段 中选项选中的值
   * <p> 示例值：option
   */
  @SerializedName("option_value")
  private String optionValue;
  /**
   * 选项类型为图片时，表示图片的名称
   * <p> 示例值：name
   */
  @SerializedName("name")
  private String name;
  /**
   * 图片链接
   * <p> 示例值：https://xxxxxxxxxxxxxxxxxx
   */
  @SerializedName("picture_url")
  private String pictureUrl;
  /**
   * 字段类型为 GENERIC_USER 时，该参数定义引用人员
   * <p> 示例值：
   */
  @SerializedName("generic_user")
  private CustomAttrGenericUser genericUser;

  // builder 开始
  public UserCustomAttrValue() {
  }

  public UserCustomAttrValue(Builder builder) {
    /**
     * 字段类型为`TEXT`时该参数定义字段值，必填；字段类型为`HREF`时该参数定义网页标题，必填
     * <p> 示例值：DemoText
     */
    this.text = builder.text;
    /**
     * 字段类型为 HREF 时，该参数定义默认 URL，例如手机端跳转小程序，PC端跳转网页
     * <p> 示例值：http://www.feishu.cn
     */
    this.url = builder.url;
    /**
     * 字段类型为 HREF 时，该参数定义PC端 URL
     * <p> 示例值：http://www.feishu.cn
     */
    this.pcUrl = builder.pcUrl;
    /**
     * 字段类型为 ENUMERATION 或 PICTURE_ENUM 时，该参数定义选项值
     * <p> 示例值：edcvfrtg
     */
    this.optionId = builder.optionId;
    /**
     * 选项类型的值。;;表示 成员详情/自定义字段 中选项选中的值
     * <p> 示例值：option
     */
    this.optionValue = builder.optionValue;
    /**
     * 选项类型为图片时，表示图片的名称
     * <p> 示例值：name
     */
    this.name = builder.name;
    /**
     * 图片链接
     * <p> 示例值：https://xxxxxxxxxxxxxxxxxx
     */
    this.pictureUrl = builder.pictureUrl;
    /**
     * 字段类型为 GENERIC_USER 时，该参数定义引用人员
     * <p> 示例值：
     */
    this.genericUser = builder.genericUser;
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

  public String getUrl() {
    return this.url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public String getPcUrl() {
    return this.pcUrl;
  }

  public void setPcUrl(String pcUrl) {
    this.pcUrl = pcUrl;
  }

  public String getOptionId() {
    return this.optionId;
  }

  public void setOptionId(String optionId) {
    this.optionId = optionId;
  }

  public String getOptionValue() {
    return this.optionValue;
  }

  public void setOptionValue(String optionValue) {
    this.optionValue = optionValue;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPictureUrl() {
    return this.pictureUrl;
  }

  public void setPictureUrl(String pictureUrl) {
    this.pictureUrl = pictureUrl;
  }

  public CustomAttrGenericUser getGenericUser() {
    return this.genericUser;
  }

  public void setGenericUser(CustomAttrGenericUser genericUser) {
    this.genericUser = genericUser;
  }

  public static class Builder {

    /**
     * 字段类型为`TEXT`时该参数定义字段值，必填；字段类型为`HREF`时该参数定义网页标题，必填
     * <p> 示例值：DemoText
     */
    private String text;
    /**
     * 字段类型为 HREF 时，该参数定义默认 URL，例如手机端跳转小程序，PC端跳转网页
     * <p> 示例值：http://www.feishu.cn
     */
    private String url;
    /**
     * 字段类型为 HREF 时，该参数定义PC端 URL
     * <p> 示例值：http://www.feishu.cn
     */
    private String pcUrl;
    /**
     * 字段类型为 ENUMERATION 或 PICTURE_ENUM 时，该参数定义选项值
     * <p> 示例值：edcvfrtg
     */
    private String optionId;
    /**
     * 选项类型的值。;;表示 成员详情/自定义字段 中选项选中的值
     * <p> 示例值：option
     */
    private String optionValue;
    /**
     * 选项类型为图片时，表示图片的名称
     * <p> 示例值：name
     */
    private String name;
    /**
     * 图片链接
     * <p> 示例值：https://xxxxxxxxxxxxxxxxxx
     */
    private String pictureUrl;
    /**
     * 字段类型为 GENERIC_USER 时，该参数定义引用人员
     * <p> 示例值：
     */
    private CustomAttrGenericUser genericUser;

    /**
     * 字段类型为`TEXT`时该参数定义字段值，必填；字段类型为`HREF`时该参数定义网页标题，必填
     * <p> 示例值：DemoText
     *
     * @param text
     * @return
     */
    public Builder text(String text) {
      this.text = text;
      return this;
    }


    /**
     * 字段类型为 HREF 时，该参数定义默认 URL，例如手机端跳转小程序，PC端跳转网页
     * <p> 示例值：http://www.feishu.cn
     *
     * @param url
     * @return
     */
    public Builder url(String url) {
      this.url = url;
      return this;
    }


    /**
     * 字段类型为 HREF 时，该参数定义PC端 URL
     * <p> 示例值：http://www.feishu.cn
     *
     * @param pcUrl
     * @return
     */
    public Builder pcUrl(String pcUrl) {
      this.pcUrl = pcUrl;
      return this;
    }


    /**
     * 字段类型为 ENUMERATION 或 PICTURE_ENUM 时，该参数定义选项值
     * <p> 示例值：edcvfrtg
     *
     * @param optionId
     * @return
     */
    public Builder optionId(String optionId) {
      this.optionId = optionId;
      return this;
    }


    /**
     * 选项类型的值。;;表示 成员详情/自定义字段 中选项选中的值
     * <p> 示例值：option
     *
     * @param optionValue
     * @return
     */
    public Builder optionValue(String optionValue) {
      this.optionValue = optionValue;
      return this;
    }


    /**
     * 选项类型为图片时，表示图片的名称
     * <p> 示例值：name
     *
     * @param name
     * @return
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }


    /**
     * 图片链接
     * <p> 示例值：https://xxxxxxxxxxxxxxxxxx
     *
     * @param pictureUrl
     * @return
     */
    public Builder pictureUrl(String pictureUrl) {
      this.pictureUrl = pictureUrl;
      return this;
    }


    /**
     * 字段类型为 GENERIC_USER 时，该参数定义引用人员
     * <p> 示例值：
     *
     * @param genericUser
     * @return
     */
    public Builder genericUser(CustomAttrGenericUser genericUser) {
      this.genericUser = genericUser;
      return this;
    }


    public UserCustomAttrValue build() {
      return new UserCustomAttrValue(this);
    }
  }
}
