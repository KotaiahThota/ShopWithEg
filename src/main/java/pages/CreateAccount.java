package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.DriverFactory;

public class CreateAccount extends DriverFactory{
	
	public CreateAccount(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="firstName")
	public WebElement firstname;
	
	@FindBy(id="lastName")
	public WebElement lastName;
	
	
	@FindBy(id="email")
	public WebElement email;
	
	
	@FindBy(xpath="//input[@type=\"password\"]")
	public WebElement password;
	
	@FindBy(id="birthday")
	public WebElement birthday;
	
	@FindBy(xpath="//p[text()='create account']")
	public WebElement createaccount;
	
	
	

}
