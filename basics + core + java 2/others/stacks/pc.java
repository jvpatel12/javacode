//given a sequence of numbers remove all th consecutive subs of the length greaterthan
//or equal to 2 that contains the same element. 

package stacks;
import java.util.Stack;

public class  pc{
        static int[] remove(int arr[]){
        int n=arr.length;
        Stack<Integer> s=new Stack<Integer>();
        for(int i=0;i<n;i++){
         if(s.size()==0) s.push(arr[i]);
         if(s.peek()==arr[i]){
             if(arr[i]!=arr[i+1]){
             s.pop();
            }
         }
         else if(arr[i]==n-1){
            s.push(arr[i]);
         }
        }
        return arr;
       }
       
        public static void main(String args[]) {
            int arr[]={1,2,2,3,10,10,10,4,4,4,5,7,7,2};
            int res[]= remove(arr);
            for(int i=0;i<res.length;i++){
                System.out.println(res[i] +"");
            }        
        }
}
