package com.springBoot.JenkinsIntegrationOperations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsIntegrationOperationsApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(JenkinsIntegrationOperationsApplication.class, args);
	}

	@Autowired
	private CustomPropertiesConfiguration customPropertiesConfiguration;
	@Override
	public void run(String... args) throws Exception {
		System.out.println(customPropertiesConfiguration);
		
	}

}
