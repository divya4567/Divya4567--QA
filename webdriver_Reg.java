import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverBackedSelenium;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.thoughtworks.selenium.Selenium;
public class webdriver_Reg {
	public static FirefoxDriver driver=new FirefoxDriver();
	public static void main(String[] args) {
		Selenium selenium=new WebDriverBackedSelenium(driver, "http://mail.in.com");
		driver.get("http://mail.in.com");
		driver.findElement(By.cssSelector("input.registernow")).click();
		driver.findElement(By.id("fname")).clear();
		driver.findElement(By.id("fname")).sendKeys("nagesh");
		selenium.select("day", "11");
		selenium.select("month", "Mar");
		driver.findElement(By.id("year")).sendKeys("1983");
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys("nagesh_2000");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("nagesh123");
		driver.findElement(By.id("repassword")).clear();
		driver.findElement(By.id("repassword")).sendKeys("nagesh123");
	}
}
