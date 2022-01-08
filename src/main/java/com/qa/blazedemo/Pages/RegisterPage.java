package com.qa.blazedemo.Pages;

import org.openqa.selenium.By;

import com.qa.blazedemo.base.TestBase;

public class RegisterPage extends TestBase{

	public void verifytitle() {
		String title = driver.getTitle();
		System.out.println("title is:"+ title);
		
	}
	public void clickLinkToRegister() {
		
		driver.findElement(By.linkText("home")).click();
		
		driver.findElement(By.linkText("Register")).click();
	}
	public void verifyRegisterURL() {
		String url = driver.getCurrentUrl();
		System.out.println("URL is:"+ url);
	}
	public void registerUser(String name, String company, String email, String pwd, String Cpwd) {
		driver.findElement(By.id("name")).sendKeys(name);
		driver.findElement(By.id("company")).sendKeys(company);
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.id("password-confirm")).sendKeys(Cpwd);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
}
