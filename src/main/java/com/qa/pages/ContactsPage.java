//package com.qa.pages;
//
//import java.util.List;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
////import org.testng.Assert;
//
//public class ContactsPage extends BasePage {
//
//	@FindBy(xpath = "//span[text()='Create contact']")
//	WebElement CreateContactButton;
//
//	By Email = By.id("uid-ctrl-1");
//
//	@FindBy(id = "uid-ctrl-2")
//	WebElement FirstName;
//
//	@FindBy(id = "uid-ctrl-3")
//	WebElement LastName;
//
//	@FindBy(id = "uid-ctrl-5")
//	WebElement Jobtitle;
//
//	@FindBy(xpath = "//li//button//span[text()='Create contact']")
//	WebElement ContactButton;
//
//	public ContactsPage(WebDriver driver) {
//		this.driver = driver;
//		PageFactory.initElements(driver, this);
//	}
//
//	public void CreateContactDetails(String EMail, String FirstNames, String LastNames, String Jobtitles) {
//		WebDriverWait wait = new WebDriverWait(driver, 15);
//		wait.until(ExpectedConditions.elementToBeClickable(CreateContactButton));
//		CreateContactButton.click();
//		driver.findElement(Email).sendKeys(EMail);
//		FirstName.sendKeys(FirstNames);
//		LastName.sendKeys(LastNames);
//		Jobtitle.sendKeys(Jobtitles);
//		ContactButton.click();
//		List<WebElement> Row = driver.findElements(By.xpath("//tbody//tr"));
//		int rowcount = Row.size();
//		for (int i = 1; i <= rowcount; i++) {
//			WebElement element = driver.findElement(
//					By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/table/tbody/tr["
//							+ i + "]/td[2]"));
//			if (element.getText().contains(prop.getProperty(prop.getProperty("Name")))) {
//				// Assert.assertEquals(element.getText(), "Cool Robot (Sample Contact)");
//				driver.findElement(By.xpath("//tr[" + i + "]//td//span[@class='private-checkbox__indicator']")).click();
////				System.out.println("Text Found");
////				driver.findElement(By.xpath("//span[text()='Permanently delete']")).click();
//				break;
//
//			}
//
//		}
//	}
//}