package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAcctPage extends BasePage
{
	public MyAcctPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//h2[text()='My Account']") WebElement msgheading;
	@FindBy(xpath = "//div[@class='list-group']//a[text()='Logout']")
	WebElement lnkLogout;

	
	public boolean isMyAccountPageExists()
	{
		try {
		return msgheading.isDisplayed();
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public void clickLogout() {
		lnkLogout.click();

	}


}
