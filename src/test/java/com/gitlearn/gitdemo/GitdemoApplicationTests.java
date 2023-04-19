package com.gitlearn.gitdemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GitdemoApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void testOne() { 
		GitdemoApplication gda = new GitdemoApplication(); 
		assertEquals(1, gda.getOne(), "getOne is ok");
	}

	@Test
	void testTwo() { 
		GitdemoApplication gda = new GitdemoApplication(); 
		assertEquals(2, gda.getTwo(), "getTwo is ok");
	}
}
