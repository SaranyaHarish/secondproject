package com.object.Junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookApplication {

	static WebDriver driver;
	
	@Before
	public void launchUrl(){
		//System.setProperty("Browser name","the location of browser executable file");
	 System.setProperty("webdriver.chrome.driver", "/Users/Saranya/Downloads/chromedriver 7");
	 driver= new ChromeDriver();//selenium can understand that we are using chrome driver
	 driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void testLogin(){
		WebElement userName=driver.findElement(By.id("email"));
		userName.sendKeys("saranya");
		
		WebElement passWord= driver.findElement(By.id("pass"));
		passWord.sendKeys("1234");
		
		driver.findElement(By.name("login")).click();
	}
	
	
	@After
	public void afterTest(){
		driver.close();
	}
}
