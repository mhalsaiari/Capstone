package com.qa.blazedemo.testcases;

import org.testng.annotations.DataProvider;

import com.qa.blazedemo.utils.Xls_dataProvider;

public class PurchageFlightTest_instructor {

	@DataProvider(name="testdata")
	public Object[][] readdate(){
		Object input[][]= Xls_dataProvider.getTestData("Sheet1");
		
		return input;
	}
	
}
