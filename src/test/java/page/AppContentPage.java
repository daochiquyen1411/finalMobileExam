package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class AppContentPage extends AppBasePage{

	public AppContentPage(AndroidDriver<WebElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	private WebElement btnAsset = keyword.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Assets\"]"));
	
	public AppAssetPage navigateToAssetPage() {
		keyword.click(btnAsset);
		return new AppAssetPage(this.driver);
	}
}
