package com.AmazonNavigation.TestClasses;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class OpenNavigationOnNewTab extends BaseSetupClass{
	
	@Test
	public void openAllNavigation()
	{
		//Here getting list of Navigation tabs
List<WebElement> list=driver.findElements(By.xpath("//*[@id=\"nav-xshop\"]/a"));
		// Getting total size of Navigation tab
		int size=list.size();
    for(int i=1;i<=size;i++)
    {
    	//Here im opening individual Navigation bar in new tab
    	WebElement nav=driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a["+i+"]"));
    	nav.sendKeys(Keys.chord(Keys.CONTROL,Keys.RETURN));
    	//Here using windowhandle method navigating to each tab and capturing the Tatle page 
    	ArrayList<String> tabs=new ArrayList<String>(driver.getWindowHandles());
    	driver.switchTo().window(tabs.get(i));
    	System.out.println(driver.getTitle());
    	//After capturing the Page tile again im navigating to main tab to open other Navigation tabs
    	driver.switchTo().window(tabs.get(0));
    }
	}
	

}
