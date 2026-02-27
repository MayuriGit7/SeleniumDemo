import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators1 {

	public static void main(String[] args) throws InterruptedException {
		
		Locators1 loc = new Locators1();
		//Test Branch
//Test Branch Devlop
		System.setProperty("webdriver.chrome.driver","/Users/Admin/Desktop/ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		String Password = loc.getPassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("Mayuri");
		
		driver.findElement(By.name("inputPassword")).sendKeys(Password);
		Thread.sleep(3000);
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		
		//Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		
		driver.close();
		
		
	}

	public String getPassword(WebDriver driver) throws InterruptedException
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String Password = driver.findElement(By.cssSelector("form p")).getText();
		String[] Pass = Password.split("'");
		String[] Pass1 = Pass[1].split("'");
		System.out.println(Pass1[0]);
		return (Pass1[0]);
		
		
		
	}
}
