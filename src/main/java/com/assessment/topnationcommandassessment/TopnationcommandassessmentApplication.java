package com.assessment.topnationcommandassessment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.assessment.topnationcommandassessment")
public class TopnationcommandassessmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(TopnationcommandassessmentApplication.class, args);
	}

}
