/**
 * @author:liuhang
 * @date:2016年9月16日
 * @Description:博客实体
 */
package com.liuhang.blog.entity;

public class Blog {
  private int blogId;
  private String title;
  
  public void setBlogId(int id)
  {
    this.blogId=id;
  }
  public int getBlogId()
  {
    return this.blogId;
  }
  
  public void setTitle(String title)
  {
    this.title=title;
  }
  public String getTitle()
  {
    return this.title;
  }
  
  

}
