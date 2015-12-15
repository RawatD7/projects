package com.insoft.projectCucumber;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseMain {
	
	static WebDriver driver;
	public void openBrowser(){
		driver = new FirefoxDriver();
		driver.get("http://enterprise.demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
//close browser
	public void closeBrowser(){
		
		driver.quit();
	}
	

}
