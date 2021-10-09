package com.selenium;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Types {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jegan\\eclipse-workspace\\Selenium1\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		// Single Dropdown
		driver.get("http://www.leafground.com/pages/Dropdown.html");

		// selectByIndex()
		WebElement selectByIndex = driver.findElement(By.xpath("//select[@id='dropdown1']"));
		Select s1 = new Select(selectByIndex);
		s1.selectByIndex(1);
		
		//selectByVisibleText()
		WebElement selectByVisibleText = driver.findElement(By.xpath("//select[@name='dropdown2']"));
		Select s2 = new Select(selectByVisibleText);
		s2.selectByVisibleText("Appium");
		
		//selectByValue()
		WebElement selectByValue = driver.findElement(By.xpath("//select[@name='dropdown3']"));
		Select s3 = new Select(selectByValue);
		s3.selectByValue("3");
		
		Thread.sleep(3000);
		
		//deselectByValue()
		s3.deselectByValue("3");
		
		//deselectByIndex()
		s1.deselectByIndex(1);
		
		//deselectByVisibleText()
		s2.deselectByVisibleText("Appium");
		
		Thread.sleep(3000);
		

		// Multiple dropdown
		driver.navigate().to("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");

		WebElement state = driver.findElement(By.xpath("//select[@name='States']"));
		Select s = new Select(state);

		boolean multiple = s.isMultiple();
		System.out.println(multiple);
		System.out.println("-------------------");

		// s.getoptions();
		List<WebElement> options = s.getOptions();

		// iterate
		Iterator<WebElement> ite = options.iterator();
		while (ite.hasNext()) {
			WebElement states = (WebElement) ite.next();
			String text = states.getText();
			System.out.println(text);
		}

		s.selectByValue("California");
		s.selectByIndex(3);
		s.selectByValue("Pennsylvania");
		s.selectByValue("Washington");
		System.out.println("------------------------");

		// get first selected options
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		String selectedoption = firstSelectedOption.getText();
		System.out.println("First Selected Option: " + selectedoption);

		System.out.println("------------------------");

		// get all selected options
		List<WebElement> selectedoptions = s.getAllSelectedOptions();

		// Iterate
		for (WebElement all : selectedoptions) {
			String text = all.getText();
			System.out.println(text);
		}

		s.deselectByIndex(3);

		s.deselectAll();
	}
}
