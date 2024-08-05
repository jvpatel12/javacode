public class search61 {
    static void findAllindicas(int a[],int target,int idx){
   
         if(idx > a.length){
               return;   //base work
         }
        if(a[idx]== target ){
          System.out.println(idx);   //self work
        }
      findAllindicas(a,target,idx+1);   //recursive work
    }
public static void main(String[] args) {
       int a[] = {1,2,4,4,4,6};
       int target = 4;
       findAllindicas(a, target, 0);
}
}