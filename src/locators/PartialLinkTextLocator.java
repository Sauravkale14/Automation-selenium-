package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkTextLocator {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://actitime.summant.com/login.jsp");
		Thread.sleep(4000);
		driver.findElement(By.partialLinkText("actimind.com")).click();
		Thread.sleep(7000);
		driver.quit();
	}

}
