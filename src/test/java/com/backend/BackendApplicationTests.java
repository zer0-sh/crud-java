package com.backend;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BackendApplicationTests {

	@Test
	void contextLoads() {
		BackendApplication app = new BackendApplication();
		assertEquals("Hello World", app.getGreeting(), "Greeting should be 'Hello World'");
	}

}
