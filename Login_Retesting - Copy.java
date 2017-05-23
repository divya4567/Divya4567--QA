import java.io.FileInputStream;
import jxl.Sheet;
import jxl.Workbook;
import com.thoughtworks.selenium.DefaultSelenium;
public class Login_Retesting {
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
FileInputStream fi1=new FileInputStream("E:\\Framework\\Object Repository\\loginOR.xls");
        Workbook w1=Workbook.getWorkbook(fi1);
        Sheet s1=w1.getSheet("Sheet1");
        for (int i = 1; i < s.getRows(); i++) {
        	selenium.type(s1.getCell(0, 1).getContents(), s.getCell(0, i).getContents());
        	Thread.sleep(1000);
    		selenium.type(s1.getCell(1, 1).getContents(), s.getCell(1, i).getContents());	
		}
		
		//selenium.click(s1.getCell(2, 1).getContents());
		//selenium.waitForPageToLoad("30000");
		return "Pass";
	}
	public static String logout()
	{
		
		selenium.click("link=");
		return "Pass";
		
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		openURL();
		login();
		//logout();
		

	}

}
