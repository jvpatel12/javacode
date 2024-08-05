 import java.util.Scanner;

public class reversenumber {
  
     static String reveString(String str ,int idx){
       if(idx==str.length()){
        return "";
       }
    
       String revernumber = reveString(str,idx+1);

       return revernumber + str.charAt(idx);




     }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String  s = sc.nextLine();
        System.out.println(reveString(s, 0));
    }
}
