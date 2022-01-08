package selenium4Basics;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserAction {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromiumdriver().setup();
		WebDriver driver = new ChromeDriver();
		//time out
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
 		 // open a web page
		driver.get("https://google.com");
		String originalWindow = driver.getWindowHandle();
		/*
		driver.navigate().to("https://automationstepbystep.com");
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		// switch to window
		
		driver.switchTo().newWindow(WindowType.WINDOW);	
		driver.switchTo().newWindow(WindowType.TAB);
		driver.switchTo().window(originalWindow);
		driver.navigate().to("https://www.zomato.com/");
		Thread.sleep(2000);

		//frames
		driver.navigate().to("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		driver.switchTo().frame("packageFrame");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/main")).click();
		Thread.sleep(3000);
		
		Dimension size = driver.manage().window().getSize();
		int width =  size.getWidth();
		int hight = size.getHeight();
		System.out.println("width = " + width + " hight = "+ hight); 
		
		driver.manage().window().setSize(new Dimension(800, 600));

		//take screenshot
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File("./image.png"));

		// use java script
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement button = driver.findElement(By.name("btnI"));
		js.executeScript("arguments[0].click();", button);
		Thread.sleep(3000);
		//close
		driver.close();
		driver.quit();
		*/
	}
}
