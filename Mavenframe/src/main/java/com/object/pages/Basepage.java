package com.object.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Basepage {

	public static WebDriver driver;
	
	public String browser = "chrome";
	
	public Basepage(){
		if(driver==null){
			if(browser.equals("chrome")){
				//System.setProperty("Browser name","the location of browser executable file");
				System.setProperty("webdriver.chrome.driver", "/Users/Saranya/Downloads/chromedriver 7");
			 driver= new ChromeDriver();//selenium can understand that we are using chrome driver
				
			}
			
			else if(browser.equals("firefox")){
				//System.setProperty("Browser name","the location of browser executable file");
				System.setProperty("webdriver.chrome.driver", "/Users/Saranya/Downloads/chromedriver 7");
				 driver= new FirefoxDriver();//selenium can understand that we are using chrom driver
			}
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			
			driver.get("https://www.facebook.com/");
		}
	}
	
	public boolean elementFound(WebElement element){
		boolean result = false;
		try {
			result = element.isDisplayed();
		}
		catch (Exception e){
			e.printStackTrace();
		}
		return result;
		
		
	}
	
	public String setText(WebElement element1,String name)
{
	if(name!=null){
		element1.click();
		element1.clear();
		element1.sendKeys(name);
	}
	return name;


}
	
	public String getTxtAttribute(WebElement element2){
		return element2.getAttribute("Value");
	}
	
	public void buttonClick(WebElement element){
		element.click();
	}
	
	public String getTitle(){
		return driver.getTitle();
	}
	
	public void quitDriver(){
		driver.quit();
	}
}

