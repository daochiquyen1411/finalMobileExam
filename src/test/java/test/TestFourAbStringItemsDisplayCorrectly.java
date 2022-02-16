package test;

import java.net.MalformedURLException;

import org.testng.Assert;

import driver.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import page.AppHomePage;
import page.AppSearchViewPage;
import page.AppViewPage;
import page.AppFilterPage;

public class TestFourAbStringItemsDisplayCorrectly extends BaseTest{
	
	@Given("user click on view button")
	public void user_click_on_view_button() throws MalformedURLException {
		driver = DriverFactory.getDriver("Android");
		AppHomePage appHomePage = new AppHomePage(this.driver);
		appHomePage.navigateToAppViewPage();
	}

	@And("user select search view")
	public void user_select_search_view() {
		AppViewPage appViewPage = new AppViewPage(this.driver);
		appViewPage.navigateToSearchViewPage();
	}
	
	@And("user select filter")
	public void user_select_filter() {
		AppSearchViewPage appSearchViewPage = new AppSearchViewPage(this.driver);
		appSearchViewPage.navigateToFilterPage();
	}
	
	@And("user type Ab in textbox filter")
	public void user_type_ab_in_textbox_filter() {
		AppFilterPage appFilterPage = new AppFilterPage(this.driver);
		appFilterPage.typeAb();
	}
	
	@Then("user should see 4 items")
	public void items_display_successful() {
		AppFilterPage appFilterPage = new AppFilterPage(this.driver);
		Assert.assertEquals(4, appFilterPage.countAbApps());
	}
}
