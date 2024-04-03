public class reccursion3{
    static int pow(int p , int q){
        if(q==0){
            return 1;
        }
        // return p * pow( p, q-1);

    //}
    int smallpow = pow(p, q/2);
    if(q%2==0){
        return smallpow * smallpow ;
    }
    else{
        return p * smallpow * smallpow;
    }
}
    public static void main(String[] args) {
       System.out.println(pow(5,4));
    }
}