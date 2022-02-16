package test;

import java.net.MalformedURLException;

import org.junit.Assert;

import driver.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import page.AppHomePage;
import page.AppPReferenceFormXMLPage;
import page.AppPreferencePage;

public class TestCheckboxShouldBeCheckedAfterClick extends BaseTest{
	
	@Given("user select preference")
	public void user_select_preference() throws MalformedURLException {
		driver = DriverFactory.getDriver("Android");
		AppHomePage appHomePage = new AppHomePage(this.driver);
		appHomePage.navigateToPreferencePage();
	}

	@And("user select preference from XML")
	public void user_select_preference_from_xml() {
		AppPreferencePage appPreferencePage = new AppPreferencePage(this.driver);
		appPreferencePage.navigateToPreferenceFromXMLPage();
	}
	
	@And("user check on Checkbox Preference")
	public void user_check_on_Checkbox_Preference() {
		AppPReferenceFormXMLPage appPReferenceFormXMLPage = new AppPReferenceFormXMLPage(this.driver);
		appPReferenceFormXMLPage.clickOnCheckBox();
	}
	
	@Then("checkbox should be checked")
	public void checkbox_should_be_checked() {
		AppPReferenceFormXMLPage appPReferenceFormXMLPage = new AppPReferenceFormXMLPage(this.driver);
		Assert.assertTrue(appPReferenceFormXMLPage.isCheckboxChecked());
	}
}
