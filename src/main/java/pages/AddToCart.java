package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.DriverFactory;

public class AddToCart extends DriverFactory {
	
	public AddToCart(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//p[text()='add to cart']")
	public WebElement addtocart;
	
	public void clickaddtocart()
	{
		addtocart.click();
		
	}
	
	

}
