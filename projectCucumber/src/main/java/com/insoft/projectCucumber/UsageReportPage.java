package com.insoft.projectCucumber;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class UsageReportPage extends BaseMain{
	WebElement element;
	Select select = new Select(element);
	
	public void details(){
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();
		
	}
	
	public boolean usageReport(){
		driver.get("http://enterprise.demo.orangehrmlive.com/leave/viewLeaveBalanceReport");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver.findElement(By.xpath("//*[@id='leave-balance-report']/div[1]/h1")).isDisplayed();
		
	}

	
	public void selectLeave(){
		driver.findElement(By.xpath("//*[@id='leave_balance_report_type']"));
	select.selectByVisibleText("Leave Type");	
	driver.findElement(By.xpath("//*[@id='leave_balance_leave_type']"));
	select.selectByVisibleText("FMLA US");
	
		
	}
public void click (){
	driver.findElement(By.xpath("//*[@id='viewBtn']")).click();
	
	
	
}
public boolean viewResult(){
	return driver.findElement(By.xpath(".//*[@id='report-results']/div/table/thead/tr[1]/th[2]")).isDisplayed();
	
	
	
}
	}

	

