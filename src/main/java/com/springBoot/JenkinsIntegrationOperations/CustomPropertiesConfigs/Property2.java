package com.springBoot.JenkinsIntegrationOperations.CustomPropertiesConfigs;

class Property2{
	private int val1=0;
	private int val2=0;
	private int val3=0;
	public int getVal1() {
		return val1;
	}
	public void setVal1(int val1) {
		this.val1 = val1;
	}
	public int getVal2() {
		return val2;
	}
	public void setVal2(int val2) {
		this.val2 = val2;
	}
	public int getVal3() {
		return val3;
	}
	public void setVal3(int val3) {
		this.val3 = val3;
	}
	@Override
	public String toString() {
		return "Property2 [val1=" + val1 + ", val2=" + val2 + ", val3=" + val3 + "]";
	}
}