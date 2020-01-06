package com.hrms.testcase.admin;

import org.hrms.base.BasePackage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginAdmin extends BasePackage {
@FindBy(how =How.XPATH,using="//input[@id='username']")
static WebElement username;
@FindBy(how =How.XPATH,using="//input[@id='Password']")
static WebElement password;
@FindBy(how =How.XPATH,using="//input[@name='login']")
static WebElement login;

@Test(groups= {"Smoke","Regression"})
public void AdminLogin()
{
	PageFactory.initElements(driver,LoginAdmin.class);
	log.info("Page Loaded Successfully");
	username.sendKeys(OR.getProperty("admin"));
	log.info("Username Entered Successfully");
	password.sendKeys(OR.getProperty("password"));
	log.info("Password Entered Successfully ");
	login.click();
	log.info("Info Submitted");
	String Expected_Url=driver.getCurrentUrl();
	log.info("Current Url is as"+Expected_Url);
 	String Actual_Url="http://localhost/erms/erms/admin/welcome.php";
  	Assert.assertEquals(Actual_Url, Expected_Url);
}
@Test()
public void FalseAdminLogin()
{
	PageFactory.initElements(driver,LoginAdmin.class);
	log.info("Page Loaded Successfully");
	username.sendKeys(OR.getProperty("admin1"));
	log.info("Username Entered Successfully");
	password.sendKeys(OR.getProperty("password1"));
	log.info("Password Entered Successfully ");
	login.click();
	log.info("Info Submitted");
	String Expected_Url=driver.getCurrentUrl();
	log.info("Current Url is as"+Expected_Url);
 	String Actual_Url="http://localhost/erms/erms/admin/welcome.php";
  	Assert.assertEquals(Actual_Url, Expected_Url);
}
}