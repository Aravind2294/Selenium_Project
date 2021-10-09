package com.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Class {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jegan\\eclipse-workspace\\Selenium1\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/alerts");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("(//button[text()='Click me'])[1]")).click();

		Thread.sleep(2000);

		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		driver.findElement(By.xpath("(//button[text()='Click me'])[2]")).click();
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().dismiss();
		
		driver.findElement(By.xpath("(//button[text()='Click me'])[4]")).click();
		
		Alert alert2 = driver.switchTo().alert();
		
		String text = alert2.getText();
		
		System.out.println(text);
		
		Thread.sleep(2000);
		
		alert2.sendKeys("Hello!!!");
		
		alert2.accept();
		
	}
}
