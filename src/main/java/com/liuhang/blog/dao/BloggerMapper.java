/**
 * @author:liuhang
 * @date:2016年9月20日
 * @Description:博主信息数据库接口
 */
package com.liuhang.blog.dao;

import com.liuhang.blog.entity.Blogger;

public interface BloggerMapper {
  public Blogger getBloggerById(String id);
}
