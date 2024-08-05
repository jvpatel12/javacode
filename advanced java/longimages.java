import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JFileChooser;

public class longimages {
    public static void main(String[] args) {
         try{
  
      Class.forName("com.mysql.cj.jdbc.Driver");
      Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/jeel", "root", "jeel1234");
      
            String q="insert into images(pic)  values(?)";

            PreparedStatement jeel=con.prepareStatement(q);
            JFileChooser jfc=new JFileChooser();
            jfc.showOpenDialog(null);
            File file=jfc.getSelectedFile();
            FileInputStream fil=new FileInputStream(file);
            jeel.setBinaryStream(1, fil,fil.available());
            jeel.executeUpdate();
            System.out.println("done....");
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
