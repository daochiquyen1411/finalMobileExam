package page;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import driver.DriverFactory;

import java.net.MalformedURLException;
import java.time.Duration;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import keyword.Keyword.Direction;

import org.openqa.selenium.Dimension;

public class AppHomePage extends AppBasePage{

	public AppHomePage(AndroidDriver<WebElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	private WebElement btnContent = keyword.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Content\"]"));
	private WebElement btnPreference = keyword.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Preference\"]"));
	private WebElement btnText; 
	private WebElement btnView;
	
	public AppContentPage navigateToContentPage() {
		keyword.click(btnContent);
		return new AppContentPage(this.driver);
	}
	
	public AppPreferencePage navigateToPreferencePage() {
		keyword.click(btnPreference);
		return new AppPreferencePage(this.driver);
	}
	
	public AppTextPage navigateToAppTextPage() {
		keyword.scrollToElement("Text");
		btnText = keyword.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Text\"]"));
		keyword.click(btnText);
		return new AppTextPage(this.driver);
	}

	public AppViewPage navigateToAppViewPage() {
		keyword.scrollToElement("Views");
		btnView = keyword.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Views\"]"));
		keyword.click(btnView);
		return new AppViewPage(this.driver);
	}

}
