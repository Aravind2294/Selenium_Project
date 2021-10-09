package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jegan\\eclipse-workspace\\Selenium1\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.automationtesting.in/Frames.html");

		driver.manage().window().maximize();

		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println(size);

		// iframe ----> id, name, index, webelement
		driver.switchTo().frame("singleframe"); // driver enter into the frame

		WebElement input1 = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		input1.sendKeys("Hi Aravind!!!");

		driver.switchTo().defaultContent(); // exit driver from the frame

		// nested frame
		WebElement nestedframe = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		nestedframe.click();

		WebElement outerframe = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(outerframe); // driver enter into the outerframe

		WebElement innerframe = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(innerframe); // driver enter into the innerframe

		WebElement input2 = driver.findElement(By.xpath("//input[@type='text']"));
		input2.sendKeys("Selenium");
	}
}
