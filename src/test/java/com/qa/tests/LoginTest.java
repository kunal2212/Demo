package com.qa.tests;

import java.io.IOException;
//import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
//import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.qa.pages.BasePage;

import com.qa.pages.LoginPage;
//import com.qa.utils.Constant;
import com.qa.utils.Constant;

public class LoginTest extends BasePage {

	//public LoginPage loginpage;

	public LoginTest() throws IOException

	{
		super();
	}

	@BeforeMethod

	public void Setup() throws Exception {
		// base = new BasePage();
		// prop = base.intiallizedProperties();
		// driver = base.initializedriver();
		// intiallizedProperties();
		initializedriver();
		//loginpage = new LoginPage(driver);
	}

	@Test(priority = 1)
	public void VerifyTitle() {
		System.out.println("Login Test");
		String title=LoginPage.VerifyLoginPagetile();
//		loginpage.VerifyLoginPagetile();
		System.out.println("The Current page Tiltle Before Login is" + title);
		Assert.assertEquals(title, Constant.LoginPageTitleName);
		
	}

//	@Test()
//	public void InputLoginDetails() throws IOException {
//		System.out.println("Login Test");
//		loginpage = new LoginPage(driver);
//		loginpage.login(prop.getProperty("username"), prop.getProperty("paswword"));
//	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
