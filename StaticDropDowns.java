import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDowns {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/Admin/Desktop/ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		
		//Static Dropdowns
		WebElement staticdropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		Select dropdown = new Select(staticdropdown);
		
		dropdown.selectByIndex(1);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByValue("USD");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByVisibleText("AED");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		//Non Static Drop downs
		
		driver.findElement(By.xpath("//div[@id = 'divpaxinfo']")).click();
		int i=0;
		while(i<3)
		{
		driver.findElement(By.xpath("//span[@id = 'hrefIncAdt']")).click();
		i++;
		}
		System.out.println(driver.findElement(By.xpath("//div[@id = 'divpaxinfo']")).getText());
		driver.findElement(By.xpath("//input[@id = 'btnclosepaxoption']")).click();
		
		//driver.close();

	}

}
