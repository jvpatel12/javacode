public class lastoccurence {
     
      public static int lastoccurence(int arr[],int key,int i){
        //looked forwared compare on self 
        if(i==arr.length){
            return 1;
        }
        int isFound = lastoccurence(arr, key, i+1);
        if(isFound != -1){
            return isFound;
        }
        if(arr[i]==key){
            return i;
        }
        return isFound;
      }

       public static void main(String[] args) {
        int arr[]= {8,3,6,8,10};
        System.out.println(lastoccurence(arr, 5, 0));
       }
}
