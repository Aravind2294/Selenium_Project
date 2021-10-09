package com.selenium;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windows_Handling {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jegan\\eclipse-workspace\\Selenium1\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		WebElement mobile = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		
		Actions act = new Actions(driver);
		act.contextClick(mobile).perform();
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		Thread.sleep(2000);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(2000);
		
		WebElement electronics = driver.findElement(By.xpath("//a[normalize-space()='Electronics']"));
		act.contextClick(electronics).perform();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
//		Thread.sleep(2000);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(2000);
		
		WebElement computer = driver.findElement(By.xpath("//a[normalize-space()='Computers']"));
		act.contextClick(computer).perform();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
//		Thread.sleep(2000);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
	//-----------------Windows handling-----------------
		
		String windowHandle = driver.getWindowHandle();
		String title = driver.switchTo().window(windowHandle).getTitle();
		System.out.println(title);
		
		Set<String> activewindow = driver.getWindowHandles();
		
		for (String str : activewindow) {
			String active = driver.switchTo().window(str).getTitle();
			System.out.println(active);
		}
		
		String s = "Electronics Store: Buy Electronics products Online at Best Prices in India at Amazon.in";
		
		for (String str : activewindow) {
			if (driver.switchTo().window(str).getTitle().equals(s)) {
				break;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
