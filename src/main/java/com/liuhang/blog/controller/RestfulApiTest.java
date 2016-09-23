package com.liuhang.blog.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.liuhang.blog.entity.Blogger;
import com.liuhang.blog.entity.Link;
import com.liuhang.blog.service.BloggerService;
import com.liuhang.blog.service.LinkService;

@RestController
@RequestMapping("rest")
public class RestfulApiTest {
  @Resource
  private BloggerService bloggerService;
  @Resource
  private LinkService linkService;

  @RequestMapping(value = "/blogger/{id}")
  public Blogger restApi1(@PathVariable("id") String id) {
    Blogger blogger = new Blogger();
    blogger.setId(id);
    blogger.setPassWord("liuhang");
    blogger.setUserName("liuhang");
    return blogger;
  }

  @RequestMapping(value = "/data/{id}")
  public Blogger restApi2(@PathVariable("id") String id) {
    return this.bloggerService.getBloggerById(id);
  }

  @RequestMapping(value = "/links")
  public List<Link> restApi3() {
    return this.linkService.getLinks();
  }

}
