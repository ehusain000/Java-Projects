package com.eftekher;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "/Users/eftekherhusain/Downloads//geckodriver 2");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.eshopper24.com/");
		
		

	}

}
