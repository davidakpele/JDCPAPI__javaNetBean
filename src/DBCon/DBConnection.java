package DBCon;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    public static Connection connect = null;
    
    public Connection getConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connect =  DriverManager.getConnection("jdbc:mysql://localhost/jdcpapidb", "root", "");
            System.out.println("Database Connected..!");
            return connect;
        } catch (ClassNotFoundException | SQLException ex){
            return null;
            //Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}