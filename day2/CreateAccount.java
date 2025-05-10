package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("guest");

		ChromeDriver driver = new ChromeDriver(option);
		
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Testleaf");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		driver.findElement(By.id("numberEmployees")).sendKeys("25");
		
		WebElement Industry = driver.findElement(By.name("industryEnumId"));
		Select select = new Select(Industry);
		select.selectByValue("IND_SOFTWARE");
		
		WebElement Ownership = driver.findElement(By.name("ownershipEnumId"));
		Select select1 = new Select(Ownership);
		select1.selectByVisibleText("S-Corporation");
		
		WebElement Source = driver.findElement(By.id("dataSourceId"));
		Select select2 = new Select(Source);
		select2.selectByValue("LEAD_EMPLOYEE");
		
		WebElement Market = driver.findElement(By.id("marketingCampaignId"));
		Select select3 = new Select(Market);
		select3.selectByIndex(6);
		
		WebElement State = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select select4 = new Select(State);
		select4.selectByValue("TX");
		
		driver.findElement(By.className("sma	llSubmit")).click();
		
		String Title = driver.getTitle();
		System.out.println(Title);
		
		Thread.sleep(5000);
		driver.close();		
		
	}

}
