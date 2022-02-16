package test;

import java.net.MalformedURLException;

import driver.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import page.AppHomePage;

public class TestCounterMyPreferenceShouldMatchCounterLauchingPreferencPage extends BaseTest{
	@Given("user click on preference")
	public void user_click_on_preference() throws MalformedURLException {
		driver = DriverFactory.getDriver("Android");
		AppHomePage appHomePage = new AppHomePage(this.driver);
		appHomePage.navigateToPreferencePage();
	}
		
	@And("user select lauching preference")
	public void user_lauching_preference() {
		// Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@And("user select lauch preference activity button")
	public void user_select_lauch_preference_activity_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@And("user compare the count in lauching preference page with lauch preference activity page")
	public void user_compare_the_count_in_lauching_preference_page_with_lauch_preference_activity_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@And("user click on my preference to increase the count {int}")
	public void user_click_on_my_preference_to_increase_the_count(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
}
