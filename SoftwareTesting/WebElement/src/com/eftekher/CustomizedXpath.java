package com.eftekher;

import org.apache.xpath.operations.String;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomizedXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/Users/eftekherhusain/Downloads//geckodriver 2");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://en-gb.facebook.com/login/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div[1]/div/div/div[2]/form/div/div[3]/button")).click();
		
		


	}

}
