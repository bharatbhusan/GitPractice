package dockerdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestNG_3 {

	@Test
	public void TestNG1_test1()
	{
		System.out.println("TestNG1.test1");
		WebDriver  driver= new FirefoxDriver();
		driver.get("https://www.google.com");
	}
	
	@Test(groups="sequential-test")
	public void TestNG1_test2()
	{
		System.out.println("TestNG1.test2");
		WebDriver  driver= new FirefoxDriver();
		driver.get("https://www.facebook.com");
	}
	
	@Test
	public void TestNG1_test3()
	{
		System.out.println("TestNG1.test3");
		WebDriver  driver= new FirefoxDriver();
		driver.get("https://www.cricinfo.com");
	}
}
