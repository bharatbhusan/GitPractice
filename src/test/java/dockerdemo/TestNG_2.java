package dockerdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestNG_2 {

	@Test(groups="sequential-test")
	public void TestNG2_test1()
	{
		System.out.println("TestNG2.test1");
		WebDriver  driver= new FirefoxDriver();
		
		driver.get("https://www.gmail.com");
	}
	
	@Test(groups="sequential-test")
	public void TestNG2_test2()
	{
		System.out.println("TestNG2.test2");
		WebDriver  driver= new ChromeDriver();
		driver.get("https://www.cricbuzz.com");
	}
	
	@Test
	public void TestNG2_test3()
	{
		System.out.println("TestNG2.test3");
		WebDriver  driver= new ChromeDriver();
		driver.get("https://www.youtube.com");
	}
}
