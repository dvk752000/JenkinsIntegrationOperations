package com.springBoot.JenkinsIntegrationOperations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.health.Health;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	//CustomPropertiesConfiguration customPropertiesConfiguration;
	
	@Autowired
	CustomHealthCheck customHealthCheck;
	
	
    @GetMapping("/")
    public String sendGreeting(){
    	//System.out.println(val1);
        return "Home Page";
    }
	
	@GetMapping("/health")
	public Health checkHealth() {
		return customHealthCheck.health();
	}
}
