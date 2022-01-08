package com.qa.blazedemo.Pages;

import org.openqa.selenium.By;

import com.qa.blazedemo.base.TestBase;

public class MainPage extends TestBase{

	public void clickdestination() {
		driver.findElement(By.linkText("destination of the week! The Beach!")).click();
	}
	public void clickTravellink() {
		driver.findElement(By.linkText("Travel The World")).click();
	}
}
