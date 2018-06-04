package com.maven.veryFirst;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */

public class AppTest 
{
	@Test
	public void openBrowser() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\hp\\Desktop\\chrome drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		Thread.sleep(5000);
		driver.close();
		
		System.out.println("Maven successfully executed......!");
	}
}
