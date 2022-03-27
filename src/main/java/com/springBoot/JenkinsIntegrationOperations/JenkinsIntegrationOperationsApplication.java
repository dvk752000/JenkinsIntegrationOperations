package com.springBoot.JenkinsIntegrationOperations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springBoot.JenkinsIntegrationOperations.CustomPropertiesConfigs.CustomPropertiesConfiguration;

@SpringBootApplication
public class JenkinsIntegrationOperationsApplication implements CommandLineRunner{
	@Autowired
	CustomPropertiesConfiguration customPropertiesConfiguration;
	
	@Autowired
	CustomJenkinsConfiguration customJenkinsConfiguration;
	
	
	public static void main(String[] args) {
		SpringApplication.run(JenkinsIntegrationOperationsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(customPropertiesConfiguration);
		//System.out.println(customJenkinsConfiguration);
	}
}
