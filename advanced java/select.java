import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class select{
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // creating the connection
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jeel", "root", "jeel1234");
            // String t="create table student(tName varchar(10),tRoll int(10),tNumber
            // varchar(10))";
            // String q="insert into student(tName,tRoll,tNumber) values(?,?,?)";

        String q = "select *from student";

        Statement jeel=con.createStatement();
        ResultSet set=jeel.executeQuery(q);

        while (set.next()) {
            String name=set.getString(1);
            int roll=set.getInt(2);
            String number=set.getString(3);

            System.out.println("name :" + name +"roll :"+roll +  "number :"+number);
            
      }
        
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}