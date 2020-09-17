package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Test_base {
	
public static WebDriver driver;
public static Properties prop;
	public Test_base() throws IOException{
		prop=new Properties();
		FileInputStream fis=new FileInputStream("E:/chaichin/maven/FreeCRM/src/main/java/com/crm/qa/config/config.properties");
	prop.load(fis);
	}
	
	public static void initialization()
	{
		String browsername=prop.getProperty("browser");
		if(browsername.equals("ff"));
		{
		System.setProperty("webdriver.gecko.driver", "C:/Users/Master01/Downloads/sel/geckodriver-v0.24.0-win64");
	driver=new FirefoxDriver();
		}
		driver.get(prop.getProperty("url"));
	
	
	}

}

