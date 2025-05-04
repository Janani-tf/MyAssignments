package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.facebook.com/");
		d.manage().window().maximize();
		String Title = d.getTitle();
		System.out.println(Title);
		
		d.findElement(By.id("email")).sendKeys("jananiisampath13@gmail.com");
		d.findElement(By.id("pass")).sendKeys("Yummiee@12");
		d.findElement(By.name("login")).click();
		
		
	}

}
