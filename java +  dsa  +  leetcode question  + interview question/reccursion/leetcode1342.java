package reccursion;

public class leetcode1342 {
     static int numberOfsetps(int n){
        return helper(n,0);
     }

     static int  helper(int n,int setps){
        if(n==0){
            return setps;
        }
        if(n%2==0){
            return helper(n/2, setps+1);
        }
        return helper(n-1, setps+1);
     }
    public static void main(String[] args) {
      System.out.println(numberOfsetps(8));        
    }
}
