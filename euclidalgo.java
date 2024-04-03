public class euclidalgo {
    static int iGCD2(int x,int y){
        if(y==0){
            return x;
        }
        return iGCD2(y, x%y);
    }
    public static void main(String[] args) {
        System.out.println(iGCD2(15, 24));
    }
}
