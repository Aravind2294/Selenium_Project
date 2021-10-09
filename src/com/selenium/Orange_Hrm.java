package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orange_Hrm {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jegan\\eclipse-workspace\\Selenium1\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://opensource-demo.orangehrmlive.com/");

		WebElement userpassword = driver
				.findElement(By.xpath("//span[text()='( Username : Admin | Password : admin123 )']"));

		String text = userpassword.getText();
		System.out.println(text);
		String[] split = text.split(" ");
		for (String string : split) {
			System.out.println(string);
//			if (string.equalsIgnoreCase("Admin")) {
//				System.out.println("Username: " + string);
//			} else if (string.equalsIgnoreCase("admin123")) {
//				System.out.println("Password: " + string);
//			}
		}

//		String un = text.substring(13, 18);
//		String pw = text.substring(32, 40);
//		System.out.println(un + "\n" + pw);

		WebElement username = driver.findElement(By.id("txtUsername"));
		username.sendKeys("Admin");

		WebElement password = driver.findElement(By.id("txtPassword"));
		password.sendKeys("admin123");

		driver.findElement(By.id("btnLogin")).click();

		driver.findElement(By.id("menu_admin_viewAdminModule")).click();

		driver.findElement(By.id("btnAdd")).click();

		WebElement empname = driver.findElement(By.id("systemUser_employeeName_empName"));
		empname.sendKeys("Garry White");

		WebElement username1 = driver.findElement(By.id("systemUser_userName"));
		username1.sendKeys("Aravind S");

		WebElement password1 = driver.findElement(By.id("systemUser_password"));
		password1.sendKeys("8098294433");

		WebElement cfnpwd = driver.findElement(By.id("systemUser_confirmPassword"));
		cfnpwd.sendKeys("8098294433");

		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/form/fieldset/p/input[1]")).click();

	}
}
