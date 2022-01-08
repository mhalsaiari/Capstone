package com.qa.blazedemo.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import com.qa.blazedemo.base.TestBase;

public class ChooseFlightPage extends TestBase{
	
	
	public void fetchflightdetails(){
	
		List<WebElement> li = driver.findElements(By.xpath("//*[@class='table']/descendant::td"));
		
		int size = li.size();
		System.out.println(size);
		
		for(int i=0 ;i<size;i++)
		{
			String text = li.get(i).getText();
			System.out.println(text);
		}
		
	}

	
	public void chooseflight(){
		driver.findElement(By.xpath("//*[@class='table']/descendant::input[1]")).click();
	}
	
	
	
	
	
	
	
}