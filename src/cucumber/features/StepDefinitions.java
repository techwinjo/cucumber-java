package cucumber.features;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions {
	@Given("^I navigated to the zoo website$")
	public void shouldNavigateToZoo() throws Throwable {
		System.out.println("excueted the navigate to zoo method");
	}

	@When("^I click on the adoption link$")
	public void shouldClickOnAdoption() throws Throwable {
		System.out.println("excueted the click on adoption link method");
	}

	@Then("^I check to see that no animals are available$")
	public void i_check_to_see_that_no_animals_are_available() throws Throwable {
		System.out
				.println("checked that the no animals string was visible or not");

	}

}
