public class permutions{

    public static void printSum(String str,String permution){
        if(str.length()==0){
           System.out.println(permution);
         return;
        }
       
       for(int i=0;i<str.length();i++){
       char curr=str.charAt(i);
       String newS=str.substring(0, 1) + str.substring(i+1);
       printSum(str, permution+curr);
       }
    }
    public static void main(String[] args) {
       String str="abc"; 
       printSum(str, "");        
    }
}
