package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Facebook_Login {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\jegan\\eclipse-workspace\\Selenium1\\driver\\msedgedriver.exe");

		WebDriver driver1 = new EdgeDriver();

		driver1.get("https://en-gb.facebook.com/");

		//id
		WebElement email = driver1.findElement(By.id("email"));
		email.sendKeys("aravindsundarpmk@gmail.com");

		//name
		WebElement password = driver1.findElement(By.name("pass"));
		password.sendKeys("8098294433");

		Thread.sleep(3000);

		//classname
		WebElement eye = driver1.findElement(By.className("_9lsa"));
		eye.click();

//		WebElement login = driver1.findElement(By.name("login"));
//		login.click();

//		WebElement signup = driver1.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
//		signup.click();

		driver1.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();

		Thread.sleep(5000);

		WebElement firstname = driver1.findElement(By.xpath("(//input[@data-type='text'])[1]"));

		firstname.sendKeys("Aravind");

		WebElement lastname = driver1.findElement(By.xpath("//input[contains(@aria-label,'Surname')]"));

		lastname.sendKeys("S");

	}

}
