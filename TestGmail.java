import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestGmail {
	public static void main(String[] args) throws InterruptedException{
		//create webdriver
		WebDriver d= new FirefoxDriver();
		
		//give url
		d.get("http://www.google.co.in");
		
		//click on sign in
		d.findElement(By.id("gb_70")).click();
		//enter user id
		d.findElement(By.id("Email")).sendKeys("divya4567@gmail.com");
		//enter email address
		//d.findElement(By.id("divya4567@gmail.com")).sendKeys();
		
		//click next
		d.findElement(By.id("next")).click();
		//add some delay
		Thread.sleep(2000);
		//enter password
		d.findElement(By.id("Passwd")).sendKeys("divya");
		//click on sign in
		d.findElement(By.id("signIn")).click();
		Thread.sleep(1000);
		
		
		
		
	}

}
