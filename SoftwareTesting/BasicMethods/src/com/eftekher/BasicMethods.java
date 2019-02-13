package com.eftekher;

import org.openqa.selenium.firefox.FirefoxDriver;



public class BasicMethods {
	
	public static void main(String[] args){
	System.setProperty("webdriver.gecko.driver", "/Users/eftekherhusain/Downloads//geckodriver 2");
	FirefoxDriver dr = new FirefoxDriver();
	dr.get("https://www.google.com");
	}

}
