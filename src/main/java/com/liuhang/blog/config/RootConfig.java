/**
 * @author:liuhang
 * @date:2016年9月16日
 * @Description:TODO
 */
package com.liuhang.blog.config;

import java.io.IOException;

import javax.sql.DataSource;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternUtils;

import com.alibaba.druid.pool.DruidDataSource;

@Configuration
@ComponentScan(basePackages="com.liuhang.blog.service.impl")
public class RootConfig {
  /*
   * 配置数据库源
   */
  @Bean
  public DataSource getDataSource() {
    DruidDataSource dataSource = new DruidDataSource();
    dataSource.setDriverClassName("com.mysql.jdbc.Driver");
    dataSource.setUrl("jdbc:mysql://localhost:3306/db_blog");
    dataSource.setUsername("root");
    dataSource.setPassword("root");
    return dataSource;
  }

  /*
   * 配置SqlSessionFactoryBean
   */
  @Bean(name = "sqlSessionFactoryBean")
  public SqlSessionFactoryBean getSqlSessionFactoryBean() throws IOException {
    SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
    sqlSessionFactoryBean.setDataSource(getDataSource());
    ResourcePatternResolver resolver =
        ResourcePatternUtils.getResourcePatternResolver(new DefaultResourceLoader());
    sqlSessionFactoryBean.setMapperLocations(resolver.getResources("mappers/*.xml"));
    return sqlSessionFactoryBean;
  }

  @Bean
  public MapperScannerConfigurer getMapperScannerConfigurer() {
    MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
    mapperScannerConfigurer.setBasePackage("com.liuhang.blog.dao");
    mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactoryBean");
    return mapperScannerConfigurer;
  }
}
