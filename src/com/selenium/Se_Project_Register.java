package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Se_Project_Register {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\jegan\\eclipse-workspace\\Selenium1\\driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();

		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");

		driver.findElement(By.xpath("//a[@title='Log in to your customer account']")).click();
		
		WebElement txtemail = driver.findElement(By.xpath("//input[@name='email_create']"));
		txtemail.sendKeys("aravindrocks22@gmail.com");
		
		driver.findElement(By.xpath("//i[@class='icon-user left']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//label[@for='id_gender1']")).click();
		
		WebElement firstname = driver.findElement(By.xpath("//input[@id='customer_firstname']"));
		firstname.sendKeys("Aravind");
		
		WebElement lastname = driver.findElement(By.xpath("//input[@id='customer_lastname']"));
		lastname.sendKeys("S");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='passwd']"));
		password.sendKeys("8098294433");
		
		WebElement days = driver.findElement(By.xpath("//select[@id='days']"));
		Select s1 = new Select(days);
		s1.selectByValue("22");
		
		WebElement months = driver.findElement(By.xpath("//select[@id='months']"));
		Select s2 = new Select(months);
		s2.selectByValue("3");
		
		WebElement years = driver.findElement(By.xpath("//select[@id='years']"));
		Select s3 = new Select(years);
		s3.selectByValue("1994");
		
		driver.findElement(By.xpath("//label[text()='Sign up for our newsletter!']")).click();
		
		WebElement company = driver.findElement(By.xpath("//input[@id='company']"));
		company.sendKeys("KGS@co");
		
//		WebElement firstname1 = driver.findElement(By.xpath("//input[@id='firstname']"));
//		firstname1.sendKeys("Aravind");
		
		WebElement address = driver.findElement(By.xpath("//input[@id='address1']"));
		address.sendKeys("Balambigai nagar");
		
		WebElement address1 = driver.findElement(By.xpath("//input[@id='address2']"));
		address1.sendKeys("California");
		
		WebElement city = driver.findElement(By.xpath("//input[@id='city']"));
		city.sendKeys("Santa Cruz");
		
		WebElement state = driver.findElement(By.xpath("//select[@id='id_state']"));
		Select s4 = new Select(state);
		s4.selectByValue("5");
		
		WebElement pincode = driver.findElement(By.xpath("//input[@id='postcode']"));
		pincode.sendKeys("90001");
		
		WebElement texttype = driver.findElement(By.xpath("//textarea[@id='other']"));
		texttype.sendKeys("Santa Cruz (Spanish for 'Holy Cross') is the county seat and largest city of Santa Cruz County, California. As of 2019, the U.S. Census Bureau estimated Santa Cruz's population at 64,608.");
		
		WebElement phone = driver.findElement(By.xpath("//input[@id='phone']"));
		phone.sendKeys("987654321");
		
		WebElement mobile = driver.findElement(By.xpath("//input[@id='phone_mobile']"));
		mobile.sendKeys("8098294433");		
		
		driver.findElement(By.xpath("//button[@id='submitAccount']")).click();
		
		driver.findElement(By.xpath("(//a[normalize-space()='Sign out'])[1]")).click();
	}
}
