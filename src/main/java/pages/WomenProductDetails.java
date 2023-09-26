package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.DriverFactory;

public class WomenProductDetails extends DriverFactory{
	
	public WomenProductDetails(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@aria-label='Linda Reversible Tie Up Long Sleeve Shirt In White']")
	public WebElement productname1;
	
	@FindBy(xpath="//div[@aria-label='Cleopatra Luxury Gold Chain Cover Up Dress']")
	public WebElement productname2;

}
