import java.sql.*;

public class jdbc {
    public static void main(String[] args) {
        try {
            // load the driver

            Class.forName("com.mysql.cj.jdbc.Driver");
            // creating the connection
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jeel", "root", "jeel1234");
            // String table="create table student(tName varchar2(10),tRoll int(10) primary key auto_increment,tNumber varchar(10) not null)";
            
            // Statement jeel=con.createStatement();
            // jeel.executeUpdate(table);
            // System.out.println("table created in databases..");
            // con.close();
            if (con.isClosed()) {
                System.out.println("connection is closed");
            } else {
                System.out.println("connection is created.....");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}