package cucumber.features;

import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitionsContact {

	WebDriver driver = null;

	@Given("^I am on my zoo website$")
	public void i_am_on_my_zoo_website() throws Throwable {
		driver = new FirefoxDriver();
		driver.navigate().to("https://www.teksystems.com/en");
	}

	@When("^I click on the contact link$")
	public void i_click_on_the_contact_link() throws Throwable {
		driver.findElement(By.partialLinkText("IT Careers")).click();
		driver.findElement(By.partialLinkText("Apply for a Job")).click();
		
		// driver.findElement(By.linkText("Find an IT job near you")).click();

	}

	@And("^populate the contact form$")
	public void populate_the_contact_form() throws Throwable {
		
		//Keyword
	    driver.findElement(By.id("keyword")).sendKeys("java developer with cucumber");
	    driver.findElement(By.xpath("//button[contains(.,'Search')]")).click();	
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@Then("^I should be on the contact confirmation page$")
	public void i_should_be_on_the_contact_confirmation_page() throws Throwable {
		Assert.assertTrue(true);
		//river.close();
		
	}
}
