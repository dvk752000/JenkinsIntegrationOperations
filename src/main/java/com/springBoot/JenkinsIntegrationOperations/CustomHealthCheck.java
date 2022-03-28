package com.springBoot.JenkinsIntegrationOperations;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;  


@Component
@EnableScheduling
public class CustomHealthCheck implements HealthIndicator {
	
	@Scheduled(cron="1 * * * * *")
    @Override
    public Health health() {
        int errorCode = check(); // perform some specific health check
        if (errorCode != 200) {
        	System.out.println("Server is DOWN");
            return Health.down()
              .withDetail("Error Code", errorCode).build();
        }
        System.out.println("Server is UP");
        return Health.up().build();
    }
    
    public int check() {
    	// Our logic to check health
    	try {
        	URL url = new URL("http://localhost:8081");
        	HttpURLConnection http = (HttpURLConnection)url.openConnection();
        	
        	String password = "password";  
            String user = "vamsi";  
            String userpass = user + ":" + password;  
            String basicAuth = "Basic " + new String(Base64.getEncoder().encode(userpass.getBytes()));
            http.setRequestProperty("Authorization", basicAuth);

        	int statusCode = http.getResponseCode();
        	System.out.println(statusCode);
        	return statusCode;
    	}
    	catch(Exception e) {
    		System.out.println("Exception Occured: " + e);
    	}
    	return 0;
    }
}
