package com.qa.pages;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.qa.utils.Constant;

public class BasePage {
	public static WebDriver driver;
	public static Properties prop;

	public BasePage() throws IOException {
		prop = new Properties();

		FileInputStream Fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\java\\com\\qa\\property\\Login.properties");
		prop.load(Fis);
//		return prop;
	}

	public static WebDriver initializedriver() {

		String browsername = prop.getProperty("Browser");
		if (browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browsername.equals("FF")) {
			System.out.println("Browser is Firefox");
			System.setProperty("webdriver.firefox.driver", "D:\\geckodriver.exe");
			driver = new FirefoxDriver();
			System.out.println("Browser is Firefox");
		} else {
			System.out.println("Browser is IE");

		}
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Constant.PageLoadTimeout, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Constant.ImplicitlyWait, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));

		return driver;
	}

}
