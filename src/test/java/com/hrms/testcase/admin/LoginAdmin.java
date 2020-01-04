package com.hrms.testcase.admin;

import org.hrms.base.BasePackage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginAdmin extends BasePackage {

@Test 
public void AdminLogin()
{
 driver.findElement(By.xpath(OR.getProperty("admin_username"))).sendKeys("admin");
 log.info("username Entered");
 driver.findElement(By.xpath(OR.getProperty("admin_password"))).sendKeys("test@123");
 log.info("password entered");
 driver.findElement(By.xpath(OR.getProperty("admin_login"))).click();
}
}
