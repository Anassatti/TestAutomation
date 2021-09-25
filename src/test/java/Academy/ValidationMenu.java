package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Resources.base;
import pageObjects.LandingPage;

public class ValidationMenu extends base{
	public WebDriver driver;
public static Logger log=LogManager.getLogger(base.class.getName());
	
	@BeforeTest
	public void initilize() throws IOException
	{
		driver=	initializeDriver();
		 driver.get(pro.getProperty("url"));
	}
	@Test
	public void basePageNavigation() 
	{

	LandingPage land= new LandingPage(driver);
	//Is menu displayed
     Assert.assertTrue( land.getmenu().isDisplayed());
     log.info("Successfully valided menu");
	   
	}
@AfterTest
public void teardown()
{
	driver.close();
}

}
