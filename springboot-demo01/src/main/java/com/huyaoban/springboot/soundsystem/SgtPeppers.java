package com.huyaoban.springboot.soundsystem;

import org.springframework.stereotype.Component;

/**
 * Component注解表明该类会作为组件类，并告知Spring要为这个类创建Bean，不需要显示配置该Bean。
 * Bean的ID默认是类名第一个字母小写，也可以指定ID。
 * 
 * @author Administrator
 *
 */
// @Component
@Component("cdBean")
public class SgtPeppers implements CompactDisc {
	private String title = "Sgt. Pepper's Lonely Learts Club Band";
	private String artist = "The Beatles";

	@Override
	public void play() {
		System.out.println("Playing " + title + " by " + artist);
	}

}
