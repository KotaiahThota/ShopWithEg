package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DriverFactory {

	public static WebDriver driver;
	
	public void init()
	{
		driver=new SafariDriver();

	}
	
	
}
