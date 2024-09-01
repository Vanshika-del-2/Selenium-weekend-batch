package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Makemytrip_Webelement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://makemytrip.com");
	
		driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
		driver.findElement(By.xpath("//span[@class='chNavIcon appendBottom2 chSprite chTrains inactive']")).click();
		driver.findElement(By.xpath("//label[@for='fromCity']")).click();
		driver.findElement(By.xpath("//span[text()='Kolkata Howrah Junction']")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='To']")).click();
		
		
		driver.findElement(By.xpath("//span[text()='MAS']")).click();
		driver.findElement(By.xpath("//div[@aria-label='Mon Sep 09 2024']")).click();
		driver.findElement(By.xpath("//li[@data-cy='SL']")).click();
		driver.findElement(By.xpath("//a[text()='Search']")).click();
		
		
	List<WebElement> allTrains =driver.findElements(By.xpath("//div[@class='train-name']"));
	
	
	for(WebElement trains:allTrains) {
		System.out.println(trains.getText());
		System.out.println("---------");
	}
	}
}
	
				
		
		
		
		
		
		
		
		
		

	


