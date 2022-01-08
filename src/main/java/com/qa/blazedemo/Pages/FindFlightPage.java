package com.qa.blazedemo.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.qa.blazedemo.base.TestBase;

public class FindFlightPage extends TestBase {
	
	
	public void findFlight(String departure, String destination) throws InterruptedException
	{
		WebElement e1= driver.findElement(By.xpath("//select[@name='fromPort']"));
		Select dd = new Select(e1);
		
		dd.selectByVisibleText(departure);
		
		Thread.sleep(2000);
		
		WebElement e2 = driver.findElement(By.xpath("//select[@name='toPort']"));
		
		Select dd1 = new Select(e2);
		dd1.selectByVisibleText(destination);
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
	}
	
	public void findFlightnoParam() throws InterruptedException
	{
		WebElement e1= driver.findElement(By.xpath("//select[@name='fromPort']"));
		Select dd = new Select(e1);
		
		dd.selectByVisibleText("Paris");
		
		Thread.sleep(2000);
		
		WebElement e2 = driver.findElement(By.xpath("//select[@name='toPort']"));
		
		Select dd1 = new Select(e2);
		dd1.selectByVisibleText("London");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
	}

}