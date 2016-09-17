/**
 * @author:liuhang
 * @date:2016年9月16日
 * @Description:TODO
 */
package com.liuhang.blog.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages="com.liuhang.blog.controller")
public class WebConfig {
  @Bean
  public ViewResolver viewResolver()
  {
    InternalResourceViewResolver resolver=new InternalResourceViewResolver();
    resolver.setPrefix("/WEB-INF/home/");
    resolver.setSuffix(".jsp");
    return resolver;
  } 
}
