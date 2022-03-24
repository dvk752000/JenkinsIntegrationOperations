package com.springBoot.JenkinsIntegrationOperations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@Autowired
	CustomPropertiesConfiguration customPropertiesConfiguration;
	
	
	@Value("${custom.property1.val1:Default Text}")
	private String val1;
	
    @GetMapping("")
    public String sendGreeting(){
    	System.out.println(val1);
        return "Value of " + customPropertiesConfiguration;
    }
    
}
