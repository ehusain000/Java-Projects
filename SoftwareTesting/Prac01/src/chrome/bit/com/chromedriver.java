package chrome.bit.com;

import org.openqa.selenium.chrome.ChromeDriver;

public class chromedriver {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/eftekherhusain/Desktop/Everything/CODING/SoftwareTesting/Driver//chromedriver 2");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("myemail");
		driver.findElement(By.name("pass")).sendKeys("mypass");
		//driver.findElement(By.linkText("Forgot account?")).click();
		//driver.findElement(By.cssSelector("#login_form > table > tbody > tr:nth-child(3) > td:nth-child(2) > div > a")).click();
		driver.findElement(By.xpath("//*[@id='login_form']/table/tbody/tr[3]/td[2]/div/a")).click();
		
		
	}

}
