import org.w3c.dom.ranges.RangeException;

public class reverse1 {
    public static void main(String args[]){
        int n = 500238;
        int a;
        int rev=0;
        while(n>0){
          a=n%10;
          rev=(rev*10)+a;
          n=n/10;
        }
        System.out.println(rev);
    }
    
}
