package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.DriverFactory;

public class BeautyProducts extends DriverFactory{
	
	public BeautyProducts(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@aria-label='Moisturizing Lip Gloss Bundle']")
	public WebElement productname1;
	
	
	@FindBy(xpath="//div[@aria-label='Naughty Spice Bronzer']")
	public WebElement productname2;
	
	
	
	
	
	

}
