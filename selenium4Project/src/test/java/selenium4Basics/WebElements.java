package selenium4Basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromiumdriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		/*
		WebElement searchBox = driver.findElement(By.name("q"));
		 // searchBox.sendKeys("chandan meaning",Keys.ENTER);
		
		driver.navigate().to("https://trytestingthis.netlify.app/");
		List<WebElement> options = driver.findElements(By.name("Optionwithcheck[]"));
		for(WebElement element : options) {
			System.out.println(element.getText());
		}
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#fname")).sendKeys("chandan");
		*/
		Thread.sleep(2000);
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		WebElement loginButton =  driver.findElement(By.id("btnLogin"));
		
		driver.findElement(RelativeLocator.with(By.tagName("input")).above(loginButton)).sendKeys("fdskljfkl");
		//relative locator
		Thread.sleep(2000);
		driver.quit();
	}

}
