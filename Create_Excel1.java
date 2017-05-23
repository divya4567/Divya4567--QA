import java.io.FileOutputStream;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
public class Create_Excel1 {
public static String excel() throws Exception
{
	FileOutputStream fo=new FileOutputStream("E:\\Framework\\Results\\loginres.xls");
	WritableWorkbook wwb=Workbook.createWorkbook(fo);
	WritableSheet ws=wwb.createSheet("LoginResults", 0);
	Label lab=new Label(0,0,"Username");
	Label pw=new Label(1,0,"Password");
	Label rs=new Label(2,0,"Result");
	ws.addCell(lab);
	ws.addCell(pw);
	ws.addCell(rs);
	wwb.write();
	wwb.close();
	return "Pass";
}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		excel();

	}

}
