

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MouseHover {
	public static void main(String[] args) throws InterruptedException{
		
		WebDriver d= new FirefoxDriver();
		 Thread.sleep(2000);
		 d.get("https://www.google.com/");
		 Thread.sleep(1000);
		 d.get("http://store.demoqa.com/");
		 Thread.sleep(1000);
		// d.findElement(By.linkText("Product Category")).click();
		 WebElement e1= d.findElement(By.linkText("Product Category"));
		 Actions a= new Actions(d);
		 a.moveToElement(e1).build().perform();
		 
		 Thread.sleep(5000);
		 d.findElement(By.linkText("iPhones")).click();
		 Thread.sleep(5000);
		 d.findElement(By.xpath(".//*[@id='default_products_page_container']/div[4]/div[2]/h2/a")).click();
		 Thread.sleep(7000);
		 d.findElement(By.xpath(".//*[@id='single_product_page_container']/div[1]/div[2]/form/div[2]/div[1]/span/input")).click();
		 Thread.sleep(5000);
		 d.findElement(By.xpath(".//*[@id='fancy_notification_content']/a[1]")).click();
		 Thread.sleep(5000);
		 d.navigate().to("http://store.demoqa.com/products-page/product-category/");
		 Thread.sleep(5000);
		 
		 WebElement e= d.findElement(By.linkText("Product Category"));
		 Actions a1= new Actions(d);
		 a.moveToElement(e).build().perform();
		 Thread.sleep(5000);
		 d.findElement(By.linkText("iPads")).click();
		 Thread.sleep(5000);
		 d.findElement(By.xpath (".//*[@id='default_products_page_container']/div[4]/div[2]/h2/a")).click();
		 Thread.sleep(5000);
		 
		 d.findElement(By.name("Buy")).click();
		 Thread.sleep(5000);
		 d.findElement(By.xpath(".//*[@id='fancy_notification_content']/a[1]")).click();
		 
		 Thread.sleep(5000);
		 d.findElement(By.xpath(".//*[@id='checkout_page_container']/div[1]/a/span")).click();
		 Thread.sleep(5000);
		 Select drop= new Select(d.findElement(By.id("current_country")));
		 drop.selectByValue("US");
		 Thread.sleep(5000);
		 d.findElement(By.xpath(".//*[@id='change_country']/input[2]")).sendKeys("texas");
		 
		 
		 
		 
		 
		 
	}
	

}
