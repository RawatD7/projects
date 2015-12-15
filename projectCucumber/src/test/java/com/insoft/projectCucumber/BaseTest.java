package com.insoft.projectCucumber;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class BaseTest {
	BaseMain main = new BaseMain();
		@Before
		public void set(){
		main.openBrowser();
		
	}
	
	@After
	public void get(){
		
	main.closeBrowser();	
		
	}
	
	
	
	

}
