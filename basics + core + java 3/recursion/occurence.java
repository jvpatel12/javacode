public class occurence {
    
    public static int firstOccuence(int arr[],int key,int i){
        if(arr[i]==key){        //ussing by the recursion
            return i;
        }
        else if(arr[i]!=key){
            return -1;
        }
        return firstOccuence(arr, key, i+1);
    }
    public static void main(String[] args) {
         int arr[]={8,3,2,6,9,1};
         System.out.println(firstOccuence(arr, 5, 0));
    }
}