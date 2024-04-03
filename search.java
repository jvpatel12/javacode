public class search{

     static boolean search(int a[],int target,int idx){
    // base case 
       if(idx > a.length){
        return false; 
       }
     //self work
       if(a[idx]==target){
        return true;
       }
   // recurvise work 
     if(search(a, target, idx+1)){
        return true;
     }
     else{
        return false;
     }
     }

  public static void main(String[] args) {
       int a[] = {1,2,4,6};
       int target = 4;
       if(search(a, target, 0)){
              System.out.println("yes");
       }
       else{
        System.out.println("no");
       }
  }
}