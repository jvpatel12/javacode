public class factorialwithrecusion {
    static int factorial(int n){
        if(n==0){
            return 1;
        }
        int smallans =  factorial(n-1); //calling the factorial number 4
        

        //self work 
        
        int ans =  n * smallans;
        return ans;

    }
    public static void main(String[] args) {
        System.out.println(factorial(5));
      
    }
}
