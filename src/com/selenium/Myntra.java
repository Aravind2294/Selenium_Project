package com.selenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jegan\\eclipse-workspace\\Selenium1\\driver\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.myntra.com/men-tshirts");
		
		List<WebElement> discountedprice = driver.findElements(By.xpath("//span[@class='product-strike']//preceding-sibling::span[@class='product-discountedPrice']"));
		List<Integer> pricelist = new ArrayList<>();
		
		for (int i = 0; i < discountedprice.size(); i++) {
			String text = discountedprice.get(i).getText().replace("Rs. ", "");
			int values = Integer.parseInt(text);
			pricelist.add(values);
		}
		
		System.out.println(pricelist);
		int size = pricelist.size();
		System.out.println("size: "+size);
		System.err.println("Maximum value: "+Collections.max(pricelist));
		System.err.println("Minimum value: "+Collections.min(pricelist));
		
		
	}

}
