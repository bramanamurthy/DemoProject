package com.automationcicd.DemoProject;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class TestClass 
{
	WebDriver driver;
	
	
	@BeforeMethod
	public void launchDriver()
	{		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void test1()
	{
		driver.navigate().to("https://automationtalks.com/");
		System.out.println("Test 1--> "+driver.getTitle());
		driver.quit();
	}
	
	@Test
	public void test2()
	{
		driver.navigate().to("https://automationtalks.com/");
		System.out.println("Test 2--> "+driver.getTitle());
		driver.quit();
	}
	
	@Test
	public void test3()
	{
		driver.navigate().to("https://automationtalks.com/");
		System.out.println("Test 3--> "+driver.getTitle());
		driver.quit();
	}
}
