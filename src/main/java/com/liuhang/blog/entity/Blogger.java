/**
 * @author:liuhang
 * @date:2016年9月16日
 * @Description:博主实体
 */
package com.liuhang.blog.entity;

public class Blogger {
  private int bloggerId;
  private String userName;
  private String passWord;

  public void setBloggerId(int bloggerId) {
    this.bloggerId = bloggerId;
  }

  public int getBloggerId() {
    return this.bloggerId;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getUerName() {
    return this.userName;
  }

  public void setPassWord(String passWord) {
    this.passWord = passWord;
  }

  public String getPassWord() {
    return this.passWord;
  }
}
