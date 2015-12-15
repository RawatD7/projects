package com.insoft.projectCucumber;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class usageReport  {
	 UsageReportPage page = new  UsageReportPage();
	 
	 @Given("^After Login$")
	 public void after_Login()  {
		 page.details();
	     
	 }

	 
	 
	@Given("^I am should be on leave entitlement and usage report page$")
	public void i_am_should_be_on_leave_entitlement_and_usage_report_page() {
		boolean b = page.usageReport();
		Assert.assertTrue(b);
	    
	}

	@When("^I enter leave type\"([^\"]*)\" for all the Job Title$")
	public void i_enter_leave_type_for_all_the_Job_Title(String arg1)  {
	   page.selectLeave();
	}

	@When("^In all the location$")
	public void in_all_the_location() {
	    
	}

	@Then("^I should see the usage entitlement table$")
	public void i_should_see_the_usage_entitlement_table() {
	   boolean c = page.viewResult();
	   Assert.assertTrue(c);
	}



}
