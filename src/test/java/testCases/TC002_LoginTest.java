package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAcctPage;
import testBase.BaseClass;

public class TC002_LoginTest extends BaseClass
{
	
	  @Test(groups= {"Sanity","Master"}) //Step8 groups added
      public void verify_login()
      {
    	  logger.info("starting TC002_LoginTest");
    	  
    	  try {
    	  HomePage hp=new HomePage(driver);
    	  hp.ClickMyAcc();
    	  hp.ClickLinkLogin();
    	  
    	  LoginPage lp=new LoginPage(driver);
    	  lp.SetUsername(p.getProperty("email"));
    	  lp.SetPwd(p.getProperty("password"));
    	  lp.clicklogin();
    	  
    	  MyAcctPage mp=new MyAcctPage(driver);
    	  boolean targetPage=mp.isMyAccountPageExists();
    	  
    	  Assert.assertTrue(targetPage);
    	  }
    	  catch(Exception e)
    	  {
    		  Assert.fail();
    	  }
    	  
      }

}
