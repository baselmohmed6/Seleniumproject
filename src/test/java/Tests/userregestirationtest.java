package Tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.google.common.graph.SuccessorsFunction;

import Pages.HomePage;
import Pages.Userregisterationpage;
import Pages.loginpage;

public class userregestirationtest  extends TestBase{

	HomePage homeobject;
	Userregisterationpage registerobject;
	loginpage login;
	@Test (priority = 1 ,alwaysRun = true)
	public void uservanregistersuccess() 
	{
		homeobject = new HomePage(driver);
		homeobject.openregisterlink();
		registerobject=new Userregisterationpage(driver);
		
		registerobject.userregisteration("Basel","Mohamed", "bsbpLa@gmail.com", "12345678");
	assertTrue(registerobject.successmessage.getText().contains("Your registration completed"));	
	 login= new loginpage(driver);
	 
	  homeobject.openloginlink();
	// registerobject.openloginpage("baselm@gmail.com", "12345678");
	
	
	}
	
	
}
