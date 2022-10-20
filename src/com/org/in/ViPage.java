package com.org.in;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ViPage {
    
	@FindBy (xpath = "(//a[@data-toggle='dropdown'])[1]") private WebElement prepaid;
	@FindBy (xpath = "//a[text()='Mobile Recharge']")private WebElement mobileRecharge;
	@FindBy (xpath = "(//a[@data-toggle='dropdown'])[2]") private WebElement postpaid;
	@FindBy (xpath = "(//a[@data-toggle='dropdown'])[3]") private WebElement connection;
	@FindBy (xpath ="(//a[@id='navbarDropdown'])[4]")private WebElement roaming;
	@FindBy (xpath = "(//a[@id='navbarDropdown'])[5]")private WebElement smartPhoneOffer;
	@FindBy (xpath = "(//a[@id='navbarDropdown'])[6]")private WebElement explore;
	@FindBy (xpath = "(//a[@id='navbarDropdown'])[7]")private WebElement help;
	
	public ViPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void selectPrepaid()
	{
		prepaid.click();
		
		
	}
	public void selectPostpaid(String sPospaid)
	{
		Select a2 = new Select(postpaid);
		a2.selectByVisibleText(sPospaid);
	}
	public void selectNewConnection(String newConnection)
	{
		Select a3 = new Select(connection);
		a3.selectByValue(newConnection);
	}
	public void clickRoaming()
	{
		roaming.click();
	}
	public void clickOnOffer()
	{
		smartPhoneOffer.click();
	}
	public void selectExplore(String sExplore)
	{
		Select a4 = new Select(explore);
		a4.selectByValue(sExplore);
	}
	public void selectHelp(String sHelp)
	{
		Select a5 = new Select(help);
		a5.selectByValue(sHelp);
	}
}
