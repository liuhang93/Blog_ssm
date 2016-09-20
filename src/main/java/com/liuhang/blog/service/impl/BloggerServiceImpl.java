/**
 * @author:liuhang
 * @date:2016年9月20日
 * @Description:TODO
 */
package com.liuhang.blog.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.liuhang.blog.dao.BloggerMapper;
import com.liuhang.blog.entity.Blogger;
import com.liuhang.blog.service.BloggerService;

@Service
public class BloggerServiceImpl implements BloggerService{
  @Resource
  private BloggerMapper mapper;
  public Blogger getBloggerById(String id)
  {
    return mapper.getBloggerById(id);    
  }

}
