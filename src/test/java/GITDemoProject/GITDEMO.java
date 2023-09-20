package GITDemoProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GITDEMO {
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\P3INW25\\eclipse-workspace\\GITDemo\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://192.168.56.146:4081/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}

}
