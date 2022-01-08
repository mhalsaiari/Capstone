package com.qa.blazedemo.testcases;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.blazedemo.Pages.FindFlightPage;
import com.qa.blazedemo.base.TestBase;

public class FindFlightPageTest extends TestBase{
	
	FindFlightPage ff;
	
	@BeforeClass
	public void openbrowser()
	{
		ff = new FindFlightPage();
	}
	
	@Parameters({"departure","destination"})
	@Test(priority='1')
	public void findFlightTest(String departure, String destination) throws InterruptedException
	{
		ff.findFlight(departure,destination);
	}
	
	

}