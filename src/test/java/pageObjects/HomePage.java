package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage
{
	
	
	
	//constructor
	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
	//Locators
	
	@FindBy(xpath="//span[contains(text(),'My Account')]") WebElement lnkMyAcc;
	@FindBy(xpath="//a[contains(text(),'Register')]") WebElement lnkRegister;
	@FindBy(xpath="//a[text()='Login']") WebElement clklogin;
	
	//Actions
	public void ClickMyAcc()
	{
		lnkMyAcc.click();
	}
	

	public void ClickLinkResis()
	{
		lnkRegister.click();
	}
	
	public void ClickLinkLogin()
	{
		clklogin.click();
	}

}
