package com.qa.blazedemo.testcases;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.blazedemo.Pages.ChooseFlightPage;
import com.qa.blazedemo.Pages.FindFlightPage;
import com.qa.blazedemo.base.TestBase;

public class ChooseFlightPageTest extends TestBase{

	FindFlightPage ff;
	ChooseFlightPage cf;
		
	@BeforeClass
	public void openbrowser(){
		
		ff = new FindFlightPage();
		cf= new ChooseFlightPage();
	}

	@Parameters({"departure","destination"})
	@Test(priority='1')
	public void findflightTest(String departure, String destination) throws InterruptedException {
		ff.findFlight(departure, destination);
		cf.fetchflightdetails();
			
	}
		
	@Test(priority='2')
	public void chooseflightTest(){
		cf.chooseflight();
	}
	
}
