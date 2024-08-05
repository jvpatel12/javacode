import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import com.mysql.cj.jdbc.Driver;

public class image{
    public static void main(String[] args) {
        try{
  
      Class.forName("com.mysql.cj.jdbc.Driver");
      Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/jeel", "root", "jeel1234");
      
            String q="insert into images(pic)  values(?)";

            PreparedStatement jeel=con.prepareStatement(q);
            FileInputStream f1=new FileInputStream("C:\\Users\\lenovo\\Desktop\\jeel.png");
            jeel.setBinaryStream(1, f1,f1.available());
            jeel.executeUpdate();
            System.out.println("done....");
            con.close(); 
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
