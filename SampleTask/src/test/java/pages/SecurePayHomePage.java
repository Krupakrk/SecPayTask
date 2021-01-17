package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SecurePayHomePage {
	
	@FindBy(xpath = "//*[contains(text(),\"Contact us\")]")
	WebElement contactPageButton;
	
	WebDriver driver;
	public SecurePayHomePage(WebDriver driver) {
		this.driver = driver;	
		PageFactory.initElements(driver, this);
	}
	
	public void click_contactPage() {
				
		contactPageButton.click();
	}

}
