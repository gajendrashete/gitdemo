package com.gitlearn.gitdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(GitdemoApplication.class, args);
	}

	public int getOne() { 
		return 1; 
	}

	public int getTwo() { 
		return 2; 
	}

	public int getThree() {
		return 3;
	}
}
