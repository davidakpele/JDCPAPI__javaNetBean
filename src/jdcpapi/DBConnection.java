/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdcpapi;
import java.sql.*;
/**
 *
 * @author HP
 */
public class DBConnection {
    static final String DB_URL = "jdbc:derby://localhost:1527/javadb"; 
   // static final String USER = "";
   // static final String PASS = "";
   public static Connection connectBD(){
     //  @SuppressWarnings("UnusedAssignment")
       Connection conn = null;
       try{
      // register jdbc driver, not required for  newer versions of  jdk
       Class.forName("org.apache.derby.jdbc.ClientDriver");
       //Open a  connection
       conn = DriverManager.getConnection(DB_URL);
       return conn;
       }catch(Exception ex){
           System.out.println("Error:: there were error while conneccting to database.");
           return null;
       }
   }
}
