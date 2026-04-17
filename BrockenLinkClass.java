package MyPackage;

import java.net.HttpURLConnection; 
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrockenLinkClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.drive.chromedriver", "C:\\Users\\tushar.chimurkar\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	
	
		Thread.sleep(3000);
		
        driver.get("http://www.deadlinkcity.com/");
        
        List <WebElement> links = driver.findElements(By.tagName("a"));
        
        int resCode = 200;
        int brockenLink =0;
        
        
        System.out.println("Total Links on Page - "+ links.size());
        
        for (WebElement element : links) {
        	String url = element.getAttribute("href");
        	
        	try {
        		
        		URL urllink = new URL(url);
        		HttpURLConnection huc = (HttpURLConnection)urllink.openConnection();
        		huc.setRequestMethod("HEAD");
        		huc.connect();
        		 
        		resCode = huc.getResponseCode();
        		
        		if (resCode >= 400) {
        			System.out.println(url + "Brocken Links");
        			brockenLink++;
        		}
        		
        		
        	}catch(MalformedURLException e) {
        		
        	}catch(Exception e) {
        		
        	}
        }
        
        System.out.println("Total Brocken List - "+ brockenLink);
	}

}
