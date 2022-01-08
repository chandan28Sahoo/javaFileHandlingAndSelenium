package selenium4Basics;
/*
 Selenium WebDriver is an open-source tool for automated testing of web apps across many browsers. 

DesiredCapabilities are a set of key-value pairs encoded as a JSON object.
It helps QAs define basic test requirements such as operating systems, browser combinations, 
browser versions, etc. within Selenium test scripts. 
The DesiredCapabilities Class has multiple methods that let QAs specify the required properties regarding 
the desired test environments.
 * */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DesirCapability {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setAcceptInsecureCerts(true);
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--incognito");
		options.merge(caps);
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://google.com");
		Thread.sleep(2000);
		driver.quit();
	}

}
