package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.DriverFactory;

public class FashionForAllProductsPage extends DriverFactory{
	
	public FashionForAllProductsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@aria-label=\"The Black Madonna : Unisex Sweatshirt\"]")
	public WebElement product2;
	
	@FindBy(xpath="//div[@aria-label=\"Uniform “GAME DAY” Shorts - Marble Camo Green\"]")
	public WebElement product3;
	
	
}
