package selenium4Basics;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

/*
Normal
waits for the entire page to be loaded
Se webdriver waits until the load event fire is returned

 ChromeOptions chromeOptions = new ChromeOptions();
 chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);

By default normal is set to browser if none is provided

Eager
waits until the initial HTML document has been completely loaded and parsed
discards loading of stylesheets, images and subframes
Se webdriver waits until the DOMContentLoaded event fire is returned

 ChromeOptions chromeOptions = new ChromeOptions();
 chromeOptions.setPageLoadStrategy(PageLoadStrategy.EAGER);
 
 None
When set to none Selenium WebDriver only waits until the initial page is downloaded

 ChromeOptions chromeOptions = new ChromeOptions();
 chromeOptions.setPageLoadStrategy(PageLoadStrategy.NONE);
 * */
public class PageLoadingStratigies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//normal
		/*
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		*/
		//eager
		/*
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.setPageLoadStrategy(PageLoadStrategy.EAGER);
		*/
		//none
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.setPageLoadStrategy(PageLoadStrategy.NONE);
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOptions);
		
		driver.get("https://google.com");
		driver.quit();
	}

}
