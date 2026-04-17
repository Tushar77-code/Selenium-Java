package MyPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollBy {

	public static void main(String[] args) {

		System.setProperty("webdriver.driver.chromedriver", "C:\\Users\\tushar.chimurkar\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
//		driver.get("https://www.calculator.net/");
		
		driver.get("https://www.mi.com/in/?srsltid=AfmBOooktHiX_6oZ00LkW7bcrlkkWstISMJiidSTiK0KLjmcqDc6uYUH");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//scroll vertically 
//		js.executeScript("window.scrollBy(0, 500)");
		
		//scroll element visible 
//		WebElement ddcalculator = driver.findElement(By.linkText("Due Date Calculator"));
//		js.executeScript("arguments[0].scrollIntoView();", ddcalculator);
//		ddcalculator.click();
//		System.out.println("Scroll to Element Executed Successfully");
		
		//scroll down webpage to the bottom
		
//		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		WebElement xiomi = driver.findElement(By.linkText("Xiaomi"));
		
		js.executeScript("arguments[0].scrollIntoView();", xiomi);
		System.out.println("Window Scrolled to Xiomi and Clicked");
		
		xiomi.click();
		 
		
		
	
	
	}
	
	

}
