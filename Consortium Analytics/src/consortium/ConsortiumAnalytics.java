package consortium;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConsortiumAnalytics {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty(("Webdriver.Chrome.driver"), ("\"C:\\Users\\DST\\Downloads\\chromedriver-win64\\chromedriver.exe\""));
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://consortium-analytics.web.app/");
		driver.findElement(By.xpath("/html/body/div/div/nav/div/div/div[2]/div[1]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div/div/main/div/section[4]/form/div[1]/div[1]/input")).sendKeys("Arman");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div/div/main/div/section[4]/form/div[1]/div[2]/input")).sendKeys("Ali");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/section[4]/form/div[1]/div[3]/input")).sendKeys("armansarkar715@gmail.com");
		Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div/div/main/div/section[4]/form/div[1]/div[4]/input")).sendKeys("SQA");
		Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div/div/main/div/section[4]/form/div[1]/div[5]/input")).sendKeys("Consortium");
		Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div/div/main/div/section[4]/form/div[1]/div[6]/div/div")).click();



	}

}
