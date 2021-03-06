import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YouTubeTesting {
	public static void main(String []args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumTesting\\Library\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); // instance of driver created
		driver.get("https:\\www.youtube.com");
		driver.manage().window().maximize();   // to Maxmize the screen
		driver.findElement(By.name("search_query")).sendKeys("mongodb database skills"); // 
		 
		driver.findElement(By.id("search-icon-legacy")).click(); // click on id then   
		 try 
		 {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		WebElement link = driver.findElement(By.xpath("//*[@id=\"video-title\"]/yt-formatted-string"));
		link.click();
	
	}

}
