package com.coco.security;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.coco.config.RootConfig;
import com.coco.config.SecurityConfig;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {RootConfig.class, SecurityConfig.class})
@Log4j
public class PasswordEncoderTest {

	@Autowired
	private PasswordEncoder pwEncoder;
	
	@Test
	public void testEncode() {
		String str = "member";
		String enStr = pwEncoder.encode(str);
		
		log.info("---------------------------------------------");
		log.info(enStr);
		log.info("---------------------------------------------");

	}
	
}
