package com.selenium;

import java.io.File;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Screen_Shot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\jegan\\eclipse-workspace\\Selenium1\\driver\\msedgedriver.exe");

		WebDriver driver = new EdgeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src= ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\jegan\\eclipse-workspace\\Selenium1\\Screenshot\\arav1.png");
		FileUtils.copyFile(src, dest);
		
		
	}

}
