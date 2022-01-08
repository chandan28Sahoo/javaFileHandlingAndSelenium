package selenium4Basics;

import java.security.Key;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

/*
what are waits
functions in selenium to make  webdriver wait for a specific time or for some condition to be true.
why waits are needed
somtimes the automation scripts is faster than the browser loading time or objects render time on browser - no such
element
Different elements may load at different time interval.
Se webdriver script and browser events may not be synchronous at all times.

Implicit Wait
Useful when there is some gap in loading time of the web page and web elements
An implicit wait makes WebDriver to poll the DOM for a certain amount of time when trying to find an element or elements if they are not immediately available

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

default setting is 0 (disabled)
Once set, the implicit wait is set for the entire life of the session
Polling frequency  - 500 ms

Explicit Wait
Useful when there you need to wait until some condition is met
Makes WebDriver to wait until a certain condition is true

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
wait.until(ExpectedConditions.elementToBeClickable(By.xpath("")));

alert is present
element exists
element is visible
title contains
title is
element staleness
visible text

Polling frequency  - 500 ms

Warning: 
Mixing implicit and explicit waits can cause unpredictable wait times
E.g.
Implicit wait = 10 sec
Explicit wait = 15 sec
could cause a timeout to occur after 25 seconds.

Fluent Wait

similar to Explicit wait, i.e. wait for a certain duration until a condition is met
Differences

Polling frequency - can change as per need
Ignore Exception - in case element is not found, can ignore any exception like ‘NoSuchElement’ exception etc.
 * */
public class WaitsIn_Selenium {

	private static final Class<? extends Throwable> NoSuchElementException = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//implicit wait - it will wait when didnt find any element or object. but it will not complete purly 10sec
		// whenever it will get object or element it will move forward. it will polling every 500ms.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://google.com");
		
		driver.findElement(By.name("q")).sendKeys("zomato",Keys.ENTER);
		 // WebElement searchBox = driver.findElement(By.name("q"));
		 // searchBox.sendKeys("chandan meaning", Keys.ENTER);
		//explicit wait 
		// it also will polling in every 500ms. until the condition is true. as soon as the condition is 
		// true the perticular element is clickable.
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		//wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Zomato"))).click();
		
		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(10))
				.ignoring(NoSuchElementException);
		
		fluentWait.until(ExpectedConditions.elementToBeClickable(By.xpath("Zomato"))).click();
		driver.close();
	}

}
