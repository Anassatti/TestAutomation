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

public class ValidationTitle extends base{
	public WebDriver driver;
public static Logger log=LogManager.getLogger(base.class.getName());
	
LandingPage land;
	@BeforeTest
	public void initilize() throws IOException
	{
		driver=	initializeDriver();
		log.info("Driver is initilized");
		driver.get(pro.getProperty("url"));
		log.info("Navigate to homepage");
	}
	@Test
	public void basePageNavigation() throws IOException
	{

	
	 land= new LandingPage(driver);
     Assert.assertEquals(land.gettitle().getText(), "FEATURED COURSES123");
     log.info("Successfully valided text message");
     
	}
	@Test
	public void ValidateHeader() throws IOException
	{

	
   land= new LandingPage(driver);
     Assert.assertEquals(land.getHeader().getText(), "An Academy to learn Everything about Testing");
     log.info("Successfully valided text message");
     
	}
	@AfterTest
	public void teardown()
	{
		driver.close();
	}


}
