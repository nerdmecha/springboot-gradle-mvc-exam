package com.board.demo0524;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class Demo0524Application {
	public static void main(String[] args) {
		SpringApplication.run(Demo0524Application.class, args);
	}
}