import java.util.Scanner;

public class removeoccurrenss {
    

      static String removeA(String str,int idx){
          //base case  
             if(idx == str.length()){
                return "";
             }

          //recursive work
              String smallAns = removeA(str, idx+1);


          //self work

          char charcuret = str.charAt(idx);

          if(charcuret!='a'){
               return charcuret+smallAns;

                    }
                    else{
                         return smallAns;
                    }
      }

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
          String s = sc.nextLine();
          
         System.out.println(removeA(s, 0));
    }
}
