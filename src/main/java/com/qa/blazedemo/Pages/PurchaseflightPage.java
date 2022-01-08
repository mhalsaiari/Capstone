package com.qa.blazedemo.Pages;

import org.openqa.selenium.By;

import com.qa.blazedemo.base.TestBase;

public class PurchaseflightPage extends TestBase {
	
	public void purchaseFlight(String name, String address, String city, String state
			,String zipCode, String creditCardNumber, String creditCardMonth
			, String creditCardYear, String nameOnCard)
	{
		driver.findElement(By.id("inputName")).sendKeys(name);
		driver.findElement(By.id("address")).sendKeys(address);
		driver.findElement(By.id("city")).sendKeys(city);
		driver.findElement(By.id("state")).sendKeys(state);
		driver.findElement(By.id("zipCode")).sendKeys(zipCode);
		driver.findElement(By.id("creditCardNumber")).sendKeys(creditCardNumber);
		driver.findElement(By.id("creditCardMonth")).sendKeys(creditCardMonth);
		driver.findElement(By.id("creditCardYear")).sendKeys(creditCardYear);
		driver.findElement(By.id("nameOnCard")).sendKeys(nameOnCard);
	}

}