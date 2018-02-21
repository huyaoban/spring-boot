package com.huyaoban.springboot.soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Import注解导入另外一个配置类中的Bean，可同时导入多个配置类。 ImportResource注解导入XML中的Bean。
 * 
 * @author Administrator
 *
 */
@Configuration
// @Import(CDConfig.class)
@Import({ CDConfig.class })
// @ImportResource("classpath:cd-config.xml")
public class CDPlayerConfig {

	// @Bean
	// public MediaPlayer cdPlayer() {
	// return new CDPlayer(sgtPeppers());
	// // 这种配置方式，要求依赖的Bean定义在同一个配置类中
	// // 如果Bean配置在不同的类中，或者XML中，或者组件扫描中，可通过参数传递进来，参考下面的方法。
	// }

	@Bean
	public MediaPlayer anotherPlayer(CompactDisc cd) {
		// 注册anotherPlayer Bean的时候，Spring会在容器中查找CompactDisc Bean，并注入进来，这是最佳方式
		return new CDPlayer(cd);
	}
}

// 在XML配置中引用JavaConfig的Bean和其它XML配置的Bean
// <bean class="com.huyaoban.springboot.soundsystem.CDConfig"/>
// <import resource="cd-config.xml"/>
