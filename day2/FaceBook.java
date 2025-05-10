package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Janani");
		driver.findElement(By.name("lastname")).sendKeys("Muthu");
		
		WebElement Day = driver.findElement(By.id("day"));
		Select select = new Select(Day);
		select.selectByIndex(10);
		
		WebElement Month = driver.findElement(By.id("month"));
		Select select1 = new Select(Month);
		select1.selectByValue("12");
		
		WebElement Year = driver.findElement(By.id("year"));
		Select select2 = new Select(Year);
		select2.selectByVisibleText("2023");
		
		driver.findElement(By.xpath("(//input[@id='sex'])[1]")).click();
		driver.findElement(By.name("reg_email__")).sendKeys("9876543210");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Welcome#123");
		
	}

}
