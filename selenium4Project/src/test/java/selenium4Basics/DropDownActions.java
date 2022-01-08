package selenium4Basics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownActions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//select a option from drop down
		driver.get("https://trytestingthis.netlify.app/");
		/*
			//create select object
			WebElement dropDown = driver.findElement(By.id("option"));
			Select selectEle = new Select(dropDown);
	
			selectEle.selectByIndex(1);
			Thread.sleep(2000);
			selectEle.selectByValue("option 2");
			Thread.sleep(2000);
			selectEle.selectByVisibleText("Option 3");
		*/
		/*
			//select one option
			Thread.sleep(2000);
			List<WebElement> allOptions = selectEle.getOptions();
			for(WebElement ee: allOptions) {
				System.out.println(ee.getText());
				if(ee.getText().equalsIgnoreCase("option 2") ) {
					ee.click();
					Thread.sleep(1000);
				}
			}
		*/
		
		//deselect
		WebElement dropDown = driver.findElement(By.id("owc"));
		Select selectEle = new Select(dropDown);
		
		selectEle.selectByIndex(1);
		Thread.sleep(2000);
		selectEle.selectByValue("option 2");
		Thread.sleep(2000);
		selectEle.selectByVisibleText("Option 3");
		Thread.sleep(2000);
		selectEle.deselectByVisibleText("Option 3");
		Thread.sleep(2000);
		driver.quit();
		System.out.println("done");
	}

}
