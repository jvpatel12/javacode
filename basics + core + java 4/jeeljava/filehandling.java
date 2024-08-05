import java.io.*;
import java.sql.SQLOutput;
public class filehandling{
public static void main(String[] args) throws IOException {
try {
FileReader fin = new FileReader("C:\\j\\p.txt");
FileWriter fout = new FileWriter("C:\\j\\p1.txt");
int in = 0;
String copyin =" ";
while ((in = fin.read()) != -1) {
copyin = copyin + ((char)in);
fout.write(in);
}
System.out.println(copyin);
fin.close();
fout.close();
}
catch (Exception e){
System.out.println(e);
}
}
}