import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.lang.reflect.Method;
import com.thoughtworks.selenium.DefaultSelenium;
import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
public class DriverScript {
      static String className = null;
      public static int rs = 1;
public static DefaultSelenium selenium = new DefaultSelenium("localhost",1212,"*firefox", "http://");
     public static boolean Set_Execution_sheet(String strPath) throws Exception {
            FileInputStream file = new FileInputStream(strPath);
            Workbook wb = Workbook.getWorkbook(file);
            Sheet sh = wb.getSheet(0);
            selenium.start();
            selenium.open(sh.getCell(1, 1).getContents());
            selenium.windowMaximize();
            return true;
      }
      public static boolean Execute(String str) throws Exception {
    	  //To take the data from Testcases.xls
            FileInputStream file = new FileInputStream(str);
            Workbook wb = Workbook.getWorkbook(file);
            Sheet s = wb.getSheet(0);
          //To create the out put Result file
            FileOutputStream fo=new FileOutputStream("E:\\Framework\\Results\\loginResults.xls");
            WritableWorkbook wwb=Workbook.createWorkbook(fo);
            WritableSheet ws=wwb.createSheet("LoginResults", 0);
            //Add a label 'Result'
            Label res=new Label(8,0,"Results");
            ws.addCell(res);
            //To take each row data
            for (int i = 1; i <= s.getRows(); i++) {
        try {
        	if(s.getCell(7, i).getContents().equalsIgnoreCase("Yes"))
        	{
        		//Taking the class name from 5,i
                if (!(s.getCell(5, i).getContents()).contentEquals("")) {
                  className = s.getCell(5, i).getContents();
                 }
              //Taking the method name from 6,i
                String functioncall = s.getCell(6, i).getContents();        
                               // object declaration
                               Object ret = "Fail";
                               //Reading the method name which is available in functioncall string
                               String methodName = functioncall.substring(0, functioncall.indexOf("("));
                               //Converting the classname
                               Class c = Class.forName(className);
                               //Taking the method name from the class
                                Method m = c.getMethod(methodName, null);
                                //Creating the instance
                                Object ob = c.newInstance();
                                //Executing the method 
                               ret = m.invoke(ob, null);
                               
                                System.out.println("return value:" + ret.toString());
                                //Capturing screen shot
                                selenium.captureScreenshot("E:\\Framework\\Results\\Result" + rs + ".jpg");
                               rs++;
                            	for (int j = 0; j < s.getColumns(); j++) {
                    				System.out.println(s.getCell(j, i).getContents());
                    				Label data=new Label(j,i,s.getCell(j, i).getContents());
                    				ws.addCell(data);
                    			}
		
        	}
                          } catch (Exception e) {
                        selenium.captureScreenshot("E:\\Framework\\Results\\Result"+ rs + ".jpg");
                  }
            }
       wwb.write();
       wwb.close();
            return true;

      }
}







