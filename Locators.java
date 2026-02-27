import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","/Users/Admin/Desktop/ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("Mayuri");
		driver.findElement(By.name("inputPassword")).sendKeys("testMayuri");
		driver.findElement(By.className("signInBtn")).click();
		
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Mayuri");	//Xpath
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("abc@gmail.com"); //CSS
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9876543210"); 	//Xpath parent child
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();	//CSS without tagname just classname
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());		//CSS Parent child 
		driver.findElement(By.className("go-to-login-btn")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("MayuriKawade");  //CSS without tagname just ID
		driver.findElement(By.cssSelector("input[type*='Pass']")).sendKeys("rahulshettyacademy"); //CSS regular expression
		driver.findElement(By.xpath("//input[@id='chkboxTwo']")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();  //Xpath regular expression
		Thread.sleep(1000);
		
		
		driver.close();

}
}