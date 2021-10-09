package com.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class World_Odometer {

	static int Indexoftotalcases, Indexoftotalrecovered, Indexoftotaltests;
	static String country = "India";

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jegan\\eclipse-workspace\\Selenium1\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.worldometers.info/coronavirus/");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// get all table headers
		List<WebElement> allheaders = driver
				.findElements(By.xpath("//table[@id='main_table_countries_today']/thead/tr/th"));

		// iterate
		for (int i = 0; i < allheaders.size(); i++) {
			String text = allheaders.get(i).getText();
//			System.out.println(text);
			String headers = text.replace("\n", " ");
//			System.out.println(headers);

			if (headers.equalsIgnoreCase("Total Cases")) {
				Indexoftotalcases = i;
				System.out.println("Total cases index value is: " + Indexoftotalcases);
			} else if (headers.equalsIgnoreCase("Total Recovered")) {
				Indexoftotalrecovered = i;
				System.out.println("Total recovered index value is: " + Indexoftotalrecovered);
			} else if (headers.equalsIgnoreCase("Total Tests")) {
				Indexoftotaltests = i;
				System.out.println("Total tests index value is: " + Indexoftotaltests);
			}
		}

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Travel into the table
		List<WebElement> allrows = driver.findElements(By.xpath("//table[@id='main_table_countries_today']/tbody/tr"));

		// iterate table rows
		for (int i = 0; i < allrows.size(); i++) {
			// get table data
			List<WebElement> alldata = allrows.get(i).findElements(By.tagName("td"));

			// iterate data
			for (int j = 0; j < alldata.size(); j++) {
				
				if (alldata.get(j).getText().equalsIgnoreCase(country)) {
					
					System.out.println(country);
					System.out.println("Total cases: " + alldata.get(Indexoftotalcases).getText());
					System.out.println("Total recovered: " + alldata.get(Indexoftotalrecovered).getText());
					System.out.println("Total tests: " + alldata.get(Indexoftotaltests).getText());
					System.exit(0);
				}
			}
		}
	}
}
