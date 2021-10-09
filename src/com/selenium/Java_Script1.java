package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Java_Script1 {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\jegan\\eclipse-workspace\\Selenium1\\driver\\msedgedriver.exe");

		WebDriver driver = new EdgeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebElement mobile = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		js.executeScript("arguments[0].click();", mobile );
		
		//scroll function
		js.executeScript("window.scrollBy(0, 6000);");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0, -1000);");
		Thread.sleep(2000);
		js.executeScript("history.go(0)");
		Thread.sleep(2000);
		
		//scroll view 
//		WebElement apple = driver.findElement(By.xpath("//a[@aria-label='Apple Airpods pro']"));
//		js.executeScript("arguments[0].scrollIntoView();", apple);
		Thread.sleep(1000);
		
		//alert
//		js.executeScript("alert('hello world');");
		
		//refresh the page 
		js.executeScript("history.go(0)");
		
		//get current website title
		String title = js.executeScript("return document.title;").toString();
		System.out.println(title);
		
		//get current website URL
		Object pageurl = js.executeScript("return document.URL;");
		System.out.println(pageurl);
		System.out.println("-------------------------------------");
		
		//navigate
		js.executeScript("window.location = 'https://yahoo.com'");
		
		//get entire texts of the website
		String entiretext = js.executeScript("return document.documentElement.innerText;").toString();
		System.out.println(entiretext);
		System.out.println("-------------------------------------");
		
		Thread.sleep(2000);
		js.executeScript("document.getElementById('text').value='MOBILE';"); 
//		String mob1 = js.executeScript("return arguments[0].innerHTML", mobile).toString();
	}

}
