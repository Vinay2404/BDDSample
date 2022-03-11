package stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.*;

public class CRMStepDef {
	
	@Before("RegressionTest")
	public void setupDBReg() {
		System.out.println("DB for RegressionTest");
	}
	@Before(value = "RegressionTest", order = 1)
	public void ReadRegProp() {
		System.out.println("Read from RegressionTest Property");
	}
	@Before("SmokeTest")
	public void setupDBSmoke() {
		System.out.println("DB for SmokeTest");
	}
	@Before(value = "SmokeTest", order = 2)
	public void ReadSmokeProp() {
		System.out.println("Read from SmokeTest Property");
	}
	
	@After
	public void closeDBRemote() {
		System.out.println("After each scenario....");
	}
//	@After
//	public void closeDB() {
//		System.out.println("After each scenario....");
//	}
	
	@Given("User must login")
	public void user_must_login() {
	    System.out.println("User must login");
	}

	@When("create a new contact")
	public void create_a_new_contact() {
		System.out.println("create a new contact");
	}

	@When("User view a contact")
	public void user_view_a_contact() {
		System.out.println("User view a contact");
	}

	@When("User edit a contact details")
	public void user_edit_a_contact_details() {
		System.out.println("User edit a contact details");
	}

	@When("User create a new deal")
	public void user_create_a_new_deal() {
		System.out.println("User create a new deal");
	}

	@When("User view a deal details")
	public void user_view_a_deal_details() {
		System.out.println("User view a deal details");
	}

	@When("User logout from app")
	public void user_logout_from_app() {
		System.out.println("User logout from app");
	}
	@When("create a new task")
	public void create_a_new_task() {
		System.out.println("create a new task");
	}

	@When("User view a task")
	public void user_view_a_task() {
		System.out.println("User view a task");
	}

	@When("User edit task details")
	public void user_edit_task_details() {
		System.out.println("User edit task details");
	}





}
