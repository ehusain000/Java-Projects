package com.eftekher;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class checkBoxes {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.gecko.driver", "/Users/eftekherhusain/Downloads//geckodriver 2");
		WebDriver dr = new FirefoxDriver();
		
		dr.get("https://www.linkedin.com/");
		dr.findElement(By.xpath("html/body/div[1]/main/div/div[1]/div/form/input[1]")).sendKeys("heftekher2281@gmail.com");
		dr.findElement(By.xpath("html/body/div[1]/main/div/div[1]/div/form/input[2]")).sendKeys("Matinbd^5");
		dr.findElement(By.xpath("html/body/div[1]/main/div/div[1]/div/form/input[3]")).click();
		dr.findElement(By.xpath("html/body/nav/div/ul[1]/li[2]/a/span[2]")).click();
		
		dr.findElement(By.xpath("html/body/div[5]/div[4]/div[2]/div[2]/div/div[2]/div/section[2]/ul/li[1]/div[2]/button")).click();
		dr.findElement(By.xpath("html/body/div[5]/div[4]/div[2]/div[2]/div/div[2]/div/section[2]/ul/li[4]/div[2]/button")).click();
		dr.findElement(By.xpath("html/body/div[5]/div[4]/div[2]/div[2]/div/div[2]/div/section[2]/ul/li[5]/div[2]/button")).click();
		dr.findElement(By.xpath("html/body/div[5]/div[4]/div[2]/div[2]/div/div[2]/div/section[2]/ul/li[6]/div[2]/button")).click();
		//dr.findElement(By.xpath("")).click();
		//dr.findElement(By.xpath("")).click();
		

	}

}
