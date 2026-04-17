package MyPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectUsage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.drive.chromedriver", "C:\\Users\\tushar.chimurkar\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.udyog-aadhar.com//#msme-registration");
		
		
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.name("LEADCF6"));
		
		Select dropdown = new Select(element);
		
//		dropdown.selectByValue("Pvt. Ltd.");
		
//		dropdown.selectByIndex(3);
		
		dropdown.selectByVisibleText("Proprietorship");
		
		
		if (dropdown.isMultiple()) {
			System.out.println("Dropdown is Multiple");
		}else {
			System.out.println("Dropdown is not Multiple");
		}
		
		
        List <WebElement> Options = dropdown.getOptions();
        
        System.out.println("All Options - "+ Options.size());
		
        for (WebElement el : Options) {
        	System.out.println(el.getText());
        }
		

	}

}
