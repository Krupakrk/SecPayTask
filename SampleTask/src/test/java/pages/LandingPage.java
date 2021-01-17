package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	
	
	@FindBy(name="q")
	WebElement inputString;
	
	@FindBy(className = "ellip")
	WebElement securePayLink;
	
	WebDriver driver;

	//Constructor class
	public LandingPage(WebDriver driver) {
		System.out.println("In construct class of Landing page");
		this.driver = driver;	
		PageFactory.initElements(driver, this);
	}
	
	public void searchPage() {
		System.out.println("In search page");
		inputString.sendKeys("SecurePay");
		inputString.sendKeys(Keys.ENTER);
		
	}
	
	public void securePayLink() {
		System.out.println("In securePayLink");
		securePayLink.click();
	}
}
