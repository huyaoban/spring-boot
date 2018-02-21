package com.huyaoban.springboot.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/**
 * @PropertySource注解会把app.properties属性文件加载到Spring环境中
 * @author Administrator
 *
 */
@Configuration
// @Profile("dev")
@PropertySource("classpath:/com/huyaoban/springboot/soundsystem/app.properties")
public class CDConfig {
	@Autowired
	private Environment env;

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
		return new SgtPeppers(env.getProperty("disc.title"), env.getProperty("disc.artist"));
	}

	@Bean(name = "sgtPeppers")
	@Profile("qa")
	public CompactDisc sgtPeppersQA() {
		return new SgtPeppers(env.getProperty("disc.title"), env.getProperty("disc.artist"));
	}

	@Bean(name = "sgtPeppers")
	@Profile("prod")
	public CompactDisc sgtPeppersProd() {
		return new SgtPeppers(env.getProperty("disc.title"), env.getProperty("disc.artist"));
	}
}
