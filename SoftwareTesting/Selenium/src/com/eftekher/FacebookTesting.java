package com.eftekher;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookTesting {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "/Users/eftekherhusain/Downloads//geckodriver 2");
		WebDriver dr = new FirefoxDriver();
		
		dr.get("https://www.facebook.com/");
		dr.findElement(By.xpath("html/body/div[1]/div[2]/div/div/div/div/div[2]/form/table/tbody/tr[2]/td[1]/input")).sendKeys("heftekher2281@gmail.com");
		dr.findElement(By.xpath("html/body/div[1]/div[2]/div/div/div/div/div[2]/form/table/tbody/tr[2]/td[2]/input")).sendKeys("Dunkin1$");
		dr.findElement(By.xpath("html/body/div[1]/div[2]/div/div/div/div/div[2]/form/table/tbody/tr[2]/td[3]/label/input")).click();
		//dr.findElement(By.xpath("")).click();
		dr.findElement(By.xpath("html/body/div[1]/div[3]/div[1]/div/div[2]/div[2]/div[1]/div[2]/div/div[3]/div/div/div[2]/div[1]/div/div/div/div[2]/div/div[1]/div/div[1]/div[2]/div/div/div")).sendKeys("I just signed in on fb with just code :-) LOL ");
		dr.findElement(By.xpath("html/body/div[1]/div[3]/div[1]/div/div[2]/div[2]/div[1]/div[2]/div/div[3]/div/div/div[2]/div[1]/div/div/div/div[2]/div/div[2]/div[3]/div/div[1]/div/div[1]/div/div/div/a/span[2]")).click();
		dr.findElement(By.xpath("html/body/div[1]/div[3]/div[3]/div/div/div/div/div[1]/div/div/ul/li[5]/a/span/span")).click();
		dr.findElement(By.xpath("html/body/div[1]/div[3]/div[3]/div/div/div/div/div[1]/div/div/ul/li[7]/a/span/span")).click();
		dr.findElement(By.xpath("html/body/div[1]/div[3]/div[1]/div/div[2]/div[2]/div[1]/div[2]/div/div[3]/div/div/div[2]/div[1]/div/div/div/div[2]/div/div[2]/div[3]/div/div[2]/div/button")).click();
		
		Thread.sleep(2000);
		
		

	}

}
