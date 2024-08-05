public class sort{
    public static  void  binarySort(int arr[]){
             for(int i = 0 ; i<arr.length-1;i++){
               boolean flag = false;   //has any swapped happen
                for(int j = 0; j<arr.length-1-i;j++){
                    if(arr[j] > arr[j+1]){
                        int temp = arr[j];
                        arr[j]   = arr[j+1];   //swap(arr[j],arr[j+1])      // time compleity n2/2  n2-n/2   n2
                        arr[j+1]= temp;
                        flag = true;

                    }
                }
                if(flag == false){    //has any swapped happen?
                    return;
                }
             }
               }
               public static void printArr (int arr[]){
                for(int i =0; i<arr.length;i++){
                    System.out.print(arr[i] + "");
                }
                System.out.println();
               }

               public static void main(String args[]){
                int arr[] = {5,4,1,3,2} ;
              binarySort(arr);
              printArr(arr);
               }
}