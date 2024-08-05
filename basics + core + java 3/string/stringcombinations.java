public class stringcombinations {
    static void combinations(String dig,String res,String [] kp){
        



        int currnum = dig.charAt(0)-'o';
        String currchocies = kp[currnum];

        for(int i =0;i<currchocies.length();i++){
            combinations(dig.SubString(1,kp,res+currchocies.charAt(1)));
        }
    }
    public static void main(String[] args) {
        
    }
}
