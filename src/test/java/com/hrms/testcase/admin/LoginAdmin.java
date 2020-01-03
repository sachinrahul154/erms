package com.hrms.testcase.admin;

import org.hrms.base.BasePackage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginAdmin extends BasePackage {

@Test (groups = "Smoke")
public void AdminLogin()
{
 driver.findElement(By.xpath(OR.getProperty("admin_username"))).sendKeys("admin");
 driver.findElement(By.xpath(OR.getProperty("admin_password"))).sendKeys("test@123");
 driver.findElement(By.xpath(OR.getProperty("admin_login"))).click();
}
@Test(groups="Smoke")
public void FalseLogin()
{
 driver.findElement(By.xpath(OR.getProperty("admin_username"))).sendKeys("admin");
 driver.findElement(By.xpath(OR.getProperty("admin_password"))).sendKeys("test@123");
 driver.findElement(By.xpath(OR.getProperty("admin_login"))).click();
}
public void adminLogin() {
	
	
}
}
