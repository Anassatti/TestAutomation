package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.ForgetPassword;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import Resources.base;
public class HomePage extends base{
	public WebDriver driver;
	public static Logger log=LogManager.getLogger(base.class.getName());
	// Integrate with testng
	//Integrate with maven-run the project
	//Integrate with log4j
	//Generate HTML report
	// Take screenshots
	@BeforeTest
	public void initilize() throws IOException
	{
		driver=	initializeDriver();
		
	}
	
	@Test(dataProvider="getData")
	
	
	public void basePageNavigation(String Username, String Password) 
	{


		driver.get(pro.getProperty("url"));
	LandingPage land= new LandingPage(driver);
	LoginPage log= land.getLogin();
//	LoginPage log= new LoginPage(driver);
	log.getEmail().sendKeys(Username);
	log.getPassword().sendKeys(Password);
	log.getSubmit().click();
	ForgetPassword pass=land.forGotPassword();
	pass.getEmail().sendKeys("anasssatti@yahoo.com");
	pass.sendMeInstruction().click();
	// log.info("Successfully valided text message");
	//System.out.print(Text);
	}
	

	@DataProvider
	
	public Object[][] getData()
	{
		//Row stands for how many different data types test should run
		// Column stands for how many value per each test
	
		Object[][] data= new Object[2][2];
		
		data[0][0]="anasssatti@yahoo.com";
		data[0][1]="12345";
		//data[0][2]="Restrcited user";

		data[1][0]="anasssattiss@yahoo.com";
		data[1][1]="12345";
	//	data[1][2]="NON Restrcited user";
		return data;

	}
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
	
}
