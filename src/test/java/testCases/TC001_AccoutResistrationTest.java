package testCases;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.AcctRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC001_AccoutResistrationTest extends BaseClass
{
	
	
	@Test(groups= {"Regression","Master"}) //Step8 groups added
	void verify_Acct_Resistration()
	{
		logger.info("*****Starting TC001_AccoutResistrationTest *****");
		
		try {
		HomePage hp=new HomePage(driver);
		hp.ClickMyAcc();
		logger.info("Clicked on MyAcc link");
		hp.ClickLinkResis();
		logger.info("Clicked on Resister link");
		
		AcctRegistrationPage regpage=new AcctRegistrationPage(driver);
		
		logger.info("Providing cust details");
		regpage.SetFirstName(randomString());
		regpage.SetlastName(randomString());
		regpage.Setemail(randomString()+"@gmail.com");
		regpage.SetTelephone(randomNumber());
		String Password=randomAlphaNumeric();
		regpage.SetPass(Password);
		regpage.SetConfirmPass(Password);
		regpage.setPrivacyPolicy();
		regpage.clickcontinue();
		logger.info("Validating expecetd msg");
		String confmmsg=regpage.getConfirmationMsg();
		
		if(confmmsg.equals("Your Account Has Been Created!"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			logger.error("Test Failed");
			logger.debug("Debug logs");
			Assert.assertTrue(false);
		}
		//Assert.assertEquals(confmmsg, "Your Account Has Been Created!");
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		
		logger.info("Finished TC001_AccoutResistrationTest  ");
		
	}
	
	


	
}
