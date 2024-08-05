public class linear {

    static int liner(int arr[],int target){
          if(arr.length==0) return -1;

          for(int index=0;index<=arr.length;index++){
            int element = arr[index];
            if(target==element){ return index;}
          }
          return -1;
    }
 public static void main(String[] args) {
    int arr[]={10,20,45,23,60,5};
    int target=45;

    int ans=liner(arr, target);
    System.out.println(ans);
 }
}