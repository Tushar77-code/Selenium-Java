package MyPackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpennewTab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.drive.chromedriver", "C:\\Users\\tushar.chimurkar\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		System.out.println("First Page " + driver.getTitle());
		
		//open new tab
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://www.facebook.com/");
		
		System.out.println("Second Tab " + driver.getTitle());
		
		//get window handles 
		Set <String> Windowhandles = driver.getWindowHandles();
		
		List<String> handles = new ArrayList<String>();
		handles.addAll(Windowhandles);
		
		driver.close();
		
		driver.switchTo().window(handles.get(0));//switch to google page
		System.out.println("First Page " + driver.getTitle());

		
		
		
		
		
		

	}

}
