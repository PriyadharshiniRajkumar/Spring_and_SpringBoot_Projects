package com.priyalearning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootLearningApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(SpringBootLearningApplication.class, args);
		Aliens a = context.getBean(Aliens.class);
		a.show();
		
		
		/*ex. for prototype scope
		 * Aliens a1 = context.getBean(Aliens.class); a1.show();
		 */
		
	}

}
