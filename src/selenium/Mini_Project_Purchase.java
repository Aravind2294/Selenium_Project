package selenium;

import java.awt.AWTException;
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

public class Mini_Project_Purchase {

	public static void main(String[] args) throws AWTException, IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jegan\\eclipse-workspace\\Selenium1\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		WebElement signin = driver.findElement(By.xpath("//a[@class='login']"));
		signin.click();

		WebElement emailid = driver.findElement(By.xpath("//input[@id='email']"));
		emailid.sendKeys("rajasekard55@gmail.com");

		WebElement password = driver.findElement(By.xpath("//input[@id='passwd']"));
		password.sendKeys("rajasekardurai");

		WebElement clickbtn = driver.findElement(By.xpath("//i[@class='icon-lock left']"));
		clickbtn.click();

		WebElement dresses = driver.findElement(By.xpath("(//a[@title='Dresses'])[2]"));
		dresses.click();

		WebElement eveningdresses = driver.findElement(By.xpath("(//a[contains(@title,'Browse our "
				+ "different dresses to choose the perfect dress for an unforgettable evening!')])[1]"));
		eveningdresses.click();

		WebElement quickview = driver.findElement(By.xpath("//img[@title='Printed Dress']"));
		Actions act = new Actions(driver);
		act.moveToElement(quickview).build().perform();

		WebElement quickview1 = driver.findElement(By.xpath("//span[text()='Quick view']"));
		quickview1.click();

		WebElement quantity = driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
		driver.switchTo().frame(quantity);

		WebElement quantity1 = driver.findElement(By.xpath("//i[@class='icon-plus']"));
		for (int i = 0; i < 9; i++) {
			quantity1.click();
		}
		WebElement size = driver.findElement(By.xpath("//select[@name='group_1']"));
		Select s1 = new Select(size);
		s1.selectByValue("2");

		WebElement colour = driver.findElement(By.xpath("//a[@name='Pink']"));
		colour.click();

		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("E:\\rajasekar mobile\\eclipse workspace\\seleniumproj\\screenshot\\snap1.png");
		FileUtils.copyFile(src, dest);

		WebElement addtocart = driver.findElement(By.xpath("//span[text()='Add to cart']"));
		addtocart.click();

		TakesScreenshot ts1 = (TakesScreenshot) driver;
		File src1 = ts1.getScreenshotAs(OutputType.FILE);
		File dest1 = new File("E:\\rajasekar mobile\\eclipse workspace\\seleniumproj\\screenshot\\proceding1.png");
		FileUtils.copyFile(src1, dest1);

		driver.switchTo().parentFrame();
		WebElement checkout = driver.findElement(
				By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/a/span"));
		checkout.click();

		driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]")).click();

		driver.findElement(By.xpath("//button[@name='processAddress']")).click();

		TakesScreenshot ts2 = (TakesScreenshot) driver;
		File src2 = ts2.getScreenshotAs(OutputType.FILE);
		File dest2 = new File("E:\\rajasekar mobile\\eclipse workspace\\seleniumproj\\screenshot\\proceding23.png");
		FileUtils.copyFile(src2, dest2);

		driver.findElement(By.xpath("//input[@name='cgv']")).click();
		TakesScreenshot ts3 = (TakesScreenshot) driver;
		File src3 = ts3.getScreenshotAs(OutputType.FILE);
		File dest3 = new File("E:\\rajasekar mobile\\eclipse workspace\\seleniumproj\\screenshot\\proceding3.png");
		FileUtils.copyFile(src3, dest3);

		driver.findElement(By.xpath("//button[@name='processCarrier']")).click();

		driver.findElement(By.xpath("//a[@class='bankwire']")).click();

		WebElement buy = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", buy);

		TakesScreenshot ts4 = (TakesScreenshot) driver;
		File src4 = ts4.getScreenshotAs(OutputType.FILE);
		File dest4 = new File("E:\\rajasekar mobile\\eclipse workspace\\seleniumproj\\screenshot\\proceding4.png");
		FileUtils.copyFile(src4, dest4);
		buy.click();

		driver.findElement(By.xpath("//a[@class='button-exclusive btn btn-default']")).click();

		driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[3]/a")).click();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement quick3 = driver.findElement(By.xpath("//img[@itemprop='image']"));
		Actions act2 = new Actions(driver);
		act2.moveToElement(quick3).build().perform();

		driver.findElement(By.xpath("//span[text()='Quick view']")).click();

		WebElement quantity2 = driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
		driver.switchTo().frame(quantity2);

		WebElement quantity3 = driver.findElement(By.xpath("//i[@class='icon-plus']"));
		for (int i = 0; i < 9; i++) {
			quantity3.click();
		}

		WebElement size1 = driver.findElement(By.xpath("//select[@name='group_1']"));
		Select s2 = new Select(size1);
		s2.selectByValue("2");

		WebElement colour2 = driver.findElement(By.xpath("//a[@name='Blue']"));
		colour2.click();

		driver.findElement(By.xpath("(//span[text()='Add to cart'])[1]")).click();

		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//i[@class='icon-chevron-left left']")).click();

		driver.findElement(By.xpath("//a[@title='Women']")).click();

		WebElement quick4 = driver.findElement(By.xpath("(//img[@class='replace-2x img-responsive'])[4]"));
		Actions act3 = new Actions(driver);
		act3.moveToElement(quick4).build().perform();

		driver.findElement(By.xpath("(//span[text()='Quick view'])[3]")).click();

		WebElement quantity6 = driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
		driver.switchTo().frame(quantity6);

		WebElement quantity7 = driver.findElement(By.xpath("//i[@class='icon-plus']"));
		for (int i = 0; i < 9; i++) {
			quantity7.click();
		}

		WebElement size5 = driver.findElement(By.xpath("//select[@name='group_1']"));
		Select s7 = new Select(size5);
		s7.selectByValue("2");

		WebElement colour5 = driver.findElement(By.xpath("//a[@name='Orange']"));
		colour5.click();

		driver.findElement(By.xpath("//button[@name='Submit']")).click();

		driver.switchTo().parentFrame();
		WebElement proceed1 = driver.findElement(
				By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/a/span"));
		proceed1.click();

		driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/p[2]/a[1]/span")).click();

		driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/form/p/button/span")).click();

		driver.findElement(By.xpath("//input[@type='checkbox']")).click();

		driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/p/button/span")).click();

		driver.findElement(By.xpath("//a[@class='bankwire']")).click();

		driver.findElement(By.xpath("//span[text()='I confirm my order']")).click();
	}
}