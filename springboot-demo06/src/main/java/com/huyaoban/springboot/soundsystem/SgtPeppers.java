package com.huyaoban.springboot.soundsystem;

/**
 * Component注解表明该类会作为组件类，并告知Spring要为这个类创建Bean，不需要显示配置该Bean。
 * Bean的ID默认是类名第一个字母小写，也可以指定ID。
 * 
 * @author Administrator
 *
 */
// @Component
// @Component("cdBean")
// 显示配置时，可以不使用Component注解
public class SgtPeppers implements CompactDisc {
	private String title = "Sgt. Pepper's Lonely Learts Club Band";
	private String artist = "The Beatles";

	public SgtPeppers() {

	}

	public SgtPeppers(String title, String artist) {
		this.title = title;
		this.artist = artist;
	}

	@Override
	public void play() {
		System.out.println("Playing " + title + " by " + artist);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

}
