package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class ReadAssetPage extends AppBasePage{

	public ReadAssetPage(AndroidDriver<WebElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	private WebElement txtviewwReadAsset = keyword.findElement(By.id("io.appium.android.apis:id/text"));
	
	public String getReadAssetContent() {		
		return keyword.GetAttribute(txtviewwReadAsset, "text");
	}
}
