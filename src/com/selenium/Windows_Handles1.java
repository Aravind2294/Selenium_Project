package com.selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows_Handles1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jegan\\eclipse-workspace\\Selenium1\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();

		Set<String> activewindow = driver.getWindowHandles();

		Iterator<String> ite = activewindow.iterator();

		while (ite.hasNext()) {
			String next = ite.next();
			String title = driver.switchTo().window(next).getTitle();
			System.out.println(title);
		}
		String s = "The Internet";

		for (String str : activewindow) {
			if (driver.switchTo().window(str).getTitle().equals(s)) {
				break;
			}
		}
		WebElement text = driver.findElement(By.xpath("//h3[contains(text(),'a new')]"));
		String txt = text.getText();
		System.out.println(txt);
	}
}
