package Tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;
import com.google.common.graph.SuccessorsFunction;

import Pages.HomePage;
import Pages.Userregisterationpage;
import Pages.loginpage;

public class userregestirationtestwithjavafaker  extends TestBase{

	HomePage homeobject;
	Userregisterationpage registerobject;
	loginpage login;
	Faker fakedata=new Faker();
	String firstname=fakedata.name().firstName(),
			lastname=fakedata.name().lastName(),
			email=fakedata.internet().emailAddress(),
			password=fakedata.internet().password(8, 12);

	@Test (priority = 1 ,alwaysRun = true)
	public void uservanregistersuccess() 
	{

		homeobject = new HomePage(driver);
		homeobject.openregisterlink();
		registerobject=new Userregisterationpage(driver);
		
		registerobject.userregisteration(firstname,lastname, email, password);
		System.out.println(firstname+" "+lastname+" "+email+" "+password);
	assertTrue(registerobject.successmessage.getText().contains("Your registration completed"));	
	 login= new loginpage(driver);
	 registerobject.logout();
	homeobject.openloginlink();
    registerobject.openloginpage(email, password);
	registerobject.logout();
	}


}
