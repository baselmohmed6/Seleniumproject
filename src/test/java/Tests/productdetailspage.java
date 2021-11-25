package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Pages.PageBase;

public class productdetailspage  extends PageBase{

	public productdetailspage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
    
	@FindBy(xpath ="/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div/div/div[2]/h2/a")
	public WebElement currentitem;
	
	public  void gotodetailedpage()
	{
		currentitem.click();
	}
	
	
}
