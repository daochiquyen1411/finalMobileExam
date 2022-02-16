package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class AppSearchViewPage extends AppBasePage{

	public AppSearchViewPage(AndroidDriver<WebElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	private WebElement btnFilter = keyword.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Filter\"]"));
	
	public AppFilterPage navigateToFilterPage() {
		keyword.click(btnFilter);
		return new AppFilterPage(this.driver);
	}
}

