package com.qa.blazedemo.testcases;


import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.blazedemo.Pages.ChooseFlightPage;
import com.qa.blazedemo.Pages.FindFlightPage;
import com.qa.blazedemo.Pages.PurchaseflightPage;
import com.qa.blazedemo.base.TestBase;
import com.qa.blazedemo.utils.Xls_dataProvider;

public class PurchaseflightPageTest extends TestBase {
	
	FindFlightPage ff;
	ChooseFlightPage cf;
	PurchaseflightPage pf;
	
	@BeforeClass
	public void openbrowser()
	{
		
		ff = new FindFlightPage();
		cf = new ChooseFlightPage();
		pf = new PurchaseflightPage();
		
	}
	
	@BeforeMethod
	public void ChooseflightTest() throws InterruptedException
	{
		initializtion();
		ff.findFlight("Paris", "London");
		cf.chooseflight();	
	}
	
	@Test(priority='1', dataProvider="testdata")
	public void purchaseFlight(String name, String address, String city, String state
			,String zipCode, String creditCardNumber, String creditCardMonth
			, String creditCardYear, String nameOnCard)
	{
		pf.purchaseFlight(name, address, city, state, zipCode, creditCardNumber, creditCardMonth, creditCardYear, nameOnCard);
	}
	
	// fetch the data form excel sheet and supply that data to the Testmethod
	
	@DataProvider(name="testdata")
	public Object[][] readexcel() throws EncryptedDocumentException, IOException{
		Object input [][]	= Xls_dataProvider.getTestData("Sheet1");
		return input;
	}
	
	@AfterMethod
	public void closeBrowser(){
		driver.close();
	}
}