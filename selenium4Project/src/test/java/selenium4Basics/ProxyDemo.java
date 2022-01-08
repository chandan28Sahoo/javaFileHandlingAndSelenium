package selenium4Basics;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

/*
proxy:
proxy server acts as an intermediary for requests between a client  and server.
capture nerwork traffic.
mock backend calls made by the website.
access a website under corporate restrictions/policies.
 * */
public class ProxyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Proxy proxy = new Proxy();
		proxy.setAutodetect(false);
		proxy.setHttpProxy("localhost:8252");
		proxy.setSslProxy("localhost:8252");
		
		ChromeOptions chormeOption = new ChromeOptions();
		chormeOption.setCapability("proxy", proxy);
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chormeOption);
		driver.get("https://google.com");
		driver.quit();
		
		
	}

}
