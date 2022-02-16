package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class AppViewPage extends AppBasePage{

	public AppViewPage(AndroidDriver<WebElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	private WebElement btnSearchView;
	
	public AppSearchViewPage navigateToSearchViewPage() {
		keyword.scrollToElement("Search View");
		btnSearchView = keyword.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Search View\"]"));
		keyword.click(btnSearchView);
		return new AppSearchViewPage(this.driver);
	}
}
