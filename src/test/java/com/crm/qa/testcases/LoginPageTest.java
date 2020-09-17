package com.crm.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.Test_base;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;



public class LoginPageTest extends Test_base {
	LoginPage lp;
	HomePage hp;

	public LoginPageTest() throws IOException {
		super();
		
	}

	@BeforeMethod
	public void setup() throws IOException
	{
		lp=new LoginPage();
		initialization();
		
		
	}
	
	@Test(priority=1)
	public void verifyTitleTest()
	{
		String title=lp.verifyTitle();
		Assert.assertEquals(title, "Cogmento CRM");
	}
	
	@Test(priority=2)
	public void loginCrm()
	{
		hp=lp.loginToCrm(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
}
