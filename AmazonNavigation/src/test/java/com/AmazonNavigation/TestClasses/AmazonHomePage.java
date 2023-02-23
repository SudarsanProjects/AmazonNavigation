package com.AmazonNavigation.TestClasses;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AmazonHomePage extends BaseSetupClass {

	//Here i have print the size of navigation tab and navigation texts
	
	@Test
	public void navigation() throws InterruptedException
	{
		Thread.sleep(10000);
		//Here getting all navigation tabs list
		List<WebElement> list=driver.findElements(By.xpath("//*[@id=\"nav-xshop\"]/a"));
		// Printing total size of Navigation tab
		int size=list.size();
		System.out.println(size);
    	for(WebElement wb: list)
		{
    		//Using for eachloop printing all tab Texts
	        System.out.println(wb.getText());					
		}
	}
	


}