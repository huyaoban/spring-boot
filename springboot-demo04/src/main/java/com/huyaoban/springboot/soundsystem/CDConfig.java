package com.huyaoban.springboot.soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
// @Profile("dev")
public class CDConfig {
	/**
	 * Profile注解告诉Spring这个Bean只有在dev profile激活时才创建
	 * Profile注解也可用在类上面，表明这个类里面的Bean只有dev profile激活时才创建。在XML配置中，可以使用
	 * <beans>元素的profile属性来配置<beans profile="dev">
	 * 
	 * @return
	 */
	@Bean(name = "sgtPeppers")
	@Profile("dev")
	public CompactDisc sgtPeppersDev() {
		return new SgtPeppers();
	}

	@Bean(name = "sgtPeppers")
	@Profile("qa")
	public CompactDisc sgtPeppersQA() {
		return new SgtPeppers();
	}

	@Bean(name = "sgtPeppers")
	@Profile("prod")
	public CompactDisc sgtPeppersProd() {
		return new SgtPeppers();
	}
}
