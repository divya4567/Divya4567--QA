import java.io.FileInputStream;

import jxl.Sheet;
import jxl.Workbook;

import com.thoughtworks.selenium.DefaultSelenium;


public class Login_Excel {
	public static DefaultSelenium selenium=new DefaultSelenium("localhost",1212,"*firefox","http://");
	public static String openURL()
	{
		selenium.start();
		selenium.open("http://www.mail.in.com/");
		selenium.windowMaximize();
		return "Pass";
	}
	public static String login() throws Exception
	{
FileInputStream fi=new FileInputStream("E:\\Framework\\Testdata\\logindata.xls");
Workbook w=Workbook.getWorkbook(fi);
Sheet s=w.getSheet(0);
		selenium.type("f_id", s.getCell(0, 1).getContents());
		selenium.type("f_pwd", s.getCell(1, 1).getContents());
		selenium.click("css=input.signin");
		selenium.waitForPageToLoad("30000");
		return "Pass";
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		openURL();
		login();
	}

}
