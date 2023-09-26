package stepDefinations;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utility.DriverFactory;

public class Hooks {
	
	DriverFactory driverfactory = new DriverFactory();
	@Before
	public void beforeMethod()
	{
		driverfactory.init();
	}
	
	
	@After
	public void afterMethod()
	{
		DriverFactory.driver.close();
	}
}
