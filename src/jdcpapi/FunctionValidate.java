package jdcpapi;

import DBCon.DBConnection;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class FunctionValidate {
    @SuppressWarnings("FieldMayBeFinal")
    private static DBCon.DBConnection Con = new DBConnection();
    @SuppressWarnings({"StaticNonFinalUsedInInitialization", "FieldMayBeFinal"})
    private static Connection DB = Con.getConnection();
    private static PreparedStatement stmt = null;
    
    public static boolean isRegister(ValiateData s){
       String sql = ValiateData.isInsert;
        try {
            stmt = DB.prepareStatement(sql);
            stmt.setString(1, s.getID());
            stmt.setString(2, s.getFirstname());
            stmt.setString(3, s.getLastname());
            stmt.setString(4, s.getEmail());
            stmt.setString(5, s.getAddress());
            stmt.setString(6, s.getGender());
            stmt.setString(7, s.getUsername());
            stmt.setString(8, s.getPassword());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
            //Logger.getLogger(FunctionValidate.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static boolean isUpdateData(ValiateData s){
       String sql = ValiateData.isUpdate;
        try {
            stmt = DB.prepareStatement(sql);
           
            stmt.setString(1, s.getFirstname());
            stmt.setString(2, s.getLastname());
            stmt.setString(3, s.getEmail());
            stmt.setString(4, s.getAddress());
            stmt.setString(5, s.getGender());
            stmt.setString(6, s.getUsername());
            stmt.setString(7, s.getPassword());
             stmt.setString(8, s.getID());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
            //Logger.getLogger(FunctionValidate.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     public static boolean isDelete(ValiateData s){
       String sql = ValiateData.isDelete;
        try {
            stmt = DB.prepareStatement(sql);
            stmt.setString(1, s.getID());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
            //Logger.getLogger(FunctionValidate.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
    public static boolean isTruncate(){
       String sql = ValiateData.isTruncate;
        try {
            stmt = DB.prepareStatement(sql);
            stmt.executeUpdate();
            return true;
       } catch (SQLException ex) {
            return false;
            //Logger.getLogger(FunctionValidate.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void setLists(String LookFor){
        DefaultTableModel modelo = (DefaultTableModel)Dashboard.DataTable.getModel();
        while(modelo.getRowCount() > 0){
            modelo.removeRow(0);
        }
        
        @SuppressWarnings("UnusedAssignment")
        String sql = "";
        if(LookFor.equals("")){
            sql = ValiateData.isRender;
        }else{
            sql = "SELECT * FROM productdb WHERE ("
                    + "ID LIKE'"+LookFor+"%' OR "
                    + "Firstname LIKE'"+LookFor+"%' OR "
                    + "Lastname LIKE'"+LookFor+"%' OR "
                    + "Email LIKE'"+LookFor+"%' OR "
                    + "Username LIKE'"+LookFor+"%'"
                    + ")";
        }
        String data[] = new String[8];
        
        try {
            Statement st = DB.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                data[0] = rs.getString("ID");
                data[1] = rs.getString("Firstname");
                data[2] = rs.getString("Lastname");
                data[3] = rs.getString("Email");
                data[4] = rs.getString("Gender");
                data[5] = rs.getString("Address");
                data[6] = rs.getString("Username");
                data[7] = rs.getString("Password");
                modelo.addRow(data);
            }
        } catch (SQLException ex) {
            Logger.getLogger(FunctionValidate.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static String extractIDMAX(){
        String sql = "SELECT MAX(ID) FROM productdb";
        int ID = 0;
        try {
            Statement st = DB.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()){
                ID = rs.getInt(1);
            }
            if(ID == 0){
                ID = 1;
            }else{
                ID = ID + 1; 
            }
            return String.valueOf(ID);
        } catch (SQLException ex) {
            return null;
            //Logger.getLogger(FunctionValidate.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
