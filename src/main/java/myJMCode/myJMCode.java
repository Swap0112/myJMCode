package myJMCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class myJMCode {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		validateURL();

	}
	// TODO Auto-generated method stub

	@Test

	public static void validateURL()
	{
		//open URL
		System.out.println("Test the URL");
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver\\chromedriver.exe");

		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(chromeOptions);
		driver.get("https://matthey.com/");
		driver.manage().deleteAllCookies();
		//Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.findElement(By.id("onetrust-button-group-parent")).click();
		driver.findElement(By.xpath("//*[@id=\"layout_23\"]/a")).click();
		System.out.println("Verified the URL");
		String strTitle = driver.getTitle();
		System.out.println("Title is " +strTitle);
		driver.close();




	}

}
