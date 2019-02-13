package com.eftekher;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CloseBrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "/Users/eftekherhusain/Downloads//geckodriver 2");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://en-gb.facebook.com/login/");
		//driver.manage().window().maximize();
		driver.getTitle();
		System.out.println(driver.getTitle());
		driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div[1]/div/div/div[2]/form/div/div[3]/button")).click();
		Thread.sleep(2000);
		

	}

}
