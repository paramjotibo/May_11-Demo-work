package Browsers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Generalfile {
	public Properties prep;
	public WebDriver driver;
	@SuppressWarnings("deprecation")
	public WebDriver initialbrowser() throws IOException {
		 prep=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\15199\\eclipse-workspace\\Rbcwebsite\\src\\main\\java\\Browsers\\invoke.properties");
		prep.load(fis);
		String browsername=prep.getProperty("browser");
		if(browsername.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\15199\\Desktop\\latestchrome\\chromedriver.exe");
			 driver=new ChromeDriver();	
		}
		else if(browsername.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\15199\\Videos\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		return driver;
	}
	

	
}
