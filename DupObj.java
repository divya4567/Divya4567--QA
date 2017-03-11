

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DupObj {
	
	
	

		public static void main(String[] args) throws InterruptedException {
			//System.setProperty("webdriver.ie.driver", "pathToTheIEDriver");
			WebDriver d= new FirefoxDriver();
			d.get("https://www.google.com/");
			Thread.sleep(5000);
			d.get("http://www.infibeam.com/");
			Thread.sleep(5000);
			d.findElement(By.id("loginlink")).click();
			Thread.sleep(5000);
			d.findElement(By.xpath(".//*[@id='loginlink']")).click();
			Thread.sleep(5000);
			d.findElement(By.xpath(".//*[@id='new-account-btn']")).click();
			Thread.sleep(5000);
			d.findElement(By.xpath(".//*[@id='userHandle']")).sendKeys("div");
			Thread.sleep(5000);
			d.findElement(By.xpath(".//*[@id='userHandle']")).sendKeys("div@gmail.com");
			Thread.sleep(5000);
			d.findElement(By.id("email")).sendKeys("div@gmail.com");
			Thread.sleep(5000);
			List<WebElement> e= d.findElements(By.xpath(".//*[@id='password']"));
			Thread.sleep(5000);
			
			e.get(0).sendKeys("hello");
			e.get(1).sendKeys("hello");
			//for login
			Thread.sleep(7000);
			d.findElement(By.xpath(".//*[@id='loginForm']/div[6]/div/button")).click();
			//for signup
			
			Thread.sleep(7000);
			d.findElement(By.xpath(".//*[@id='new-account-btn']")).click();
		

		}

	}



