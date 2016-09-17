/**
 * @author:liuhang
 * @date:2016年9月17日
 * @Description:TODO
 */
package com.liuhang.blog.controller;

/*
 * 导入类的静态方法和静态域
 */
import static org.springframework.web.bind.annotation.RequestMethod.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;





@Controller
public class HomeController {
  @RequestMapping(value="/",method=GET)
  public String home()
  {
    return "index";
  }
}
