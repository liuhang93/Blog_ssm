package com.liuhang.blog.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.liuhang.blog.entity.Blogger;
import com.liuhang.blog.service.BloggerService;

@RestController
public class RestfulApiTest {
  @Resource
  private BloggerService service;

  @RequestMapping(value = "/blogger/{id}")
  public Blogger restApi1(@PathVariable("id") String id) {
    Blogger blogger = new Blogger();
    blogger.setId(id);
    blogger.setPassWord("liuhang");
    blogger.setUserName("liuhang");
    return blogger;
  }

  @RequestMapping(value = "data/{id}")
  public Blogger restApi2(@PathVariable("id") String id) {
    return this.service.getBloggerById(id);
  }

}
