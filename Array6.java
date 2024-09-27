public class Array6 {
    public static  int getLargest(int number[]){
        int Largest = Integer.MIN_VALUE;
        for(int i = 0;i<number.length;i++){
            if(Largest < number[i]){
                Largest=number[i];
            }
        }
        return Largest;
}
public static void main(String args[]){
    int number[] ={1,2,3,4,5,6} ;
    
    System.out.println("largest number is " + getLargest(number));
}
}
