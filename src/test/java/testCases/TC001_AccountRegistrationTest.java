package testCases;

import java.time.Duration;
import org.apache.logging.log4j.LogManager; 
import org.apache.logging.log4j.Logger;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC001_AccountRegistrationTest extends BaseClass {

	//private static final Logger logger = LogManager.getLogger(TC001_AccountRegistrationTest.class);
	

/*@Test(groups={"Regression","Master"})
	
	public void verify_account_registration()
	{
		logger.info("*******Starting TC001_AccountRegistrationTest*******" );
		
		try
		{
		
		//1
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		logger.info("Clicked on MyAccount Link");
		hp.clickRegister();
		logger.info("Clicked on Register Link");
		
		
		//2
		AccountRegistrationPage regpage=new AccountRegistrationPage(driver);
		
		
		logger.info("Providing customer detalis....");
	regpage.setFirstName(randomeString().toUpperCase());
		regpage.setLastName(randomeString().toUpperCase());
		regpage.setEmail(randomeString()+"@gmail.com");   //randomly generated the email
		regpage.setTelephone(randomeNumber());
		
		//String password=randomAlphaNumeric();
		
		
		String password=randomeAlphaNumeric();
		regpage.setPassword(password);
		regpage.setConfirmPassword(password);
		
		
		regpage.setPrivacyPolicy();
		regpage.clickContinue();
		
		logger.info("Validating expected message");
	String confmsg	=regpage.getConfirmationMsg();
		if(confmsg.equals("Your Account Has Been Created!!!"))
		{
			Assert.assertTrue(true);
		}
		else
		{

			logger.error("Test failed..");
			logger.debug("Debug logs..");
			Assert.assertTrue(false);
		}
		//Assert.assertEquals(confmsg,"Your Account Has Been Created!!!");
		}
		
		catch(Exception e )
		{
			//logger.error("Test failed");
			//logger.debug("Debug logs..");
			Assert.fail();
		}
		logger.info("******** Finished TC001_AccountRegistrationTest*******");
		
		
	}

}
*/
	@Test(groups = {"Regression", "Master"})
	public void test_account_Registration() throws InterruptedException {

	    logger.info("Starting TC_001_AccountRegistrationTest");

	    System.out.println("DRIVER = " + driver);

	    HomePage hp = new HomePage(driver);

	    hp.clickMyAccount();
	    logger.info("Clicked on My Account");

	    hp.clickRegister();
	    logger.info("Clicked on Register");

	    AccountRegistrationPage regpage = new AccountRegistrationPage(driver);

	    regpage.setFirstName(randomeString().toUpperCase());
	    logger.info("Provided First Name");

	    regpage.setLastName(randomeString().toUpperCase());
	    logger.info("Provided Last Name");

	    regpage.setEmail(randomeString() + "@gmail.com");
	    logger.info("Provided Email");

	    regpage.setTelephone(randomeNumber());
	    logger.info("Provided Telephone");

	    regpage.setPassword("test@123");
	    logger.info("Provided Password");

	    regpage.setConfirmPassword("test@123");
	    logger.info("Provided Confirmed Password");

	    regpage.setPrivacyPolicy();
	    logger.info("Set Privacy Policy");

	    regpage.clickContinue();
	    logger.info("Clicked on Continue");

	    Thread.sleep(2000);

	    String confmsg = regpage.getConfirmationMsg();

	    System.out.println("CONFIRMATION MESSAGE = " + confmsg);

	    Assert.assertEquals(confmsg, "Your Account Has Been Created!");

	    logger.info("Finished TC_001_AccountRegistrationTest");
	}}