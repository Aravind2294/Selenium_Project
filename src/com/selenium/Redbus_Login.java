package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus_Login {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jegan\\eclipse-workspace\\Selenium1\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.redbus.in/");

		driver.manage().window().maximize();

		WebElement icon_click = driver.findElement(By.id("signin-block"));
		icon_click.click();

		WebElement sign_in = driver.findElement(By.id("signInLink"));
		sign_in.click();

		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println(size);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement mobframe = driver.findElement(By.xpath("//iframe[@class='modalIframe']"));
		driver.switchTo().frame(mobframe);

		WebElement input = driver.findElement(By.xpath("(//input[@data-validate='required|internationalphone'])[1]"));
		input.sendKeys("8098294433");

//		driver.switchTo().defaultContent();
		
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

//		WebElement closeframe = driver.findElement(By.xpath("//iframe[@aria-hidden='true']"));
//		driver.switchTo().frame(closeframe);

		WebElement close = driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/div/div/div[2]/i"));
		close.click();

		driver.switchTo().defaultContent();

	}

}
