package com.org.in;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.in.Browser;

public class ViTest
{
	@Test
   public void PerformPrepaid() throws InterruptedException
   {
	   WebDriver driver = Browser.openBrowser("https://www.myvi.in/");
	   ViPage viPage = new ViPage(driver);
	   Thread.sleep(2000);
	  viPage.selectPrepaid();
	  // viPage.clickOnOffer();
	   //viPage.selectPostpaid("Redx");
   }
}
