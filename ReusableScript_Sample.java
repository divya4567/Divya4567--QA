import java.io.FileInputStream;

import jxl.Sheet;
import jxl.Workbook;

import com.thoughtworks.selenium.DefaultSelenium;
public class ReusableScript {
	public static DefaultSelenium selenium=new DefaultSelenium("localhost",1212,"*firefox","http://");
	public static String openURL()
	{
		selenium.start();
		selenium.open("http://www.mail.in.com/");
		selenium.windowMaximize();
		selenium.click("css=input.registernow");
		selenium.waitForPageToLoad("30000");
		return "Pass";
	}
	public static String reuse() throws Exception
	{
FileInputStream fi=new FileInputStream("E:\\Framework\\Testdata\\reg.xls");
Workbook w=Workbook.getWorkbook(fi);
Sheet s=w.getSheet(0);
for (int i = 1; i < s.getRows(); i++) {
	if(!s.getCell(3, i).getContents().equals(""))
	{
		if(s.getCell(2, i).getContents().contains("Textbox"))
		{
			if(selenium.isElementPresent(s.getCell(0, i).getContents()))
			{
	selenium.type(s.getCell(0, i).getContents(), s.getCell(3, i).getContents());
			}
		}
		else if(s.getCell(2, i).getContents().contains("Combo"))
		{
			if(selenium.isElementPresent(s.getCell(0, i).getContents()))
			{
	selenium.select(s.getCell(0, i).getContents(), s.getCell(3, i).getContents());
			}
		}	
		else if(s.getCell(2, i).getContents().contains("Button")/*||
				s.getCell(2, i).getContents().contains("Radio") ||
				s.getCell(2, i).getContents().contains("checkbox")*/)
		{
			if(selenium.isElementPresent(s.getCell(0, i).getContents()))
			{
				selenium.click(s.getCell(0, i).getContents());
				Thread.sleep(1000);
			}
		}
		else if(s.getCell(2, i).getContents().contains("link"))
		{
			if(selenium.isElementPresent("link="+s.getCell(0, i).getContents()))
			{
	selenium.click("link="+s.getCell(0, i).getContents());
			}
		}
	}
	
}

		
		return "Pass";
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		openURL();
		reuse();
	}

}






