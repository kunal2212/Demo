//package com.qa.tests;
//
////import static org.testng.Assert.assertEquals;
//
//import java.util.Properties;
//
//import org.openqa.selenium.WebDriver;
//import org.testng.Assert;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//
//import com.qa.pages.BasePage;
//import com.qa.pages.HomePage;
//import com.qa.pages.LoginPage;
//import com.qa.utils.Constant;
//
//public class HomeTest {
//	public BasePage base;
//	public WebDriver driver;
//	public Properties prop;
//	public LoginPage loginpage;
//	public HomePage homepage;
//
//	@BeforeMethod
//	public void Setup() throws Exception {
//		base = new BasePage();
//		driver = base.initializedriver();
//		prop = base.intiallizedProperties();
//		driver.get(prop.getProperty("url"));
//		loginpage = new LoginPage(driver);
//		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("paswword"));
//	}
//
//	@Test
//	public void HomePageTitleTest() {
//		System.out.println("The HomePage Title is "+homepage.VerifyHomePageTitle());
//		Assert.assertEquals(homepage.VerifyHomePageTitle(), Constant.HomePageTitleName);
//	}
//
//	@Test
//	public void HomePageHeaderTest()
//
//	{
//		System.out.println("The HomePage Header is "+homepage.VerifyHomePageHeader());
//		Assert.assertEquals(homepage.VerifyHomePageHeader(), Constant.HomePageHeader);
//	}
//	
//	@Test
//	public void LoggedInAccountTest() 
//	{
//		Assert.assertEquals(homepage.VerifyAccountLoggedinUser(),prop.getProperty("AccountName"));
//	}
//	
//
//	@AfterMethod
//	public void teardown() {
//		driver.quit();
//	}
//}
