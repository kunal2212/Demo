package com.qa.tests;

import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import com.qa.pages.BasePage;
import com.qa.pages.LoginPage;
import com.qa.utils.Constant;

public class LoginTest extends BasePage {
	// public BasePage base;
	public WebDriver driver;
	// public Properties prop;
	public LoginPage loginpage;

	@BeforeMethod
	public void Setup() throws Exception {
		// base = new BasePage();
		// prop = base.intiallizedProperties();
		// driver = base.initializedriver();
		intiallizedProperties();
		initializedriver();
		loginpage = new LoginPage(driver);
	}

	@Test(priority = 1)
	public void VerifyLoginTitleTest() {
		System.out.println("Login Test");
//		String Tiltle = loginpage.VerifyLoginPagetile();
//		loginpage.VerifyLoginPagetile();
//		System.out.println("The Current page Tiltle Before Login is" + Tiltle);
//		Assert.assertEquals(Tiltle, Constant.LoginPageTitleName);
	}

//	@Test()
//	public void InputLoginDetails() {
//		System.out.println("Login Test");
//		loginpage = new LoginPage(driver);
//		loginpage.login(prop.getProperty("username"), prop.getProperty("paswword"));
//	}

	@AfterMethod
	public void teardown() {
		driver.close();
	}

}
