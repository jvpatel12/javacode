import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class create {
    public static void main(String[] args) {
        try {
            // load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // creating the connection
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jeel", "root", "jeel1234");
           //String t="create table student(tName varchar(10),tRoll int(10),tNumber varchar(10))";
           String q="insert into student(tName,tRoll,tNumber) values(?,?,?)";
              
        //    Statement p=con.createStatement();
        //     p.executeUpdate(t);s
        //     System.out.println("table created in databases..");

           PreparedStatement jeel=con.prepareStatement(q);
        //    jeel.setString(1, "jeel");
        //    jeel.setInt(2,10);
        //    jeel.setString(3, "patel");
        //    jeel.executeUpdate();
        //    System.out.println("inserted into values");

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("enter name:");
        String name=br.readLine();
        System.out.println("enter the roll number");
        int roll=br.read();
        System.out.println("enter the number");
        String number=br.readLine();

        jeel.setString(1, name);
        jeel.setInt(2, roll);
        jeel.setString(3, number);
        con.close();
           
        //    Statement jeel=con.createStatement();
        //     jeel.executeUpdate(t);
        //     System.out.println("table created in databases..");
        //     con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
