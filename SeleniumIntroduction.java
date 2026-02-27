import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIntroduction {

	public static void main(String[] args) {
		
			System.out.println("Test");
			System.setProperty("webdriver.chrome.driver","/Users/Admin/Desktop/ChromeDriver/chromedriver.exe" ) ; 
		  WebDriver driver = new ChromeDriver();
		  
		  driver.get("https://rahulshettyacademy.com/");
		  System.out.println(driver.getTitle());
		  System.out.println(driver.getCurrentUrl());
		  driver.close();
		  
	}

}
