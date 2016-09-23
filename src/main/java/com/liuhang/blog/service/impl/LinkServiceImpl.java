/**
 * @author:liuhang
 * @date:2016年9月23日
 * @Description:TODO
 */
package com.liuhang.blog.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.liuhang.blog.dao.LinkMapper;
import com.liuhang.blog.entity.Link;
import com.liuhang.blog.service.LinkService;

@Service
public class LinkServiceImpl implements LinkService {
  @Resource
  private LinkMapper mapper;

  public List<Link> getLinks() {
    return this.mapper.getLinks();
  }
}
