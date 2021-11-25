package Tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.contactuspage;

public class contactustest extends TestBase{

	HomePage home;
	contactuspage contacxt;
	String fname="Basel Mohamed";
	String Email="basel@gmail.com";
	String message="Hello there";
	
     @Test
     public void contactustests()
     {
    	 home=new HomePage(driver);
    	 home.scrollpage();
    	 home.opencontactus();
    	 contacxt=new contactuspage(driver);
    	 contacxt.sendcontactus(fname, Email, message);
    	 assertTrue(contacxt.successmessage.getText().contains("Your enquiry has been successfully sent to the store owner."));
    	 
     }
}
