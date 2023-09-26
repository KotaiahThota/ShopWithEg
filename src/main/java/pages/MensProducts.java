package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.DriverFactory;

public class MensProducts extends DriverFactory {
	

	public MensProducts(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@aria-label='Rocky Floral Stripe Shorts']")
	public WebElement productname1;
	
	@FindBy(xpath="//p[text()='ACTIVELY BLACK']")
	public WebElement productname2;
	
	public void clickproductname1()
	{
		productname1.click();
		
	}

	public void clickproductname2()
	
	{
		productname2.click();
		
	}
	

}
