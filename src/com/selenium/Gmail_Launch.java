package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail_Launch {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jegan\\eclipse-workspace\\Selenium1\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");

		WebElement email = driver.findElement(By.id("identifierId"));
		email.sendKeys("aravindsundaranantham@gmail.com");

		WebElement btnnext = driver.findElement(By.className("VfPpkd-vQzf8d"));
		btnnext.click();

		Thread.sleep(3000);

		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("7373522275");
		
		WebElement nextbt = driver.findElement(By.xpath("(//span[@jsname='V67aGc'])[1]"));
        nextbt.click();
        
//        driver.findElement(By.xpath("/html/body/div[7]/div[3]/div/div[1]/div[3]/header/div[2]/div[3]/div[1]/div[2]/div/a/img")).click();
        
//        driver.findElement(By.xpath("//a[text()='Sign out']")).click();
        		
	}
}
