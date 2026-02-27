import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/Admin/Desktop/ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//Auto Select dropdowns
	/*	driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("ind");
		System.out.println("In ok");
		//Thread.sleep(3000);
		List<WebElement> options = driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
		for(WebElement option : options)
		{
			System.out.println("In loop");
			if(option.getText().equalsIgnoreCase("India"))
			{
				System.out.println("In if");
			option.click();
			break;
			}
		}
		*/
		
		//CheckBoxes
		
//		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
//		if(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected())
//		{
//			System.out.println("Senior selected");
//		}
//		
//		//Counting  Checkboxes
//		
//		int Size= driver.findElements(By.xpath("//input[@type='checkbox']")).size();
//		System.out.println(Size);
//		
		// Checking Disable of element
		
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_0']")).click();
		//if(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date2']")).isDisplayed())
		
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
		{
			System.out.println("Disabled");
		}
		else
		{
			System.out.println("Not Disabled");
		}
	
	}
		
	}


