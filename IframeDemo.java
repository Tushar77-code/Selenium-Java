package MyPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.driver.chromedriver", "C:\\Users\\tushar.chimurkar\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.rediff.com/");
		
		//Switch to iframe
		driver.switchTo().frame("moneyiframe");
		
		//perform click on iframes element
		WebElement NSC = driver.findElement(By.id("nseindex"));

		NSC.click();
		
		//get value of iframes element
		System.out.println("The Element Value is - "+ NSC.getText());
		
		driver.quit();
	}

}
