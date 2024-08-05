
public class sumNatrual2 {
    
     static int sumnatural(int n){
        if(n==0) return 0;
        if(n%2==0){
            return sumnatural(n-1) -n;
        }
        else{
            return sumnatural(n-1) + n;
        }
     }

    public static void main(String[] args) {
        System.out.println(sumnatural(5));
    }
}
