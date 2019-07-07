package com.automationcicd.DemoProject;

import org.testng.annotations.Test;

import com.functions.Common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class TestClass 
{
	WebDriver driver;
	
	@BeforeMethod
	public void launchDriver()
	{		
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
		}
	
	@Test
	public void test1()
	{
		driver.get("https://www.makemytrip.com/flights/");
		System.out.println("Test 1--> "+driver.getTitle());
		
		WebElement loginLink=driver.findElement(By.xpath("//p[text()=' Login or Create Account']"));
		Common.highlightElement(driver, loginLink);
		loginLink.click();
		
		System.out.println("Page Title: "+driver.getTitle());
				
		WebElement createAccount=driver.findElement(By.xpath("//a[text()=' Create New Account ']"));
		Common.highlightElement(driver, createAccount);
		createAccount.click();
		
		WebElement frameElm=driver.findElement(By.xpath("//iframe[@name='webpush-bubble']"));				
		driver.switchTo().frame(frameElm);
		
		WebElement btnClose=driver.findElement(By.xpath("//button[@id='deny']"));
		Common.highlightElement(driver, btnClose);
		btnClose.click();
				
		Common.captureScreenShot(driver);
				
		driver.navigate().to("https://www.google.com/");
		
		System.out.println("Page Title: "+driver.getTitle());	
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
