package selenium4Basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseActions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		/*
			//Click and Hold in Selenium
			driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
			WebElement boxA = driver.findElement(By.xpath("//li[text()='A']"));
			WebElement boxD = driver.findElement(By.xpath("//li[text()='D']"));
			Actions  actions = new Actions(driver);
			//actions.moveToElement(boxA);
			Thread.sleep(2000);
			//actions.clickAndHold();
			//actions.moveToElement(boxD);
			actions.contextClick(boxD);
			
			actions.build().perform();
		*/
		//drag and drop
		driver.get("https://selenium08.blogspot.com/2020/01/drag-drop.html");
		WebElement box1 = driver.findElement(By.id("draggable"));
		WebElement box2 = driver.findElement(By.id("droppable"));
		Thread.sleep(2000);
		Actions  actions = new Actions(driver);
		actions.dragAndDrop(box1, box2);
		actions.build().perform();
		Thread.sleep(2000);
		driver.quit();
		System.out.println("done");
	}

}
