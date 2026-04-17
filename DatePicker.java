package MyPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Expecetd Date - 22 may 2026
		
		String expectedDay = "21";
		String expectedMonth = "July";
		String expectedYear = "2026";


		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tushar.chimurkar\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/datepicker/");
		
//		WebElement frame = driver.findElement(By.className("demo-frame"));
		
//		driver.switchTo().frame(frame);
		driver.switchTo().frame(0); // We can switch to frame by its index 
		
		
		WebElement datefield = driver.findElement(By.id("datepicker"));
		datefield.click();
		
		while(true) {
			String calendarMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String calendarYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			if (calendarMonth.equals(expectedMonth) && (calendarYear.equals(expectedYear))) {
				List <WebElement> daysList = driver.findElements(By.xpath("//table/tbody/tr/td"));
				
				for (WebElement e : daysList) {
					String calendarDay = e.getText();
					if(calendarDay.equals(expectedDay)) { 
						e.click();
						break;
					}
				}
				break;
				
			}else {
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			}
		}
		
		System.out.println("Code Executed Successfully...!");
		
		
		

	}

}
