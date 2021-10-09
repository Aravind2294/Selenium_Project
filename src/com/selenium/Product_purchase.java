package com.selenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Product_purchase {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://automationpractice.com/index.php");

		driver.findElement(By.xpath("//a[@title='Log in to your customer account']")).click();

		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("aravindrocks22@gmail.com");

		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("8098294433");

		driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();

		JavascriptExecutor js = (JavascriptExecutor) driver;

		driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);

		driver.findElement(By.xpath("(//a[@title='Dresses'])[2]")).click();

		driver.findElement(By.xpath(
				"(//a[@title='Browse our different dresses to choose the perfect dress for an unforgettable evening!'])[1]"))
				.click();

		WebElement quickview = driver.findElement(By
				.xpath("(//a[@href=\"http://automationpractice.com/index.php?id_product=4&controller=product\"])[2]"));
		js.executeScript("arguments[0].click();", quickview);
		
//		WebElement quantity = driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
//		driver.switchTo().frame(quantity);

		WebElement qty = driver.findElement(By.xpath("//a[@class='btn btn-default button-plus product_quantity_up']"));
		for (int i = 0; i < 9; i++) {
			qty.click();
		}

		WebElement size = driver.findElement(By.xpath("//select[@class='form-control attribute_select no-print']"));
		Select s1 = new Select(size);
		s1.selectByValue("2");

		driver.findElement(By.xpath("//a[@name='Pink']")).click();

		TakesScreenshot ts1 = (TakesScreenshot) driver;
		File src1 = ts1.getScreenshotAs(OutputType.FILE);
		File dest1 = new File("C:\\Users\\jegan\\eclipse-workspace\\Selenium1\\Screenshot\\quickview.png");
		FileUtils.copyFile(src1, dest1);

		driver.findElement(By.xpath("//span[text()='Add to cart']")).click();
		
//		driver.switchTo().parentFrame();

		driver.findElement(By.xpath("//a[@title='Proceed to checkout']")).click();

		WebElement Shopping_cart_summary = driver.findElement(By.id("cart_title"));
		js.executeScript("arguments[0].scrollIntoView();", Shopping_cart_summary);

		TakesScreenshot ts2 = (TakesScreenshot) driver;
		File src2 = ts2.getScreenshotAs(OutputType.FILE);
		File dest2 = new File("C:\\Users\\jegan\\eclipse-workspace\\Selenium1\\Screenshot\\Shopping_cart_summary.png");
		FileUtils.copyFile(src2, dest2);

		driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]")).click();

		WebElement Address = driver.findElement(By.xpath("//h1[text()='Addresses']"));
		js.executeScript("arguments[0].scrollIntoView();", Address);

		TakesScreenshot ts3 = (TakesScreenshot) driver;
		File src3 = ts3.getScreenshotAs(OutputType.FILE);
		File dest3 = new File("C:\\Users\\jegan\\eclipse-workspace\\Selenium1\\Screenshot\\Address.png");
		FileUtils.copyFile(src3, dest3);

		driver.findElement(By.xpath("//button[@name='processAddress']")).click();

		driver.findElement(By.xpath("//input[@type='checkbox']")).click();

		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();

		driver.findElement(By.xpath("//a[@title='Pay by bank wire']")).click();

		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();

		WebElement order_conformation = driver.findElement(By.xpath("//span[text()='Order confirmation']"));
		js.executeScript("arguments[0].scrollIntoView();", order_conformation);

		TakesScreenshot ts4 = (TakesScreenshot) driver;
		File src4 = ts4.getScreenshotAs(OutputType.FILE);
		File dest4 = new File("C:\\Users\\jegan\\eclipse-workspace\\Selenium1\\Screenshot\\order_conformation.png");
		FileUtils.copyFile(src4, dest4);
		// another product purchase
		//driver.findElement(By.xpath("//a[@title='Back to orders']")).click();

		driver.findElement(By.xpath("//a[normalize-space()='Back to your account.']")).click();

		Actions a = new Actions(driver);

		WebElement women = driver.findElement(By.xpath("//a[text()='Women']"));
		a.moveToElement(women).build().perform();
		
		driver.findElement(By.linkText("Blouses")).click();
		
		driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[text()='Quick view']")).click();
//		a.moveToElement(qkvew).build().perform();
//		qkvew.click();
		
		driver.findElement(By.xpath("//a[@title='Proceed to checkout']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		WebElement f2 = driver.findElement(By.id("fancybox-frame1633342809473"));
//		driver.switchTo().frame(f2);
		
//		WebElement wtclr = driver.findElement(By.id("color_8"));
//		wtclr.click();
		
		

//		driver.findElement(By.xpath("(//span[text()='Quick view'])[5]")).click();

//		driver.findElement(By.xpath("(//div[@class='product-container'])[5]")).click();
//
//		WebElement qty1 = driver.findElement(By.xpath("//i[@class='icon-plus']"));
//		for (int i = 0; i < 9; i++) {
//			qty1.click();
//		}
//
//		WebElement size1 = driver.findElement(By.id("group_1"));
//		Select s2 = new Select(size1);
//		s2.selectByValue("M");
//
//		TakesScreenshot ts5 = (TakesScreenshot) driver;
//		File src5 = ts5.getScreenshotAs(OutputType.FILE);
//		File dest5 = new File("C:\\Users\\jegan\\eclipse-workspace\\Selenium1\\Screenshot\\add_1.png");
//		FileUtils.copyFile(src5, dest5);
//
//		driver.findElement(By.xpath("//button[@name='Submit']")).click();

	}
}
