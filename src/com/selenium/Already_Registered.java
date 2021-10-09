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
import org.openqa.selenium.support.ui.Select;

public class Already_Registered {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jegan\\eclipse-workspace\\Selenium1\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://automationpractice.com/index.php");

		driver.findElement(By.xpath("//a[normalize-space()='Sign in']")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("email")).sendKeys("sundarisivasankar1999@gmail.com");

		driver.findElement(By.name("passwd")).sendKeys("aruna1234");

		driver.findElement(By.id("SubmitLogin")).click();

//		Thread.sleep(2000);

		driver.findElement(By.xpath("(//a[@title='Dresses'])[2]")).click();

		driver.findElement(By.xpath("(//a[text()='Evening Dresses'])[4]")).click();

		driver.findElement(By.xpath("//img[@title='Printed Dress']")).click();

//		Thread.sleep(2000);

		WebElement frame1 = driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));

		driver.switchTo().frame(frame1);
//		
//		WebElement frame2 = driver.findElement(By.xpath("//div[@class='product_attributes clearfix']"));
//		
//		driver.switchTo().frame(frame2);

		WebElement quantity = driver.findElement(By.xpath("(//a[@data-field-qty='qty'])[2]"));

		for (int i = 0; i < 9; i++) {

			quantity.click();
		}

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Thread.sleep(2000);

		WebElement size = driver.findElement(By.xpath("//select[@name='group_1']"));
		Select s5 = new Select(size);

		s5.selectByIndex(1);

		driver.findElement(By.xpath("//a[@name='Pink']")).click();

//		Thread.sleep(6000);

		WebElement cart = driver.findElement(By.name("Submit"));

		cart.click();

//		Thread.sleep(7000);

//		TakesScreenshot ts = (TakesScreenshot) driver;
//
//		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
//
//		File dest = new File("C:\\Users\\Lenovo\\eclipse-workspace\\Selenium_New\\screenshot\\snap3.png");
//
//		FileUtils.copyFile(screenshotAs, dest);

		 driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

//		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@title='Proceed to checkout']")).click();

//		WebElement checkout = driver.findElement(By.xpath("//span[normalize-space()='Proceed to checkout']"));
//		checkout.click();
		
//		driver.findElement(By.className("continue btn btn-default button exclusive-medium")).click();

		//Thread.sleep(5000);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement summary = driver.findElement(By.xpath("//ul[@id='order_step']"));

		js.executeScript("arguments[0].scrollIntoView();", summary);

		TakesScreenshot ts1 = (TakesScreenshot) driver;

		File screenshotAs2 = ts1.getScreenshotAs(OutputType.FILE);

		File dest2 = new File("C:\\Users\\Lenovo\\eclipse-workspace\\Selenium_New\\screenshot\\summery.png");

		FileUtils.copyFile(screenshotAs2, dest2);

//		Thread.sleep(2000);

		driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]")).click();

		WebElement address = driver.findElement(By.xpath("//li[@class='step_current third']"));

		js.executeScript("arguments[0].scrollIntoView();", address);

//		Thread.sleep(2000);

		TakesScreenshot ts2 = (TakesScreenshot) driver;

		File screenshotAs3 = ts2.getScreenshotAs(OutputType.FILE);

		File dest3 = new File("C:\\Users\\Lenovo\\eclipse-workspace\\Selenium_New\\screenshot\\address.png");

		FileUtils.copyFile(screenshotAs3, dest3);

		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();

		driver.findElement(By.xpath("//input[@type='checkbox']")).click();

		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();

		WebElement payment = driver.findElement(By.xpath("//li[@class='step_current last']"));

		js.executeScript("arguments[0].scrollIntoView();", payment);

//		Thread.sleep(2000);

		TakesScreenshot ts3 = (TakesScreenshot) driver;

		File screenshotAs4 = ts3.getScreenshotAs(OutputType.FILE);

		File dest4 = new File("C:\\Users\\Lenovo\\eclipse-workspace\\Selenium_New\\screenshot\\payment.png");

		FileUtils.copyFile(screenshotAs4, dest4);

		driver.findElement(By.xpath("//a[@class='cheque']")).click();

		WebElement confirm = driver.findElement(By.xpath("//li[@class='step_current last']"));

		js.executeScript("arguments[0].scrollIntoView();", confirm);

//		Thread.sleep(2000);

		TakesScreenshot ts4 = (TakesScreenshot) driver;

		File screenshotAs5 = ts4.getScreenshotAs(OutputType.FILE);

		File dest5 = new File("C:\\Users\\Lenovo\\eclipse-workspace\\Selenium_New\\screenshot\\confirm.png");

		FileUtils.copyFile(screenshotAs5, dest5);

		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();

//		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[@title='Back to orders']")).click();

		driver.findElement(By.xpath("(//a[@title='Dresses'])[2]")).click();

		driver.findElement(By.xpath(
				"//a[@title='Short dress, long dress, silk dress, printed dress, you will find the perfect dress for summer.']"))
				.click();

		driver.findElement(By.xpath("(//img[@title='Printed Summer Dress'])[1]")).click();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title='Orange']")).click();

//		Thread.sleep(4000);

		 driver.findElement(By.xpath("(//button[@type='submit'])[3]")).click();

		driver.findElement(By.name("Submit")).click();

//		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[@title='Continue shopping']")).click();

//		Thread.sleep(2000);

		// driver.findElement(By.xpath("(//a[@title='Dresses'])[2]")).click();

		// driver.findElement(By.linkText("(//a[' Casual Dresses '])[28]")).click();

		driver.findElement(By.xpath("(//a[@title='T-shirts'])[2]")).click();

		driver.findElement(By.xpath("//img[@title='Faded Short Sleeve T-shirts']")).click();



		// driver.findElement(By.name("Submit")).click();
		
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		Thread.sleep(2000);
		
		WebElement clk = driver.findElement(By.xpath("/html/body/div/div/div[3]/form/div/div[3]/div[1]/p/button"));
		clk.click();
		driver.switchTo().parentFrame();
		System.exit(0);

	}

}
 