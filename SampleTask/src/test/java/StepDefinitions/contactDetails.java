package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;

public class contactDetails {
	
//	WebDriver driver = null;
//
//	
//	@Given("I am google search page")
//	public void i_am_google_search_page() {
//		String projectPath = System.getProperty("user.dir");
//		System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/Drivers/chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//		
//		driver.navigate().to("https://www.google.com.au/");
//	    
//	}
//	
//	
//	@Given("I search for SecurePay on google")
//	public void i_search_for_SecurePay_on_google() {
//		System.out.println("I search for SecurePay on google");
//		
//		driver.findElement(By.name("q")).sendKeys("SecurePay");
//		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
//
//	}
//
//	@When("I click through the Securepay website")
//	public void i_click_through_the_Securepay_website() {
//		System.out.println("I click through the Securepay website");
//		
////		driver.getPageSource().contains("");
//		driver.findElement(By.className("//*[@class='LC20lb DKV0Md']"));
//		
//	}
//
//	@And("I navigate to the contact us page")
//	public void i_navigate_to_the_contact_us_page() {
//		System.out.println("I navigate to the contact us page");
//	}
//
//	@And("I verify the contact page is loaded")
//	public void i_verify_the_contact_page_is_loaded() {
//		System.out.println("I verify the contact page is loaded");
//	}
//
//	@Then("I generate random data")
//	public void i_generate_random_data() {
//		System.out.println("I generate random data");
//	}
//
//	@And("I use the generated data to fill in the contact us form")
//	public void i_use_the_generated_data_to_fill_in_the_contact_us_form() {
//		System.out.println("I use the generated data to fill in the contact us form");
//	}
//
//	@And("I close the browser")
//	public void i_close_the_browser() {
//		System.out.println("I close the browser");
//		
//		driver.close();
//		driver.quit();
//	}
}
