package com.huyaoban.springboot.soundsystem;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
@ActiveProfiles("dev")
public class CDPlayerTest {
	@Autowired
	private CompactDisc cd;

	@Autowired
	private MediaPlayer player;

	@Test
	public void cdShouldNotBeNull() {
		Assert.assertNotNull(cd);
	}

	@Test
	public void play() {
		Assert.assertNotNull(player);
		player.play();
	}

}
