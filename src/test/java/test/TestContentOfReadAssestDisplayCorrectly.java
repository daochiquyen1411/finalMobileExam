package test;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import driver.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.AppAssetPage;
import page.AppContentPage;
import page.AppHomePage;
import page.ReadAssetPage;

public class TestContentOfReadAssestDisplayCorrectly extends BaseTest{
	
	@Given("user open API demo app")
	public void user_open_api_demo_app() throws MalformedURLException {
		driver = DriverFactory.getDriver("Android");
	}

	@And("user click content button")
	public void user_click_content_button() {
		AppHomePage appHomePage = new AppHomePage(this.driver);
		appHomePage.navigateToContentPage();
	}

	@And("user click asset button")
	public void user_click_asset_button() {
		AppContentPage appContentPage = new AppContentPage(this.driver);
		appContentPage.navigateToAssetPage();
	}

	@And("user click read asset button")
	public void user_click_read_asset_button() {
		AppAssetPage appAssetPage = new AppAssetPage(this.driver);
		appAssetPage.navigateToReadAssetPage();
	}
	
	@Then("user will see the read asset content display correctly")
	public void user_will_see_the_readAsset_content_display_correctly() {
		ReadAssetPage readAssetPage = new ReadAssetPage(this.driver);
		String expectMessage = "This text is stored in a raw Asset.\r\n"
				+ "\r\n"
				+ "It was read and placed into the TextView here.";
		String actualMessage = readAssetPage.getReadAssetContent();
		Assert.assertEquals(expectMessage.replaceAll("\\s\\s+", " ").trim(), actualMessage.replaceAll("\\s\\s+", " ").trim());
	}
}
