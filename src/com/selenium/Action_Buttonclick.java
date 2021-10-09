package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Buttonclick {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jegan\\eclipse-workspace\\Selenium1\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demoqa.com/buttons");

		Actions act = new Actions(driver);

		WebElement dynamic_click = driver.findElement(By.xpath("//button[text()='Click Me']"));

		act.click(dynamic_click).perform();

		WebElement right_click = driver.findElement(By.xpath("//button[text()='Right Click Me']"));

		act.contextClick(right_click).build().perform();

		Thread.sleep(2000);

		WebElement double_click = driver.findElement(By.xpath("//button[text()='Double Click Me']"));

		act.doubleClick(double_click).perform();

	}
}
