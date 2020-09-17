package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.Test_base;

public class LoginPage extends Test_base{

	

	@FindBy(xpath="//input[@type='text']")
	WebElement username;
	@FindBy(xpath="//input[@type='password']")
	WebElement password;
	@FindBy(xpath="(//div[.='Login'])[2]")
	WebElement login;
	
	public LoginPage() throws IOException {
		PageFactory.initElements(driver, this);
		
		
	}
	
	
	public String verifyTitle()
	{
		return driver.getTitle();
	}
	
	public HomePage loginToCrm(String un,String pwd)
	{
		username.sendKeys(un);
		password.sendKeys(pwd);
		login.click();
		return new HomePage();
	}
	

}
