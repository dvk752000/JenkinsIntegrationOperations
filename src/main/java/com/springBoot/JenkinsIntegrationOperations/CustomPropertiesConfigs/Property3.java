package com.springBoot.JenkinsIntegrationOperations.CustomPropertiesConfigs;

import java.util.ArrayList;
import java.util.List;

class Property3{
	private List<String> val1 = new ArrayList<String>();
	private List<Integer> val2 = new ArrayList<Integer>();
	public List<String> getVal1() {
		return val1;
	}
	public void setVal1(List<String> val1) {
		this.val1 = val1;
	}
	public List<Integer> getVal2() {
		return val2;
	}
	public void setVal2(List<Integer> val2) {
		this.val2 = val2;
	}
	@Override
	public String toString() {
		return "Property3 [val1=" + val1 + ", val2=" + val2 + "]";
	}
	
}
