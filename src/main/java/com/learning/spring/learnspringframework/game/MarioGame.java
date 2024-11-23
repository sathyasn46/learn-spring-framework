package com.learning.spring.learnspringframework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class MarioGame implements GamingConsole {

	
	public void up() {
		System.out.println("Jump");
	}
	public void down() {
		System.out.println("Go down into hole");
	}
	public void left() {
		System.out.println("Move left");
	}
	public void right() {
		System.out.println("move right");
	}
}
