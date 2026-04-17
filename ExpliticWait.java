package MyPackage;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Stopwatch;

public class ExpliticWait {

	
public static void main(String []args) {
		
		System.setProperty("webdriver.driver.chromedriver", "C:\\Users\\tushar.chimurkar\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		driver.get("https://www.ebay.com/");
		
		//Applying Explicit Wait
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10)); 
		
		
		Stopwatch watch = null;
		

		try {
			watch = Stopwatch.createStarted();
			//valid link text is "Sell"
			
//			WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Sell")));
			
			
			WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Sell")));
			element.click();
			System.out.println("Click Successfully..!");
		}
		
		catch(Exception e) {
			
			watch.stop();
			System.out.println(e);
			System.out.println(watch.elapsed(TimeUnit.SECONDS)+ " Seconds ");
			
		}
		
		driver.quit();
		
}
}
