package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Class {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jegan\\eclipse-workspace\\Selenium1\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demoqa.com/droppable");

		Actions act = new Actions(driver);

		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));

		WebElement drop = driver.findElement(By.xpath("(//div[@id='droppable'])[1]"));

		act.dragAndDrop(drag, drop).perform();
	}
}