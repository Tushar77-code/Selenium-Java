package MyPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImgLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.driver.chromedriver", "C:\\Users\\tushar.chimurkar\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		
		driver.manage().window().maximize();
		
		WebElement imagelink = driver.findElement(By.xpath("//img[@class='logo']"));
		
		System.out.println("The Image Link is Clicked Successfully");
		
		imagelink.click();
		
		if (driver.getTitle().equals("ParaBank | Welcome | Online Banking")) {
			System.out.println("Test Passed");
		}
		else {
			System.out.println("Test Failed");
		}
		
	}

}
