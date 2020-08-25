package com.generics.MavenCrossBrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTest implements AutoConstant
{
 public WebDriver driver;
 @Parameters("browser")
 @BeforeClass
 public void openBrowser(String browser)
  {
	 if(browser.equalsIgnoreCase("chrome"))
	 {
	  System.setProperty(chrome_key, chrome_value);
	   driver=new ChromeDriver();
	 }
	 else if(browser.equalsIgnoreCase("firefox"))
	 {
		  driver=new FirefoxDriver();
	 }
	 else
	 {
		 System.setProperty(ie_key, ie_value);
		 driver=new InternetExplorerDriver();
	 }
  }
 @BeforeMethod
 public void openApp()
 {
	 driver.get(url);
	 driver.manage().window().maximize();
 }
}
