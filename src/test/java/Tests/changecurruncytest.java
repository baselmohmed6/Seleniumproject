package Tests;

import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.SearchPage;

public class changecurruncytest extends TestBase{
	
	String searchtxt= "Mac";
	HomePage home;
	SearchPage search;
	@Test
	public void testchangecurruncy() throws InterruptedException
	{
		home=new HomePage(driver);
		home.changecurrunc();
		
		search=new SearchPage(driver);
		search.productsearchusingautosuggest(searchtxt);
		
	}

}
