package page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class AppFilterPage extends AppBasePage{

	public AppFilterPage(AndroidDriver<WebElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	private WebElement txtFilter = keyword.findElement(By.id("android:id/search_src_text"));
	private WebElement blockApps = keyword.findElement(By.id("io.appium.android.apis:id/list_view"));
	List<WebElement> allAppLsts; 
	
	public void typeAb() {
		keyword.setText(txtFilter, "Ab");
	}
	
	public int countAbApps() {
		allAppLsts = blockApps.findElements(By.className("android.widget.TextView"));
		return allAppLsts.size();
	}
}

