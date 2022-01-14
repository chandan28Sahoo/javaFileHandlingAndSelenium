package selenium4Basics;

import java.util.ArrayList;
import java.util.Set;

import javax.swing.Action;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandlerDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		String parentHandle =  driver.getWindowHandle();
		System.out.println(parentHandle);
		/*
		 //open new window
			driver.findElement(By.id("newWindowBtn")).click();
			Set<String> handles =  driver.getWindowHandles();
			for (String handle : handles) {
				if(!handle.equals(parentHandle)) {
					driver.switchTo().window(handle);
					driver.findElement(By.id("firstName")).sendKeys("chandan");
					Thread.sleep(5000);
					driver.close();
				}
			}
			driver.switchTo().window(parentHandle);
			driver.findElement(By.id("name")).sendKeys("chandan");
			Thread.sleep(2000);
			driver.quit();
		*/
		/*
			//open new tab
			driver.findElement(By.id("newTabBtn")).click();
			Set<String> handles =  driver.getWindowHandles();
			for (String handle : handles) {
				if(!handle.equals(parentHandle)) {
					driver.switchTo().window(handle);
					driver.findElement(By.xpath("//button[@onclick='alertFunction()']")).click();
					Alert alert = driver.switchTo().alert();
	//				Thread.sleep(2000);
					alert.accept();
	//				driver.findElement(By.id("firstName")).sendKeys("chandan");
					Thread.sleep(10000);
					driver.close();
				}
			}
			driver.switchTo().window(parentHandle);
			driver.findElement(By.id("name")).sendKeys("chandan");
			Thread.sleep(2000);
			driver.quit();
		*/
		/*
			//multiple windows
			driver.findElement(By.id("newWindowsBtn")).click();
			Set<String> childDandles =  driver.getWindowHandles();
			ArrayList<String> tabs = new ArrayList<String>(childDandles);
			int count = tabs.size();
			System.out.println(count);
			
			driver.switchTo().window(tabs.get(1));
			driver.findElement(By.name("name")).sendKeys("chandan");
			Thread.sleep(2000);
			driver.close();
			Thread.sleep(5000);
			
			driver.switchTo().window(tabs.get(2));
			driver.findElement(By.id("firstName")).sendKeys("chandan");
			driver.close();
			Thread.sleep(2000);
			
			driver.switchTo().window(parentHandle);
			driver.findElement(By.id("name")).sendKeys("chandan");
			Thread.sleep(2000);
		*/
		driver.findElement(By.id("newTabsBtn")).click();
		Set<String> childDandles =  driver.getWindowHandles();
		ArrayList<String> tabs = new ArrayList<String>(childDandles);
		
		driver.switchTo().window(tabs.get(1));
		driver.findElement(By.id("alertBox")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
//		driver.close();
		Thread.sleep(5000);
		
		driver.switchTo().window(tabs.get(2));
		driver.findElement(By.id("firstName")).sendKeys("chandan");
//		driver.close();
		Thread.sleep(2000);
		
		driver.switchTo().window(parentHandle);
		driver.findElement(By.id("name")).sendKeys("chandan");
		Thread.sleep(5000);
		driver.quit();
	}

}
