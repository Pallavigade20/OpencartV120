package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AcctRegistrationPage extends BasePage
{
	
	public AcctRegistrationPage(WebDriver driver)
	{
		super(driver);	
	}
	
	//Locator
	
	@FindBy(xpath="//input[@id='input-firstname']") WebElement txtfirstname;
	@FindBy(xpath="//input[@id='input-lastname']") WebElement txtlastname;
	@FindBy(xpath="//input[@id='input-email']") WebElement txtemail;
	@FindBy(xpath="//input[@id='input-telephone']") WebElement txttelephone;
	@FindBy(xpath="//input[@id='input-password']") WebElement txtpassword;
	@FindBy(xpath="//input[@id='input-confirm']") WebElement txtconfirmpwd;
	@FindBy(xpath="//input[@name='agree']") WebElement chkbox;
	@FindBy(xpath="//input[@value='Continue']") WebElement btncontinue;
	@FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']") WebElement msgConfirmation;

	
	//Action methods
	public void SetFirstName(String fname)
	{
		txtfirstname.sendKeys(fname);
	}
	
	public void SetlastName(String lname)
	{
		txtlastname.sendKeys(lname);
	}
	
	public void Setemail(String email)
	{
		txtemail.sendKeys(email);
	}
	
	public void SetTelephone(String tel)
	{
		txttelephone.sendKeys(tel);
	}
	
	public void SetPass(String pwd)
	{
		txtpassword.sendKeys(pwd);
	}
	
	public void SetConfirmPass(String pwd)
	{
		txtconfirmpwd.sendKeys(pwd);
	}
	
	public void setPrivacyPolicy()
	{
		chkbox.click();
	}
	
	public void clickcontinue()
	{
		btncontinue.click();
		
		//sol2 
		//btnContinue.submit();
		
		//sol3
		//Actions act=new Actions(driver);
		//act.moveToElement(btnContinue).click().perform();
					
		//sol4
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("arguments[0].click();", btnContinue);
		
		//Sol 5
		//btnContinue.sendKeys(Keys.RETURN);
		
		//Sol6  
		//WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//mywait.until(ExpectedConditions.elementToBeClickable(btnContinue)).click();

	}
	
	public String getConfirmationMsg() {
		try {
			return (msgConfirmation.getText());
		} catch (Exception e) 
		{
			return (e.getMessage());

		}
	}

}
