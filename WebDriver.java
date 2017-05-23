import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class WebDriver {
public static FirefoxDriver driver=new FirefoxDriver();
	public static String login()
	{
		driver.get("http://mail.in.com");
		driver.findElement(By.id("f_id")).sendKeys("mar1selenium");
		driver.findElement(By.id("f_pwd")).sendKeys("selenium");
		driver.findElement(By.cssSelector("input.signin")).click();
		driver.findElement(By.linkText("Sign out")).click();
		
		return "Pass";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		login();
	}

}
