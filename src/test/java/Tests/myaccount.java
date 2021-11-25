package Tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.MYACCOUNTPAGE;
import Pages.Userregisterationpage;
import Pages.loginpage;

public class myaccount  extends TestBase{
	HomePage homeobject;
	Userregisterationpage registerobject;
	loginpage login;
	MYACCOUNTPAGE myaccobject;
	@Test (priority = 1 )
	public void uservanregistersuccess() 
	{
		homeobject = new HomePage(driver);
		homeobject.openregisterlink();
		registerobject=new Userregisterationpage(driver);
		
		registerobject.userregisteration("Basel","Mohamed", "besipds@gmail.com", "12345678");
	assertTrue(registerobject.successmessage.getText().contains("Your registration completed"));	
	}
	@Test (dependsOnMethods = {"uservanregistersuccess"})
	public void registerusercanchangepass()
	{
		
		myaccobject=new MYACCOUNTPAGE(driver);
		registerobject.openMyAccountPage();
		myaccobject.openchangepassword();
		myaccobject.changepassword("12345678", "1234567890");
	    myaccobject.btnsub();
		assertTrue(myaccobject.resultlbl.getText().contains("Password was changed"));
		
	}
}
