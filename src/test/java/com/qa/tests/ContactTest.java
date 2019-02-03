//package com.qa.tests;
//
//import java.io.IOException;
//import java.util.Properties;
//
//import org.openqa.selenium.WebDriver;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.DataProvider;
//import org.testng.annotations.Test;
//
//import com.qa.dataprovider.GetExcelData;
//import com.qa.pages.BasePage;
//import com.qa.pages.ContactsPage;
//import com.qa.pages.HomePage;
//import com.qa.pages.LoginPage;
//
//public class ContactTest {
//	public BasePage base;
//	public WebDriver driver;
//	public Properties prop;
//	public LoginPage loginpage;
//	public HomePage homepage;
//	public ContactsPage contactsPage;
//	public GetExcelData getExcelData;
//
//	@BeforeMethod
//	public void Setup() throws Exception {
//		base = new BasePage();
//		driver = base.initializedriver();
//		prop = base.intiallizedProperties();
//		driver.get(prop.getProperty("url"));
//		loginpage = new LoginPage(driver);
//		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("paswword"));
//		contactsPage = homepage.ClickOnContacts();
//
//	}
//
//	@DataProvider
//
//	public Object[][] Data() throws IOException {
//		return getExcelData.getdata("FreeCrmUserDetails",
//				System.getProperty("user.dir") + "\\src\\main\\java\\com\\qa\\dataprovider\\UserDetails.xlsx");
//	}
//
//	@Test(dataProvider="Data")
//	public void CreateContactDetailstest(String User, String Lastname, String Email, String email_confirm) {
//		contactsPage.CreateContactDetails(User, Lastname, Email, email_confirm);
//	}
//	
//	
//	
//	@AfterMethod
//	public void teardown() {
//		driver.quit();
//	}
//}
