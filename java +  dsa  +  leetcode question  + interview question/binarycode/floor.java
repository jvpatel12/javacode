public class floor {
    static int celling(int arr[],int target){
        int start = 0 ;
        int end = arr.length -1;

        while (start <= end) { 
            int mid  = start + (end - start)/2;

            if(arr[mid] < target) {
                 start = mid + 1;
            }
            else if (arr[mid] > target ) {
                end = mid -1 ;
            }
            else{
                return mid;
            }
        }
        return end;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,4,6,13,14,16,18};
        int target = 15;
        int ans  = celling(arr, target);
        System.out.println(ans);
    }
}
