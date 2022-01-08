package selenium4Basics;

import java.security.Key;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/*
How to find element:
findElement()


 * */
public class WebElementStrategies {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		/*
			//find element by name
			driver.get("https://google.com");
			WebElement searchBox = driver.findElement(By.name("q"));		
			searchBox.sendKeys("selenium",Keys.ENTER);
		*/
		/*
			//find element by tagname
			driver.get("https://trytestingthis.netlify.app/");
			List<WebElement> select = driver.findElements(By.tagName("select"));
			for(WebElement data:select) {
				System.out.println(data.getText());
			}
		*/
		/*
		//how to get element from element
			driver.get("https://google.com");
			WebElement form = driver.findElement(By.tagName("form"));		
			form.findElement(By.name("q")).sendKeys("chandan",Keys.ENTER);
			
		*/
		/*
			//how to get active element
			driver.get("https://google.com");
			WebElement searchBox = driver.findElement(By.name("q"));		
			searchBox.sendKeys("selenium");
			String activeElementTitle = driver.switchTo().activeElement().getAttribute("title");
			System.out.println(activeElementTitle);
			Thread.sleep(2000);
		*/
		/*
			//how to get element like tagname,text,css.
			driver.get("https://google.com");
			WebElement searchBox = driver.findElement(By.name("q"));		
			String tagName = searchBox.getTagName();
			String text = searchBox.getText();
			String cssValue = searchBox.getCssValue("font");
			System.out.println(tagName);
			System.out.println(text);
			System.out.println(cssValue);
		*/
		//how to get check element is enabled/is selected
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		WebElement checkBox = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
		System.out.println(checkBox.isEnabled());
		System.out.println(checkBox.isSelected());
		driver.quit();
	}

}
