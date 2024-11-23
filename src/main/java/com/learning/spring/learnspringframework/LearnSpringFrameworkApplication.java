package com.learning.spring.learnspringframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.learning.spring.learnspringframework.enterprise.example.MyWebController;
import com.learning.spring.learnspringframework.game.GameRunner;

@SpringBootApplication
public class LearnSpringFrameworkApplication {
	
		

	public static void main(String[] args) {
		
	//1- Tight Coupling
	/*
	 * MarioGame game = new MarioGame(); SuperContraGame game = new
	 * SuperContraGame(); GameRunner runner = new GameRunner(game);
	 * runner.run();
	 */
		
	//2- Loose coupling -Interface
	//We can also use the GamingConsole interface object and pass in GameRunner constructor
	/*
	 * GamingConsole gameConsole = new PacmanGame();
	 * GameRunner runner = new GameRunner(gameConsole);
	 * runner.run();
	 */
	
	//3 Loose coupling Spring
		
		ConfigurableApplicationContext configAppContext
			= SpringApplication.run(LearnSpringFrameworkApplication.class, args);
		
		GameRunner runner = configAppContext.getBean(GameRunner.class);
		runner.run();
		
		MyWebController webController = configAppContext.getBean(MyWebController.class);
	
		System.out.println(webController.getValueFromBusinessService());
		
	}

}
