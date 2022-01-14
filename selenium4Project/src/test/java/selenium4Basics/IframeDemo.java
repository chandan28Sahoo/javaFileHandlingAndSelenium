package selenium4Basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IframeDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		
		/*
			driver.findElement(By.id("name")).sendKeys("hello"); // main page
			driver.switchTo().frame(driver.findElement(By.id("frm1")));
			Select selectCorse = new Select(driver.findElement(By.id("course")));
			Thread.sleep(2000);
			selectCorse.selectByVisibleText("Java");
			driver.switchTo().defaultContent();
			driver.findElement(By.id("name")).clear();
			driver.findElement(By.id("name")).sendKeys("chandan");
		*/
		driver.findElement(By.id("name")).sendKeys("hello");
		driver.switchTo().frame(driver.findElement(By.id("frm3")));
		driver.switchTo().frame(driver.findElement(By.id("frm1")));
		Select selectCorse = new Select(driver.findElement(By.id("course")));
		selectCorse.selectByVisibleText("Java");
		Thread.sleep(3000);
		
		driver.switchTo().parentFrame();
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys("frm3");
		
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys("main web page");
		
		driver.quit();
	}

}
