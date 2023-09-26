package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.DriverFactory;

public class LoginPage extends DriverFactory{
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="email")
	public WebElement emailTextBox;
	
	@FindBy(name="password")
	public WebElement password;
	
	@FindBy(xpath="//p[text()='sign in']")
	public WebElement signin;
	

public void entervalidEmail()
{
	emailTextBox.sendKeys("kotaiahthota16@gmail.com");
	
}

public void enterinvalidEmail()
{
	emailTextBox.sendKeys("kotaiahthota16@gmail.com");
	
}
public void entervalidpassword()
{
	password.sendKeys("AmmaNanna@143");
	
}

public void enterinvalidpassword()
{
	password.sendKeys("AmmaNanna@143");
	
}
public void clickSignIn()
{
	signin.click();
	
}

}


