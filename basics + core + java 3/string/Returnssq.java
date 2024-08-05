package string;

import java.util.ArrayList;

public class Returnssq{
   

      // f(abc) 
    static ArrayList<String> getssq(String str){
        ArrayList<String> ans = new ArrayList<>();
        // base case 

        if(str.length()==0){
            ans.add("");
            return ans;
        }

    char curr = str.charAt(0);   //a
    ArrayList<String> smallAns = getssq(str.substring(1));


    // ans = bc,b,c,abc,ab,ac,a
    for(String ss: smallAns){
        ans.add(ss);
        ans.add(curr + ss);

    }
    return ans;
    }
    public static void main(String[] args) {
        ArrayList<String> ans = getssq("abc");
        for(String ss : ans){
            System.out.println(ss);
        }
    }
}