package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.grid.Main;

public class LaunchChrome {
	
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com");
		
		
		WebElement logo = driver.findElement(By.xpath("//a[contains(@class,'myntraweb-sprite desktop-logo sprites-heade')]"));
String color = logo.getCssValue("font-size");

System.out.println(color);

	}

}
