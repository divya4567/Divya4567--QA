import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateEx {
	public static void main(String[] agrs) throws InterruptedException{
		
		WebDriver d= new FirefoxDriver();
		d.get("http://www.newtours.demoaut.com/");
		
		Thread.sleep(2000);
		d.findElement(By.name("userName")).sendKeys("div");
		
		Thread.sleep(2000);
		d.findElement(By.name("password")).sendKeys("divya");
		
		Thread.sleep(5000);
		d.findElement(By.name("login")).click();
		
		Thread.sleep(5000);
		d.navigate().to("https://www.expedia.com");
		
		Thread.sleep(5000);
		d.findElement(By.xpath(".//*[@id='header-account-menu']/span")).click();
		
		Thread.sleep(5000);
		d.findElement(By.xpath(".//*[@id='header-account-register']/span")).click();
		
		Thread.sleep(5000);
		d.findElement(By.id("create-account-firstname")).sendKeys("div");
		
		Thread.sleep(5000);
		d.findElement(By.id("create-account-lastname")).sendKeys("divya");
		
		Thread.sleep(5000);
		d.findElement(By.id("create-account-emailId")).sendKeys("div@gmail.com");
		
		Thread.sleep(5000);
		d.findElement(By.id("create-account-password")).sendKeys("divya4567");
		
		Thread.sleep(5000);
		d.findElement(By.id("create-account-confirm-password")).sendKeys("divya4567");
		
		Thread.sleep(5000);
		d.findElement(By.xpath(".//*[@id='create-account-expedia-policy']")).click();
		
		Thread.sleep(5000);
		d.findElement(By.id("create-account-submit-button")).click();
		
	    Thread.sleep(10000);
	    d.navigate().to("https://www.google.com/");
	    d.close();
	
	
	
	}
	

}
