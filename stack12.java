package stacks;
import java.util.*;

public class stack12{
    public  static int[] remove(int arr[]) {
        int n = arr.length;
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < n; i++) {
            if (s.size() == 0 || s.peek() != arr[i]) {
                s.push(arr[i]);
            }
           else  if (arr[i]==s.peek()) {
                
                if (arr[i] != arr[i + 1] || i==n-1) {
                    s.pop();
                }
            } 
        }
        int[] res=new int[s.size()];
        int m= res.length;
        for(int i=m-1;i>=0;i--){
            res[i]=s.pop();
        }
        return res;
       } 
       public static void main(String args[]){
        int arr[] = { 1, 2, 2, 3, 10, 10, 10, 4, 4, 4, 5, 7, 7, 2 };
        int res[] = remove(arr);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i] + "");
        }
    }
}
