package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	@Given("^User is on Home Page$")
	public void user_is_on_home_page() {
		System.out.println("User is on Home Page");
	}

	@When("^User Navigate to LogIn Page$")
	public void user_navigate_to_log_in_page() {
		System.out.println("User Navigate to LogIn Page");
	}
	
	@And("User enters UserName {} and Password {}")
	public void user_enters_user_name_and_password(String string, String string2) {
		System.out.println("User enters UserName "+string+" and Password "+string2);
	}
	@Then("Message displayed Login {word}")
	public void message_displayed_login_successfully(String string) {
		System.out.println("Message displayed Login "+string);
	}

}
