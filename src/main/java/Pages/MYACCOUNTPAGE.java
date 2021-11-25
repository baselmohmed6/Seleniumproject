package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MYACCOUNTPAGE extends PageBase{

	public MYACCOUNTPAGE(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
  
	@FindBy(linkText =  "Change password")
	WebElement chngpass;
	@FindBy(id =   "OldPasswords")
	WebElement oldass;
	@FindBy(id =  "NewPassword")
	WebElement Newpass;
	@FindBy(xpath =    "/html/body/div[6]/div[3]/div/div[2]/div/div[2]/form/div[2]/button")
	public WebElement btnsub;
	@FindBy(id = "ConfirmNewPassword")
	WebElement confirmpass;
	@FindBy(xpath =   "//*[@id=\"bar-notification\"]/div/p")
	public WebElement resultlbl;
	
	public void openchangepassword()
	{
		clickbtn(chngpass);
		
	}
	public void changepassword(String oldpass,String nepass)
	{
		oldass.sendKeys(oldpass);
		Newpass.sendKeys(nepass);
		confirmpass.sendKeys(nepass);
		
	}
	public void btnsub() {
		// TODO Auto-generated method stub
		btnsub.submit();
	}
}
