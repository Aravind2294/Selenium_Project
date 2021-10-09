package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Launch {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jegan\\eclipse-workspace\\Selenium1\\driver\\chromedriver.exe");

		// Interface //class ---->Multiple Inheritance
		WebDriver driver = new ChromeDriver();
		//parent  //child-----> Upcasting

		
		// get() --->Launch a new browser and opens the given URL
		driver.get("https://accounts.google.com/b/0/AddMailService");

		driver.manage().window().maximize();

		// gettitle() --->Returns the current page title
		String title = driver.getTitle();
		System.out.println(title);

		// getCurrentUrl() --->Returns the current page URL
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

//		String pageSource = driver.getPageSource();
//		System.out.println(pageSource);

		// Navigate methods
		// to() ---->Navigate the given URL

		driver.navigate().to("https://www.google.com/");

		// back() ---->Back to the previous page
		driver.navigate().back();

		// forward ---->Forward to next page
		driver.navigate().forward();

		// Refresh ---->It refresh current page
		driver.navigate().refresh();

//		driver.close();
		driver.quit();
	}
}
