package com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.qa.utils.Constant;

public class HomePage extends BasePage {

//	@FindBy(xpath = "//h1[@class='private-page__title']")
//	WebElement HomePageHeader;

	By HomePageHeader = By.xpath("//h1[@class='private-page__title']");

	@FindBy(xpath = "//span[@class='account-name ']")
	WebElement LoggedinAccountDetails;

//	@FindBy(id = "nav-primary-contacts-branch")
//	WebElement Contacts;

	By Contacts = By.id("nav-primary-contacts-branch");

	@FindBy(id = "nav-secondary-contacts")
	WebElement ContactSecondary;

	public HomePage(WebDriver driver) throws IOException {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public String VerifyHomePageTitle()

	{
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.titleIs(Constant.HomePageTitleName));
		return driver.getTitle();
	}

	public String VerifyHomePageHeader() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.presenceOfElementLocated(HomePageHeader));
		if (driver.findElement(HomePageHeader).isDisplayed()) {
			return driver.findElement(HomePageHeader).getText();
		}
		return null;
	}

	public String VerifyAccountLoggedinUser() {
		return LoggedinAccountDetails.getText();
	}

	public void ClickOnContacts() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.presenceOfElementLocated(Contacts));
		driver.findElement(Contacts).click();
		ContactSecondary.click();
		// return new ContactsPage(driver);
	}
}
