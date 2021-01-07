
import java.sql.Connection;
import java.sql.DriverManager;


public class databaseConnection {
    
   /* final static String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    final static String DB_URL = "jdbc:mysql://localhost/student";
    final static String USER = "root";
    final static String PASS = " ";*/
    
    public static Connection getConnection()
    {
        Connection conn = null;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
    
}
