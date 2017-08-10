package io.pivotal.gemfire.durableclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("clientCache.xml")
public class DurableClientExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(DurableClientExampleApplication.class, args);
	}
}
