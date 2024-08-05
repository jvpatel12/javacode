public class findsum {

      //static int maxarry(int arr[] ,int idx){
          static int sumarry(int arr[],int idx){
           if(idx==arr.length){
            return 0;
           }
           //recursion work is 
           int smallans = sumarry(arr, idx+1);
           //self work 
           return smallans + arr[idx];
          }
      //}
    public static void main(String[] args) {
        // elements if sum array [2,3,5,20,1]
        //f(arr,idex)  f(arr,3) sum = 20 this is main sum of array starting arry index 
        // inde == n-1 = return arr[idx] bacis case 
        // empty arrr is return 0;
        int arr[] = {2,3,5,20,1};
        // System.out.println(maxarry(arr, 0));
        System.out.println(sumarry(arr,0));
    }
}
