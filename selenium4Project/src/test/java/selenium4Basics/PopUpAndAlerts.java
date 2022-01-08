package selenium4Basics;

import java.rmi.Remote;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/*
java script alert
java script confirmation
java script promt

 */
public class PopUpAndAlerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		//js alart
		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		if(driver.getPageSource().contains("You successfully clicked an alert")) {
			System.out.println("You successfully clicked an alert");
		}
		Thread.sleep(2000);
		//js confirm
		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		Alert alert1 = driver.switchTo().alert();
		System.out.println(alert1.getText());
		alert1.accept();
		Thread.sleep(2000);
		
		//js promt
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();
		Alert alert2 = driver.switchTo().alert();
		alert2.sendKeys("chandan");
		System.out.println(alert2.getText());
		alert1.accept();
		Thread.sleep(2000);
		driver.close();
		
	}

}
