package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class LogTextBoxPage extends AppBasePage{

	public LogTextBoxPage(AndroidDriver<WebElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	private WebElement btnAdd = keyword.findElement(By.id("io.appium.android.apis:id/add"));
	private WebElement txtviewLogtextBox = keyword.findElement(By.id("io.appium.android.apis:id/text"));
	
	public void add() {
		keyword.click(btnAdd);
	}
	
	public String getText() {
		return keyword.GetAttribute(txtviewLogtextBox, "text");
	}
}
