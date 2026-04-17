package MyPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutor11 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.driver.chromedriver", "C:\\\\Users\\\\tushar.chimurkar\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://dev46.salesmate.io/");
		
		WebElement username = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		username.click();
		username.sendKeys("Tushar46@yopmail.com");
		
		WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		password.click();
		password.sendKeys("Tushar@123");
		
	
		WebElement login = driver.findElement(By.xpath("//*[@id=\"btnSubmit\"]"));
		login.click();
		
		Thread.sleep(3000);
		
		WebElement contactModule = driver.findElement(By.xpath("//a[@href='#/app/contacts/list']"));
		
		Thread.sleep(2000);
		contactModule.click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript(
			    "document.evaluate(\"//input[@placeholder='Search contact']\", document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue.value='James';"
			);		
		
		js.executeScript("history.go(0)");
	}

}
