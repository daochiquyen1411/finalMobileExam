package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class AppPReferenceFormXMLPage extends AppBasePage{

	public AppPReferenceFormXMLPage(AndroidDriver<WebElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	private WebElement chkboxCheckboxPreference = keyword.findElement(By.id("android:id/checkbox"));
	
	public void clickOnCheckBox() {
		keyword.click(chkboxCheckboxPreference);				
	}
	
	public boolean isCheckboxChecked() {
		return Boolean.parseBoolean(keyword.GetAttribute(chkboxCheckboxPreference, "checked"));
	}
}
