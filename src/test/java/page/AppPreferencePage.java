package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class AppPreferencePage extends AppBasePage{

	public AppPreferencePage(AndroidDriver<WebElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	private WebElement btnPreferenceXML = keyword.findElement(By.xpath("//android.widget.TextView[@content-desc=\"1. Preferences from XML\"]"));
	
	public AppPReferenceFormXMLPage navigateToPreferenceFromXMLPage() {
		keyword.click(btnPreferenceXML);
		return new AppPReferenceFormXMLPage(this.driver);
	}
	
}
