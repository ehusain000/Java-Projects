

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {

	WebDriver dr;
	@Before
	
	public void start(){
		String x = System.getProperty("browser");
		String y = System.getProperty("runMode");
		
//		FileInputStream f = new FileInputStream("config.properties");
//		Properties p = new Properties();
//		p.load(f);
//		String x = p.getProperty("browser");
//		String y = p.getProperty("runMode");
		
		
	if(x.equals("Firefox"))
	{
		if(y.equals("local"))
		{
			System.setProperty("webdriver.gecko.driver", "/Users/eftekherhusain/Desktop/Driver//geckodriver 2");
			dr = new FirefoxDriver();
			
		}
	}else if (y.equals("remote"))
	{
		System.out.println("ran remotely");
	}
	else if(x.equals("Chrome"))
	{
		if(y.equals("local"))
		{
			System.setProperty("webdriver.chrome.driver", "/Users/eftekherhusain/Desktop/Driver//chromedriver 2");
			dr = new ChromeDriver();
			
		}
	}else if (y.equals("remote"))
	{
		System.out.println("ran remotely");
	}
		
	}
	
	@After
	
	public void close()
	{
		dr.quit();
	}
	
}
