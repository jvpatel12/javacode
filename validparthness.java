/*package stacks;
//import java.util.Scanner;
import java.util.Stack;



public class validparthness {

    public static boolean isValid(String str){
      Stack<Character> s=new Stack<Character>();
      for(char c:str.toCharArray()){
        if(c=='('){
            s.push(')');
        }

        else if(c=='{'){
            s.push('}');
        }

        else if(c=='['){
            s.push(']');
        }
        else if(s.isEmpty()){
            return false;
        }
        
      }
      return s.isEmpty();
    }
   
    public static void main(String[] args) {
       // Scanner sc=new Scanner(System.in);
        //String str=sc.nextLine();
       
        System.out.println(  isValid("({[]})"));
    }
}
*/