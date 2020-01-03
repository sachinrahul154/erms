package com.hrms.testcase.admin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestData {

	public WebDriver driver;
	@Test(groups = "Smoke")
	public void Testn()
	{
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\src\\test\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("www.google.com");
	}
}
