import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class update {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // creating the connection
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jeel", "root", "jeel1234");
            // String t="create table student(tName varchar(10),tRoll int(10),tNumber
            // varchar(10))";
            // String q="insert into student(tName,tRoll,tNumber) values(?,?,?)";

            String q = "update student set  tName=? , tNumber=?where tRoll=?";
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("enter the name");
            String name = br.readLine();


            System.out.println("enter the number");
            String number=br.readLine();


            System.out.println("enter the roll number");
            int roll = Integer.parseInt(br.readLine());

            PreparedStatement jeel = con.prepareStatement(q);
            jeel.setString(1, name);
            jeel.setString(2, number);

            jeel.setInt(3, roll);
            jeel.executeUpdate();
            System.out.println("done...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
