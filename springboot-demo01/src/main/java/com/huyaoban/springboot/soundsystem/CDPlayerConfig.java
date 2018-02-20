package com.huyaoban.springboot.soundsystem;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 组件扫描默认是不启用的，这里启用了组件扫描。 它命令Spring去扫描带了Component注解的类，并为其创建Bean。
 * ComponentScan默认扫描与配置类相同的包及其子包。可通过basePackages属性指定要扫描的包。
 * 
 * @author Administrator
 *
 */
@Configuration
// @ComponentScan
// @ComponentScan("com.huyaoban.springboot.soundsystem")
// @ComponentScan(basePackages = "com.huyaoban.springboot.soundsystem")
@ComponentScan(basePackages = { "com.huyaoban.springboot.soundsystem" })
public class CDPlayerConfig {

}
