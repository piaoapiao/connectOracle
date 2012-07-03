import java.sql.*;

public class Conn
{
  public static void main(String[] args) throws SQLException
  {
    DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
    String url = "jdbc:oracle:thin:@127.0.0.1:1522:orcl";
    String userName = "scott";
    String password = "abc";
    Connection conn = DriverManager.getConnection (url, userName, password);

  // ...
    if(conn == null)
    	System.out.println("连接失败");
    else
    	System.out.println("连接成功");
    
    
    
 // Create a Statement
    Statement stmt = conn.createStatement ();

    // Select the ENAME column from the EMP table
    ResultSet rset = stmt.executeQuery ("select name from tab1");

    // Iterate through the result and print the employee names
    while (rset.next ())
    {
    	System.out.println (rset.getString (1));
    }
  }  
}

 


