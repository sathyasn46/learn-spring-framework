package com.learning.spring.learnspringframework.game;

import org.springframework.stereotype.Component;

@Component
public class PacmanGame implements GamingConsole {

	
	public void up() {
		System.out.println("Move up Maze");
	}
	public void down() {
		System.out.println("Move down Maze");
	}
	public void left() { 
		System.out.println("Move left Maze");
	}
	public void right() {
		System.out.println("move right Maze");
	}
}
