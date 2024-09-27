import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Array61 {
    public static  int getLargest(int number[]){
        int Largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i = 0;i<number.length;i++){
            if(Largest < number[i]){
                Largest=number[i];
            }
            if(smallest > number[i]){
                smallest = number[i];
            }
        }
        
        System.out.println("smallest number is " + smallest);
        return Largest;

}
public static void main(String args[]){
    int number[] ={1,2,3,4,5,6} ;
    
    System.out.println("largest number is " + getLargest(number));
}
}
