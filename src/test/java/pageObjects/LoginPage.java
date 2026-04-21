package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage
{
	//constructor
		public LoginPage(WebDriver driver)
		{
			super(driver);
		}
		
		@FindBy(id="input-email") WebElement txtusername;
		@FindBy(xpath="//input[@id='input-password']") WebElement txtpwd;
		@FindBy(xpath="//input[@value='Login']") WebElement btnlogin;
		
		public void SetUsername(String user)
		{
			txtusername.sendKeys(user);
		}
		
		public void SetPwd(String pwd)
		{
			txtpwd.sendKeys(pwd);
		}
		
		public void clicklogin()
		{
			btnlogin.click();
		}
		
		

}
