package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class AppTextPage extends AppBasePage{

	public AppTextPage(AndroidDriver<WebElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	private WebElement btnLogTextBox = keyword.findElement(By.xpath("//android.widget.TextView[@content-desc=\"LogTextBox\"]"));
	
	public LogTextBoxPage navigateToLogTextBoxPage() {
		keyword.click(btnLogTextBox);
		return new LogTextBoxPage(this.driver);
	}
}
