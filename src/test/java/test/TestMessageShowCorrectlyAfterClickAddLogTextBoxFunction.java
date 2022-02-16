package test;


import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;

import org.testng.Assert;

import driver.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import page.AppHomePage;
import page.AppTextPage;
import page.LogTextBoxPage;

public class TestMessageShowCorrectlyAfterClickAddLogTextBoxFunction extends BaseTest{
	
	@Given("user click on text button")
	public void user_click_on_text_button() throws MalformedURLException {
		driver = DriverFactory.getDriver("Android");
		AppHomePage appHomePage = new AppHomePage(this.driver);
		appHomePage.navigateToAppTextPage();
	}

	@And("user click LogTextBox button")
	public void user_click_log_text_box_button() {
	    AppTextPage appTextPage = new AppTextPage(this.driver);
	    appTextPage.navigateToLogTextBoxPage();
	}
	
	@And("user click on add button")
	public void user_click_on_add_button() {
		LogTextBoxPage logTextBoxPage = new LogTextBoxPage(this.driver);
		logTextBoxPage.add();
	}
	
	@Then("user should see the message")
	public void logTextBox_message_display_correctly() {
		LogTextBoxPage logTextBoxPage = new LogTextBoxPage(this.driver);
		String actualResult = logTextBoxPage.getText();
		String expectResult = "This is a test";
		Assert.assertEquals(actualResult.trim(), expectResult.trim());
	}

}
