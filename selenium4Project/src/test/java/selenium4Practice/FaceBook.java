package selenium4Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		/*
		driver.findElement(By.id("email")).sendKeys("7586022804");
		driver.findElement(By.id("pass")).sendKeys("password@123");
		Thread.sleep(1000);
		driver.findElement(By.name("login")).click();
		Thread.sleep(10000);
		
		WebElement div = driver.findElement(By.xpath("//div[@class='buofh1pr']"));
		div.findElement(By.linkText("Friends")).click();
		Thread.sleep(5000);
		//navigate method
		driver.navigate().back();
		Thread.sleep(5000);
		*/
		/*
			//messenger
			driver.findElement(By.xpath("//div[@aria-label='Messenger']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//div[@class='qzhwtbm6 knvmm38d']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//div[@class='_1mf _1mj']")).sendKeys("hi",Keys.ENTER);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//div[@aria-label='Close chat']")).click();
			Thread.sleep(5000);
			driver.navigate().back();
		*/
		/*
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Keya Chakraborty",Keys.ENTER);
		Thread.sleep(5000);
		driver.findElement(By.linkText("See all")).click();
		Thread.sleep(10000);
		
		List<WebElement> allSubdivs = driver.findElements(By.xpath("//div[@class='j83agx80 l9j0dhe7 k4urcfbm']"));
		
		for(WebElement ele:allSubdivs) {
			ele.findElement(By.xpath("//div[@aria-label='Add Friend']")).click();
			Thread.sleep(3000);
		}
		*/
		Thread.sleep(5000);
		driver.quit();
	}

}
