package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.DriverFactory;

public class SaveToWishList extends DriverFactory{
	
	public SaveToWishList(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//p[text()='save to wishlist']")
	public WebElement savetowishlist;
	
	

}
