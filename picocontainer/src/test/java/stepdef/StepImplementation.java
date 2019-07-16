package stepdef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.CSVUtilities;
import utilities.SharedDrive;

public class StepImplementation {

	private CSVUtilities obj;
	private SharedDrive sd;
	
	public StepImplementation(CSVUtilities obj, SharedDrive sd){
		this.obj = obj;
		this.sd = sd;
	}
	
	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() {
		System.out.println("Given I want to write a step with precondition");
		System.out.println("$$$$$$$$$$$$");
		obj.CSVFunction();
	}

	@Given("some other precondition")
	public void some_other_precondition() {
		System.out.println("Given some other precondition");
		System.out.println("%%%%%%%%%%%%%%%%%");
		sd.SharedDriveFunction();
	}

	@When("I complete action")
	public void i_complete_action() {
		System.out.println("When I complete action");
	}

	@When("some other action")
	public void some_other_action() {
		System.out.println("When some other action");
	}

	@When("yet another action")
	public void yet_another_action() {
		System.out.println("When yet another action");
	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
		System.out.println("Then I validate the outcomes");
	}

	@Then("check more outcomes")
	public void check_more_outcomes() {
		System.out.println("Then check more outcomes");
	}

	@Given("I want to write a step with name{int}")
	public void i_want_to_write_a_step_with_name(Integer int1) {
		System.out.println("Given I want to write a step with name{int}");
	}

	@When("I check for the {int} in step")
	public void i_check_for_the_in_step(Integer int1) {
		System.out.println("When I check for the {int} in step");
	}

	@Then("I verify the success in step")
	public void i_verify_the_success_in_step() {
		System.out.println("Then I verify the success in step");
	}

	@Then("I verify the Fail in step")
	public void i_verify_the_Fail_in_step() {
		System.out.println("Then I verify the Fail in step");
	}

}
