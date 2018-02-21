package com.huyaoban.springboot.soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration表明这是一个配置类，该类包含了Spring应用上下文中如何创建Bean的细节。
 * Bean注解会告诉Spring，这个方法将会返回一个对象，该对象要注册为Spring应用上下文中的Bean。
 * 默认情况下Bean的ID就是方法名。可通过name属性，指定一个ID。
 * 
 * @author Administrator
 *
 */
@Configuration
public class CDPlayerConfig {
	@Bean(name = "sgtPeppers")
	public CompactDisc sgtPeppers() {
		return new SgtPeppers();
	}

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
