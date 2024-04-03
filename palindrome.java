import java.util.Scanner;

public class palindrome {

    static String reveString(String str, int idx) {
        if (idx == str.length()) {
            return "";
        }

        String revernumber = reveString(str, idx + 1);

        return revernumber + str.charAt(idx);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String rev = reveString(s, 0);

        if (rev.equals(s)) {
            System.out.println("palindrome");
        } else {
            System.out.println(" not palindrome");
        }
    }
}
