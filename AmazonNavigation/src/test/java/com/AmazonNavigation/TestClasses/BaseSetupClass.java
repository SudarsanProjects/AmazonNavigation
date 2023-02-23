package com.AmazonNavigation.TestClasses;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseSetupClass {

	public WebDriver driver;
	@BeforeClass
	public void setup()
	{
		
		System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
	}
	 
	@AfterClass
	public void tearDown() throws InterruptedException
	{
		driver.quit();
	}
	

	
}
