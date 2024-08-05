import java.util.Scanner;

public class example3 {
    public static void main (String args[]){

        Scanner sc = new Scanner(System.in);
        int number;
        int choice;
        int evenSum = 0;
        int oddSum = 0;

        do{
            System.out.println("enter the number");
            number = sc.nextInt();

            if(number%2==0){
                evenSum+=number;
            }else{
                oddSum+=number;
            }
            System.out.println(" do ypu want to continue? press 1 for yes or 0 for no ");
            choice=sc.nextInt();
        }while(choice==1);
        System.out.println("print evenSum "+ evenSum );
        System.out.println("print oddSum" + oddSum );
    }
}
