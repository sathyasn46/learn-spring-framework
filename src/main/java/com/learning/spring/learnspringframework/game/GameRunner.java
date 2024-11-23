package com.learning.spring.learnspringframework.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
	
	//private SuperContraGame game;
	@Autowired
	private GamingConsole game;
	// Implementation of interfaces we loose coupled the Game runner class
	//The MarioGame/ContraGame object is eliminated in constructor

	public GameRunner(GamingConsole game) {
		this.game =game;
	}

	public void run() {
		game.up();
		game.down();
		game.left();
		game.right();
	}

}
