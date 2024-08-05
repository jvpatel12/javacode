public class recursionarray {

       // given array print all array recursion
       //arr = {1,2,3,4,5}
       //bigger problem f(arr)   idx is a current index on which we are currently point 
       //bigger problem is f(arr,idx)
       //smaller problem f(arr,idx+1)
       //based case emptey elemntes print 
       static void printArray(int arr[],int idx){
             if(idx == arr.length){
              return; 
             }
             System.out.println(arr[idx]);
             printArray(arr, idx+1);
       }
       public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
     printArray(arr, 0);
     }
}

