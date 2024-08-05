public class evendigitslc1{
    static int findNumbers(int nums[]){
        int count=0;
        for(int num : nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    //function to check wether even or not 
      static boolean even(int num) {
        int numof=digits(num);
        if(numof %2 ==0) return true;

        return false;
    }

    static int  digits(int num){
        int count=0;
        while (num>0) {
            count++;
            num = num/10;
        }
         return count;
    }

    public static void main(String[] args) {
           int num[]= {12,345,2,6,7896};
           System.out.println(findNumbers(num));   
    }
}


// class Solution { 
//     public int findNumbers(int[] nums) {
//         int count = 0;
        
//         for(int i=0; i<nums.length; i++) {
//            int digits = 0;
        
        
//             while(nums[i] != 0) {
//             nums[i] = nums[i] / 10;
//             digits++;
//             }
        
//             if(digits % 2 == 0) {
//             count++;
//             }       
                
//         }
        
//         return count;
        
//     }
// }




