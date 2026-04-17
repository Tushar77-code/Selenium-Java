package MyPackage;

import java.time.Duration;
import java.util.NoSuchElementException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;



public class FluentWait11 {

	public static void main(String[] args) {
		System.setProperty("webdriver.driver.chromedriver", "C:\\Users\\tushar.chimurkar\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		driver.get("https://www.ebay.com/");
		
		//Declaration of Fluent Wait
	
		Wait <WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(2))
				.withMessage("This is Exception message")
				.ignoring(NoSuchElementException.class);
		
		
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Sell")));

		element.click();
		
//		Stopwatch watch = null;
//		
//
//		try {
//			watch = Stopwatch.createStarted();
//			//valid link text is "Sell"
//			WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Sell")));
//			System.out.println("Click Successfully..!");
//		}
//		
//		catch(Exception e) {
//			
//			watch.stop();
//			System.out.println(e);
//			System.out.println(watch.elapsed(TimeUnit.SECONDS)+ " Seconds ");
//			
//		}
		
		driver.quit();
		
		
	}
}
