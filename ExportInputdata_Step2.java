import java.io.FileInputStream;
import java.io.FileOutputStream;
import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
public class ExportInputdata_Step2 {
	public static String export() throws Exception
	{
FileInputStream fi=new FileInputStream("E:\\Framework\\Testdata\\logindata.xls");
		Workbook w=Workbook.getWorkbook(fi);
		Sheet s=w.getSheet(0);
FileOutputStream fo=new FileOutputStream("E:\\Framework\\Results\\loginResults.xls");
		WritableWorkbook wwb=Workbook.createWorkbook(fo);
		WritableSheet ws=wwb.createSheet("LoginResults", 0);
		for (int i = 0; i < s.getRows(); i++) {
			for (int j = 0; j < s.getColumns(); j++) {
				System.out.println(s.getCell(j, i).getContents());
				Label data=new Label(j,i,s.getCell(j, i).getContents());
				ws.addCell(data);
			}
		}
		Label res=new Label(2,0,"Results");
		ws.addCell(res);
		wwb.write();
		wwb.close();
		return "Pass";
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		export();
	}

}
