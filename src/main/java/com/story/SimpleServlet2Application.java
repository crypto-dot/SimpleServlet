package com.story;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class SimpleServlet2Application {

	public static void main(String[] args) {
		SpringApplication.run(SimpleServlet2Application.class, args);
	}

}
