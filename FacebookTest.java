import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookTest {
	public static void main(String[] args) {
		
		WebDriver d=new FirefoxDriver();
		//give url
		d.get("http://www.google.co.in");
		d.get("http://www.facebooklogin.com");
		//enter sign in emaid adress
		d.findElement(By.id("email")).sendKeys("divya4567@gmail.com");
		//enter password
		d.findElement(By.id("pass")).sendKeys("Divya4567");
		//click login in
		
		d.findElement(By.id("loginbutton")).click();
		//find friend
		
		d.findElement(By.id("findFriendsNav")).click();
	
		
		
	}

}
