package MyPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragnDrop {   

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.driver.chromedriver", "C:\\Users\\tushar.chimurkar\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
		driver.manage().window().maximize();
		
		
		WebElement frame = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(frame);
		
		Thread.sleep(4000);
		
		WebElement dragbox3 = driver.findElement(By.xpath("//*[@id=\"gallery\"]/li[3]"));
		WebElement dropbox = driver.findElement(By.xpath("//*[@id=\"trash\"]"));
		
		
		WebElement dragbox4 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		
		WebElement dragbox2 = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));

		Actions act = new Actions(driver);
		
		act.dragAndDrop(dragbox3, dropbox).perform(); 
		
		act.dragAndDrop(dragbox4, dropbox).perform();
		
		act.clickAndHold(dragbox2).moveToElement(dropbox).release().build().perform();
		
		driver.switchTo().parentFrame();
		
		WebElement freeBook = driver.findElement(By.xpath("//a[@class='no_border'][normalize-space()='Free Ebooks']")); 
		
		act.moveToElement(freeBook).perform();		
		
		
		System.out.println("Drag and Drop Operation Successfully Executed");
		

	}

}
