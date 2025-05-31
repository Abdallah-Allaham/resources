package problem_solving.Div3;

import java.util.Scanner;

public class Translation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s = in.next().toLowerCase();
        String t = in.next().toLowerCase();
        boolean isReversely = true;

        if (s.length() == t.length()) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != t.charAt((t.length() - 1) - i)) {
                    isReversely = false;
                    break;
                }
            }
        }else {
            isReversely=false;
        }

        if (isReversely) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
