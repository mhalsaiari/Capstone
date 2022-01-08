package com.qa.blazedemo.Pages;

import org.openqa.selenium.By;

import com.qa.blazedemo.base.TestBase;

public class LoginPage extends TestBase{

	
	public void clickLinkToLoginPage() {
		
		driver.findElement(By.linkText("home")).click();
	}
	
	public void verifyLoginURL() {
		String url = driver.getCurrentUrl();
		System.out.println("URL is:"+ url);
	}
	
	public void logindetails(String email, String password) {
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
}
