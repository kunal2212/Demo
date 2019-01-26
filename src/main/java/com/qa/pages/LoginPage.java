package com.qa.pages;

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

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, LoginPage.class);
	}

	public String VerifyLoginPagetile() 
	{
	return driver.getTitle();
	}

	public HomePage login(String UserNames, String Passwords) {
		Username.sendKeys(UserNames);
		Pwd.sendKeys(Passwords);
		LoginButton.click();
		return new HomePage(driver);
	}
}
