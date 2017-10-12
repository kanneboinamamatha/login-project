package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class talentify {
public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();

	    driver.get("http://talentify.in/login.jsp");

	  // driver.findElement(By.xpath("//div[@id='navbar-collapse-1']/ul/li[7]/a")).click();
	    driver.findElement(By.name("email")).clear();
	    driver.findElement(By.name("email")).sendKeys("munnyammu448@gmail.com");
	    driver.findElement(By.name("password")).clear();
	    driver.findElement(By.name("password")).sendKeys("test123");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    
	    driver.findElement(By.xpath("//a[contains(text(),'Welcome\n						   NOT_PROVIDED')]")).click();
	    driver.findElement(By.linkText("Logout")).click();
	    // ERROR: Caught exception [unknown command []]
	  }
	    
	   
	  }
	



