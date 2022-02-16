package test;
import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import driver.DriverFactory;
import io.appium.java_client.android.AndroidDriver;

public class BaseTest {
	public static AndroidDriver<WebElement> driver;
}
