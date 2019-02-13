package loopOnBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class loopOnBrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "/Users/eftekherhusain/Downloads//geckodriver 2");
		WebDriver dr = new FirefoxDriver();
		
		dr.get("https://www.eshopper24.com/");
		java.util.List<WebElement> elements = dr.findElements(By.xpath("//ul[@class='horizontal_list main_menu clearfix']/li"));
		for (WebElement ele : elements){
			System.out.println(ele.getText());
		}
		
		int mSize = elements.size();
		for (int i = 1; i <= mSize; i++)
		{
			dr.findElement(By.xpath("//ul[@class='horizontal_list main_menu clearfix']/li["+i+"]")).click();;
			Thread.sleep(3000);
			int sSize = 
					dr.findElements(By.xpath("")).size();
			for (int j =1; j <= sSize; j++)
			{
				dr.findElement(By.xpath("")).click();
				Thread.sleep(3000);
				dr.navigate().back();
				Thread.sleep(4000);
			}
		}
	}

}
