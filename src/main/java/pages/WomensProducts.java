package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.DriverFactory;

public class WomensProducts extends DriverFactory{
	
	public  WomensProducts(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//a[@href='/products/womens/256']")
	public WebElement womenproducts;
	
	

}
