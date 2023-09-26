package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.DriverFactory;

public class ViewDetails extends DriverFactory{
	
	public ViewDetails(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//p[text()='view details']")
	public WebElement detailspage;
	
	@FindBy(xpath="//p[text()='XL']")
	public WebElement size;
	
	@FindBy(xpath="//p[text()='Floral Stripe']")
	public WebElement colour;
	
	
	
	

}
