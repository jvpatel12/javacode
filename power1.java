public class power1 {
    public static int optimizedPower(int a,int n){
      if(n==0){
        return 1;
      }
      
        int halfPowersquare =   optimizedPower(a, n/2) +  optimizedPower(a, n/2);
      
      if(n %2 !=0){
        halfPowersquare  = a * halfPowersquare;
      }
   return halfPowersquare;
    }
    public static void main(String[] args) {
        int a =2;
        int n =10;
        System.out.println(optimizedPower(2, 10));
    }
}
