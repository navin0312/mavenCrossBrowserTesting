package com.pages.MavenCrossBrowserTesting;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.MavenCrossBrowserTesting.AutoConstant;
import com.generics.MavenCrossBrowserTesting.ExcelLibrary;

public class POMActitimeLoginPages implements AutoConstant
{
 @FindBy(id="username")
 private WebElement usernameTextfield;
 @FindBy(xpath="(//input[@type='password'])[1]")
 private WebElement passwordTestfield;
 @FindBy(xpath="//label[contains(text(),'Keep me logged in')] ")
 private WebElement keepmelogedinCheckbox;
 @FindBy(xpath="(//div[contains(text(),'Login ')])[1]")
 private WebElement loginButton;
 @FindBy(xpath="//a[contains(text(),'Forgot your password?')]")
 private WebElement forgotyourpasswordLink;
 @FindBy(id="copyRight")
 private WebElement actiTIMEincLink;
 
 public POMActitimeLoginPages(WebDriver driver)
 {
	 PageFactory.initElements(driver, this);
 }
 public void loginMethod() throws IOException
 {
	 usernameTextfield.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheet_name, 0, 1));
	 passwordTestfield.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheet_name, 1, 1));
	 keepmelogedinCheckbox.click();
	 loginButton.click();
 }
}
