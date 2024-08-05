package reccursion;

public class leetcode17 {
    public static void main(String[] args) {
        letterCombinations("", "23");
    }
    public static void letterCombinations(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digits=up.charAt(0) - '0';
        for(int i=(digits -1)*3;i<digits*3;i++){
            char ch=(char)('a'+i);
            letterCombinations(p+ch, up.substring(1));
        }
    }
}
