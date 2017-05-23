public class DatabaseTest {

	public static void main(String[] args) throws SQLException {
	// TODO Auto-generated method stub
	Connection connection = null;
	ResultSet objResultSet=null;
	PreparedStatement objPreStmnt=null;
	try {
	DriverManager.registerDriver(new com.microsoft.jdbc.sqlserver.SQLServerDriver());
	String url="jdbc:microsoft:sqlserver://Servername:1717;DatabaseName=name of the database";
	connection=DriverManager.getConnection(url,"username","Password");
	System.out.println(">>>>>>>>>Connected>>>>>>>>");

	String strQuery = "select case_id,workitemid,userid from Tablename where case_id=? and workitemid=? and userid=?"; 

	//Assigning the Query 
	objPreStmnt = connection.prepareStatement(strQuery);
	objPreStmnt.setInt(1,2026086); 
	objPreStmnt.setInt(2,2000093);
	objPreStmnt.setInt(3,2000297);
	objResultSet = objPreStmnt.executeQuery(); //Executing the Query
	while (objResultSet.next()) { 
	System.out.println(" case_id:"+objResultSet.getString("case_id"));
	System.out.println(" workitemid:"+objResultSet.getString("workitemid"));
	System.out.println(" userid:"+objResultSet.getString("userid"));
	} 

	} catch (Exception e) {
	e.printStackTrace();
	}

	}


	}


