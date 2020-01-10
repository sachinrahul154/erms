package org.hrms.utilities;

import java.util.concurrent.TimeUnit;

import org.hrms.base.BasePackage;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Implements extends BasePackage {

	//
	public static void Maximize()
	{
		driver.manage().window().maximize();
	}
	//implicit Wait 	
	public static void Implicitwait()
	{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	//explicit Wait 
	public static void ExplicitWait()
	{
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(null);
	}
	//Fluent Wait
}
