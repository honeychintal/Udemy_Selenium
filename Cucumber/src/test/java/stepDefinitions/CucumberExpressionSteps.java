package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class CucumberExpressionSteps {

	@Given("pass the string {string}")
	public void pass_the_string(String string) {
		System.out.println("pass the string " + string);
	}

	@And("I have {int} cucumbers in my belly")
	public void i_have_cucumbers_in_my_belly(Integer int1) {
		System.out.println("I have " + int1 + " cucumbers in my belly");
	}
	@And("I got {double} percent")
	public void i_got_percent(Double double1) {
		System.out.println("I got "+double1+" percent");
	}
	@And("The one word is {word}")
	public void the_one_word_is(String string) {
System.out.println("The one word is "+string);
	}
}
