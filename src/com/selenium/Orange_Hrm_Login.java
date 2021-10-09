package com.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orange_Hrm_Login {

	static int Indexofusername, Indexofuserrole, Indexofemployeename, Indexofstatus;

	static String name = "Aravind";

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

		String un = text.substring(13, 18);
		String pw = text.substring(32, 40);
		System.out.println(un + "\n" + pw);

		WebElement username = driver.findElement(By.id("txtUsername"));
		username.sendKeys(un);

		WebElement password = driver.findElement(By.id("txtPassword"));
		password.sendKeys(pw);

		driver.findElement(By.id("btnLogin")).click();

		driver.findElement(By.id("menu_admin_viewAdminModule")).click();

		List<WebElement> table = driver.findElements(By.xpath("//table[@id='resultTable']/thead/tr/th"));

		for (int i = 0; i < table.size(); i++) {
			String headers = table.get(i).getText();
//			System.out.println(headers);

			if (headers.equalsIgnoreCase("Username")) {
				Indexofusername = i;
				System.out.println("Username: " + Indexofusername);

			} else if (headers.equalsIgnoreCase("User Role")) {
				Indexofuserrole = i;
				System.out.println("User Role: " + Indexofuserrole);

			} else if (headers.equalsIgnoreCase("Employee Name")) {
				Indexofemployeename = i;
				System.out.println("Employee Name: " + Indexofemployeename);

			} else if (headers.equalsIgnoreCase("Status")) {
				Indexofstatus = i;
				System.out.println("Status: " + Indexofstatus);
			}			
		}
		System.out.println("--------------------");

		List<WebElement> allrows = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));

		for (int i = 0; i < allrows.size(); i++) {
			List<WebElement> alldata = allrows.get(i).findElements(By.tagName("td"));

			for (int j = 0; j < alldata.size(); j++) {

				if (alldata.get(j).getText().equalsIgnoreCase(name)) {
					System.out.println("Username: " + alldata.get(Indexofusername).getText());
					System.out.println("User Role: " + alldata.get(Indexofuserrole).getText());
					System.out.println("Employee Name: " + alldata.get(Indexofemployeename).getText());
					System.out.println("Status: " + alldata.get(Indexofstatus).getText());
				}

			}
		}

	}

}
