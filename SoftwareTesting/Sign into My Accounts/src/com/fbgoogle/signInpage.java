package com.fbgoogle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class signInpage {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/Users/eftekherhusain/Downloads//geckodriver 2");
		WebDriver dr = new FirefoxDriver();
		dr.getCurrentUrl();
		
		
		
		

	}

}
