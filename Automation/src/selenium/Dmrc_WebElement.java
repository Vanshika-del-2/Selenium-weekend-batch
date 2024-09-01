package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dmrc_WebElement {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://delhimetrorail.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("buttonDismiss1")).click();
		driver.findElement(By.id("FromStation")).click();
		driver.findElement(By.xpath("(//div[@class='line-stataion-show'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='sub-result-name'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ToStation")).click();
		//driver.findElement(By.xpath("(//div[@class='line-stataion-show'])[2]")).click();
		driver.findElement(By.xpath("//div[@class='popup-result-location red']")).click();
		
		
		
	}

}
