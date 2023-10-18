package annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("annotation")//if we write in the same package it will take default or if we write in the diffent package we want to write the package name
public class MyConfiguration {

	@Bean
	public Sim getSim()
	{
		return new Airtel();
	}
	
	
}
