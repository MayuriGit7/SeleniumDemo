import java.sql.Array;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShoppingCart {

	public static void main(String[] args) {
//git prcatise
		System.setProperty("webdriver.chrome.driver", "/Users/Admin/Desktop/ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		ShoppingCart b = new ShoppingCart();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		String[] item = { "Brocolli" , "Cucumber", "Beetroot" };

		addItems(driver,item);
		b.checkout(driver);
	

	}

	
	public static void addItems(WebDriver driver, String[] item)
	{
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		int size = products.size();
		List items = Arrays.asList(item);

		for (int i = 0; i < size; i++) {
			
			String veggie = products.get(i).getText();

			// convert array to arraylist

			
			String[] veg = veggie.split(" ");

			if (items.contains(veg[0])) {
				//System.out.println(products.get(i).getText());
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				// driver.findElement(By.xpath("//button[text()='ADD TO CART'][i]")).click();

			}

		}
	}

	public void checkout(WebDriver driver)
	{
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		WebDriverWait w = new WebDriverWait(driver,5);
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector(".promoBtn")).click();
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.className("promoInfo")));
		
		String s = driver.findElement(By.className("promoInfo")).getText();
		System.out.println(s);
		driver.findElement(By.xpath("//button[text()='Place Order']")).click();
		
	}
}
