package org.hrms.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;

public class BasePackage {

	
	/*
	 * WebDriver --- Done Properties ---- Done Logs
	 * log4J,.log,log4j.properties,logger ---Done Extent Reports Mail
	 */

	public static WebDriver driver =null;
	public static Properties Config = new Properties();
	public static Properties OR = new Properties();
	public static FileInputStream fis;
	public Logger log = Logger.getLogger(BasePackage.class);
	
	public static void initialiseBrowser() 
	{
		
		if (Config.getProperty("browser").equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
			System.getProperty("user.dir") + "\\src\\test\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		} 
		else {
			System.out.println("Not Found");
		}
		
	}
    
	@BeforeTest(alwaysRun = true)
	
	public void setup() throws Exception {
         
		
		try {
			fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\Properties\\config.properties");
			Config.load(fis);
			// log.debug("log Initiated");
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\Properties\\OR.properties");
			OR.load(fis);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

	@AfterMethod(alwaysRun = true)
	public  void closeBrowser(){
			System.out.println("Driver Closed");
	        driver.close();
	}

}
