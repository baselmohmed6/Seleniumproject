package Tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import Pages.SearchPage;
import Pages.productdetailspage2;
import Pages.sHOPPINGCARTPAGE;

public class addproducttoshoppingcart extends TestBase{

	String prodname="Apple MacBook Pro 13-inch ";
	SearchPage serchobj;
	productdetailspage prdobj;
	productdetailspage2 products;
	sHOPPINGCARTPAGE shoppingobject;
	@Test(priority = 1)
	public void searchproduct()
	{
		serchobj=new SearchPage(driver);
		serchobj.search(prodname);
		prdobj=new productdetailspage(driver);
		prdobj.gotodetailedpage();
		products=new productdetailspage2(driver);
		assertTrue(products.breadcrumb.getText().equalsIgnoreCase("Apple MacBook Pro 13-inch"));
	}
	@Test(priority = 2)
	public void addproducttocarttest()
	{
		products=new  productdetailspage2(driver);
		products.addtocart();
	}
	
	@Test (priority   = 3)
	
	public void gotoshoopingcart() throws InterruptedException
	{
		shoppingobject=new sHOPPINGCARTPAGE(driver);
		shoppingobject.gotoshoppingcart();
		Thread.sleep(3000);
	}
}
