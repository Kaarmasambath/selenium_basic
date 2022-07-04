package firstproject;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirstProject {
	
	public static WebDriver driver;
	
	@SuppressWarnings("deprecation")
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url="https://www.sulekha.com/";
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		List<WebElement> test=driver.findElements(By.tagName("a"));
		System.out.println(test.size());
		
		
		Thread.sleep(7000);
		driver.findElement(By.xpath("//button[@class='button gray small block' or @text='Later']")).click();
		Thread.sleep(2000);
		System.out.println("Clicked successfully");
		
		WebElement search=driver.findElement(By.xpath("//input[@placeholder='Find your service here']"));
		Thread.sleep(2000);
		System.out.println("Searched successfully");
		driver.close();
		
			

		
		
	}
	

}
