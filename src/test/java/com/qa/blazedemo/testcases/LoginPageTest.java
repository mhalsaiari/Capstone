package com.qa.blazedemo.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.blazedemo.Pages.LoginPage;
import com.qa.blazedemo.base.TestBase;

public class LoginPageTest extends TestBase{

	LoginPage lp;
	
	@BeforeClass
	public void openBroswer() {
		
		lp = new LoginPage();
	}
	@Test(priority=1)
	public void clickLinkToLoginPageTest() {
		lp.clickLinkToLoginPage();
	}
	@Test (priority=2)
	public void verifyLoginURLTest() {
		lp.verifyLoginURL();
	}
	@Parameters({"useremail","password"})
	@Test (priority=3)
	public void logindetailsTest(String useremail, String password) {
		lp.logindetails(useremail,password);
	}
	
}
