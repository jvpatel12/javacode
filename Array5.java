
public class Array5 {
    public static int liner(int numbers[],int key){
          for(int i = 0; i<numbers.length;i++){
            if( numbers[i]==key){
                i++;
            }
          }
          return -1;
    }
    public static void main(String args[]){
        int numbers[]= {10,20,30,40,50,60};
        int key=20;

        int obj= liner(numbers, key);

        if(obj==-1){
            System.out.println("not valid" );
        }
        else{
            System.out.println("valid");
        }
    }
    
}
