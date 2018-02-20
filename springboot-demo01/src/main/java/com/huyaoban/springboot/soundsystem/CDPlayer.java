package com.huyaoban.springboot.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer implements MediaPlayer {
	private CompactDisc cd;

	/**
	 * 如果将Autowired注解放到cd属性上，则需要提供无参构造函数，否则Bean无法实例化
	 * 
	 * @param cd
	 */
	@Autowired
	public CDPlayer(CompactDisc cd) {
		this.cd = cd;
	}

	@Override
	public void play() {
		cd.play();
	}

}
