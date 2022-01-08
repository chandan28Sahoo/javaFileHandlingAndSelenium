package selenium4Basics;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyBoardActions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		/*
		//key down
		driver.findElement(By.name("q")).sendKeys("selenium",Keys.ENTER);
		Actions actionProvider = new Actions(driver);
		Thread.sleep(2000);
		org.openqa.selenium.interactions.Action keyDown = actionProvider.keyDown(Keys.CONTROL).sendKeys("a").build();
		keyDown.perform();
		Thread.sleep(2000);
		*/
		//key up
		Actions actionProvider = new Actions(driver);
		Thread.sleep(2000);
		WebElement searchBox = driver.findElement(By.name("q"));
		actionProvider.keyDown(Keys.SHIFT).sendKeys(searchBox, "selenium").keyUp(Keys.SHIFT).sendKeys("selenium").perform();
		Thread.sleep(2000);
		searchBox.clear();
		driver.quit();
	}

}













