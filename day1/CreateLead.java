package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {
		ChromeDriver d = new ChromeDriver();

		d.get("http://leaftaps.com/opentaps/");
		d.manage().window().maximize();
		
		d.findElement(By.id("username")).sendKeys("demosalesmanager");
		d.findElement(By.id("password")).sendKeys("crmsfa");
		d.findElement(By.className("decorativeSubmit")).click();
		d.findElement(By.partialLinkText("CRM")).click();
		d.findElement(By.linkText("Leads")).click();
		d.findElement(By.linkText("Create Lead")).click();
		d.findElement(By.name("companyName")).sendKeys("Test Leaf");
		d.findElement(By.name("firstName")).sendKeys("Janani");
		d.findElement(By.name("lastName")).sendKeys("Sampath");
		d.findElement(By.name("submitButton")).click();
		String Title = d.getTitle();
		System.out.println(Title);
		d.close();		

	}

}
