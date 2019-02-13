package com.signin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class signIn {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/Users/eftekherhusain/Downloads//geckodriver 2");
		WebDriver dr = new FirefoxDriver();
		
		dr.get("https://www.facebook.com/");
		dr.findElement(By.xpath("html/body/div[1]/div[2]/div/div/div/div/div[2]/form/table/tbody/tr[2]/td[1]/input")).sendKeys("abdcd123%@yahoo.com");
		dr.findElement(By.xpath("html/body/div[1]/div[2]/div/div/div/div/div[2]/form/table/tbody/tr[2]/td[2]/input")).sendKeys("1234mdbs");
		dr.findElement(By.xpath("html/body/div[1]/div[2]/div/div/div/div/div[2]/form/table/tbody/tr[2]/td[3]/label/input")).click();
		
			 

	}

}
