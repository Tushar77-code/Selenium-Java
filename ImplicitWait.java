package MyPackage;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.base.Stopwatch;

public class ImplicitWait {
	
	public static void main(String []args) {
		
		System.setProperty("webdriver.driver.chromedriver", "C:\\Users\\tushar.chimurkar\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		driver.get("https://www.ebay.com/");
		
		//Applying implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Stopwatch watch = null;
		

		try {
			watch = Stopwatch.createStarted();
			//valid link text is "Sell"
			driver.findElement(By.linkText("Sell")).click();
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
