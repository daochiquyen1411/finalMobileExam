package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class AppAssetPage extends AppBasePage{

	public AppAssetPage(AndroidDriver<WebElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	private WebElement btnReadAsset = keyword.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Read Asset\"]"));
	
	public ReadAssetPage navigateToReadAssetPage() {
		keyword.click(btnReadAsset);
		return new ReadAssetPage(this.driver);
	}
}
