package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class productdetailspage2 extends PageBase {

	public productdetailspage2(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
     
	@FindBy(xpath = "/html/body/div[6]/div[3]/div/div[1]/ul/li[4]/strong")
	 public WebElement breadcrumb;
	@FindBy (id = "add-to-cart-button-4")
	WebElement addtocart;
	public void addtocart()
	{
		addtocart.click();
	}
}
