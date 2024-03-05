package io.ankole.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestApplicationConfiguration {

	public static void main(String[] args) {
		SpringApplication.from(Ankole::main).with(TestApplicationConfiguration.class).run(args);
	}

}
