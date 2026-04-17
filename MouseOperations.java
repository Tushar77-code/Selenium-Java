package MyPackage;
 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOperations {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.driver.chromedriver", "C:\\Users\\tushar.chimurkar\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			
		driver.get("https://demoqa.com/buttons");
		
		driver.manage().window().maximize();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement doubleButton = driver.findElement(By.xpath("//*[@id=\"doubleClickBtn\"]"));
		WebElement singleButton = driver.findElement(By.xpath("//*[@id=\"B6Xvw\"]"));
		
		
		Actions act = new Actions(driver);

		act.doubleClick(doubleButton).perform();
		
		act.contextClick(singleButton);
		
		
		Thread.sleep(3000);
	
		act.click().perform();
		
		
	}

}
