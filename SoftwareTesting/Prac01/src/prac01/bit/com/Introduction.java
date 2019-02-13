package prac01.bit.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Introduction {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "/Users/eftekherhusain/Desktop/Everything/Desktop/Driver//geckodriver 2");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.com"); // to hit the url
		System.out.println(driver.getTitle()); // to print the title of the web page in the console
		System.out.println(driver.getPageSource()); //print page source in the console
		System.out.println(driver.getCurrentUrl()); // print the url of the page
		/* Note: if the printed some other url than what is intended, that means your website got hacked! :O */
		driver.close();
	
	}

}
