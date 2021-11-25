package Tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.google.common.graph.SuccessorsFunction;

import Data.loadproperties;
import Pages.HomePage;
import Pages.Userregisterationpage;
import Pages.loginpage;

public class userregestirationtestwithDDTandpropertiesfile  extends TestBase{
   String fname=loadproperties.userData.getProperty("firstname");
   String lname=loadproperties.userData.getProperty("lastname");
   String emails=loadproperties.userData.getProperty("email");
   String passwords=loadproperties.userData.getProperty("password");
	HomePage homeobject;
	Userregisterationpage registerobject;
	loginpage login;
	@Test (priority = 1 ,alwaysRun = true)
	public void uservanregistersuccess() 
	{
		homeobject = new HomePage(driver);
		homeobject.openregisterlink();
		registerobject=new Userregisterationpage(driver);
		
		registerobject.userregisteration(fname,lname,emails,passwords);
	assertTrue(registerobject.successmessage.getText().contains("Your registration completed"));	
	 login= new loginpage(driver);
	 
	  homeobject.openloginlink();
	 registerobject.openloginpage(emails, passwords);
	
	
	}
	
	
}
