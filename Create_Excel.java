import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
public class Create_Excel {
	public static String dateNow=null;
	public static void time()
	{
		  Calendar currentDate = Calendar.getInstance();
		  SimpleDateFormat formatter= 
		  new SimpleDateFormat("yyyyMMMdd_HHmmss");
		   dateNow = formatter.format(currentDate.getTime());
		  System.out.println("Now the date is :=>  " + dateNow);
	}
	public static String excel() throws Exception
	{
		time();
FileOutputStream fo=new FileOutputStream("E:\\Framework\\Results\\loginRes_"+dateNow+".xls");
WritableWorkbook wwb=Workbook.createWorkbook(fo);
WritableSheet ws=wwb.createSheet("LoginResults", 0);
Label l=new Label(0,0,"Username");
Label l1=new Label(1,0,"Password");
Label l2=new Label(2,0,"Results");
ws.addCell(l);
ws.addCell(l1);
ws.addCell(l2);
wwb.write();
wwb.close();
		return "Pass";
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		excel();
	}

}




