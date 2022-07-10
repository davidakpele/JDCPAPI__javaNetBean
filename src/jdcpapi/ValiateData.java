 package jdcpapi;

public class ValiateData {
    public static String isRender = "SELECT * FROM productdb";
    
    public static String isInsert = "INSERT INTO productdb ("
            + "ID,"
            + "Firstname,"
            + "Lastname,"
            + "Email,"
            + "Address,"
            + "Gender,"
            + "Username,"
            + "Password) "
            + "VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
    
    public static String isUpdate = "UPDATE productdb SET  "
            +  "Firstname = ?,"
            +  "Lastname = ?,"
            +  "Email = ?,"
            +  "Address = ?,"
            +  "Gender = ?,"
            +  "Username = ?,"
            +  "Password = ? "
            +  "WHERE  ID = ?";
    
    public static String isDelete= "DELETE FROM productdb WHERE ID = ?";
    
    public static String isTruncate= "TRUNCATE TABLE productdb";

    private String ID;
    private String Firstname;
    private String Lastname;
    private String Email;
    private String Address;
    private String Gender;
    private String Username;
    private String Password;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String Firstname) {
        this.Firstname = Firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String Lastname) {
        this.Lastname = Lastname;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    
    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }
    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
    
    
}
