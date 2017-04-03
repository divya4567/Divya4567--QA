import java.io.FileInputStream;
import java.io.FileOutputStream;
import com.thoughtworks.selenium.DefaultSelenium;
import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
public class Login_Results_Step3 {
	public static DefaultSelenium selenium=new DefaultSelenium("localhost",1212,"*firefox","http://");
	public static String login() throws Exception
	{
		//To take data from Input file
FileInputStream fi=new FileInputStream("E:\\Framework\\Testdata\\logindata.xls");
		Workbook w=Workbook.getWorkbook(fi);
		Sheet s=w.getSheet(0);
		//To create the out put Result file
FileOutputStream fo=new FileOutputStream("E:\\Framework\\Results\\loginResults.xls");
		WritableWorkbook wwb=Workbook.createWorkbook(fo);
		WritableSheet ws=wwb.createSheet("LoginResults", 0);
		//String declaration
		String str=null;
		//Launching the application
		selenium.start();
		selenium.open("http://www.mail.in.com/");
		selenium.windowMaximize();
		
		for (int i = 1; i < s.getRows(); i++) {
			//To login into the application by taking data from xls 
			selenium.type("f_id", s.getCell(0, i).getContents());
			selenium.type("f_pwd", s.getCell(1, i).getContents());
			selenium.click("css=input.signin");
			selenium.waitForPageToLoad("30000");
			//Validating the Sign out link
			if(selenium.isElementPresent("link=Sign out"))
			{
			selenium.click("link=Sign out");
			Thread.sleep(3000);
			str="Pass";
			}else{
				str="Fail";
				System.out.println("Sign out is not available");
			}
			// To get the home page
			selenium.open("http://www.mail.in.com/");
			//Export the result into Result file
			Label result=new Label(2,i,str);
			ws.addCell(result);
			// To export input data into Result file
			for (int j = 0; j < s.getColumns(); j++) {
				System.out.println(s.getCell(j, i).getContents());
				Label data=new Label(j,i,s.getCell(j, i).getContents());
				ws.addCell(data);
			}
		}
		// Adding labels in the Result file
		Label un=new Label(0,0,"Username");
		Label pw=new Label(1,0,"Password");
		Label res=new Label(2,0,"Results");
		ws.addCell(un);
		ws.addCell(pw);
		ws.addCell(res);
		wwb.write();
		wwb.close();
		return "Pass";
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		login();
	}

}
