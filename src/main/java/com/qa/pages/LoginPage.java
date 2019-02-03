package com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
	

	@FindBy(id = "username")
	WebElement Username;

	@FindBy(id = "password")
	WebElement Pwd;

	@FindBy(id = "loginBtn")
	WebElement LoginButton;

	public LoginPage(WebDriver driver)  throws IOException{
		BasePage.driver = driver;
		PageFactory.initElements(driver, LoginPage.class);
	}

	public static String VerifyLoginPagetile() 
	{
	return driver.getTitle();
	}

	public HomePage login(String UserNames, String Passwords) throws IOException {
		Username.sendKeys(UserNames);
		Pwd.sendKeys(Passwords);
		LoginButton.click();
		return new HomePage(driver);
	}
}
