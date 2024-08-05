package reccursion;

public class ascii {
    static void ascii(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
       char ch=up.charAt(0);
       ascii(p+ch, up.substring(1));
       ascii(p, up.substring(1));
       ascii(p+(ch+0), up.substring(1));
    }
    public static void main(String[] args) {
        char ch='b';
        System.out.println(ch + 0);
        System.out.println((char)(ch+1));
        ascii("", "abc");
    }
}
