package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class sHOPPINGCARTPAGE extends PageBase{

	public sHOPPINGCARTPAGE(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "//*[@id=\"bar-notification\"]/div/p/a")
	WebElement shoppingcart;
	
	public void gotoshoppingcart()
	{
		shoppingcart.click();
	}

}
