package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pages.helpers.randomDataGenerator;


public class SecurePayContact {
	
	randomDataGenerator rand = new randomDataGenerator();
	
	@FindBy(name = "firstName")
	WebElement firstName;
	

	@FindBy(name="lastName")
	WebElement lastName;
	
	@FindBy(name="email")
	WebElement emailId;
	
	@FindBy(name="phone")
	WebElement phoneNumber;
	
	@FindBy(name="company")
	WebElement companyName;
	
	@FindBy(name="website")
	WebElement websiteUrl;
	
	@FindBy(name="amount")
	WebElement amount;
	
	@FindBy(name="message")
	WebElement messageText;
	
	@FindBy(id="existingCustomer")
	WebElement existingCustomer_cb;
	
	WebDriver driver;
	public SecurePayContact(WebDriver driver) {
		this.driver = driver;	
		PageFactory.initElements(driver, this);
	}	
	
	public void fillFirstName() {
		firstName.sendKeys(rand.firstName);
		System.out.println("First Name is:"+ rand.firstName);
	}
	
	public void fillLastName() {
		lastName.sendKeys(rand.lastName);
		System.out.println("Last Name is:"+rand.lastName);
	}
	
	public void fillEmail() {
		emailId.sendKeys(rand.email);
		System.out.println("Email Id is:"+rand.email);
	}
	
	public void fillphoneNumber() {
		phoneNumber.sendKeys(rand.phoneNumber);
		System.out.println("Phone Number is:"+rand.phoneNumber);
	}
	
	public void fillcompanyName() {
		companyName.sendKeys(rand.companyName);
		System.out.println("Company Name is:"+rand.companyName);
	}
	
	public void fillWebsiteUrl() {
		websiteUrl.sendKeys(rand.webSiteUrl);
		System.out.println("Website url is:"+rand.webSiteUrl);
	}
	
	public void fillamount() {
		
		Select amountlist= new Select(amount);
		amountlist.selectByIndex(1);
	}

	public void fillmessageText(String message) {
		messageText.sendKeys(message);
	}

	public void selectCustomerCheckBox() {
		existingCustomer_cb.click();
	}
	
}
