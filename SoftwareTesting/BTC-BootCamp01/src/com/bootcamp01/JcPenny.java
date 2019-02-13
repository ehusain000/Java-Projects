package com.bootcamp01;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


/* ************************************************************************************************************************ */

/* **************************************  A3. actions on JC Penny website   ********************************************** */

/* ************************************************************************************************************************ */
public class JcPenny {
	


	@Test
	public void jcPenny() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "/Users/eftekherhusain/Downloads//geckodriver 2");
		WebDriver dr = new FirefoxDriver();
		
		dr.get("http://www.jcpenney.com/");
		Thread.sleep(2000);
		dr.quit();

	}

}
/* ************************************************************************************************************************ */
/* ************************************************************************************************************************ */
