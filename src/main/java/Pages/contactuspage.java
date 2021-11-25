package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class contactuspage extends PageBase{

	public contactuspage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


    @FindBy(id = "FullName")
    WebElement name;
    @FindBy(id = "Email")
    WebElement email;
    @FindBy(id = "Enquiry")
    WebElement enquiry;
    @FindBy(name = "send-email")
    WebElement submitbtn;
    @FindBy(css = "div.result")
    public WebElement successmessage;
    public void sendcontactus(String fname,String emails,String enquires)
    {
      name.sendKeys(fname);
      email.sendKeys(emails);
      enquiry.sendKeys(enquires);
      submitbtn.click();
    }
}
