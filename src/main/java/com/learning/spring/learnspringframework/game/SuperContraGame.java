package com.learning.spring.learnspringframework.game;

import org.springframework.stereotype.Component;

@Component
public class SuperContraGame implements GamingConsole {

	
	public void up() {
		System.out.println(" Contra Jump");
	}
	public void down() {
		System.out.println("Contra Duck");
	}
	public void left() {
		System.out.println("Move left");
	}
	public void right() {
		System.out.println("move right");
	}
}
