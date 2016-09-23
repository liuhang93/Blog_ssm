/**
 * @author:liuhang
 * @date:2016年9月23日
 * @Description:友情链接实体
 */
package com.liuhang.blog.entity;

public class Link {
  private int id;
  private String linkName;
  private String linkUrl;
  private int orderNum;

  public void setId(int id) {
    this.id = id;
  }

  public int getId() {
    return this.id;
  }

  public void setLinkName(String linkName) {
    this.linkName = linkName;
  }

  public String getLinkName() {
    return this.linkName;
  }

  public void setLinkUrl(String linkUrl) {
    this.linkUrl = linkUrl;
  }

  public String getLinkUrl() {
    return this.linkUrl;
  }
}
