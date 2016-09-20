/**
 * @author:liuhang
 * @date:2016年9月16日
 * @Description:博主实体
 */
package com.liuhang.blog.entity;

public class Blogger {
  private String id;
  private String userName;
  private String passWord;

  public void setId(String id) {
    this.id = id;
  }

  public String getId() {
    return this.id;
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
