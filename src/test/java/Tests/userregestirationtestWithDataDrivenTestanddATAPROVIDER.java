package Tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.google.common.graph.SuccessorsFunction;

import Pages.HomePage;
import Pages.Userregisterationpage;
import Pages.loginpage;

public class userregestirationtestWithDataDrivenTestanddATAPROVIDER  extends TestBase{

	HomePage homeobject;
	Userregisterationpage registerobject;
	loginpage login;
	@DataProvider(name = "testData")
	public static Object[][] userData()
	{
		return new Object[][]{ 
	    {"Basel","Mohamed", "bsbpLsdassah@gmail.com", "12345678"},
	   {"Baseles","Mohameds", "bsgb@gmail.com", "12345678"}
	    };
	}
	@Test (priority = 1 ,alwaysRun = true,dataProvider = "testData")
	public void uservanregistersuccess(String fname,String lname,String email,String password) 
	{
		homeobject = new HomePage(driver);
		homeobject.openregisterlink();
		registerobject=new Userregisterationpage(driver);
		
		registerobject.userregisteration(fname,lname, email, password);
	assertTrue(registerobject.successmessage.getText().contains("Your registration completed"));	
	 login= new loginpage(driver);
	 registerobject.logout();
	homeobject.openloginlink();
    registerobject.openloginpage(email, password);
	registerobject.logout();
	
	}
	
	
	
}
