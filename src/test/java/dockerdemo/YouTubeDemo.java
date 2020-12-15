package dockerdemo;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class YouTubeDemo {
	WebDriver driver;
	FlashObjectWebDriver flashDriver;
	String url = "https://www.youtube.com/watch?v=diWkA-NqKBk";
	
	@BeforeMethod
	@Parameters("browser")
	public void setUp(String browserName)
	{
		if(browserName.equalsIgnoreCase("firefox"))
		{
			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setBrowserName(BrowserType.FIREFOX);
			try
			{
				System.out.println("Firefox");
				driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), cap); 
			}
			catch(MalformedURLException e)
			{
				System.out.println(e.getStackTrace());
			}
		}
		else
		if(browserName.equalsIgnoreCase("chrome"))
		{
			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setBrowserName(BrowserType.CHROME);
			try
			{	
				System.out.println("Chrome");
				driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), cap); 
			}
			catch(MalformedURLException e)
			{
				System.out.println(e.getStackTrace());
			}
		}
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
	}
	
	@Test
	public void getTitle() throws MalformedURLException
	{
		
		System.out.println(driver.getTitle());
	}
    @AfterMethod
    public void tearDown()
    {
    	driver.quit();
    }
}
