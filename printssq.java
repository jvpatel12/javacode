public class printssq {

    static void printSsq(String str,String currAns){
     //base case
         if(str.length()==0){
           System.out.println(currAns);
         }



        char curr = str.charAt(0);
        String remString = str.substring(1);

        // curr char = choose to be a part kof currans 

        printSsq(remString,currAns+curr);

        // curr char does not choose 

        printSsq(remString,currAns);
    }
       public static void main(String[] args) {
          printSsq("abc","");
       }
}
