package com.liuhang.blog.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.liuhang.blog.entity.Blogger;

@RestController
public class RestfulApiTest
{
	@RequestMapping(value="/blogger/{id}")
	public Blogger restApi1(@PathVariable("id") int id)
	{
		Blogger blogger=new Blogger();
		blogger.setBloggerId(id);
		blogger.setPassWord("liuhang");
		blogger.setUserName("liuhang");
		return blogger;
	}

}
