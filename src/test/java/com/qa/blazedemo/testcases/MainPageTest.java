package com.qa.blazedemo.testcases;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.blazedemo.Pages.MainPage;
import com.qa.blazedemo.base.TestBase;

public class MainPageTest extends TestBase{

	MainPage mp;
	
	@BeforeClass
	public void openBroswer() {
		
		mp = new MainPage();
	}
	@Test(priority=1)
	void clickdestinationTest() {
		mp.clickdestination();
	}
	@Test(priority=1)
	void clickTravellinkTest() {
		mp.clickTravellink();
	}
	
}
