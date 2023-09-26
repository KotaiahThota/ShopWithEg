package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.DriverFactory;

public class LandingPage extends DriverFactory{
	
	public LandingPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
@FindBy(xpath="//p[text()='login']")
public WebElement loginButton;

@FindBy(xpath="//a[text()=\"men's\"]")
public WebElement menspage;


@FindBy(xpath="//a[text()=\"women's\"]")
public WebElement womenspage;

@FindBy(xpath="//a[text()=\"shoes\"]")
public WebElement beauty;

@FindBy(xpath="//a[text()=\"candles\"]")
public WebElement fashionforall;

public void loginButton()
{
	loginButton.click();
	
}

public void clickmenspage()
{
	menspage.click();
	
}

public void womenspage()
{
	womenspage.click();
	
}

public void beauty()
{
	beauty.click();
	
}

public void fashionforall()
{
	fashionforall.click();
	
}




}
