import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class RadioButton {
	public static void main(String[] args) throws InterruptedException{
		
		WebDriver d= new FirefoxDriver();
		d.get("http://www.newtours.demoaut.com/");
		
		Thread.sleep(2000);
        d.findElement(By.name("userName")).sendKeys("mahesh");
		
		Thread.sleep(2000);
		d.findElement(By.name("password")).sendKeys("mahesh");
		
		Thread.sleep(5000);
		d.findElement(By.name("login")).click();
		
		Thread.sleep(5000);
		d.findElement(By.xpath("html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]")).click();
		String s1=d.findElement(By.xpath("html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]")).getAttribute("value");
		System.out.println("radio button name:"+s1);
		Thread.sleep(5000);
		d.findElement(By.xpath("html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[1]")).click();
		String s2= d.findElement(By.xpath("html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[1]")).getAttribute("value");
	
		System.out.println("radio button name:"+s2);
		
		Thread.sleep(5000);
		d.findElement(By.name("fromPort")).click();
		
	//get all the options from select list
		
		Select drop1=new Select(d.findElement(By.name("fromPort")));
		Thread.sleep(5000);
		drop1.selectByIndex(3);
		Thread.sleep(5000);
		//d.findElement(By.xpath("html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td[2]/select/option[3]")).sendKeys("London");
		
		Select drop2=new Select(d.findElement(By.name("fromMonth")));
		Thread.sleep(5000);
		drop2.selectByIndex(1);
		Thread.sleep(5000);
		
		Select drop3=new Select(d.findElement(By.name("fromDay")));
		Thread.sleep(2000);
		drop3.selectByIndex(1);
		Thread.sleep(2000);
		//drop.selectByIndex(5);
		
		Select drop4=new Select(d.findElement(By.name("toMonth")));
		Thread.sleep(2000);
		drop4.selectByIndex(2);
		Thread.sleep(2000);
		
		Select drop5=new Select(d.findElement(By.name("toDay")));
		Thread.sleep(2000);
		drop5.selectByIndex(2);
		Thread.sleep(2000);
		
		d.findElement(By.xpath("html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[1]")).click();
		Thread.sleep(2000);
		
		Select drop6= new Select(d.findElement(By.name("airline")));
		Thread.sleep(2000);
		drop6.selectByIndex(2);
		
		Thread.sleep(2000);
		
		d.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[14]/td/input")).click();
		
		
		
		
	}

}
