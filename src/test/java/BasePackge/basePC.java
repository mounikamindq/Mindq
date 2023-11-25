package BasePackge;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class basePC {

	public static WebDriver driver;
	public static void applicationlaunch()
	{
		WebDriverManager.chromedriver().setup();
         driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	public void closeBrowser()
	{
		driver.close();
	}

}