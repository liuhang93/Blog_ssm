/**
 * @author:liuhang
 * @date:2016年9月23日
 * @Description:友情链接数据库接口
 */
package com.liuhang.blog.dao;

import java.util.List;

import com.liuhang.blog.entity.Link;

public interface LinkMapper {
  public List<Link> getLinks();
}
