package com.springBoot.JenkinsIntegrationOperations.CustomPropertiesConfigs;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "custom")
public class CustomPropertiesConfiguration {

	private Property1 property1 = new Property1();

	private Property2 property2 = new Property2();
	
	private Property3 property3 = new Property3();
	
	public Property1 getProperty1() {
		return property1;
	}
	public void setProperty1(Property1 property1) {
		this.property1 = property1;
	}
	public Property2 getProperty2() {
		return property2;
	}
	public void setProperty2(Property2 property2) {
		this.property2 = property2;
	}
	public Property3 getProperty3() {
		return property3;
	}
	public void setProperty3(Property3 property3) {
		this.property3 = property3;
	}
	
	@Override
	public String toString() {
		return "CustomPropertiesConfiguration [\nproperty1=" + property1 + ", \nproperty2=" + property2 + ", \nproperty3="
				+ property3 + "]";
	}
	
	public String temp() {
		return property1.toString();
	}
}
