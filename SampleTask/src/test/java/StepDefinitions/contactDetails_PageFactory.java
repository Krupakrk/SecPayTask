package StepDefinitions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import pages.LandingPage;
import pages.SecurePayContact;
import pages.SecurePayHomePage;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
import pages.base;


public class contactDetails_PageFactory extends base{
	
	LandingPage landPage;
	SecurePayHomePage securePayPage;
	SecurePayContact contactUsPage;


	@Before
	public void initialize() throws IOException
	{
		 driver =initializeDriver();
	}
	
	@Given("I am google search page")
	public void google_search_page() {
	
		driver.navigate().to("https://www.google.com.au/");
	    
	}
	
	
	@And("I search for SecurePay on google")
	public void securepay_on_google() {
		
		landPage = new LandingPage(driver);
		landPage.searchPage();
		System.out.println("I search for SecurePay on google");
		landPage.securePayLink();
		
	}

	@When("I click through the Securepay website")
	public void navigate_to_securepay_website() {
		securePayPage = new SecurePayHomePage(driver);
		System.out.println("I click through the Securepay website");
		securePayPage.click_contactPage();
			
	}

	@And("I verify that I am in the contact us page")
	public void verify_contact_us_page() {
		
		System.out.println("I navigate to the contact us page");

	}

	@Then("I generate random data")
	public void generate_random_data() {
		System.out.println("I generate random data");
	}

	@And("I use the generated data to fill in the contact us form")
	public void fill_in_contact_us_form() {
		contactUsPage = new SecurePayContact(driver);
		System.out.println("I use the generated data to fill in the contact us form");
		contactUsPage.fillFirstName();
		contactUsPage.fillLastName();
		contactUsPage.fillEmail();
		contactUsPage.fillphoneNumber();
		contactUsPage.fillcompanyName();
		contactUsPage.fillWebsiteUrl();
	}

	@Then("I enter {string}")
	public void i_enter(String string) {
		contactUsPage.fillmessageText(string);
	}
	
	@And("I close the browser")
	public void close_browser() throws IOException {
		System.out.println("I close the browser");
		getScreenshot("target");
		
		driver.close();
		driver.quit();
	}
}
