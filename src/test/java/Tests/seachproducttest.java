package Tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import Pages.SearchPage;
import Pages.productdetailspage2;

public class seachproducttest extends TestBase{

	String prodname="Apple MacBook Pro 13-inch ";
	SearchPage serchobj;
	productdetailspage prdobj;
	productdetailspage2 products;
	@Test
	public void searchproduct()
	{
		serchobj=new SearchPage(driver);
		serchobj.search(prodname);
		prdobj=new productdetailspage(driver);
		prdobj.gotodetailedpage();
		products=new productdetailspage2(driver);
		assertTrue(products.breadcrumb.getText().equalsIgnoreCase("Apple MacBook Pro 13-inch"));
	}
	
	
}
