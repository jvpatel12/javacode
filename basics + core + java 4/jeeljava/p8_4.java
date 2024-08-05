import java.io.FileInputStream;
import java.io.FileOutputStream;

public class p8_4 {
    public static void main(String[] args) {
        FileInputStream in;
        FileOutputStream out;

        try{
         in=new FileInputStream("C:\\j\\p.txt");
         out=new FileOutputStream("C:\\j\\pp.txt");

         int c;
         while((c=in.read())!=-1){
          out.write(c);
         }
        }
        catch(Exception e){
       System.out.println(e);
        }

        
        
    }
}
