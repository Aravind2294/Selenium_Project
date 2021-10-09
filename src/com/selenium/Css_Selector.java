package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_Selector {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jegan\\eclipse-workspace\\Selenium1\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		
		//Css Selector
		//locate by id
		WebElement email = driver.findElement(By.cssSelector("#email"));
		email.sendKeys("Aravindsundar@gmail.com");
		
		//locate by name
		WebElement text = driver.findElement(By.cssSelector("h2._8eso"));
		String text2 = text.getText();
		System.out.println(text2);
		
		//Locate by Name or any attribute
		driver.findElement(By.cssSelector("[data-testid='open-registration-form-button']")).click();
		
		Thread.sleep(2000);
		//Match with Prefix
		WebElement firstname = driver.findElement(By.cssSelector("[placeholder^='Fir']"));
		firstname.sendKeys("Aravind");
		
		//Match with Suffix
		WebElement surname = driver.findElement(By.cssSelector("[aria-label$='rname']"));
		surname.sendKeys("S");
		
		//Match with SubString or Contains
		WebElement emailmobile = driver.findElement(By.cssSelector("[aria-label*='or em']"));
		emailmobile.sendKeys("Aravindsundar@gmail.com");
	}
}
