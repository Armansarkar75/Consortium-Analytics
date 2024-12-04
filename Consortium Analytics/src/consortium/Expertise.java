package consortium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Expertise {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty(("Webdriver.Chrome.driver"), ("\"C:\\Users\\DST\\Downloads\\chromedriver-win64\\chromedriver.exe\""));
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://consortium-analytics.web.app/");
		driver.findElement(By.xpath("/html/body/div/div/nav/div/div/div[2]/div[1]/a")).click();
		Thread.sleep(1000);
		//Dropdown handdle using css selector
		driver.findElement(By.xpath("/html/body/div/div/nav/div/div[1]/div[2]/div[2]/a")).click();
		List<WebElement> options = driver.findElements(By.cssSelector(".mb-2>a"));
		for(WebElement option : options)
		{
	         System.out.println(option.getText()) ;  
		}

	}
	
}
